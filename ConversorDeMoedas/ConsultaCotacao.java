package ConversorDeMoedas;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCotacao {

    public String Endereco(String moedaOrigem,
                           String moedaConversao){
        return("https://v6.exchangerate-api.com/v6/9c5f27fa3a584eb593c1554b/pair/"+ moedaOrigem +"/"+moedaConversao+"/");

        }

    public Moeda buscaCotacao(String moedaOrigem,
                              String moedaConversao,
                              double valor) {
                                             //EUR/GBP/10");
        URI endereco = URI.create(Endereco(moedaOrigem, moedaConversao)+valor);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        try {
            HttpResponse<String> response = HttpClient
                     .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), Moeda.class);

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Não foi possível obter a conversão destes pares de moeda!");
        }
    }


}

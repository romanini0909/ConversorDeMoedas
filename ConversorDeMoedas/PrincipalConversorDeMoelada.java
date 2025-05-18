package ConversorDeMoedas;

import java.util.Scanner;

public class PrincipalConversorDeMoelada {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ConsultaCotacao consultaCotacao = new ConsultaCotacao();
        double valorConvercao = 0;
        int opcao = 0;

        System.out.println("*****************************************************************");
        System.out.println("Seja bem vindo/a ao Conversor de Moedas");

        while (opcao != 7) {
            System.out.println("*****************************************************************");
            System.out.println("1) Dolar => Real Brasileiro");
            System.out.println("2) Real Brasileiro => Dolar");
            System.out.println("3) Dolar => Dolar Mexicano");
            System.out.println("4) Dolar Mexicano => Dolar");
            System.out.println("5) Dolar => Dolar Canadense");
            System.out.println("6) Dolar Canadense => Dolar");
            System.out.println("7) Sair");
            System.out.println("Escolha uma opção válida:");

            if (leitura.hasNextInt()) {
                opcao = leitura.nextInt();
                leitura.nextLine();

                if (opcao >= 1 && opcao <= 6) {
                    System.out.println("Digite o valor para conversão:");
                    if (leitura.hasNextDouble()) {
                        valorConvercao = leitura.nextDouble();
                        leitura.nextLine();

                        try {
                            Moeda novaMoeda = null;
                            switch (opcao) {
                                case 1:
                                    novaMoeda = consultaCotacao.buscaCotacao("USD", "BRL", valorConvercao);
                                    System.out.println("O Valor " + valorConvercao + " [USD]  corresponde ao valor final de => " + novaMoeda + " [BRL]");
                                    break;
                                case 2:
                                    novaMoeda = consultaCotacao.buscaCotacao("BRL", "USD", valorConvercao);
                                    System.out.println("O Valor " + valorConvercao + " [BRL]  corresponde ao valor final de => " + novaMoeda + " [USD]");
                                    break;
                                case 3:
                                    novaMoeda = consultaCotacao.buscaCotacao("USD", "MXN", valorConvercao);
                                    System.out.println("O Valor " + valorConvercao + " [USD]  corresponde ao valor final de => " + novaMoeda + " [MXN]");
                                    break;
                                case 4:
                                    novaMoeda = consultaCotacao.buscaCotacao("MXN", "USD", valorConvercao);
                                    System.out.println("O Valor " + valorConvercao + " [MXN]  corresponde ao valor final de => " + novaMoeda + " [USD]");
                                    break;
                                case 5:
                                    novaMoeda = consultaCotacao.buscaCotacao("USD", "CAD", valorConvercao);
                                    System.out.println("O Valor " + valorConvercao + " [USD]  corresponde ao valor final de => " + novaMoeda + " [CAD]");
                                    break;
                                case 6:
                                    novaMoeda = consultaCotacao.buscaCotacao("CAD", "USD", valorConvercao);
                                    System.out.println("O Valor " + valorConvercao + " [CAD]  corresponde ao valor final de => " + novaMoeda + " [USD]");
                                    break;
                            }
                        } catch (RuntimeException e) {
                            System.out.println(e.getMessage());
                        }
                    } else {
                        System.out.println("Valor inválido. Por favor, digite um número.");
                        leitura.next();
                    }
                } else if (opcao == 7) {
                    System.out.println("Conversor finalizado.");
                } else {
                    System.out.println("Opção inválida. Por favor, escolha uma opção entre 1 e 7.");
                }
            } else {
                System.out.println("Opção inválida. Por favor, digite um número.");
                leitura.next();
            }
        }

        leitura.close();
    }
}
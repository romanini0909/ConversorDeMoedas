package ConversorDeMoedas;

import java.util.Map;

public record Moeda(
        String conversion_result
) {

    @Override
    public String toString() {
        return "Moeda{" + conversion_result + '}';
    }
}
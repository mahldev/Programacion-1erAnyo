package com.example.b;

import java.util.Arrays;

// ordenar las palabaras de un String en orden alfabetico
public class App {
    public static void main(String[] args) {

        String texto = "Ejemplo de ordenamiento alfabetico utilizando la API Stream de Java";

        Arrays.stream(texto.split("\\s+"))
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .forEach(System.out::println);

    }
}

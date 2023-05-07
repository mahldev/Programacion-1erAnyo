package com.example.a;

import java.util.Arrays;
import java.util.stream.Collectors;

// Encontrar el numero de palabras unicas
public class App {

    public static void main(String[] args) {

        String texto = "Ejemplo ejemplo texto texto texto";

        var palabrasUnicas = Arrays.stream(texto.split("\\s+"))
                .map(String::toLowerCase)
                .collect(Collectors.toSet());

        System.out.println("Las palabras unicas son " + palabrasUnicas.size());
    }
}

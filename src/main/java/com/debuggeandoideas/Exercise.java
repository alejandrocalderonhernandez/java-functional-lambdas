package com.debuggeandoideas;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Exercise {

    public static void main(String[] args) {

        // ── Ejercicio 1 ─────────────────────────────────────────────
        // Una lista de temperaturas como String necesita convertirse a Double
        String[] temperaturas = {"36.6", "37.1", "38.0", "36.9"};
        Function<String, Double> parser = value -> Double.parseDouble(value);
        // TODO: convierte a referencia a método
        // TODO: argumenta qué tipo de referencia es y por qué


        // ── Ejercicio 2 ─────────────────────────────────────────────
        // Ordena los nombres de pacientes alfabéticamente ignorando mayúsculas
        String[] pacientes = {"zebra", "Alice", "BOB", "charlie"};
        Arrays.sort(pacientes, (a, b) -> a.compareToIgnoreCase(b));
        // TODO: convierte a referencia a método
        // TODO: argumenta qué tipo de referencia es y por qué


        // ── Ejercicio 3
        // ¿Se puede convertir? Argumenta tu respuesta.
        BiFunction<String, String, Movie> factory = (title, year) -> {
            IO.println("Creando película: " + title);
            return new Movie(title, year);
        };
        // TODO: ¿se puede convertir a Movie::new? ¿por qué sí o por qué no?
    }
}

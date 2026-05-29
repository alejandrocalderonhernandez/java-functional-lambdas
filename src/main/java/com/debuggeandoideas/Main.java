package com.debuggeandoideas;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        //Reference by instance
        Greetter greetter = new Greetter();

        // Consumer<String> consumer = who -> greetter.sayHello(who); <- lambda
        Consumer<String> consumer = greetter::sayHello;

        consumer.accept("Alejandro");


        IO.println("------");

        //Reference by static method

        String num1 = "20";
        Integer num2 = 30;

        //Function<String, Integer> function = str -> Integer.parseInt(str); <- lambda
        Function<String, Integer> function = Integer::parseInt;
        Integer strParsed = function.apply(num1);

        IO.println(strParsed + num2);

        IO.println("------");

        //Reference by constructor
        // BiFunction<String, String, Movie> factory = (title, year) -> new Movie(title, year); <- lambda
        BiFunction<String, String, Movie> factory = Movie::new;

        Movie movie = factory.apply("Inception", "2010");
        Movie movie2 = factory.apply("Interestelar", "2000");
        Movie movie3 = factory.apply("El conjuro", "2013");

        IO.println(movie);
        IO.println(movie2);
        IO.println(movie3);

        IO.println("------");

        //Reference by arbitrary
        String str = "Hello world";
        //Function<String, Integer> functionArbitrary = s -> s.length();
        Function<String, Integer> functionArbitrary = String::length;

        IO.println(functionArbitrary.apply(str));

    }
}
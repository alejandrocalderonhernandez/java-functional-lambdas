package com.debuggeandoideas;

public record VideoGame(
        String title,
        String genre,
        String studio,
        int year,
        double rating
) {}
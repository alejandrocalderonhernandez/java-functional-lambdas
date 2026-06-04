package com.debuggeandoideas.dtos;

public record Ticket(
        String event,
        String venue,
        String category,     // GENERAL, VIP, PLATINUM

        double basePrice,
        int quantity,

        User user
) {}
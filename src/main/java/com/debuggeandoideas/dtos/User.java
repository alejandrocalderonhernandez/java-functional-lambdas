package com.debuggeandoideas.dtos;

public record User(
        String name,
        String email,

        boolean loyaltyMember,
        boolean activeLastMonth,
        boolean eligibleCard,

        int loyaltyPoints
) {}

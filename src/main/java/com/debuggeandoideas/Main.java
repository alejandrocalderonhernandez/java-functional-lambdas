package com.debuggeandoideas;

public class Main {

    public static void main(String[] args) {

    /*
        Ticket ticket = new Ticket(
                "Coldplay World Tour",
                "Foro Sol",
                "GENERAL",
                850.0, 2,
                new User("Alejandro", "alejandro@mail.com",
                        true,  true,  true,
                        150
        ));

        PricingStrategy<Ticket, Double> traditional    = PricingStrategies.traditional;
        PricingStrategy<Ticket, Double> combo          = PricingStrategies.combo;
        PricingStrategy<Ticket, Double> vipClub        = PricingStrategies.vipClub;
        PricingStrategy<Ticket, Double> loyaltyPoints  = PricingStrategies.loyaltyPoints;

        IO.println("Traditional:    $" + traditional.calculate(ticket));
        IO.println("Combo:          $" + combo.calculate(ticket));
        IO.println("VIP Club:       $" + vipClub.calculate(ticket));
        IO.println("Loyalty Points: $" + loyaltyPoints.calculate(ticket));

    */

    /*

        User user1 = new User("Alejandro", "alejandro@mail.com", true,  true,  true,  150);
        User user2 = new User("María",     "debuggeandoideas@mail.com",     true,  false, true,  0);
        User user3 = new User("Carlos",    "user@mail.com",    false, false, false, 0);

        List<BusinessValidator<User>> validators = List.of(
            UserValidators.isLoyaltyMember,
            UserValidators.wasActiveLastMonth,
            UserValidators.hasEligibleCard,
            UserValidators.isPayingWithPoints
        );

        IO.println("Alejandro aplica descuento: " + applyAll(validators, user1)); // true
        IO.println("María aplica descuento:     " + applyAll(validators, user2)); // false
        IO.println("Carlos aplica descuento:    " + applyAll(validators, user3)); // false
     */


    }
}
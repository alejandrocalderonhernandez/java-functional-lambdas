package com.debuggeandoideas.impl;

import com.debuggeandoideas.interfaces.Calculator;

public class CalculatorImpl {

    private CalculatorImpl() {}

    public static Calculator sum
            = (a, b) -> a + b;

    public static Calculator subs
            = (a, b) -> a - b;

    public static Calculator multiply
            = (a, b) -> a * b;


    public static Calculator min
            = (a, b) -> Math.min(a, b);
}

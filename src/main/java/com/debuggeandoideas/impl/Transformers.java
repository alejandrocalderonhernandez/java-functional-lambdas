package com.debuggeandoideas.impl;

import com.debuggeandoideas.interfaces.TransformFunc;

public class Transformers {

    private Transformers() {}

    public static TransformFunc<String> tuUpperCase =
            str -> str.toUpperCase();

    public static TransformFunc<Double> floor =
            num -> Math.floor(num);

    public static TransformFunc<String> toLowerCase =
            str -> str.toLowerCase();
}

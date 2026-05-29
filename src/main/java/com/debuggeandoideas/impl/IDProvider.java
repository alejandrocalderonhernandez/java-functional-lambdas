package com.debuggeandoideas.impl;

import com.debuggeandoideas.interfaces.Provider;

import java.util.UUID;

public class IDProvider {

    private IDProvider() {}

    public static Provider<String> uuid =
            () -> UUID.randomUUID().toString();

    public static Provider<Integer> randomInt =
            () -> (int) (Math.random() * 100);
}

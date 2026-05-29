package com.debuggeandoideas.interfaces;

@FunctionalInterface
public interface Provider<T> {

    T provide();
}

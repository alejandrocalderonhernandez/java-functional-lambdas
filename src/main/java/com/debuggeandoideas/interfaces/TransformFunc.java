package com.debuggeandoideas.interfaces;

@FunctionalInterface
public interface TransformFunc<T> {

    T transform(T t);
}

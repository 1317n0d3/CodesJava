package ru.svetashov.main;

public interface Action<T, Q> {
    Q act(T obj);
}

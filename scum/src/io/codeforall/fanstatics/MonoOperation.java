package io.codeforall.fanstatics;

public interface MonoOperation<T> {
    T operation(T value);
}
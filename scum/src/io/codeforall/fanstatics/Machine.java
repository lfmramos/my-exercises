package io.codeforall.fanstatics;

public class Machine<T> {

    public T operation(MonoOperation<T> operation, T value){
        return operation.operation(value);
    }

    public T operation(BiOperation<T> operation, T value1, T value2){
        return operation.operation(value1, value2);
    }
}
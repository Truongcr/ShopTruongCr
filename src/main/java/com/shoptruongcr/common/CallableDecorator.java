package com.shoptruongcr.common;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.function.BiConsumer;

public interface CallableDecorator {
    default <T> Callable<T> decorateCallable(Callable<T> callable) {
        return callable;
    }

    default <T> boolean decorateWhen(Callable<T> callable) {
        return true;
    }

    default <T> BiConsumer<Future<T>, Callable<T>> afterSubmit() {
        return (future, callable) -> {};
    }
}

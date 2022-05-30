package com.shoptruongcr.common;

import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.util.concurrent.ListenableFuture;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.function.BiConsumer;

public class CallableDecoratorThreadPoolExecutor extends ThreadPoolTaskExecutor implements CallableDecorator{

    private static final long serialVersionUID = 1L;



    @Override
    public <T> Future<T> submit(Callable<T> task) {
        if ( decorateWhen(task) ) {
            Future<T> future = super.submit(decorateCallable(task));
            BiConsumer<Future<T>, Callable<T>> consumer = afterSubmit();
            consumer.accept(future, task);
            return future;
        }

        throw new PWException("Unsupported Callable");
    }



    @Override
    public <T> ListenableFuture<T> submitListenable(Callable<T> task) {
        if ( decorateWhen(task) ) {
            ListenableFuture<T> future = super.submitListenable(decorateCallable(task));
            BiConsumer<Future<T>, Callable<T>> consumer = afterSubmit();
            consumer.accept(future, task);
            return future;
        }

        throw new PWException("Unsupported Callable");
    }
}

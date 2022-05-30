//package com.shoptruongcr.common;
//
//import java.util.concurrent.Callable;
//
//public class LoggingThreadPoolExecutor extends CallableDecoratorThreadPoolExecutor {
//
//    private static final long serialVersionUID = 1L;
//
//
//
//    @Override
//    public <T> Callable<T> decorateCallable(Callable<T> callable) {
//        return new LoggingCallable<T>(super.decorateCallable(callable));
//    }
//}

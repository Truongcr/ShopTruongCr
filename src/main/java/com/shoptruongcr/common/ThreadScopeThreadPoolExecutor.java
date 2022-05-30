//package com.shoptruongcr.common;
//
//import java.util.concurrent.Callable;
//
//public class ThreadScopeThreadPoolExecutor  extends  LoggingThreadPoolExecutor{
//    private static final long serialVersionUID = 1L;
//
//
//
//    @Override
//    public <T> Callable<T> decorateCallable(Callable<T> callable) {
//        return new ThreadScopeCallable<T>(super.decorateCallable(callable));
//    }
//}

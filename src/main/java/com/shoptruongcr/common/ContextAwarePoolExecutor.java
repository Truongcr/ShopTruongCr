//package com.shoptruongcr.common;
//
//import java.util.concurrent.Callable;
//
//public class ContextAwarePoolExecutor extends ThreadScopeThreadPoolExecutor{
//    private static final long serialVersionUID = 1L;
//
//    @Override
//    public <T> boolean decorateWhen(Callable<T> callable) {
//        return callable instanceof ReportCallable;
//    }
//
//
//
//    @Override
//    public <T> Callable<T> decorateCallable(Callable<T> callable) {
//        return new ContextAwareCallable<T>(
//                super.decorateCallable(callable),
//                SecurityContextHolder.getContext(),
//                RequestContextHolder.getRequestAttributes(),
//                getReportRequestContext(callable)
//        );
//    }
//
//    private <T> ReportRequestContext getReportRequestContext(Callable<T> task) {
//        return ReportRequestContext.builder()
//                .recordSource(getRecordSourceByContext())
//                .requestId(getRequestId(task))
//                .build();
//    }
//
//    protected <T> String getRequestId(Callable<T> task) {
//        if ( task instanceof ReportCallable ) {
//            ReportCallable<T> reportCallableTask = (ReportCallable<T>) task;
//            return reportCallableTask.getRequestId();
//        }
//
//        return null;
//    }
//
//    private RecordSource getRecordSourceByContext() {
//        RecordSource recordSource;
//        if ( ReportRequestContextHolder.existReportRequestContext() ) {
//            recordSource = ReportRequestContextHolder.currentReportRequestContext().getRecordSource();
//        } else {
//            recordSource = HeaderUtil.getPortalCode();
//        }
//
//        return recordSource;
//    }
//}

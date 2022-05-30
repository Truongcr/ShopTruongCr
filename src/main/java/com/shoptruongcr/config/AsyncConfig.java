package com.shoptruongcr.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

public class AsyncConfig {
    private static final String CORE_POOL_SIZE_EXPRESSION = "${async.executor.core-size}";
    private static final String MAX_POOL_SIZE_EXPRESSION = "${async.executor.max-size}";
    private static final String QUEUE_CAPACITY_EXPRESSION = "${async.executor.queue-capacity}";
    private static final String THREAD_NAME_PREFIX_EXPRESSION = "${sasync.executor.thread-name-prefix}";

    @Value(CORE_POOL_SIZE_EXPRESSION)
    private int corePoolSize;
    @Value(MAX_POOL_SIZE_EXPRESSION)
    private int maxPoolSize;
    @Value(QUEUE_CAPACITY_EXPRESSION)
    private int queueCapacity;
    @Value(THREAD_NAME_PREFIX_EXPRESSION)
    private String threadNamePrefix;
    @Bean
    public ThreadPoolTaskExecutor asyncExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(corePoolSize);
        executor.setMaxPoolSize(maxPoolSize);
        executor.setQueueCapacity(queueCapacity);
        executor.setThreadNamePrefix(threadNamePrefix);
        executor.initialize();
        return executor;
    }
}

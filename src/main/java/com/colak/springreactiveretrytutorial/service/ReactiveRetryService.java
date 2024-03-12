package com.colak.springreactiveretrytutorial.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@Slf4j
public class ReactiveRetryService {
    private int attemptCount = 0;

    @Retryable(retryFor = {RuntimeException.class}, maxAttempts = 3, backoff = @Backoff(delay = 1000))
    public Mono<String> performRetryableOperation() {
        attemptCount++;
        log.info("Attempt " + attemptCount);
        if (attemptCount < 3) {
            throw new RuntimeException("Simulating a transient failure");
        }
        return Mono.just("Operation succeeded after " + attemptCount + " attempts");
    }
}

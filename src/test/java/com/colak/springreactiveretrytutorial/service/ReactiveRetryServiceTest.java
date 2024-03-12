package com.colak.springreactiveretrytutorial.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.test.StepVerifier;

@SpringBootTest
class ReactiveRetryServiceTest {
    @Autowired
    private ReactiveRetryService reactiveRetryService;

    @Test
    void testRetryableOperationSuccess() {
        StepVerifier.create(reactiveRetryService.performRetryableOperation())
                .expectNext("Operation succeeded after 3 attempts")
                .verifyComplete();
    }

}

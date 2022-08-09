package com.amazonaws.codesamples.job;

import org.springframework.stereotype.Component;

@Component
public class BadgeFillJob extends Job {
    @Override
    protected void run(String... args) {

        while (true) {
            try {
                Thread.sleep(2000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(System.currentTimeMillis());
        }
    }
}

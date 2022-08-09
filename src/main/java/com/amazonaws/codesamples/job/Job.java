package com.amazonaws.codesamples.job;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class Job {

    public void start(String ... args) {

        log.info("{} start!!", this.getClass().getSimpleName());

        try {
            this.run(args);
        } catch (Exception e) {
            log.error("{} fail: {}", this.getClass().getSimpleName(), e.getMessage(), e);
        }finally {
            log.info("{} success!!", this.getClass().getSimpleName());
        }

    }

    protected abstract void run(String ... args);

}

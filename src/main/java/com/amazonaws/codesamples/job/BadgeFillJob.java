package com.amazonaws.codesamples.job;

import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.model.Message;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
@Slf4j
public class BadgeFillJob extends Job {

    public static final String QUEUE_URL = "https://sqs.ap-northeast-2.amazonaws.com/692609349536/dynamo-test-q";

    private final AmazonSQS sqs;

    @Override
    protected void run(String... args) {

        while (true) {
            List<Message> messages = sqs.receiveMessage(QUEUE_URL).getMessages();
            if (messages.size() > 0) {
                log.info("sqs: {}", messages.get(0).getBody());
            }

            try {
                Thread.sleep(2000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            log.info("{}", System.currentTimeMillis());
        }
    }
}

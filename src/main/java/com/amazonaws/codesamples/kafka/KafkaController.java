package com.amazonaws.codesamples.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class KafkaController {

    @Autowired
    KafkaTemplate kafkaTemplate;

    @GetMapping("/ksend")
    public void send() {
        kafkaTemplate.send("topic1", "hello");
    }

    @KafkaListener(topics = "topic1", groupId = "g1")
    public void listen(@Payload String payload, @Header(KafkaHeaders.RECEIVED_PARTITION) int partition) {
        log.info("--------------------");
        log.info("partion:{}, payload:{}", partition, payload);
        log.info("--------------------");
    }

}

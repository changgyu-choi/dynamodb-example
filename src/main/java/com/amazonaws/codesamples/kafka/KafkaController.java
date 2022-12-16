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

  /*  @Autowired
    KafkaTemplate<String, String> kafkaTemplate;

    @GetMapping("/ksend")
    public void send() {
        String key = String.valueOf(System.currentTimeMillis());
        kafkaTemplate.send("topic1", key, "hello");
    }

    @KafkaListener(topics = "topic1", groupId = "g1")
    public void listen(@Payload String payload,
                       @Header(KafkaHeaders.RECEIVED_PARTITION) int partition,
                       @Header(KafkaHeaders.RECEIVED_KEY) String key) {
        log.info("--------------------");
        log.info("partition:{}, key:{}, payload:{}", partition, key, payload);
        log.info("--------------------");
    }*/

}

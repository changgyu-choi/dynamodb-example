package com.amazonaws.codesamples;

import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClientBuilder;
import com.amazonaws.services.sqs.model.Message;
import com.amazonaws.services.sqs.model.SendMessageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QueueController {

    public static final String QUEUE_URL = "https://sqs.ap-northeast-2.amazonaws.com/692609349536/dynamo-test-q";

    @GetMapping("/publish/{msg}")
    public String publish(@PathVariable String msg) {
        AmazonSQS sqs = AmazonSQSClientBuilder.defaultClient();
        SendMessageRequest send_msg_request = new SendMessageRequest().withQueueUrl(QUEUE_URL).withMessageBody(msg).withDelaySeconds(5);
        sqs.sendMessage(send_msg_request);
        return "Ok";
    }

    @GetMapping("/listen")
    public String listen() {
        AmazonSQS sqs = AmazonSQSClientBuilder.defaultClient();
        List<Message> messages = sqs.receiveMessage(QUEUE_URL).getMessages();
        return messages.get(0).getBody();
    }
}

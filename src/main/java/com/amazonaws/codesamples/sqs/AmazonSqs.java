package com.amazonaws.codesamples.sqs;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AmazonSqs {

    @Bean
    public AmazonSQS amazonSQS2() {
        return AmazonSQSClientBuilder.standard().withRegion(Regions.AP_NORTHEAST_2).build();
    }

}

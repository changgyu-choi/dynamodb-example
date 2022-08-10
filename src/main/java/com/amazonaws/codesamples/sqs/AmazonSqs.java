package com.amazonaws.codesamples.sqs;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class AmazonSqs {

    @Bean
    @Profile("default")
    public AmazonSQS amazonSQS1() {
        AWSCredentialsProvider credentials = new ProfileCredentialsProvider("sandbox");
        return AmazonSQSClientBuilder.standard().withCredentials(credentials).withRegion(Regions.AP_NORTHEAST_2).build();
    }

    @Bean
    @Profile("!default")
    public AmazonSQS amazonSQS2() {
        return AmazonSQSClientBuilder.standard().withRegion(Regions.AP_NORTHEAST_2).build();
    }

}

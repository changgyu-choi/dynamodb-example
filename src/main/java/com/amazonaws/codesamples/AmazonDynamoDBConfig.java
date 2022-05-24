package com.amazonaws.codesamples;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class AmazonDynamoDBConfig {

    @Profile("default")
    @Bean
    public AmazonDynamoDB amazonDynamoDB1() {
        AWSCredentialsProvider baseCredentials = new ProfileCredentialsProvider("sandbox");
        return AmazonDynamoDBClientBuilder.standard()
                .withRegion(Regions.AP_NORTHEAST_2)
                .withCredentials(baseCredentials)
                .build();
    }

    @Profile("local-docker")
    @Bean
    public AmazonDynamoDB amazonDynamoDB2() {
        BasicAWSCredentials basicAWSCredentials = new BasicAWSCredentials("AKIA2CQV366QHC5UKGYP",
                "xBsVwDnDv1OxRO+TsYt7k3YYVLGNWHxUcCe0y6/n");
        AWSStaticCredentialsProvider baseCredentialsProvider = new AWSStaticCredentialsProvider(basicAWSCredentials);
        return AmazonDynamoDBClientBuilder.standard()
                .withRegion(Regions.AP_NORTHEAST_2)
                .withCredentials(baseCredentialsProvider)
                .build();
    }

    @Profile(value = {"testing", "staging", "production"})
    @Bean
    public AmazonDynamoDB amazonDynamoDB3() {
        return AmazonDynamoDBClientBuilder.standard()
                .build();
    }
}

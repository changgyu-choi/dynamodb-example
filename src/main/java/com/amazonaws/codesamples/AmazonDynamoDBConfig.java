package com.amazonaws.codesamples;

<<<<<<< Updated upstream
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
=======
>>>>>>> Stashed changes
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AmazonDynamoDBConfig {

    @Bean
    public AmazonDynamoDB amazonDynamoDB1() {
        return AmazonDynamoDBClientBuilder.standard()
                .withRegion(Regions.AP_NORTHEAST_2)
<<<<<<< Updated upstream
                .withCredentials(baseCredentials)
                .build();
    }

    @Profile("!default")
    @Bean
    public AmazonDynamoDB amazonDynamoDB3() {
        return AmazonDynamoDBClientBuilder.standard()
                .withRegion(Regions.AP_NORTHEAST_2)
=======
>>>>>>> Stashed changes
                .build();
    }
}

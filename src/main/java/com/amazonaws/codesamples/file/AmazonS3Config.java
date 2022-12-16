package com.amazonaws.codesamples.file;


import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;

@Configuration
public class AmazonS3Config {

    @Profile("!default")
    @ConditionalOnMissingBean
    @Bean
    public AmazonS3 amazonS3()  {
        return AmazonS3ClientBuilder.standard().withRegion(Regions.AP_NORTHEAST_2).build();
    }

    @Profile("default")
    @ConditionalOnMissingBean
    @Bean
    public AmazonS3 defaultAmazonS3()  {
        return AmazonS3ClientBuilder.standard()
                .withRegion(Regions.AP_NORTHEAST_2)
                .withCredentials(new ProfileCredentialsProvider("sandbox"))
                .build();
    }
}

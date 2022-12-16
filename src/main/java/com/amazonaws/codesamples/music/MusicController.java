package com.amazonaws.codesamples.music;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MusicController {

    private AmazonDynamoDB amazonDynamoDB;

    /*public MusicController(AmazonDynamoDB amazonDynamoDB) {
        this.amazonDynamoDB = amazonDynamoDB;
    }

    @GetMapping("/music")
    public String sayHello() {
        DynamoDBMapper mapper = new DynamoDBMapper(amazonDynamoDB);

        Music music = mapper.load(Music.class, "방탄소년단", "봄날");
        return music.getArtist() + ":" + music.getSongTitle();
    }*/
}

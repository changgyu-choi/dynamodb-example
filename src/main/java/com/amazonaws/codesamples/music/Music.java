package com.amazonaws.codesamples.music;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "Music")
public class Music {

    private String artist;
    private String songTitle;

    @DynamoDBHashKey(attributeName = "Artist")
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @DynamoDBRangeKey(attributeName = "SongTitle")
    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    @Override
    public String toString() {
        return "Music [Artist=" + artist + ", SongTitle=" + songTitle + "]";
    }
}
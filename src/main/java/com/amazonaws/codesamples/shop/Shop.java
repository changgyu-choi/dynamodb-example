package com.amazonaws.codesamples.shop;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@Setter
@Getter
@RedisHash("shop")
public class Shop {

    @Id
    private String id;
    private String name;

    public Shop(String id, String name) {
        this.id = id;
        this.name = name;
    }


}

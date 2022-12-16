package com.amazonaws.codesamples.shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableRedisRepositories
public class ShopRedisController {

    @Autowired
    private ShopRepository shopRepository;

   /* @PostMapping("/v1/shops")
    public void insert(){
        Shop shop = new Shop("PARAN", "파란헤어");
        shopRepository.save(shop);
    }

    @GetMapping("/v1/shops")
    public String select(){
        Shop shop = shopRepository.findById("PARAN").get();
        return shop.getName();
    }*/

}

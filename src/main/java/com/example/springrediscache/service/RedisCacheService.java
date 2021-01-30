package com.example.springrediscache.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class RedisCacheService {

    @Cacheable(cacheNames = "mySpecialCaching")
    public String longRunningMethod() throws InterruptedException{
        Thread.sleep(5000L);
        return  "Method was worked";
    }

    @CacheEvict(cacheNames = "mySpecialCaching")
    public void clearCache(){
        System.out.println("Cache is clear");
    }
}

package org.iona.currency;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by Bakhtiyor Ruziev on 21.06.15.
 *
 */
@EnableAutoConfiguration
@SpringBootApplication
@EnableCaching
@ImportResource("context.xml")
public class App {

    public static void main(String[] args)
    {
        SpringApplication.run(App.class, args);

    }

    @Bean
    public CacheManager cacheManager()
    {
        return new ConcurrentMapCacheManager( "findByDate", "findBetweenDate");
    }

}

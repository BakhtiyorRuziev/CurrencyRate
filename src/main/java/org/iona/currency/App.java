package org.iona.currency;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by Bakhtiyor Ruziev on 21.06.15.
 *
 */
@EnableAutoConfiguration
@SpringBootApplication
@ImportResource("context.xml")
public class App {

    public static void main(String[] args)
    {
        SpringApplication.run(App.class, args);

    }

}

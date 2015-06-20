package org.iona.currency;

import org.iona.currency.models.Currency;
import org.iona.currency.models.Rate;
import org.iona.currency.repository.RateRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by Bakhtiyor Ruziev on 21.06.15.
 *
 */
public class App {

    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");


    }

}

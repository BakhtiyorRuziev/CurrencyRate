package org.iona.currency.test;

import org.iona.currency.exceptions.RateNotFoundException;
import org.iona.currency.models.Rate;
import org.iona.currency.services.RateService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by Bakhtiyor Ruziev on 26.06.15.
 *
 *
 */


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:context.xml")
public class RateServiceTest {

    @Autowired
    RateService rateService;

    @Test
    public void service() throws Exception
    {

    }

    @Test
    public void serviceNotFound() throws Exception {
        Rate rate = rateService.findByDate(20121212);
        Assert.assertNull(rate);
    }


    public void checkDiff() throws Exception {


    }








}


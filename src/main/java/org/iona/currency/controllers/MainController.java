package org.iona.currency.controllers;

import org.iona.currency.models.Rate;
import org.iona.currency.repository.RateRepository;
import org.iona.currency.services.RateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Bakhtiyor Ruziev on 25.06.15.
 *
 */

@RestController
@RequestMapping(name = "rate")
public class MainController {

    @Autowired
    RateRepository rateRepository;

    @Autowired
    RateService rateService;

    @RequestMapping(value = "/find-date/{date}.json", produces = "application/json")
    @ResponseBody
    public Rate findByDateJson(@PathVariable(value = "date") int date)
    {
        return rateService.findByDate(date);
    }


    @RequestMapping(value = "/find-date/{date}.xml", produces = "application/xml")
    @ResponseBody
    public Rate findByDateXml(@PathVariable(value = "date") int date)
    {
        return rateService.findByDate(date);
    }




    @RequestMapping(value = "/find-between-date/{s}/{e}.json", produces = {"application/json"})
    @ResponseBody
    public List<Rate> findByBetweenDateJson(@PathVariable(value = "s") int sDate,
                                        @PathVariable(value = "e") int eDate)
    {
        return rateService.findByBetweenDate(sDate, eDate);
    }

    @RequestMapping(value = "/find-between-date/{s}/{e}.xml", produces = {"application/xml"})
    @ResponseBody
    public List<Rate> findByBetweenDateXml(@PathVariable(value = "s") int sDate,
                                        @PathVariable(value = "e") int eDate)
    {
        return rateService.findByBetweenDate(sDate, eDate);
    }










}

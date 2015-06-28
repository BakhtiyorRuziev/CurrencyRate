package org.iona.currency.services;

import org.iona.currency.models.Rate;
import org.iona.currency.repository.RateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by Bakhtiyor Ruziev on 25.06.15.
 *
 */
@Service
public class RateService {

    @Autowired
    RateRepository rateRepository;

    public Rate findByDate(int date) {

        return rateRepository.findByDate(date);
    }

    public List<Rate> findByBetweenDate(int sDate, int eDate)
    {

        return rateRepository.findBetweenDate(sDate, eDate)
                .stream()
                .sorted((o1, o2) -> Integer.compare(o1.getDate(),o2.getDate()))
                .collect(Collectors.toList());

    }





}

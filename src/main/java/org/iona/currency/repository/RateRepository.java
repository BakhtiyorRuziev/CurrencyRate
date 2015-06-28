package org.iona.currency.repository;

import org.iona.currency.models.Rate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * Created by Bakhtiyor Ruziev on 21.06.15.
 *
 */
public interface RateRepository extends MongoRepository<Rate, String> {


    @Query("{date:?0}")
    public Rate findByDate(int date);

    @Query("{date: {$gte: ?0, $lte: ?1}}")
    public List<Rate> findBetweenDate(int fromDate, int toDate);



}

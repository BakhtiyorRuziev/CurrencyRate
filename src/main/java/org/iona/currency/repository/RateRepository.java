package org.iona.currency.repository;

import org.iona.currency.models.Rate;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Bakhtiyor Ruziev on 21.06.15.
 *
 */
public interface RateRepository extends MongoRepository<Rate, String> {



}

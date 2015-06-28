package org.iona.currency.exceptions;

/**
 * Created by Bakhtiyor Ruziev on 28.06.15.
 *
 */
public class RateNotFoundException extends Exception {

    public RateNotFoundException() {
        super("Rate not found");
    }
}

package org.iona.currency.models;

import java.math.BigDecimal;

/**
 * Created by Bakhtiyor Ruziev on 21.06.15.
 *
 */
public class Currency {

    private String code;
    private BigDecimal rate;

    public Currency(String code, BigDecimal rate) {
        this.code = code;
        this.rate = rate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "code='" + code + '\'' +
                ", rate=" + rate +
                '}';
    }
}

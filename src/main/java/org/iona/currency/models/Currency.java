package org.iona.currency.models;

import javax.xml.bind.annotation.XmlElement;
import java.math.BigDecimal;

/**
 * Created by Bakhtiyor Ruziev on 21.06.15.
 *
 */
public class Currency {


    private String code;

    private String charCode;

    private BigDecimal rate;

    private BigDecimal diffPercentPreviousDay;

    private BigDecimal diffAmountPreviouseDay;

    public Currency(String code, String charCode, BigDecimal rate) {
        this.code = code;
        this.charCode = charCode;
        this.rate = rate;
    }

    public Currency() {
    }

    @XmlElement(name = "code")
    public String getCode() {
        return code;
    }


    public void setCode(String code) {
        this.code = code;
    }

    @XmlElement(name = "rate")
    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    @XmlElement(name = "charCode")
    public String getCharCode() {
        return charCode;
    }

    @XmlElement(name = "diffPercentPreviousDay")
    public BigDecimal getDiffPercentPreviousDay() {
        return diffPercentPreviousDay;
    }

    public void setDiffPercentPreviousDay(BigDecimal diffPercentPreviousDay) {
        this.diffPercentPreviousDay = diffPercentPreviousDay;
    }

    @XmlElement(name = "diffAmountPreviouseDay")
    public BigDecimal getDiffAmountPreviouseDay() {
        return diffAmountPreviouseDay;
    }

    public void setDiffAmountPreviouseDay(BigDecimal diffAmountPreviouseDay) {
        this.diffAmountPreviouseDay = diffAmountPreviouseDay;
    }

    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }



    @Override
    public String toString() {
        return "Currency{" +
                "code='" + code + '\'' +
                ", charCode='" + charCode + '\'' +
                ", rate=" + rate +
                '}';
    }
}

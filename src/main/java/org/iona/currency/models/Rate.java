package org.iona.currency.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.util.List;

/**
 * Created by Bakhtiyor Ruziev on 21.06.15.
 *
 */

@Document(collection = "currency")
@XmlRootElement(name = "rate")
public class Rate {

    @Id
    private String id;


    private int date;


    private List<Currency> currencies;

    public Rate(String date, List<Currency> currencies) {
        setDate(date);
        this.currencies = currencies;
    }

    public Rate() {
    }

    @XmlTransient
    @JsonIgnore
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @XmlElement(name = "date")
    public int getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = Integer.parseInt(date);
    }

    public List<Currency> getCurrencies() {
        return currencies;
    }

    @XmlElement(name = "currency")
    public void setCurrencies(List<Currency> currencies) {
        this.currencies = currencies;
    }

    @Override
    public String toString() {
        return "Rate{" +
                "id='" + id + '\'' +
                ", date='" + date + '\'' +
                ", currencies=" + currencies +
                '}';
    }
}

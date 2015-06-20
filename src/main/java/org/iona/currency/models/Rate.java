package org.iona.currency.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Created by Bakhtiyor Ruziev on 21.06.15.
 *
 */

@Document(collection = "currency")
public class Rate {

    @Id
    private String id;

    private String date;

    private List<Currency> currencies;

    public Rate(String date, List<Currency> currencies) {
        this.date = date;
        this.currencies = currencies;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Currency> getCurrencies() {
        return currencies;
    }

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

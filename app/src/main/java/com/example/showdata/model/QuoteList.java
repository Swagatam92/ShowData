package com.example.showdata.model;

public class QuoteList {
    String market_cap, price, percent_change_1h;

    public QuoteList(String market_cap, String price, String percent_change_1h) {
        this.market_cap = market_cap;
        this.price = price;
        this.percent_change_1h = percent_change_1h;
    }

    public String getMarket_cap() {
        return market_cap;
    }

    public void setMarket_cap(String market_cap) {
        this.market_cap = market_cap;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPercent_change_1h() {
        return percent_change_1h;
    }

    public void setPercent_change_1h(String percent_change_1h) {
        this.percent_change_1h = percent_change_1h;
    }
}

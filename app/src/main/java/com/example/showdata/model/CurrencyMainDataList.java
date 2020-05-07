package com.example.showdata.model;

public class CurrencyMainDataList {
    String name;
    String symbol,total_supply;
    USD quote;

    public CurrencyMainDataList(String name, String symbol, String total_supply, USD quote) {
        this.name = name;
        this.symbol = symbol;
        this.total_supply = total_supply;
        this.quote = quote;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getTotal_supply() {
        return total_supply;
    }

    public void setTotal_supply(String total_supply) {
        this.total_supply = total_supply;
    }

    public USD getQuote() {
        return quote;
    }

    public void setQuote(USD quote) {
        this.quote = quote;
    }
}

package com.example.showdata.model;

import java.util.ArrayList;

public class DataList {
    StatusList status;
    ArrayList<CurrencyMainDataList> data = new ArrayList<>();

    public DataList(StatusList status, ArrayList<CurrencyMainDataList> data) {
        this.status = status;
        this.data = data;
    }

    public StatusList getStatus() {
        return status;
    }

    public void setStatus(StatusList status) {
        this.status = status;
    }

    public ArrayList<CurrencyMainDataList> getData() {
        return data;
    }

    public void setData(ArrayList<CurrencyMainDataList> data) {
        this.data = data;
    }
}

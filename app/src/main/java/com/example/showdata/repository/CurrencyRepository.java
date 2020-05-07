package com.example.showdata.repository;

import android.app.Application;

import com.example.showdata.ApiInterface.APIService;
import com.example.showdata.model.CurrencyMainDataList;
import com.example.showdata.model.DataList;
import com.example.showdata.retrofitSingletone.CurrencyInstance;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CurrencyRepository {
    private Application application;
    public MutableLiveData<DataList> postsMutableLiveData = new MutableLiveData<>();
    MutableLiveData<List<CurrencyMainDataList>> currencyMainDataLists = new MutableLiveData<>();

    public CurrencyRepository(Application application) {
        this.application = application;
    }
    public LiveData<List<CurrencyMainDataList>> fetchAlldata() {
        APIService apiService = CurrencyInstance.getApiService();
        Call<DataList> call = apiService.getAllData();
        call.enqueue(new Callback<DataList>() {
            @Override
            public void onResponse(Call<DataList> call, Response<DataList> response) {

                postsMutableLiveData.setValue(response.body());
                currencyMainDataLists.setValue(postsMutableLiveData.getValue().getData());

            }

            @Override
            public void onFailure(Call<DataList> call, Throwable t) {

            }
        });
        return currencyMainDataLists;
    }
}

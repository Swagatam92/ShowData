package com.example.showdata.retrofitSingletone;

import com.example.showdata.ApiInterface.APIService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CurrencyInstance {
    private static final String BASE_URL = "https://pro-api.coinmarketcap.com/v1/cryptocurrency/listings/";
    private static volatile Retrofit retrofit = null;
    public static APIService getApiService() {
        if (retrofit == null) {
            synchronized (CurrencyInstance.class) {
                if (retrofit == null) {
                    retrofit = new Retrofit
                            .Builder()
                            .baseUrl(BASE_URL)
                            .addConverterFactory(GsonConverterFactory.create())
                            .build();
                }
            }
        }
        return retrofit.create(APIService.class);
    }
}

package com.example.showdata.ApiInterface;


import com.example.showdata.model.DataList;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by lenovo on 3/31/2018.
 */

public interface APIService {

  /*  @FormUrlEncoded
    @POST("/loginview/logintab.php")
    Call<String> userlogincall(@Field("username") String username, @Field("userpass") String userpass);*/

    @Headers({"Accept: application/json", "X-CMC_PRO_API_KEY: afe46205-87ba-426d-883d-4d67b5e9e695"})
    @GET("latest")
    Call<DataList> getAllData();




}

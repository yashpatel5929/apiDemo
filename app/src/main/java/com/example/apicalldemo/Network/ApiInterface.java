package com.example.apicalldemo.Network;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    //doing some changes in API_interface
    @GET("getmoviedetail")
    Call<Void> getMovieDetail(@Query("page_no") String page_no);
}

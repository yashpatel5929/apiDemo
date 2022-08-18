package com.example.apicalldemo.Network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

//first squash commit
public class ApiClient {
    //making retrofit builder
    //adding one more line for testing to make master branch ahead of featured branch
    public static final String BASE_URL = "https://userqaapi.plexigo.com/api/content/";
    private static Retrofit retrofit = null;

    public static Retrofit getClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;

        //commit to checking push and commit working from android studio itself or not
    }
}

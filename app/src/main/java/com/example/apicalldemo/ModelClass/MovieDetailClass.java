package com.example.apicalldemo.ModelClass;

import static android.content.ContentValues.TAG;

import android.util.Log;

import com.example.apicalldemo.Network.ApiClient;
import com.example.apicalldemo.Network.ApiInterface;
import com.example.apicalldemo.contract.Contract;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MovieDetailClass implements Contract.ModelClass {
    @Override
    public void getMovieDetail(OnChangeListerner onChangeListerner, String page_no) {
        ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);

        Call<Void> call = apiInterface.getMovieDetail(page_no);
        call.enqueue(new Callback<Void>() {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {

                Log.d(TAG, "onResponse: " + response.body());
                onChangeListerner.onFinished();
            }

            @Override
            public void onFailure(Call<Void> call, Throwable t) {
                Log.d(TAG, "onResponse: " + t.getMessage());
                onChangeListerner.onFailure();
            }
        });
    }
}

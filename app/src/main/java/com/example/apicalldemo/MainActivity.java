package com.example.apicalldemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.apicalldemo.Presenter.MovieDetailPresenter;
import com.example.apicalldemo.contract.Contract;
//first comment for squash
//second comment for squash
public class MainActivity extends AppCompatActivity implements Contract.View {
    private MovieDetailPresenter movieDetailPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movieDetailPresenter = new MovieDetailPresenter(this);
        movieDetailPresenter.requestDataFromServer();

    }

    @Override
    public void showProgress() {
        //show progress
    }

    @Override
    public void hideProgress() {
        //hide progressbar
    }

}
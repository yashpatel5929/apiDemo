package com.example.apicalldemo.Presenter;

import com.example.apicalldemo.ModelClass.MovieDetailClass;
import com.example.apicalldemo.contract.Contract;

public class MovieDetailPresenter implements Contract.Presenter , Contract.ModelClass.OnChangeListerner {

    private Contract.View movieDetailView;
    private Contract.ModelClass movieDetailModel;
    public MovieDetailPresenter(Contract.View movieDetailView) {
        this.movieDetailView = movieDetailView;
        movieDetailModel= new MovieDetailClass();
    }


    @Override
    public void onFinished() {
        //set data
    }

    @Override
    public void onFailure() {
        //hanle exception
        movieDetailView.hideProgress();
    }


    @Override
    public void getMoreData(String pageNo) {
        movieDetailModel.getMovieDetail(this, pageNo);
    }

    @Override
    public void requestDataFromServer() {
        if(movieDetailView!= null){
            movieDetailView.showProgress();
        }
        movieDetailModel.getMovieDetail(this, "77");
    }
}

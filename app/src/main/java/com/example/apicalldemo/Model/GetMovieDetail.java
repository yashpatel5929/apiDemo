package com.example.apicalldemo.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class GetMovieDetail {

    @SerializedName("title")
    private String title;

    @SerializedName("status")
    private String status;

    public String getStatus(){return status;}

    public void setStatus(String status){
        this.status = status;
    }

    public String getTitle(){return title;}

    public void setTitle(String title){
        this.title = title;
    }


}

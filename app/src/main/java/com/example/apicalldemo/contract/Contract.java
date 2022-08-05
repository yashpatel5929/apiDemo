package com.example.apicalldemo.contract;

public interface Contract {

    interface ModelClass{
        interface OnChangeListerner{
            void onFinished();

            void onFailure();
        }

        void getMovieDetail(OnChangeListerner onChangeListerner, String page_no);
    }

    interface View {

        void showProgress();

        void hideProgress();


    }

    interface Presenter {

        void getMoreData(String pageNo);

        void requestDataFromServer();

    }


}

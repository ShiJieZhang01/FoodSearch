package com.yang.foodsearch.mvp.precenter;

import android.util.Log;

import com.yang.foodsearch.mvp.contract.HomeContract;


/**
 * Created by admin on 17/4/12.
 */

public class HomePresenter implements HomeContract.Presenter {

    private HomeContract.MvpView mvpView;
    private static final String TAG = "HomePresenter zsj TAG";

    public HomePresenter(HomeContract.MvpView mvpView) {
        this.mvpView = mvpView;
        this.mvpView.attachPresenter(this);
    }

    @Override
    public void subscribe() {
        Log.d(TAG, "subscribe: ");
    }

    @Override
    public void unSubscribe() {

    }

    @Override
    public void showName() {
        Log.d(TAG, "showName: ");
    }
}

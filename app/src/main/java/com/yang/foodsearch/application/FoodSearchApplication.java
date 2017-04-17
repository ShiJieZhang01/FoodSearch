package com.yang.foodsearch.application;

import android.app.Application;

import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.model.LatLng;

/**
 * Created by admin on 17/4/14.
 */

public class FoodSearchApplication extends Application{
    public LatLng lastpoint;
    private static FoodSearchApplication application;
    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
        SDKInitializer.initialize(getApplicationContext());
    }

    public LatLng getLastpoint() {
        return lastpoint;
    }

    public void setLastpoint(LatLng lastpoint) {
        this.lastpoint = lastpoint;
    }

    public static FoodSearchApplication getInstance(){
        return application;
    }
}

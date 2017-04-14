package com.yang.foodsearch.mvp.contract;


import com.yang.foodsearch.mvp.precenter.BasePresenter;
import com.yang.foodsearch.mvp.view.BaseMvpView;

/**
 * Created by admin on 17/4/12.
 */

public interface HomeContract {
    interface Presenter extends BasePresenter {
        void showName();

    }
    interface MvpView extends BaseMvpView<Presenter> {

    }
}

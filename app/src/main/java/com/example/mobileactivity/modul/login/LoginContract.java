package com.example.mobileactivity.modul.login;

import com.example.mobileactivity.base.BasePresenter;
import com.example.mobileactivity.base.BaseView;

public interface LoginContract {
    interface View extends BaseView<Presenter> {
        void redirectToProfile();
    }

    interface Presenter extends BasePresenter {
        void performLogin(String email, String password);
    }
}

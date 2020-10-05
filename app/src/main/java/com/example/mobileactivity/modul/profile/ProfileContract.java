package com.example.mobileactivity.modul.profile;

import android.os.Bundle;

import com.example.mobileactivity.base.BasePresenter;
import com.example.mobileactivity.base.BaseView;

public interface ProfileContract {
    interface View extends BaseView<Presenter> {
        void showUser(String email, String password);
        void redirectToLogin();
    }

    interface Presenter extends BasePresenter {
        void getUserInfo(Bundle bundle);
        void performLogout();
    }
}

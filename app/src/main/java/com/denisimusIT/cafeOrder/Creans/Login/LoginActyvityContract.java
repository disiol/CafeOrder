package com.denisimusIT.cafeOrder.Creans.Login;

public interface LoginActyvityContract {
    interface LoginView {
        void showButtonLoginText();
    }

    interface Presenter {
        void onButtonWasClicked();
        void onDestroy();
    }

    interface Model {
        void loadButtonLoginText();
    }
}



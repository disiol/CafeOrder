package com.denisimusIT.cafeOrder.Creans.Login;

public interface LoginActyvityContract {
    interface LoginView {
        void showButtonLoginText();
        void sendLogotapeImage();
    }

    interface Presenter {
        void onButtonWasClicked();
        void onDestroy();
    }

    interface Model {
        void loadButtonLoginText();
        void loginValidator();
        void logotypeLoader();
    }
}



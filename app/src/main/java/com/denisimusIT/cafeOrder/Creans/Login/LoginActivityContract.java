package com.denisimusIT.cafeOrder.Creans.Login;

public interface LoginActivityContract {
    interface LoginView {
        void sendLogotapeImage();
        void showButtonLoginText();
    }

    interface LoginPresenter {
        void onButtonWasClicked();
        void onDestroy();
    }

    interface Model {
        void logotypeLoader();

        void loginValidator();

        void loadListOfGroup();

        void loadButtonLoginText();


    }
}



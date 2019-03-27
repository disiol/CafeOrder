package com.denisimusIT.cafeOrder.Model;

import com.denisimusIT.cafeOrder.Creans.Login.LoginActyvityContract;

public class Login implements LoginActyvityContract.Model {

    @Override
    public void logotypeLoader() {
      //TODO загружает логотип компании
    }

    @Override
    public void loginValidator() {
        // TODO  проверяет логин и пароль пользователя
    }

    @Override
    public void loadListOfGroup() {
        // TODO  выдает список груп пользователей клиент / продавец

    }

    @Override
    public void loadButtonLoginText() {
        //TODO проверяет какой тексть выбран в groupSelector и выдает текст кнопки
    }
}

package org.example.googleTest;

import io.qameta.allure.Step;

public class Authorization {

    @Step("Авторизация")
    public static void auth() {

        LoginPage loginPage = new LoginPage();
        loginPage.loginInput();
        loginPage.waitForProgressBar();
        loginPage.passwordInput();

    }
}

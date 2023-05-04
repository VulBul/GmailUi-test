package googleTest;

import io.qameta.allure.Step;

public class Authorization {

    @Step("Авторизация")
          public Authorization  auth (){

                  LoginPage loginPage = new LoginPage();
                  loginPage.loginInput();
                  loginPage.waitForProgressBar();
                  loginPage.passwordInput();

                    return this;
              }
}

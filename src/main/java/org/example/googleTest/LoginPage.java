package org.example.googleTest;

import io.qameta.allure.Step;
import org.example.constConfig.ConfigProvider;
import org.example.coreWebDriver.BaseSeleniumPage;
import org.example.misc.Rear;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BaseSeleniumPage {


    String URL = ConfigProvider.URL;
    String PASSWORD = ConfigProvider.PASSWORD;
    String LOGIN = ConfigProvider.LOGIN;

    public LoginPage() {

        driver.get(Rear.getUrl());
    }

    @Step("Заполнить поле Email")
    public LoginPage loginInput() {

        WebElement loginEmail = driver.findElement(By.xpath("//input[@type='email']"));
        loginEmail.sendKeys(Rear.getLogin(), Keys.ENTER);

        return this;
    }

    @Step("Дождаться, пока уйдет прогресс бар")
    public LoginPage waitForProgressBar() {
        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='password']")));

        return this;
    }

    @Step("Заполнить поле пароль")
    public LoginPage passwordInput() {
        WebElement pressPassword = driver.findElement(By.xpath("//input[@type='password']"));
        pressPassword.sendKeys(Rear.getPass(), Keys.ENTER);


        return this;
    }


}




package org.example.googleTest;

import io.qameta.allure.Step;
import org.example.constConfig.ConfigProvider;
import org.example.coreWebDriver.BaseSeleniumTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class MessagePage extends BaseSeleniumTest {

    String LOGIN = ConfigProvider.LOGIN;


    @Step("Нажать кнопку 'Написать, чтобы открыть MessagePanel")
    public MessagePage checkWriteButton() {

        WebElement clickButton = driver.findElement(By.xpath("//div[@class='T-I T-I-KE L3']"));
        clickButton.click();
        return this;
    }

    @Step("Дождаться и ввести в поле ввода Email")
    public MessagePage writeHeaderEmail() {
        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@peoplekit-id='BbVjBd']")));
        firstResult.sendKeys(LOGIN);
        return this;
    }

    @Step("Ввести данные в поле Тема")
    public MessagePage writeTopic(String text) {

        WebElement topicWrite = driver.findElement(By.xpath("//input[@aria-label='Тема']"));
        topicWrite.sendKeys(text);
        return this;
    }

    @Step("Ввести данные в поле Текст сообщения")
    public MessagePage writeBody(String bodytext) {

        WebElement emailBodywrite = driver.findElement(By.xpath("//div[@aria-label='Текст письма']"));
        emailBodywrite.sendKeys(bodytext);

        return this;
    }

    @Step("Нажать кнопку Отправить")
    public MessagePage clickSendButton() {

//        WebElement sendButton = driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']"));
        WebElement sendButton = driver.findElement(By.xpath("//div[text()='Отправить']"));
        sendButton.click();

        return this;
    }

    @Step("Проверить, что письмо пришло")
    public MessagePage checkAssignMessage(String text) {
        List<WebElement> tableElements = driver.findElements(By.xpath("//tr[@role='row']"));
        String textFromRow = tableElements.get(0).getText();
        Boolean checkTrue = textFromRow.contains(text);
        System.out.println(checkTrue);


        return this;

    }


}

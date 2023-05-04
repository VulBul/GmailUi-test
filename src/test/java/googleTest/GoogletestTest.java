package googleTest;

import coreWebDriver.BaseSeleniumTest;
import io.qameta.allure.Step;
import misc.IntGenerate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GoogletestTest  extends BaseSeleniumTest {
    @Test

    @DisplayName("Проверка отправки письма самому себе")
    public void messageYourself() {
        String title = "VulBul -" + new IntGenerate().getRandomNumber();
        String body = "VulBul -" + new IntGenerate().getRandomNumber();
        new Authorization()
                .auth();
        new MessagePage()
                .checkWriteButton()
                .writeHeaderEmail()
                .writeTopic(title)
                .writeBody(body)
                .clickSendButton()
                .checkAssignMessage(title);


    }





//        MessagePage messagePage = new MessagePage();
//
//        messagePage.checkWriteButton();
//        messagePage.writeHeaderEmail();
//        messagePage.writeTopic(title);
//        messagePage.writeBody(body);
//        messagePage.clickSendButton();




    }


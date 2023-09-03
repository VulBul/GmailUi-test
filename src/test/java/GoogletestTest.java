import org.example.coreWebDriver.BaseSeleniumTest;
import org.example.googleTest.Authorization;
import org.example.googleTest.MessagePage;
import org.example.misc.IntGenerate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GoogletestTest extends BaseSeleniumTest {

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


}


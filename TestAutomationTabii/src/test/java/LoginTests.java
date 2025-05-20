import Base.BaseTests;
import Pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTests extends BaseTests {

    LoginPage loginPage = new LoginPage();

    @Test(description = "Başarılı kullanıcı girişi")
    public void LoginSuccessful() throws InterruptedException {

        loginPage.goLoginPage()
                .fillEmail(email)
                .fillPassword(password)
                .clickLogin();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        loginPage.clickProfile();
        Thread.sleep(5000);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000000));
        String url = webDriver.getCurrentUrl();
        System.out.println(url);
        assertEqualsText(url,correctUrl);
    }

    @Test(description = "Başarısız kullanıcı girişi ")
    public void LoginUnSuccessful() {

        loginPage.goLoginPage()
                .fillEmail(email)
                .fillPassword("aaaaaaaa")
                .clickLogin();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String errorText = webDriver.findElement(By.cssSelector("[class='ToastMessage_toast-message__2QyH6 pointer-events-auto flex bg-secondary-40 w-full']")).getText();
        assertEqualsText(errorText, errorMessage);
    }

    @Test(description = "Kısa şifre kontrolü")
    public void LoginRequiredController(){

        loginPage.goLoginPage()
                .fillEmail(email)
                .fillPassword("123")
                .clickLogin();
        String errorText =webDriver.findElement(By.cssSelector("[class='w-full']")).getText();
        System.out.println(errorText);

        assertEqualsText(errorText,errorRequiredMessage);
    }
}

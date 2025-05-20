import Base.BaseTests;
import Pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomePageTests extends BaseTests {

    LoginPage loginPage = new LoginPage();

    @Test(description = "Başarılı kullanıcı çıkışı")
    public void LogOutSuccessful() throws InterruptedException {

        loginPage.goLoginPage()
                .fillEmail(email)
                .fillPassword(password)
                .clickLogin();
        Thread.sleep(2000);
        loginPage.clickProfile();
        Thread.sleep(5000);
        webDriver.findElement(By.cssSelector("[class='relative flex items-center lg:flex-row-reverse']")).click();
        webDriver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/header/div/nav/div[2]/div/div[2]/div/div[1]/div[2]/div/div/div/span[2]")).click();
        Thread.sleep(2000);
        String url = webDriver.getCurrentUrl();
        System.out.println(url);
        assertEqualsText(url,"https://www.tabii.com/tr");
    }


}

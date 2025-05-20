import Base.BaseTests;
import Pages.LoginPage;
import Pages.RegisterPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class RegisterTests extends BaseTests {

    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();

    @Test(description = "Kayıt işlemi")
    public void RegisterSuccessful () throws InterruptedException {

        loginPage.goLoginPage();
        webDriver.findElement(By.cssSelector("[tabindex='1']")).click();
        registerPage.fillName("tester")
                .fillEmail("testaccount@gmail.com")
                .fillPassword("Aa123456")
                .chooseGender()
                .fillCalendar()
                .clickCheckBox();
        Thread.sleep(5000);

        registerPage.clickRegister();
        Thread.sleep(5000);

       /* String Name = "testtName";
        String email="test";
        String userPassword="test";
        webDriver.findElement(By.cssSelector("[href*='register.htm']")).click();
        webDriver.findElement(By.id("customer.firstName")).sendKeys(firstName);
        webDriver.findElement(By.id("customer.lastName")).sendKeys(lastName);
        webDriver.findElement(By.id("customer.address.street")).sendKeys(tempText);
        webDriver.findElement(By.id("customer.address.city")).sendKeys(tempText);
        webDriver.findElement(By.id("customer.address.state")).sendKeys(tempText);
        webDriver.findElement(By.id("customer.address.zipCode")).sendKeys(tempText);
        webDriver.findElement(By.id("customer.phoneNumber")).sendKeys(phoneNumber);
        webDriver.findElement(By.id("customer.ssn")).sendKeys(tempText);
        webDriver.findElement(By.id("customer.username")).sendKeys(userName);
        webDriver.findElement(By.id("customer.password")).sendKeys(userPassword);
        webDriver.findElement(By.id("repeatedPassword")).sendKeys(userPassword);
        webDriver.findElement(By.cssSelector("[value='Register']")).click();
*/
        String url = webDriver.getCurrentUrl();
        System.out.println(url);
        assertEqualsText(url,verifyUrl);




    }
}

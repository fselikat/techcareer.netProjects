package Pages;

import Base.BaseTests;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class LoginPage extends BaseTests {

    @Step("Giriş Yap sayfasına tıklanır")
    public LoginPage goLoginPage () {
        webDriver.findElement(By.xpath("//*[@id='Main']/div/div/header/div/nav/div/div[2]/a/button")).click();
        return this;
    }


    @Step("Username alanı doldurulur")
    public LoginPage fillEmail(String email){
        webDriver.findElement(By.name("mail")).sendKeys(email);
        return this;
    }

    @Step("Password alanı doldurulur")
    public LoginPage fillPassword(String password){
        webDriver.findElement(By.name("password")).sendKeys(password);
        return this;
    }

    @Step("Login butonuna tıklanır")
    public LoginPage clickLogin(){
        webDriver.findElement(By.cssSelector("[data-testid='login-login-link']")).click();
        return this;
    }

    @Step
    public LoginPage clickProfile (){
        webDriver.findElement((By.cssSelector("[data-testid='profile_name0']"))).click();
        return this;
    }

    @Step("Hata mesajı alınır")
    public String getErrorMessage(){
        String errorText = webDriver.findElement(By.xpath("//*[@id='__next']/div[2]/div/div[2]/p[2]")).getText();
        return errorText;
    }

    @Step("Register butonuna tıklanır")
    public LoginPage clickRegister(){
        webDriver.findElement(By.cssSelector("[href*='register.htm']")).click();
        return this;
    }
}

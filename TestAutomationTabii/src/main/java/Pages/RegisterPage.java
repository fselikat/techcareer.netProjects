package Pages;

import Base.BaseTests;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class RegisterPage extends BaseTests {
    @Step("AdSoyad alanı doldurulur")
    public RegisterPage fillName(String text){
        webDriver.findElement(By.id("username")).sendKeys(text);
        return this;
    }

    @Step("E-posta alanı doldurulur")
    public RegisterPage fillEmail(String text){
        webDriver.findElement(By.id("email")).sendKeys(text);
        return this;
    }

    @Step("Şifre alanı doldurulur")
    public RegisterPage fillPassword(String text){
        webDriver.findElement(By.id("password")).sendKeys(text);
        return this;
    }

    @Step("Cinsiyet alanı doldurulur")
    public RegisterPage chooseGender() throws InterruptedException {
        webDriver.findElement(By.cssSelector("[class='Select_select__IoxnZ rtl:pr-5']")).click();
        Thread.sleep(1000);
        webDriver.findElement(By.cssSelector("value='F'")).click();
        return this;
    }

    @Step("Doğum tarihi alanı doldurulur")
    public RegisterPage fillCalendar(){
        webDriver.findElement(By.cssSelector("[class='Datepicker_input__ika3u react-datepicker-ignore-onclickoutside']")).sendKeys("05.05.2005");
        return this;
    }

    @Step("Gizlilik politikasını onayla")
    public RegisterPage clickCheckBox(){
        webDriver.findElement(By.cssSelector("[class='Checkbox_checkmark__4P6Mw rtl:right-0  border-red-50']")).click();
        return this;
    }

    @Step("Kayıt ol butonuna tıkla")
    public RegisterPage clickRegister(){
        webDriver.findElement(By.cssSelector("[class='Button_btn__giJE4 mb-6 w-full Button_primary-brand-btn__irITw']")).click();
        return this;
    }

}

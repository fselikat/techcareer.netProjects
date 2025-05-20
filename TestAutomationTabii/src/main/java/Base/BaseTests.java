package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTests extends BaseLibrary {
    public static WebDriver webDriver ;


    @BeforeMethod
    public void openBrowser(){
        webDriver = new ChromeDriver();
        webDriver.get("https://www.tabii.com/tr");
        webDriver.manage().window().maximize();
    }

    @AfterMethod
    public void closeBrowser(){
        webDriver.quit();
    }
}

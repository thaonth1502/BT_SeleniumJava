package WebElementAndWebDriver;

import locators.LocatorsCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Login {

    WebDriver driver;

    public Login(WebDriver driver) {
        this.driver = driver;
    }

    public  void login() {

        //verify Login Page
        driver.findElement(By.xpath(LocatorsCRM.headerLoginPage)).isDisplayed();

        //Login page
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).click();
    }
}

package WebElementAndWebDriver;

import common.BaseTest;
import locators.LocatorsCRM;
import org.openqa.selenium.By;


public class Login extends BaseTest {
    public static void main(String[] args) {
        createDriver();
        login();
        closeDriver();
    }

    public static void login() {
        driver.get("https://crm.anhtester.com/admin/authentication");
        //verify Login Page
        driver.findElement(By.xpath(LocatorsCRM.headerLoginPage)).isDisplayed();
        //Login page
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).sendKeys("123456");
        sleep(1);
        driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).click();
    }
}

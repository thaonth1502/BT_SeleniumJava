package WebElementAndWebDriver;

import common.BaseTest;
import locators.LocatorsCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


import static WebElementAndWebDriver.Login.login;

public class Customer extends BaseTest {

    public static void main(String[] args) {
        createDriver();
        login();
        createNewCustomer();
        verifyCustomerCreated();
        closeDriver();
    }
    public static void createNewCustomer(){

        driver.findElement(By.xpath(LocatorsCRM.menuCustomer)).click();
        //verify Customer Page
        driver.findElement(By.xpath(LocatorsCRM.headerCustomerPage)).isDisplayed();

        driver.findElement(By.xpath(LocatorsCRM.buttonAddNewCustomer)).click();

        //verify tab Customer Info
        driver.findElement(By.xpath(LocatorsCRM.nameTabCustomer)).isDisplayed();

        //input data into fields
        driver.findElement(By.xpath(LocatorsCRM.inputCompany)).sendKeys("[04082024] - CMC Global");
        sleep(1);
        driver.findElement(By.xpath(LocatorsCRM.inputVATNumber)).sendKeys("15");
        driver.findElement(By.xpath(LocatorsCRM.inputPhoneNumber)).sendKeys("098765432");
        driver.findElement(By.xpath(LocatorsCRM.inputWebsite)).sendKeys("CMCGlobal.vn");
        driver.findElement(By.xpath(LocatorsCRM.dropdownGroups)).click();
        sleep(1);
//        driver.findElement(By.xpath(LocatorsCRM.inputSearchGroup)).sendKeys("VIP");
//        driver.findElement(By.xpath(LocatorsCRM.inputSearchGroup)).sendKeys(Keys.ENTER);
//        sleep(1);
        driver.findElement(By.xpath(LocatorsCRM.dropdownCurrency)).click();
        driver.findElement(By.xpath(LocatorsCRM.inputSearchCurrency)).sendKeys("USD");
        sleep(1);
        driver.findElement(By.xpath(LocatorsCRM.inputSearchCurrency)).sendKeys(Keys.ENTER);
        sleep(1);
        driver.findElement(By.xpath(LocatorsCRM.dropdownDefaultLanguage)).click();
        sleep(1);

        driver.findElement(By.xpath("//span[normalize-space()='Vietnamese']")).click();
        sleep(1);
        driver.findElement(By.xpath(LocatorsCRM.inputAddress)).sendKeys("11 Duy Tan");
        driver.findElement(By.xpath(LocatorsCRM.inputCity)).sendKeys("Hanoi");
        driver.findElement(By.xpath(LocatorsCRM.inputState)).sendKeys("Cau Giay");
        driver.findElement(By.xpath(LocatorsCRM.inputZipCode)).sendKeys("100000");
        driver.findElement(By.xpath(LocatorsCRM.dropdownCountry)).click();
        sleep(1);
        driver.findElement(By.xpath(LocatorsCRM.inputSearchCountry)).sendKeys("Vietnam");
        sleep(1);
        driver.findElement(By.xpath(LocatorsCRM.inputSearchCountry)).sendKeys(Keys.ENTER);
        sleep(1);

        //click Save button
        driver.findElement(By.xpath(LocatorsCRM.buttonSave)).click();
    }

    public static void verifyCustomerCreated(){
        driver.findElement(By.xpath(LocatorsCRM.menuCustomer)).click();
        driver.findElement(By.xpath(LocatorsCRM.inputSearchCustomerPage)).sendKeys("[04082024] - CMC Global");
        driver.findElement(By.xpath(LocatorsCRM.inputSearchCustomerPage)).sendKeys(Keys.ENTER);

        driver.findElement(By.xpath("//a[normalize-space()='[04082024] - CMC Global']")).isDisplayed();

    }
}

package WebElementAndWebDriver;

import locators.LocatorsCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Customer {
    WebDriver driver;

    public Customer(WebDriver driver) {
        this.driver = driver;
    }

    public void createNewCustomer(){
        driver.findElement(By.xpath(LocatorsCRM.menuCustomer)).click();
        //verify Customer Page
        driver.findElement(By.xpath(LocatorsCRM.headerCustomerPage)).isDisplayed();

        driver.findElement(By.xpath(LocatorsCRM.buttonAddNewCustomer)).click();

        //verify tab Customer Info
        driver.findElement(By.xpath(LocatorsCRM.nameTabCustomer)).isDisplayed();

        //input data into fields
        driver.findElement(By.xpath(LocatorsCRM.inputCompany)).sendKeys("CMC Global");
        driver.findElement(By.xpath(LocatorsCRM.inputVATNumber)).sendKeys("15");
        driver.findElement(By.xpath(LocatorsCRM.inputPhoneNumber)).sendKeys("098765432");
        driver.findElement(By.xpath(LocatorsCRM.inputWebsite)).sendKeys("CMCGlobal.vn");
        driver.findElement(By.xpath(LocatorsCRM.dropdownGroups)).click();
        driver.findElement(By.xpath(LocatorsCRM.inputSearchGroup)).sendKeys("VIP");
        driver.findElement(By.xpath(LocatorsCRM.inputSearchGroup)).submit();
        driver.findElement(By.xpath(LocatorsCRM.dropdownCurrency)).click();
        driver.findElement(By.xpath(LocatorsCRM.inputSearchCurrency)).sendKeys("USD");
        driver.findElement(By.xpath(LocatorsCRM.inputSearchCurrency)).submit();
        driver.findElement(By.xpath(LocatorsCRM.dropdownDefaultLanguage)).click();

        Select select = new Select(driver.findElement(By.xpath(LocatorsCRM.selectDefaultLanguage)));
        select.selectByVisibleText("Vietnamese");

        driver.findElement(By.xpath(LocatorsCRM.inputAddress)).sendKeys("11 Duy Tan");
        driver.findElement(By.xpath(LocatorsCRM.inputCity)).sendKeys("Hanoi");
        driver.findElement(By.xpath(LocatorsCRM.inputState)).sendKeys("Cau Giay");
        driver.findElement(By.xpath(LocatorsCRM.inputZipCode)).sendKeys("100000");
        driver.findElement(By.xpath(LocatorsCRM.inputCompany)).sendKeys("CMC Global (ThaoNTH)");
        driver.findElement(By.xpath(LocatorsCRM.dropdownCountry)).click();
        driver.findElement(By.xpath(LocatorsCRM.inputSearchCountry)).sendKeys("Vietnam");
        driver.findElement(By.xpath(LocatorsCRM.inputSearchCountry)).submit();

        //click Save button
        driver.findElement(By.xpath(LocatorsCRM.buttonSave)).click();
    }

    public void verifyCustomerCreated(){
        driver.findElement(By.xpath(LocatorsCRM.inputSearchCustomerPage)).sendKeys("CMC Global (ThaoNTH)");
        driver.findElement(By.xpath(LocatorsCRM.inputSearchCustomerPage)).submit();

        driver.findElement(By.xpath("//a[normalize-space()='CMC Global (ThaoNTH)']")).isDisplayed();

    }
}

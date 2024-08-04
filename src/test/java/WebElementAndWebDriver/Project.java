package WebElementAndWebDriver;

import common.BaseTest;
import locators.LocatorsCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


import static WebElementAndWebDriver.Login.login;

public class Project extends BaseTest {
    public static void main(String[] args) {
        createDriver();
        login();
        createNewProject();
        verifyProjectCreated();
        closeDriver();
    }

    public static void createNewProject(){

        driver.findElement(By.xpath(LocatorsCRM.menuProjects)).click();
        //verify Project Page
        driver.findElement(By.xpath(LocatorsCRM.headerProjectPage)).isDisplayed();

        driver.findElement(By.xpath(LocatorsCRM.buttonAddNewProject)).click();
        driver.findElement(By.xpath(LocatorsCRM.nameTabProject)).isDisplayed();

        //Input date into form
        driver.findElement(By.xpath(LocatorsCRM.inputProjectName)).sendKeys("[04082024] - Selenium Java");
        sleep(1);

        driver.findElement(By.xpath(LocatorsCRM.dropdownCustomer)).click();
        sleep(1);
        driver.findElement(By.xpath(LocatorsCRM.inputSearchCustomer)).sendKeys("[04082024] - CMC Global");
        sleep(1);
        driver.findElement(By.xpath("//span[@class='text']")).click();

        sleep(1);

        driver.findElement(By.xpath(LocatorsCRM.dropdownBillingType)).click();
        sleep(1);
        driver.findElement(By.xpath("//span[normalize-space()='Project Hours']")).click();
        sleep(1);

        driver.findElement(By.xpath(LocatorsCRM.dropdownStatus)).click();
        sleep(1);
        driver.findElement(By.xpath("//span[normalize-space()='In Progress']")).click();

        driver.findElement(By.xpath(LocatorsCRM.inputRatePerHour)).sendKeys("300");
        driver.findElement(By.xpath(LocatorsCRM.inputEstimatedHours)).sendKeys("40");
        sleep(1);

        driver.findElement(By.xpath(LocatorsCRM.dropdownMembers)).click();
        sleep(1);
        driver.findElement(By.xpath(LocatorsCRM.inputSearchMember)).sendKeys("Anh Tester Admin");
        driver.findElement(By.xpath(LocatorsCRM.inputSearchMember)).sendKeys(Keys.ENTER);
        sleep(1);

        driver.findElement(By.xpath(LocatorsCRM.calenderDeadline)).sendKeys("05-10-2024");
        driver.findElement(By.xpath(LocatorsCRM.calenderDeadline)).sendKeys(Keys.ENTER);
        sleep(1);
        driver.findElement(By.xpath(LocatorsCRM.inputTags)).sendKeys("thaonth");
        sleep(1);
        driver.findElement(By.xpath(LocatorsCRM.inputTags)).sendKeys(Keys.ENTER);
        sleep(1);

        driver.findElement(By.xpath(LocatorsCRM.checkboxSendEmail)).click();
        sleep(1);
        driver.findElement(By.xpath(LocatorsCRM.btn_Save)).sendKeys(Keys.PAGE_DOWN);
        driver.findElement(By.xpath(LocatorsCRM.btn_Save)).click();
        sleep(1);
    }

    public static void verifyProjectCreated(){
        driver.findElement(By.xpath(LocatorsCRM.menuProjects)).click();
        driver.findElement(By.xpath(LocatorsCRM.inputSearchProjectPage)).sendKeys("[04082024] - Selenium Java");
        driver.findElement(By.xpath(LocatorsCRM.inputSearchProjectPage)).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//a[normalize-space()='[04082024] - Selenium Java']")).isDisplayed();
    }
}

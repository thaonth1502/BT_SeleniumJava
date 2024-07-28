package WebElementAndWebDriver;

import locators.LocatorsCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project {
    WebDriver driver;

    public Project(WebDriver driver) {
        this.driver = driver;
    }

    public void createNewProject(){

        this.driver.findElement(By.xpath(LocatorsCRM.menuProjects)).click();
        //verify Project Page
        this.driver.findElement(By.xpath(LocatorsCRM.headerProjectPage)).isDisplayed();

        this.driver.findElement(By.xpath(LocatorsCRM.buttonAddNewProject)).click();
        this.driver.findElement(By.xpath(LocatorsCRM.nameTabProject)).isDisplayed();

        //Input date into form
        driver.findElement(By.xpath(LocatorsCRM.inputProjectName)).sendKeys("Selenium Java 072024");
        driver.findElement(By.xpath(LocatorsCRM.dropdownCustomer)).click();
        driver.findElement(By.xpath(LocatorsCRM.inputSearchCustomer)).sendKeys("Anh Tester");
        driver.findElement(By.xpath("//div[@id='bs-select-6']/descendant::li[1]")).click();
        driver.findElement(By.xpath(LocatorsCRM.inputRatePerHour)).sendKeys("300");
        driver.findElement(By.xpath(LocatorsCRM.inputEstimatedHours)).sendKeys("40");
        driver.findElement(By.xpath(LocatorsCRM.calenderStartDate)).sendKeys("29-08-2024");
        driver.findElement(By.xpath(LocatorsCRM.calenderDeadline)).sendKeys("05-09-2024");
        driver.findElement(By.xpath(LocatorsCRM.inputTags)).sendKeys("thaonth");
        driver.findElement(By.xpath(LocatorsCRM.inputTags)).submit();
        driver.findElement(By.xpath(LocatorsCRM.inputDescription)).sendKeys("This is project of ThaoNTH");
        driver.findElement(By.xpath(LocatorsCRM.checkboxSendEmail)).click();
        driver.findElement(By.xpath(LocatorsCRM.btn_Save));
    }

    public void verifyProjectCreated(){
        driver.findElement(By.xpath(LocatorsCRM.inputSearchProjectPage)).sendKeys("Selenium Java 072024");
        driver.findElement(By.xpath(LocatorsCRM.inputSearchProjectPage)).submit();
        driver.findElement(By.xpath("(//a[contains(text(),'Selenium Java 072024')])")).isDisplayed();
    }
}

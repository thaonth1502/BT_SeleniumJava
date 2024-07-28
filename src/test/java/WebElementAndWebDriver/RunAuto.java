package WebElementAndWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class RunAuto {



    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://crm.anhtester.com/admin/authentication");
        Login login = new Login(driver);
        Customer customer = new Customer(driver);
        Project project = new Project(driver);

        login.login();
        //Create new Customer
        customer.createNewCustomer();
        customer.verifyCustomerCreated();

        //Create new Project
        project.createNewProject();
        project.verifyProjectCreated();

        driver.quit();
    }
}

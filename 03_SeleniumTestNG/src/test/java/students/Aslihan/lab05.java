package students.Aslihan;

import code.base.TestBase;
import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class lab05 extends TestBase {
    //Go to Amazon
//enter Desk in search box
//Then search for desks
//(Use this task with TestNG framework)
    WebDriver driver;

    @Test
    void TC1(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.amazon.ca/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("desk");
        driver.findElement(By.id("nav-search-submit-button")).click();

    }


}

package students.Aslihan;

import code.base.TestBase;
import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class lab06 extends TestBase {
    //go to http://demo.guru99.com/test/newtours/register.php
// click on country dropdown and select Barbados with Select Method
//Use 3 different Select Method (visible text,index,value)
//and switch to another countries as you wish
    WebDriver driver;

    @Test
    void TC1() {
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/test/newtours/register.php");

        WebElement DropDownBox=driver.findElement(By.xpath("//select[@name='country']"));
        DropDownBox.click();

        Select dropDown=new Select(DropDownBox);

        dropDown.selectByVisibleText("BARBADOS");
        System.out.println(dropDown.getFirstSelectedOption().getText());

        dropDown.selectByIndex(25);
        System.out.println(dropDown.getFirstSelectedOption().getText());

        dropDown.selectByValue("BARBADOS");
        System.out.println(dropDown.getFirstSelectedOption().getText());

    }


}


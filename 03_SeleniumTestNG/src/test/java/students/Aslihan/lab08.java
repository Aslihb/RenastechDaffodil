package students.Aslihan;

import code.base.TestBase;
import code.utilities.BrowserUtils;
import code.utilities.DriverUtil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class lab08 extends TestBase {
    //1) Launch the web browser and open the site http://demo.guru99.com/test/delete_customer.php
    //Step 2) Enter Any Customer id.
    //Step 3) After entering the customer ID, Click on the “Submit” button.
    //Step 4) Reject/accept the alert.

    @Test
    void TC14(){
        driver.get("http://demo.guru99.com/test/delete_customer.php");
        driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("121122");
        driver.findElement(By.name("submit")).click();

        Alert alert=driver.switchTo().alert();
        BrowserUtils.wait(2);

        alert.accept();
        alert.accept();
        } }


package students.Aslihan;

import code.utilities.WebDriverUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class lab04 {
//1. Open Chrome browser
//2. Go to https://demo.guru99.com/test/radio.html
//3. Verify all checkboxes are not selected (you can use findelements to store in list and use for loop to validate)
//4. Click to checkbox3
//5. Verify checkbox3 is selected

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/radio.html");

        List<WebElement> checkBoxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
        System.out.println(checkBoxes.size());

        for (int i = 0; i <checkBoxes.size(); i++) {
            if (checkBoxes.get(i).isSelected()){
                System.out.println("Verification has failed");
            }else{
                System.out.println("Verification has passed");
            }}

        WebElement checkBox3=driver.findElement(By.id("vfb-6-2"));
        checkBox3.click();
        if (checkBox3.isSelected()){
            System.out.println("CheckBox3 selected verification has passed");
        }else{
            System.out.println("CheckBox3 selected verification has failed");
        }




    }
}

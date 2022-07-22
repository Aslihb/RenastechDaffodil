package students.Aslihan;

import code.utilities.WebDriverUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.sql.DriverManager;

public class lab03 {
    //TASK: Google search
//1- Open a chrome browser
//2- Go to: https://google.com
//3- Write “apple” in search box
//4- Click google search button
//5- Verify title:
//Expected: Title should start with "apple" word
//6-navigate back
//7-write cherry in search box
//8-verify title contains cherry.

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("apple");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        String expectedTitle="apple";
        String actualTitle=driver.getTitle();
        System.out.println("Actual title is : "+ actualTitle);
        if(expectedTitle==actualTitle){
            System.out.println("Verification has passed");
        }else{
            System.out.println("Verification has failed");
        }
        Thread.sleep(2000);

        driver.navigate().back();
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("cherry");
        String expectedTitle2="cherry";
        String actualTitle2=driver.getTitle();
        System.out.println("Actual title is : "+ actualTitle2);
        if(expectedTitle2==actualTitle2){
            System.out.println("Verification has passed");
        }else{
            System.out.println("Verification has failed");
        }
//TASK2: Google Feeling lucky button
//1- Open a chrome browser
//2- Go to: https://google.com
//3- Write "apple" in search box
//click i am feeling lucky button
//Verify title contains Apple

        WebDriver driver2=new ChromeDriver();
        driver2.manage().window().maximize();
        driver2.get("https://google.com");
        Thread.sleep(2000);
        driver2.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("apple");
        Thread.sleep(2000);
        driver2.findElement(By.xpath("//input[@name='btnI']")).click();
        String expectedTitle3="Apple";
        String actualTitle3=driver2.getTitle();
        if(expectedTitle3!=actualTitle3){
            System.out.println("Verification has failed");
        }else{
            System.out.println("Verification has passed");
        }


//go to https://opensource-demo.orangehrmlive.com/
//locate user name and send user name, (username=Admin)
//locate user password and send password (password=admin123)
//click on the login button

        WebDriver driver3=new ChromeDriver();
        driver3.manage().window().maximize();
        driver3.get("https://opensource-demo.orangehrmlive.com/");
        driver3.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver3.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver3.findElement(By.id("btnLogin")).click();





    }}




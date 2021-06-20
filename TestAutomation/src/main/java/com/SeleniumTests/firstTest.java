package com.SeleniumTests;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.chrome.ChromeDriver;
 import org.testng.annotations.Test;


 public class firstTest {

   // public static void main(String[] args) throws InterruptedException {
@Test
     public void opengoogle(){
        System.setProperty("webdriver.chrome.driver","/Users/Kaushik/WebDrivers/chromedriver");
                WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
System.out.println("testing");



       // Thread.sleep(5000);
        //driver.manage().window().maximize();
        driver.quit();
    }
}
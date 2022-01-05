package com.loginapp.testCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
    public String baseURL="http://practice.automationtesting.in/my-account/";
    public String username="atikrkhan454@outlook.com";
    public String password="Login@atik@123456789";
    public static WebDriver driver;



    @BeforeTest
    public void openWeb() {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
        driver=new ChromeDriver();
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}

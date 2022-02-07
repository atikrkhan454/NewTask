package com.login_email;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.security.auth.Subject;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class TestCases {

    WebDriver driver;
    @Test
    public void loginEmail() throws InterruptedException, FileNotFoundException {

        GmailPageObjects gp= PageFactory.initElements(driver, GmailPageObjects.class);
        gp.enterEmail("Your Gmail id");
        gp.enterPassword("Gmail password");
        gp.writeCSV();

    }

    @BeforeTest
    public void openURL(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://mail.google.com");
        /*System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://mail.google.com");*/

    }

}

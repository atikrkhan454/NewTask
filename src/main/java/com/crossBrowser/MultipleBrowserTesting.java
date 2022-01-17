package com.crossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultipleBrowserTesting {

    WebDriver driver;

    @BeforeTest
    @Parameters("browserName")

    public void setup(String browserName) throws Exception {

        //Check if parameter passed as chrome
        if (browserName.equalsIgnoreCase("chrome")) {

            System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        //Check if parameter passed as firefox
        else if (browserName.equalsIgnoreCase("firefox")) {

            System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
            driver = new FirefoxDriver();
        } else {
            //If no browser passed throw an exception
            throw new Exception("Browser is not correct");
        }
        driver.manage().window().maximize();

    }

    @Test
    public void gettingTitleName() {
        driver.get("https://www.atmecs.com/");
        System.out.println(driver.getTitle());

    }

    @AfterTest
    public void tearDown() {

        driver.close();
    }
}

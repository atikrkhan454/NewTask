package com.crossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

    WebDriver driver;
    private String browserName;


    public void setBrowser(String browserName) throws Exception {


        if (browserName.equalsIgnoreCase("chrome")) {

            System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        //Check if parameter passed as firefox
        else if (browserName.equalsIgnoreCase("firefox")) {

            System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
        } else {
            //If no browser passed throw an exception
            throw new Exception("Browser is not correct");
        }
        this.browserName = browserName;
    }

    public String getBrowser() {
        return browserName;
    }


    public void setUrl(String urlSet) {
        driver.get(urlSet);

        String title= driver.getTitle();
        System.out.println(title);

        driver.close();
    }



}

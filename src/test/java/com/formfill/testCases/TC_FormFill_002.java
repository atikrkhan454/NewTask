package com.formfill.testCases;

import com.formfill.pageObjects.RegistrationForm;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC_FormFill_002 {

    WebDriver driver;

   @Test
    public void fillUpTest(){

        RegistrationForm regd= new RegistrationForm(driver);

        regd.closeAdd();
        regd.typeFirstName();
        regd.typeLastName();
        regd.typeEmail();
        regd.clickgender();
        regd.typeMobileNo();
        regd.selectHobbies();
        regd.typeAddrss();
        regd.clickSubmit();
    }

    @BeforeTest
    void openurl() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");
    }

    @AfterTest
    void closeBrowser(){
            System.out.println("Registration Successfully");
            //driver.quit();

    }
}

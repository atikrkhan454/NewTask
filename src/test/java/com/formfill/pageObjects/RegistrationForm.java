package com.formfill.pageObjects;

// This class will store all the locators and methods of Regd. form

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class RegistrationForm {

    WebDriver driver;

    By close_add= By.xpath("//*[@id='close-fixedban']/img");
    By first_name= By.id("firstName");
    By last_name= By.id("lastName");
    By email= By.id("userEmail");
    By gender= By.xpath("//div[@id='genterWrapper']/div[2]/div[1]"); //For Male
    By mobile_no= By.id("userNumber");
    By hobbies= By.xpath("//div[@id='hobbiesWrapper']/div[2]/div[3]/label"); // for music
    By address= By.id("currentAddress");
    By submit= By.id("submit");



    public RegistrationForm(WebDriver driver){

        this.driver=driver;
    }

    public void closeAdd(){

        driver.findElement(close_add).click();
    }

    public void typeFirstName(){

        driver.findElement(first_name).sendKeys("Atik Ragib");

    }

    public void typeLastName(){

        driver.findElement(last_name).sendKeys("Khan");

    }

    public void typeEmail(){

        driver.findElement(email).sendKeys("atikrkhan454@outlook.com");
    }

    public void clickgender(){

        driver.findElement(gender).click();
    }

    public void typeMobileNo(){

        driver.findElement(mobile_no).sendKeys("7855958892" + Keys.PAGE_DOWN);
    }

    public void selectHobbies(){

        driver.findElement(hobbies).click();
    }

    public void typeAddrss(){

        driver.findElement(address).sendKeys("Bhubaneswar");
    }

    public void clickSubmit(){

        driver.findElement(submit).click();
    }

}

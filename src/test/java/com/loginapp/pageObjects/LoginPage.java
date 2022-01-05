package com.loginapp.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver ldriver;

    public LoginPage(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(id = "username")
    WebElement txtUserName;

    @FindBy(id = "password")
    WebElement txtPassword;

    @FindBy(name = "login")
    WebElement buttnLogin;

    public void setUserName(String uname){
        txtUserName.sendKeys(uname);
    }

    public void setPassword(String pwd){
        txtPassword.sendKeys(pwd);
    }

    public void clickSubmit(){
        buttnLogin.click();
    }

}

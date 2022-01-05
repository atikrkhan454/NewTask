package com.loginapp.testCases;

import com.loginapp.pageObjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_LoginTest_001 extends BaseClass {


    @Test
    public void loginTest(){
        driver.get(baseURL);

        LoginPage lp=new LoginPage(driver);
        lp.setUserName(username);
        lp.setPassword(password);

        lp.clickSubmit();

        if(driver.getTitle().equals("My Account – Automation Practice Site")){

            Assert.assertTrue(true);
        }else
        {
            Assert.assertTrue(false);

        }

    }
}

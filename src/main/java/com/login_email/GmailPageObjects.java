package com.login_email;

import com.opencsv.CSVWriter;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GmailPageObjects {

    private WebDriver driver;


    @FindBy(id = "identifierId")
    WebElement emailField;

    @FindBy(xpath = "//input[@type='password']")
    WebElement passwordField;

    @FindBy(xpath = "//div[@class='gb_ka']")
    WebElement profilePic;

    @FindBy(xpath = "//span[@class='bog']")
    List<WebElement> subjects;

    @FindBy(xpath = "//td[@class='xW xY ']")
    List<WebElement> date;

    public GmailPageObjects(WebDriver driver){
        this.driver=driver;
    }

    public void waitForVisible(WebDriver driver, WebElement element) throws InterruptedException {

            Thread.sleep(1000);
            //System.out.println("Waiting for element visibility");
            WebDriverWait wait=new WebDriverWait(driver,15);
            wait.until(ExpectedConditions.visibilityOf(element));

    }

    public void enterEmail(String emailID) throws InterruptedException {

        waitForVisible(driver, emailField);
        Actions actions= new Actions(driver);
        actions.moveToElement(emailField);
        actions.click();
        actions.sendKeys(emailID + Keys.ENTER);
        actions.build().perform();

    }

    public void enterPassword(String password) throws InterruptedException {

        waitForVisible(driver, passwordField);
        Actions actions= new Actions(driver);
        actions.moveToElement(passwordField);
        actions.click();
        actions.sendKeys(password + Keys.ENTER);
        actions.build().perform();

    }

    public List<String>  gettingSubjects () throws InterruptedException {

        List<String> subj= new ArrayList<>();

        waitForVisible(driver, profilePic);

        int mailsize= subjects.size();
        System.out.println("No of mail shown in first page ="+ mailsize);
        System.out.println("All the subjects are");

        for (WebElement sub:subjects){
            String s= sub.getText();
           /* for (WebElement date:date){
                String st= date.getText();

                System.out.println(s + " " + st);
            }*/
            //System.out.println(s);
            subj.add(s);

        }



      /*  for (int i = 0; i < subjects.size(); i++){
            if (subjects.get(i).getText().contains(emailSubject)){
                subjects.get(i).click();
                System.out.println("email checked");
                break;
            }
        }*/

        return subj;

    }

    public void writeCSV() throws InterruptedException {
        // first create file object for file placed at location
        // specified by filepath
        List<String> obj= gettingSubjects();
        String filePath = ".//output.csv";

        File file = new File(filePath);

        try {
            // create FileWriter object with file as parameter
            FileWriter outputfile = new FileWriter(file);

            // create CSVWriter object filewriter object as parameter
            CSVWriter writer = new CSVWriter(outputfile);

            // adding header to csv
            String[] header = {"Subjects"};
            writer.writeNext(header);

            // add data to csv
            for (int i=0; i<obj.size();i++){

                String[] s= {obj.get(i)};
                writer.writeNext(s);
            }


            // closing writer connection
            writer.close();
            outputfile.close();
        }
        catch (IOException e) {

            e.printStackTrace();
        }
    }

}

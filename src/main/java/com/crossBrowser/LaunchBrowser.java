package com.crossBrowser;

public class LaunchBrowser {

    public static void main(String[] args) throws Exception {


        Browser lb=new Browser();

        lb.setBrowser("chrome");
        lb.setUrl("https://www.atmecs.com/");

    }
}

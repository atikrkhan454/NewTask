package com.practice;

import java.util.ArrayList;

public class AmazonPrime {

    public static ArrayList<String> actionMovie=new ArrayList<>();
    public static ArrayList<String> comedyMovie=new ArrayList<>();

    public static void setActionMovie(String movieName)
    {
        actionMovie.add(movieName);
    }

    public static void setComedyMovie(String movieName){
        comedyMovie.add(movieName);
    }

    public static void showActionMovie(){

        for (String mn : actionMovie) {
            System.out.println(mn);
        }
    }

    public static void showComedyMovie(){

        for (String mn : comedyMovie) {
            System.out.println(mn);
        }
    }
}

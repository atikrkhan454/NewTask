package com.practice;

public class AppRunner {

    public static void main(String[] args) {

        AmazonPrime.setActionMovie("Dhoom3");
        AmazonPrime.setActionMovie("War");
        AmazonPrime.setActionMovie("Baaghi3");

        AmazonPrime.setComedyMovie("Dhammal");
        AmazonPrime.setComedyMovie("Garam Masala");
        AmazonPrime.setComedyMovie("Gol Maal");

        System.out.println("Action movies are:");
        AmazonPrime.showActionMovie();

        System.out.println("----------------------");

        System.out.println("Comedy movies are:");
        AmazonPrime.showComedyMovie();
    }
}

package com.atm_system;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

public class User {

    private String firstName;
    private String middleName;
    private String lastName;
    private String uuid;
    private byte pinHash[];
    private ArrayList<Account> accounts;

    public User(String firstName, String middleName, String lastName, String pin, Bank theBank) {

        //set user's name
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;

        //store the pin's MD5 hash,rather than the original value for security reasons
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            this.pinHash=md.digest(pin.getBytes());
        } catch (NoSuchAlgorithmException e) {
            System.err.println("error, caught NotSuchAlgorithmException");
            e.printStackTrace();
            System.exit(1);
        }

        //get a new uuid for the user
        this.uuid=theBank.getNewUserUUID();

        //create empty list of Ac
        this.accounts= new ArrayList<Account>();

        //print log in message
        System.out.printf("New user %s %s %s with ID %s created.\n",firstName,middleName,lastName,this.uuid);
    }

    public void addAccount(Account anAcct){
        this.accounts.add(anAcct);
    }
    public String getUUID(){

        return this.uuid;
    }
    public boolean validatePin(String aPin) {

        //check whether a given pin matches the true user pin
        try {
            MessageDigest md= MessageDigest.getInstance("MD5");
            return MessageDigest.isEqual(md.digest(aPin.getBytes()),this.pinHash);
        } catch (NoSuchAlgorithmException e) {
            System.err.println("error, caught NotSuchAlgorithmException");
            e.printStackTrace();
            System.exit(1);
        }
        return false;

    }
    public String getFirstName(){
        return this.firstName;
    }
    public void printAccountsSummary(){

        System.out.printf("\n\n%s's accounts summary\n", this.firstName);
        for (int a = 0; a < this.accounts.size();a++){
            System.out.printf("  %d) %s\n", a+1, this.accounts.get(a).getSummaryLine());
        }

        System.out.println();
    }
    public int numAccounts(){
        return this.accounts.size();
    }

    public void printAcctTransHistory(int acctIdx){
        this.accounts.get(acctIdx).printTransHistory();

    }

    public double getAcctBalance(int acctIdx){

        return this.accounts.get(acctIdx).getBalance();
    }

    public String getAcctUUID(int acctIdx){

        return this.accounts.get(acctIdx).getUUID();
    }

    public void addAcctTransaction(int acctIdx, double amount, String remarks){

        this.accounts.get(acctIdx).addTransaction(amount, remarks);
    }

}

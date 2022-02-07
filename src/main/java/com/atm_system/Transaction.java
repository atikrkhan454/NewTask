package com.atm_system;

import java.util.Date;

public class Transaction {

    private double amount;
    private Date timestamp;
    private String remarks;
    private Account inAccount;

    public Transaction(double amount, Account inAccount){

        this.amount= amount;
        this.inAccount= inAccount;
        this.timestamp= new Date();
        this.remarks="";


    }

    public Transaction(double amount, String remarks,Account inAccount){

        this(amount,inAccount);
        this.remarks=remarks;
    }

    public double getAmount(){
        return this.amount;
    }

    public String getSummaryLine(){

        if (this.amount >= 0){
            return String.format("%s : ₹%.02f : %s", this.timestamp.toString(), this.amount, this.remarks);
        }else {
            return String.format("%s : (₹%.02f) : %s", this.timestamp.toString(), -this.amount, this.remarks);
        }
    }

}

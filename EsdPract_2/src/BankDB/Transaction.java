/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankDB;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Marken Tuan Nguyen
 */
public class Transaction {
    int transId;
    Date transDate;
    double transAmount;
    String transType;
    int cusId;
    
    public Transaction(){}

    public Transaction(int transId, Date transDate, double transAmount, String transType, int cusId) {
        this.transId = transId;
        this.transDate = transDate;
        this.transAmount = transAmount;
        this.transType = transType;
        this.cusId = cusId;
    }

    public int getTransId() {
        return transId;
    }

    public void setTransId(int transId) {
        this.transId = transId;
    }

    public Date getTransDate() {
        return transDate;
    }

    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public double getTransAmount() {
        return transAmount;
    }

    public void setTransAmount(double transAmount) {
        this.transAmount = transAmount;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }
    
    public int getCusId() {
        return cusId;
    }

    public void setCusId(int cusId) {
        this.cusId = cusId;
    }
    
}

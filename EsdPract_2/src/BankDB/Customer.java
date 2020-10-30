/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankDB;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Marken Tuan Nguyen
 */
public class Customer {
    int cusId;
    String cusName;
    double cusBalance;
    
    public Customer(){}
    
    public Customer(int id, String name, double balance){
        this.cusId = id;
        this.cusName = name;
        this.cusBalance = balance;
    }

    public int getCusId() {
        return cusId;
    }

    public void setCusId(int cusId) {
        this.cusId = cusId;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public double getCusBalance() {
        return cusBalance;
    }

    public void setCusBalance(double cusBalance) {
        this.cusBalance = cusBalance;
    }

    @Override
    public String toString() {
        return this.cusId + " | " + this.cusName + " | " + this.cusBalance; //To change body of generated methods, choose Tools | Templates.
    }

    
}

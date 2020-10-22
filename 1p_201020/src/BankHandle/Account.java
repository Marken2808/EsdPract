/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankHandle;

import java.util.ArrayList;

/**
 *
 * @author Marken Tuan Nguyen
 */
public class Account {
    private int accID;
    private double current;
    ArrayList<Object> test = new ArrayList<>();
    
    public Account(){}
    
    public Account (int accID, double current){
        this.accID = accID;
        this.current = current;
    }
    
    public ArrayList<Object> toArray (){
        test.add(getAccID());
        test.add(getCurrent());
        return test;
    }
    
    public void deposit(double money){
        this.current += money;
    }
    
    public void withdraw(double money){
        this.current -= money;
    }
    
    public int getAccID(){
        return this.accID;
    }
    public double getCurrent(){
        return this.current;
    }
    
    @Override
    public String toString(){
        return toArray() + "";
    }
}

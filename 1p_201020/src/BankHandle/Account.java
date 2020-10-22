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
    
    public double getSelectedID(ArrayList<Account> arr, int s){
        
        for( int i=0; i<arr.size(); i++){
            if(s == arr.get(i).getAccID()){
                return this.current = arr.get(i).getCurrent();
            }
        } 
        return 0;
    }
    
    public void getSelectedMethod(ArrayList<Account> arr, String s, double money){
        if("d".equals(s)) {
            deposit(money);
            System.out.println("Deposit: " + this.current);
        } else if("w".equals(s)){
            withdraw(money);
            System.out.println("Withdraw: " + this.current);
        }
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

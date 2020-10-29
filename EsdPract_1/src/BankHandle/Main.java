/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankHandle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Marken Tuan Nguyen
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        ArrayList<Account> test = new ArrayList<>();
        Account acc = new Account();
        System.out.println("Enter ID and Money [ Quit by 0! ]: ");
        while(input.hasNextInt()){
            int id =input.nextInt();
            if(id == 0) {break;}
            double money =input.nextDouble();
            
            acc = new Account(id,money);
            System.out.println("Enter ID and Money [ Quit by 0! ]:  ");
           // System.out.println("Enter id and money: ");
            test.add(acc);  
        }
        System.out.println("List of added account: "+test);
        
        System.out.println("Enter ID to find: ");
        int id =input.nextInt();
        
        
        if(acc.getSelectedID(test,id) == 0 ){
            System.out.println("Invalid account!");
        }else{
            System.out.println("Deposit press [d] or Withdraw press [w]");
            String method =input.next();
            if("d".equals(method)){
                System.out.println("Amount of deposit: ");
                double money =input.nextDouble();
                acc.getSelectedMethod(test, method, money);
            } else if("w".equals(method)){
                System.out.println("Amount of withdraw: ");
                double money =input.nextDouble();
                acc.getSelectedMethod(test, method, money);
            } 
        }
        
        
        
    }
    
}

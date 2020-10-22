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
        
        System.out.println("Enter id and money: ");
        while(input.hasNextInt()){
            int id =input.nextInt();
            if(id == 0) {break;}
            double money =input.nextDouble();
            System.out.println("Quit by 0! or  ");
            Account acc = new Account(id,money);
            System.out.println("Enter id and money: ");
            test.add(acc);  
        }
        System.out.println(test);
        
        System.out.println(test.get(1));
        System.out.println("Enter id to do: ");
        
        int[] num = new int[30];
        
        
        
        int select =input.nextInt();
        
        
        
        
        
        
       
        
    }
    
}

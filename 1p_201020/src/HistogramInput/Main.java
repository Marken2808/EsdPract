/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HistogramInput;

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
        // TODO code application logic 
        ArrayList<Integer> input = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i<10; i++){
//            System.out.print(i+"1-"+(i+1)+"0\t|");
//            input[i] = scanner.nextInt();
//        }
        System.out.println("Enter any numbers (1-100):");
        while(scanner.hasNextInt()){
            input.add(scanner.nextInt());
        }
        
        Histogram histogram = new Histogram();
        histogram.checkSum(input);
    }
    
}

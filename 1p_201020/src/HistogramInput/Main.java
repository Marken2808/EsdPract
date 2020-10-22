/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HistogramInput;

import java.io.File;
import java.io.FileNotFoundException;
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
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic 
        ArrayList<Integer> input = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter any numbers (1-100):");
        File file = new File("src/HistogramInput/grades.txt");
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextInt()){
            input.add(scanner.nextInt());
        }
        
        Histogram histogram = new Histogram();
        histogram.checkSum(input);
    }
    
}

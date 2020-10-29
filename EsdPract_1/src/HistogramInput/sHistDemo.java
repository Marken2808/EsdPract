/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HistogramInput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

/**
 *
 * @author me-aydin
 */
public class sHistDemo {
    
    /**
     *
     * @return
     */
    int nums[]; 
    
    public sHistDemo(){
        nums = new int[100];
        Random random = new Random();
        
        for(int i=0;i<100;i++) {
            nums[i] = random.nextInt(100);
           // System.out.println(nums[i]);
        }
    }
    
    public int[] retrieve() throws FileNotFoundException, IOException {
       
        try {
            FileReader file = new FileReader("src/HistogramInput/grades.txt");
            BufferedReader br = new BufferedReader(file);

            for(int i = 0; i<nums.length;i++) {
                String str = br.readLine().trim();
                try {
                    nums[i]= Integer.parseInt(str);
                } 
                catch(NumberFormatException ex) {
                    System.out.println("Error, "+nums[i]+" isn't a whole number!");
                }
                 //   System.out.println(str+" "+nums[i])
            }
            br.close();
        }
        catch(IOException ie ) {
            System.out.println(ie);
        }

        return nums;
    }
    public int[] getNums(){
         return nums;
    }
    
 
    public static void main(String[] str) throws FileNotFoundException, IOException{
        sHistDemo demo = new sHistDemo(); 
        
       // int[] nums = demo.getNums();
        int[] nums = demo.retrieve();
        
        sHistogram hist = new sHistogram(nums, 10);
        
        System.out.println(hist.getHistogram());
        
    }
    
}
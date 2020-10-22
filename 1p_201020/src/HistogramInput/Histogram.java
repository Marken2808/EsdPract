/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HistogramInput;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Marken Tuan Nguyen
 */
public class Histogram {
    
    
    void getLayer(ArrayList<Integer> input, int num) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=0; i< input.size(); i++){
            arr.add(((input.get(i))-1)/10);   
        }
        System.out.println(arr);
        int count = 0;
        
        for(int i : arr){
            if(arr.get(i) == num){
                count++;
            }
        }
        
        System.out.println(count);

    }
    
    void checkSum(ArrayList<Integer> input) {
        
        for(int i = 0; i<10; i++){
            System.out.println("at: "+i);
            getLayer(input, i);
            
        }
        
        
    }
    
    void test(ArrayList<Integer> input) {
        
    }

}

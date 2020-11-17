/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Marken Tuan Nguyen
 */
public class Histogram {
    
    void checkSum(ArrayList<Integer> input) {
        
        ArrayList<Integer> arr = new ArrayList<>();
        int[] test = new int[10];
        
        for(int i=0; i< input.size(); i++){
            arr.add(((input.get(i))-1)/10);   
        }
        for (int i=0; i<test.length; i++){
            for(int j=0; j<arr.size(); j++){
                if(arr.get(j)==i){
                    test[i]++;
                }
            }
        }
        System.out.println("test: "+ Arrays.toString(test)); 
        
        String [] strArr = new String[10];
        for(int i=0;i<10;i++){
            strArr[i] = String.join("", Collections.nCopies(test[i], "*"));
            System.out.printf("%d-%d\t|", (i+1)*10-9,(i+1)*10);
            System.out.println(strArr[i]);
        }
          
    }
}

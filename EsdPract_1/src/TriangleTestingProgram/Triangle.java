/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TriangleTestingProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Marken Tuan Nguyen
 */
public class Triangle {
    
    void checkValid(int[] sides) {
        //System.out.println(Arrays.toString(sides));
        if( sides[0] + sides[1] > sides[2] && 
            sides[1] + sides[2] > sides[0] && 
            sides[2] + sides[0] > sides[1])
        {
            String sharpe = checkSharpe(getTriangle(sides));
            System.out.println("It is " + sharpe +" triangle");
        } else {
            System.out.println("It is NOT triangle");
        }    
    } 
    
    int getTriangle(int[] sides) {
        
        int sum=0;
        for ( int i=0; i<sides.length; i++){
            for ( int j=i+1; j<sides.length; j++){
                int count=0;
                if (sides[i] == sides[j]) {
                    count++;
                    //System.out.println("count:" + count+ " ->"  + sides[i] + ":" + sides[j]);  
                } else if (sides[i] != sides[j]){
                    count=0;
                } 
                sum+=count;
            }
        }
        //System.out.println("sum:" + sum);
        return sum;
    }    
    
    String checkSharpe (int count){
        if(count == 0) return "scalene";
        else if(count == 1) return "isosceles";
        else if(count == 3) return "equilateral";
        return null;
    }
}

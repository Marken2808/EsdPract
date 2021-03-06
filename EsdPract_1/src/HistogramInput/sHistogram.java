/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HistogramInput;

/**
 *
 * @author me-aydin
 */

public class sHistogram {
    private final int[] bins;
    private int[] nums;
    
    
    public sHistogram(final int NUM,final int BIN){
        bins = new int[BIN];
        nums = new int[NUM];
        for(int i=0;i<BIN;i++)
            bins[i]=0;
    }

    public sHistogram(int[] grades, final int BIN) {
        
        bins = new int[BIN];
        final int NUM = grades.length;
        nums = new int[NUM];
        
        for(int i=0;i<BIN;i++)  bins[i]=0;
        
        for(int i=0;i<grades.length;i++) {
            nums[i] = grades[i];  
        }
    }
     
    public int[] getBins(){
        return bins;
    }
    
    
    public String getHistogram() { 
        
        String hist = "";
        int min = 0; 
        int max = 1;
        
        for(int i=0;i<nums.length;i++){
            int indx = (nums[i]-1)*bins.length/nums.length;
            bins[indx]++;
        }
         
        for(int i=0;i<bins.length;i++){
            min = 1+(i*nums.length/bins.length);
            max = (i+1)*(nums.length/bins.length);
            
            String bns = (min<10)?String.format("% d",min):""+min;
            bns += " - ";
            bns += (max<100)?String.format("% d",max):""+max;
            hist += bns+":  ";
            for(int j=0;j<bins[i];j++){
                hist += "*";
            }
            
            hist += "\n";
        } 
        
        return hist;
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical1;

import java.util.Scanner;

/**
 *
 * @author Marken Tuan Nguyen
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] sides = new int[3];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of sides: "); 
        
        int n = scanner.nextInt();
        for (int i = 0; i<n; i++){
            System.out.print("Enter the side " + (i+1) + ": ");
            sides[i] = scanner.nextInt();
        }
        
        Triangle triangle = new Triangle();
        triangle.checkValid(sides);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankDB;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        Connection con = null;
        PreparedStatement preStatement = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HistogramDB.Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/BankDB","nctuan", "123456"); 
// replace your user name with <user> and your password with <passwd> 
        } catch (SQLException ex) {
            Logger.getLogger(HistogramDB.Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Customer[] customer = new Customer[10];
        Customer cs = null;
        int id=0;
        String name;
        double balance=0;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            id = sc.nextInt();
            name = sc.next();
            balance = sc.nextDouble();
            cs = new Customer(id,name,balance);
            customer[0] = cs;
        }
        
        System.out.println(cs.getCusId());
    }
    
}

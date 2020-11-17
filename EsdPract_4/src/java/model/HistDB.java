/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marken Tuan Nguyen
 */
public class HistDB {
    Connection con = null;
    PreparedStatement preStatement = null;
    Statement statement = null;
    ResultSet resultSet = null;

    public String doQuery(String query) {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/HistogramDB","nctuan", "123456"); 
        // replace your user name with <user> and your password with <passwd> 
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        ArrayList<Integer> input = new ArrayList<>();
        File file = new File("src/HistogramDB/grades.txt");
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextInt()){
            input.add(scanner.nextInt());
            

        }
        
        
        
                        
        try {
            preStatement = con.prepareStatement("INSERT INTO grades VALUES(?,?)");
            for(int i = 0; i<input.size(); i++){
                //System.out.println(input.get(i));
                preStatement.setString(1, "Student"+String.valueOf(i));
                preStatement.setString(2, String.valueOf(input.get(i)));
                preStatement.executeUpdate();
                
                
                
            }
            System.out.println("Row added");
            preStatement.close(); 
            //con.close();
        }
        catch (SQLException s){
            System.out.println("SQL statement is not executed!");
            s.printStackTrace();
        }
}

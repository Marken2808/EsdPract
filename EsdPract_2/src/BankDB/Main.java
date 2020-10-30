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
import java.sql.ResultSetMetaData;
import java.sql.RowId;
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

    static Connection con = null;   
    static Statement statement = null;
    static ResultSet resultSet = null;
        
    public static void insert(String tableDB, Object[] ob) throws SQLException {
        
        PreparedStatement preStatement = null;
        preStatement = con.prepareStatement("INSERT INTO " +tableDB+" VALUES(?,?,?)");
        for(int i=0; i<ob.length; i++){
            preStatement.setString((i+1), String.valueOf(ob[i]));
        }
        preStatement.executeUpdate();
        System.out.println("Row added");
        preStatement.close(); 
    }
    
    public static void retrieve(String tableDB) throws SQLException {
        statement = con.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM " + tableDB );
        ResultSetMetaData metaData =  resultSet.getMetaData();
        int numberOfColumns = metaData.getColumnCount();
        while (resultSet.next()) {
            for (int i = 1; i <= numberOfColumns; i++){
                System.out.print(resultSet.getObject(i)+"\t");
            }
            System.out.println();
        }
        System.out.println("-------------------");
        resultSet.close();
        statement.close(); 
    }
    
    public static void select(String tableDB, int choice) throws SQLException{
        statement = con.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM " + tableDB +" WHERE customerID=" + choice);
        ResultSetMetaData metaData =  resultSet.getMetaData();
        while (resultSet.next()) {
            
            Customer cus = new Customer();
            int id = Integer.parseInt(resultSet.getString(1));
            String name = resultSet.getString(2);
            double balance = Double.valueOf(resultSet.getString(3));
            
            cus = new Customer(id, name, balance);
 
            System.out.println(cus.toString());
            
        }
        resultSet.close();
        statement.close(); 
//        return null;
    }
    
    public static Object[] scanTable(Scanner sc, String[] s) throws SQLException {
        
        Object[] ob = new Object[s.length];
        for(int i=0; i<s.length; i++){
            System.out.print(s[i]);
            ob[i]=sc.next();
        }
        return ob;        
    }
    
    public static Object[] declareCustomer(Object[] ob) throws SQLException {
        Customer cs = new Customer(
                Integer.valueOf((String)ob[0]),
                (String)ob[1],
                Double.valueOf((String)ob[2])
        );
        Object[] cusOb = new Object[ob.length];
        cusOb[0] = cs.getCusId();
        cusOb[1] = cs.getCusName();
        cusOb[2] = cs.getCusBalance();
        
        return cusOb;
    }
   
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // TODO code application logic here
        con = DriverManager.getConnection("jdbc:derby://localhost:1527/BankDB","nctuan", "123456"); 
        Class.forName("org.apache.derby.jdbc.ClientDriver");

        Scanner scan = new Scanner(System.in);
        String[] cusStr = new String[]{"Customer ID: ","Customer Name: ","Customer Balance: "};
        Object[] cusScan = scanTable(scan,cusStr);
        Object[] cusOb = declareCustomer(cusScan);
        
        insert("customers",cusOb);
        retrieve("customers");
        
        System.out.print("Choose Customer ID: ");
        int choice = scan.nextInt();
        select("customers", choice);
//            System.out.print("Chose: " + Arrays.toString(cusOb));
//        } else {
//            System.out.print("No data");
//        }
        
        con.close();  

    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenwithdatabase;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Lenovo
 */
public class Mavenwithdatabase {
    
    public static Connection conn(){
    try{
        String url = "jdbc:mysql://localhost:3306/comfeedormies";
        String user = "root";
        String password = "";
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, user, password);
        return conn;
        
    }catch(SQLException|ClassNotFoundException e){
        JOptionPane.showMessageDialog(null, e);
    }
    return null;
    }

    public static void main(String[] args) {
        
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Connection.SQLServerConnection;
import entity.Account;
import entity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author A410R
 */
public class AccountDAO {
    public Account getOne(String username,String password) {
        String query = "Select * FROM Account WHERE (username like ? and password like ?)";
        
        try (Connection con = SQLServerConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(query);){
            
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            
            
            
            if(rs.next()){
                Account a = new Account();
                a.setUsername(rs.getString(1));
                a.setPassword(rs.getString(1));
                return a;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return null;
    }
}

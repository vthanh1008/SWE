/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Connection.SQLServerConnection;
import entity.Brand;
import entity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author A410R
 */
public class BrandDAO {
    public List<Brand> getAll(){
        String query = "Select * FROM Brand";
        
        try (Connection con = SQLServerConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(query);){
            ResultSet rs = ps.executeQuery();
            
            List<Brand> ls = new ArrayList<>();
            
            while(rs.next()){
                Brand b = new Brand();
                b.setId(rs.getInt(1));
                b.setStatusId(rs.getInt(3));
                b.setBrand(rs.getString(2));
                ls.add(b);
            }
            return ls;
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return null;
    }
}

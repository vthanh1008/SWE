/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Connection.SQLServerConnection;
import entity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author A410R
 */
public class ProductDAO {
    
    Connection con;
    PreparedStatement ps;
    
    
    public List<Product> getAll(){
        String query = "Select * FROM product";
        
        try (Connection con = SQLServerConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(query);){
            ResultSet rs = ps.executeQuery();
            
            List<Product> ls = new ArrayList<>();
            
            while(rs.next()){
                Product p = new Product();
                p.setId(rs.getInt(1));
                p.setBrandID(rs.getInt(2));
                p.setSizeID(rs.getInt(3));
                p.setStatusID(rs.getInt(4));
                p.setName(rs.getString(5));
                p.setImage(rs.getString(6));
                p.setPrice(rs.getDouble(7));
                p.setQuantity(rs.getInt(8));
                p.setDescription(rs.getString(9));
                ls.add(p);
            }
            return ls;
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return null;
    }
    
    public Product getOne(int id) {
        String query = "Select * FROM product WHERE id = ?";
        
        try (Connection con = SQLServerConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(query);){
            
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            
            
            while(rs.next()){
                Product p = new Product();
                p.setId(rs.getInt(1));
                p.setBrandID(rs.getInt(2));
                p.setSizeID(rs.getInt(3));
                p.setStatusID(rs.getInt(4));
                p.setName(rs.getString(5));
                p.setImage(rs.getString(6));
                p.setPrice(rs.getDouble(7));
                p.setQuantity(rs.getInt(8));
                p.setDescription(rs.getString(9));
                return p;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return null;
    }
    
    
    public boolean addStudent(Product product) {
        int check = 0;
        String sql = "INSERT INTO Product(brand_id,size_id,status_id,name,image,price,quantity,description)"
                   + " VALUES(?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection con = SQLServerConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql);) {
            //ps.setObject(1, product.getId());
            ps.setObject(1, product.getBrandID());
            ps.setObject(2, product.getSizeID());
            ps.setObject(3, product.getStatusID());
            ps.setObject(4, product.getName());
            ps.setObject(5, product.getImage());
            ps.setObject(6, product.getPrice());
            ps.setObject(7, product.getQuantity());
            ps.setObject(8, product.getDescription());
            check = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean update(Product product, int id) {
        return false;
    }
    
    public boolean delete(int id) {
        return false;
    }
    
    
    public List<Product> searchByName(String name){
        String query = "Select * FROM product WHERE name LIKE '%"+name+"%'";
        
        try (Connection con = SQLServerConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(query);){
            
           // ps.setObject(1, name);
            ResultSet rs = ps.executeQuery();
            
            List<Product> ls = new ArrayList<>();
            
            
            while(rs.next()){
                Product p = new Product();
                p.setId(rs.getInt(1));
                p.setBrandID(rs.getInt(2));
                p.setSizeID(rs.getInt(3));
                p.setStatusID(rs.getInt(4));
                p.setName(rs.getString(5));
                p.setImage(rs.getString(6));
                p.setPrice(rs.getDouble(7));
                p.setQuantity(rs.getInt(8));
                p.setDescription(rs.getString(9));
                ls.add(p);
            }
            return ls;
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return null;
    }
    
    
    public List<Product> getAllById(int id){
        String query = "Select * FROM product where brand_id = ?";
        
        try (Connection con = SQLServerConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(query);){
            
            
            ps.setObject(1, id);
            ResultSet rs = ps.executeQuery();
            
            
            List<Product> ls = new ArrayList<>();
            
            while(rs.next()){
                Product p = new Product();
                p.setId(rs.getInt(1));
                p.setBrandID(rs.getInt(2));
                p.setSizeID(rs.getInt(3));
                p.setStatusID(rs.getInt(4));
                p.setName(rs.getString(5));
                p.setImage(rs.getString(6));
                p.setPrice(rs.getDouble(7));
                p.setQuantity(rs.getInt(8));
                p.setDescription(rs.getString(9));
                ls.add(p);
            }
            return ls;
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return null;
    }
    
    
    public static void main(String[] args) {
        
        System.out.println(new ProductDAO().getOne(1));
    }
    
}

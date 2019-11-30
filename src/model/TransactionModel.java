/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.security.SecureRandom;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.CashierPage;

/**
 *
 * @author user
 */
public class TransactionModel {
    public void addTransactionData(String date, String menu, String barber, String cashier, String uniqueId_member, int price, int pay, int discount) {
        try {
            PreparedStatement ps;
            String query = "INSERT INTO transaksi (tanggal, menu, username_barber, username_cashier, id_member, total_harga, uang_bayar, diskon, kembalian) VALUES (?,?,?,?,?,?,?,?,?)";
            ps = Connection.openConnection().prepareStatement(query);
            ps.setString(1, date);
            ps.setString(2, menu);
            ps.setString(3, barber);
            ps.setString(4, cashier);
            ps.setString(5, uniqueId_member);
            ps.setInt(6, price);
            ps.setInt(7, pay);
            ps.setInt(8, discount);
            ps.setInt(9, (pay - ((price + discount) - discount)));

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, 
                          " Price         : " + (price + discount ) +
                        "\n Discount  : " + discount +
                        "\n ------------------------" +
                        "\n Total         : " + ((price + discount) - discount) +
                        "\n Pay           : " + pay +
                        "\n ------------------------" +          
                        "\n Change    : " + (pay - ((price + discount) - discount)));
//                reset();
            }
        } catch(SQLException ex){
            Logger.getLogger(CashierPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void editTransactionData(String menu, String barber, String member, int total, int bayar, int diskon, int id, int diskonEdit) {
        try {
            String query = "UPDATE transaksi SET menu = ?, username_barber = ?, id_member = ?, total_harga = ?, uang_bayar = ?, diskon = ?, kembalian = ? WHERE id_transaksi = ?";
            PreparedStatement ps = Connection.openConnection().prepareStatement(query);
            ps.setString(1, menu);
            ps.setString(2, barber);
            ps.setString(3, member);
            ps.setInt(4, total);
            ps.setInt(5, bayar);
            ps.setInt(6, diskon);
            ps.setInt(7, (bayar - (total - diskon)) - diskonEdit);
            ps.setInt(8, id);
            
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, 
                          " Price         : " + (total + diskon) +
                        "\n Discount  : " + diskon +
                        "\n ------------------------" +
                        "\n Total         : " + total +
                        "\n Pay           : " + bayar +
                        "\n ------------------------" +          
                        "\n Change    : " + ((bayar - (total - diskon)) - diskonEdit));
//                ShowTransactionHistory();
            }
        } catch (SQLException ex) {
            Logger.getLogger(CashierPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int checkMember(String id) {
        PreparedStatement ps;
        ResultSet rs;
        String query = "SELECT id_member FROM member WHERE id_member = ?";
        int pos = 0;
        
        try {
            ps = Connection.openConnection().prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            
            if (rs.next()) {
                pos = 1;
            }else {
                pos = 0;
            }
        } catch(SQLException ex) {
            Logger.getLogger(CashierPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return pos;
    }
    
    public static String generateUniqueIDMember(){
        final String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
        final String CHAR_UPPER = CHAR_LOWER.toUpperCase();
        final String NUMBER = "0123456789";
        final SecureRandom random = new SecureRandom();
        
        final String DATA_FOR_RANDOM_STRING = CHAR_UPPER + NUMBER;
        
        int length = 6;
        StringBuilder sb = new StringBuilder(length);
        
        for (int i = 0; i < length; i++) {
            int rndCharAt = random.nextInt((DATA_FOR_RANDOM_STRING).length());
            char rndChar = DATA_FOR_RANDOM_STRING.charAt(rndCharAt);
            
            sb.append(rndChar);
        }
        
        return sb.toString();
    }
    
    public void addMemberData(String namaMember, String alamat, String date, String no_telp, String email) {
        try {
            String uniqueId = generateUniqueIDMember();
            String query = "INSERT INTO member (id_member, nama_member, alamat, tanggal_lahir, no_telp, email) VALUES (?,?,?,?,?,?)";
            PreparedStatement ps = Connection.openConnection().prepareStatement(query);
            ps.setString(1, uniqueId);
            ps.setString(2, namaMember);
            ps.setString(3, alamat);
            ps.setString(4, date);
            ps.setString(5, no_telp);
            ps.setString(6, email);
            
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Congratulations, your Unique ID is : " + uniqueId);
            }
        } catch(SQLException ex) {
            Logger.getLogger(CashierPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public int getDiscount(int total,String IDMember){
        int discount = 0;
        int getCount = 0;
        try {
            String query = "SELECT COUNT(id_member) FROM transaksi WHERE id_member = ?";
            PreparedStatement ps = Connection.openConnection().prepareStatement(query);
            ps.setString(1, IDMember);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                getCount = rs.getInt(1);
            }
            
            if (getCount > 0 && (getCount+1) % 3 == 0) {
                discount = (total * 10) / 100;
            }
        }catch (SQLException ex){
            Logger.getLogger(CashierPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return discount;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.FunctionLibrary;
import model.TransactionModel;
import view.CashierPage;

/**
 *
 * @author user
 */
public class ControllerCashier {
    FunctionLibrary fl = new FunctionLibrary();
    
    public void loadBarber(javax.swing.JComboBox cbBarber) {
        try {
            PreparedStatement ps;
            ResultSet rs;
            String query = "SELECT * FROM users WHERE LEVEL = 'Barber'";
            ps = Connection.openConnection().prepareStatement(query);
            rs = ps.executeQuery();
            
            cbBarber.addItem("-- Choose Barber --");
            
            while(rs.next()) {
                cbBarber.addItem(rs.getString("username"));
            }
            
        } catch(SQLException ex) {
            Logger.getLogger(CashierPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void loadYear(javax.swing.JComboBox cbYear, String username) {
        try {
            PreparedStatement ps;
            ResultSet rs;
            String year = "";
            ArrayList<String> yearFix = new ArrayList<>();
            String query = "SELECT * FROM transaksi WHERE username_cashier = ?";
            ps = Connection.openConnection().prepareStatement(query);
            ps.setString(1, username);
            rs = ps.executeQuery();
            int count = 0;
            while(rs.next()) {
                String tanggal = rs.getString("tanggal");
                year = fl.splitYear(tanggal);
                
                if (count == 0) {
                    yearFix.add(year);
                    cbYear.addItem(year);
                    count++;
                }
                else{
                    int count2 = 0;
                    for (int i = 0; i < yearFix.size(); i++) {
                        if (year.equals(yearFix.get(i))) {
                            count2++;
                        }
                    }
                    if (count2 == 0) {
                        cbYear.addItem(year);
                    }
                    
                }
            }
            
        } catch(SQLException ex) {
            Logger.getLogger(CashierPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int menuPrice(int index) {
        int price = 0;
        
        switch(index){
            case 0:
                price = 0;
                break;
            case 1:
                price = 30000;
                break;
            case 2:
                price = 35000;
                break;
            case 3:
                price = 20000;
                break;    
            case 4:
                price = 15000;
                break;
            case 5:
                price = 22000;
                break;
            case 6:
                price = 40000;
                break;
        }
        return price;
    }
    
    public void addMember(String namaMember, String address, String email, String phoneNumber, String date) {
        try {
            if (namaMember.equals("")) {
                JOptionPane.showMessageDialog(null, "Please fill the member name field!");
            } else if(address.equals("")) {
                JOptionPane.showMessageDialog(null, "Please fill the address field!");
            } else if (email.equals("")) {
                JOptionPane.showMessageDialog(null, "Please fill the address field!");
            } else if (phoneNumber.equals("")) {
                JOptionPane.showMessageDialog(null, "Please fill phone number field!");
            } else {
                new TransactionModel().addMemberData(namaMember, address, date, phoneNumber, email);
            }
        } catch(NullPointerException ex) {
                JOptionPane.showMessageDialog(null, "Please fill date field!");
        }
    }
    
    public void cashierInfo(String cashierUsername, javax.swing.JLabel jlName, javax.swing.JLabel jlAddress, javax.swing.JLabel jlGender, javax.swing.JLabel jlNik) {
        String query = "SELECT * FROM users WHERE username = ?";
        
        try {
            PreparedStatement ps = Connection.openConnection().prepareStatement(query);
            ps.setString(1, cashierUsername);
            ResultSet rs = ps.executeQuery();
            String gender = "";
            
            if (rs.next()) {
                String name = rs.getString("nama");
                String nik = rs.getString("nik");
                String address = rs.getString("alamat");
                
                if (rs.getInt("jenis_kelamin") == 1) {
                    gender = "Male";
                } else if (rs.getInt("jenis_kelamin") == 2) {
                    gender = "Female";
                } else {
                    gender = "other";
                }
                jlName.setText(name);
                jlAddress.setText(address);
                jlGender.setText(gender);
                jlNik.setText(nik);
            }
            
        } catch(SQLException ex) {
            Logger.getLogger(CashierPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int salaryInfo(String cashierUsername) {
        int salary = 0;
        String query = "SELECT SUM(total_harga) FROM transaksi WHERE username_cashier = ?";
        try {
            PreparedStatement ps = Connection.openConnection().prepareStatement(query);
            ps.setString(1, cashierUsername);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                int total = rs.getInt(1);
                salary = (total * 25) / 100;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CashierPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        return salary;
    }
    
    public void totalDataInputInfo(String cashierUsername, javax.swing.JLabel jlDataInput) {
        int total = 0;
        String query = "SELECT COUNT(total_harga) FROM transaksi WHERE username_cashier = ?";
        try {
            PreparedStatement ps = Connection.openConnection().prepareStatement(query);
            ps.setString(1, cashierUsername);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                total = rs.getInt(1);
            }
            
            jlDataInput.setText(String.valueOf(total));
        } catch (SQLException ex) {
            Logger.getLogger(CashierPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

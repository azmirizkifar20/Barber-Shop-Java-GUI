package controller;

import model.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.FunctionLibrary;
import view.BarberPage;

public class ControllerBarber {
    FunctionLibrary fl = new FunctionLibrary();
    
    public void memberInfo(String usernameBarber, javax.swing.JLabel jlName, javax.swing.JLabel jlAddress, javax.swing.JLabel jlGender, javax.swing.JLabel jlNik) {
        String query = "SELECT * FROM users WHERE username = ?";
        
        try {
            PreparedStatement ps = Connection.openConnection().prepareStatement(query);
            ps.setString(1, usernameBarber);
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
            Logger.getLogger(BarberPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int salaryInfo(String usernameBarber) {
        int salary = 0;
        String query = "SELECT SUM(total_harga) FROM transaksi WHERE username_barber = ?";
        try {
            PreparedStatement ps = Connection.openConnection().prepareStatement(query);
            ps.setString(1, usernameBarber);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                int total = rs.getInt(1);
                salary = (total * 45) / 100;
            }
            
//            jlSalary.setText(String.valueOf(salary));
        } catch (SQLException ex) {
            Logger.getLogger(BarberPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        return salary;
    }
    
    public void totalDataInputInfo(String usernameBarber, javax.swing.JLabel jlDataInput) {
        int total = 0;
        String query = "SELECT COUNT(total_harga) FROM transaksi WHERE username_barber = ?";
        try {
            PreparedStatement ps = Connection.openConnection().prepareStatement(query);
            ps.setString(1, usernameBarber);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                total = rs.getInt(1);
            }
            
            jlDataInput.setText(String.valueOf(total));
        } catch (SQLException ex) {
            Logger.getLogger(BarberPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void loadYear(javax.swing.JComboBox cbYear, String username) {
        try {
            PreparedStatement ps;
            ResultSet rs;
            String year = "";
            ArrayList<String> yearFix = new ArrayList<>();
            String query = "SELECT * FROM transaksi WHERE username_barber = ?";
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
                else {
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
            Logger.getLogger(BarberPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

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
import view.AdminPage;

public class ControllerAdmin {
    FunctionLibrary fl = new FunctionLibrary();
    
    public int salaryInfoBarber(String usernameBarber) {
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
            
        } catch (SQLException ex) {
            Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        return salary;
    }
    
    public int salaryInfoCashier(String usernameCashier) {
        int salary = 0;
        String query = "SELECT SUM(total_harga) FROM transaksi WHERE username_cashier = ?";
        try {
            PreparedStatement ps = Connection.openConnection().prepareStatement(query);
            ps.setString(1, usernameCashier);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                int total = rs.getInt(1);
                salary = (total * 25) / 100;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        return salary;
    }
    
    public void totalDataInputInfoBarber(String usernameBarber, javax.swing.JLabel jlDataInput) {
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
            Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void totalDataInputInfoCashier(String usernameCashier, javax.swing.JLabel jlDataInput) {
        int total = 0;
        String query = "SELECT COUNT(total_harga) FROM transaksi WHERE username_cashier = ?";
        try {
            PreparedStatement ps = Connection.openConnection().prepareStatement(query);
            ps.setString(1, usernameCashier);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                total = rs.getInt(1);
            }
            
            jlDataInput.setText(String.valueOf(total));
        } catch (SQLException ex) {
            Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void register(String name, String nik, String address, String username, String password, String passwordConfirm, int gender, javax.swing.JComboBox cbLevel, String level) {
        if (name.equals("")) {
            JOptionPane.showMessageDialog(null, "Name required!");
        } else if (nik.equals("")) {
            JOptionPane.showMessageDialog(null, "NIK required!");
        } else if (address.equals("")) {
            JOptionPane.showMessageDialog(null, "Address required!");
        } else if (username.equals("")) {
            JOptionPane.showMessageDialog(null, "Username required!");
        } else if (password.equals("")) {
            JOptionPane.showMessageDialog(null, "Password reuqired");
        } else if (!password.equals(passwordConfirm)) {
            JOptionPane.showMessageDialog(null, "Invalid password confirmation!");
        } else if(gender == 0) {
            JOptionPane.showMessageDialog(null, "Gender required");
        } else if (cbLevel.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Job required");
        } else if (new FunctionLibrary().checkUsername(username)) {
            JOptionPane.showMessageDialog(null, "This username already exist");
        } else {
            PreparedStatement ps;
            String passwordFix = new FunctionLibrary().SHA1(password);
            String query = "INSERT INTO users (nama, nik, alamat, jenis_kelamin, level, username, password) VALUES (?,?,?,?,?,?,?)";

            try {
                ps = Connection.openConnection().prepareStatement(query);
                ps.setString(1, name);
                ps.setString(2, nik);
                ps.setString(3, address);
                ps.setInt(4, gender);
                ps.setString(5, level);
                ps.setString(6, username);
                ps.setString(7, passwordFix);

                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "New User Add");
                }
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);

            }
        }
    }
    
    public void loadYear(javax.swing.JComboBox cbYear, String username) {
        try {
            String year = "";
            ArrayList<String> yearFix = new ArrayList<>();
            String queryCek = "SELECT * FROM users WHERE username = ?";
            PreparedStatement psCek = Connection.openConnection().prepareStatement(queryCek);
            psCek.setString(1, username);
            ResultSet rsCek = psCek.executeQuery();
            
            if (rsCek.next()) {
                String level = rsCek.getString("level");
                if (level.equals("Cashier")) {
                    String query = "SELECT * FROM transaksi WHERE username_cashier = ?";
                    PreparedStatement ps = Connection.openConnection().prepareStatement(query);
                    ps.setString(1, username);
                    ResultSet rs = ps.executeQuery();
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
                } else if (level.equals("Barber")) {
                    String query = "SELECT * FROM transaksi WHERE username_barber = ?";
                    PreparedStatement ps = Connection.openConnection().prepareStatement(query);
                    ps.setString(1, username);
                    ResultSet rs = ps.executeQuery();
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
                }
                else if (level.equals("Admin")) {
                    String query = "SELECT * FROM transaksi";
                    PreparedStatement ps = Connection.openConnection().prepareStatement(query);
                    ResultSet rs = ps.executeQuery();
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
                }
                
            }
        } catch(SQLException ex) {
            Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

package model;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import view.AdminPage;

public class FunctionLibrary {
    public String SHA1(String password) {
        String encPass = null;
        
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA1");
            digest.update(password.getBytes(), 0, password.length());
            encPass = new BigInteger(1, digest.digest()).toString(16);
            String vsha1 = encPass.toUpperCase();
        } catch(Exception e) {
            e.printStackTrace();
        }
        return encPass;
    }
    
    public boolean checkUsername(String username) {
        PreparedStatement ps;
        ResultSet rs;
        boolean checkUser = false;
        String query = "SELECT * FROM users WHERE username = ?";
        
        try {
            ps = Connection.openConnection().prepareStatement(query);
            ps.setString(1, username);
            rs = ps.executeQuery();
            
            if (rs.next()) {
                checkUser = true;
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        return checkUser;
    }
    public String convertGender(int index){
        if (index == 1) {
            return "Male";
        }
        else if(index == 2){
            return "Female";
        }
        else{
            return "Other";
        }
    }
    public String splitMonth(String dateTransaction){
        String tempString = dateTransaction;
        String [] mainDevide = tempString.split(" ",2);
        String [] dateDevide = mainDevide[0].split("-",3);
        String result = dateDevide[1];
        return result;
    }
    public String splitYear(String dateTransaction){
        String tempString = dateTransaction;
        String [] mainDevide = tempString.split(" ",2);
        String [] dateDevide = mainDevide[0].split("-",3);
        String result = dateDevide[2];
        return result;
    }
}

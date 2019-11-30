package controller;

import model.Connection;
import model.Transaction;
import java.awt.Color;
import java.awt.Font;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import model.FunctionLibrary;
import model.Users;
import view.AdminPage;
import view.BarberPage;
import view.CashierPage;

public class TableControl {
    DefaultTableModel modelTransaksiBarber = new DefaultTableModel();
    DefaultTableModel modelTransaksiCashier = new DefaultTableModel();
    DefaultTableModel modelBarber = new DefaultTableModel();
    DefaultTableModel modelCashier = new DefaultTableModel();
    DefaultTableModel modelMember = new DefaultTableModel();
    DefaultTableModel modelTransactionAdmin = new DefaultTableModel();
    DefaultTableModel modelUser = new DefaultTableModel();
    
    ArrayList<Transaction> daftarTransaksiBarber;
    ArrayList<Transaction> daftarTransaksiCashier;
    ArrayList<Transaction> daftarTransaksiMember;
    ArrayList<Transaction> daftarTransaksiAdmin;
    ArrayList<Users> daftarUsers;

    public DefaultTableModel getModelTransaksiBarber() {
        return modelTransaksiBarber;
    }

    public DefaultTableModel getModelBarber() {
        return modelBarber;
    }

    public DefaultTableModel getModelTransaksiCashier() {
        return modelTransaksiCashier;
    }

    public DefaultTableModel getModelCashier() {
        return modelCashier;
    }

    public DefaultTableModel getModelMember() {
        return modelMember;
    }

    public DefaultTableModel getModelTransactionAdmin() {
        return modelTransactionAdmin;
    }

    public DefaultTableModel getModelUser() {
        return modelUser;
    }

    public ArrayList<Transaction> getDaftarTransaksiBarber() {
        return daftarTransaksiBarber;
    }

    public ArrayList<Transaction> getDaftarTransaksiCashier() {
        return daftarTransaksiCashier;
    }

    public ArrayList<Transaction> getDaftarTransaksiMember() {
        return daftarTransaksiMember;
    }

    public ArrayList<Transaction> getDaftarTransaksiAdmin() {
        return daftarTransaksiAdmin;
    }

    public ArrayList<Users> getDaftarUsers() {
        return daftarUsers;
    }
    
    // styling
    public void styleBarberTable(javax.swing.JTable jtTransaction, javax.swing.JTable jtSalary) {
        jtTransaction.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        jtTransaction.getTableHeader().setOpaque(false);
        jtTransaction.getTableHeader().setBackground(new Color(0,204,204));
        jtTransaction.getTableHeader().setForeground(new Color(255, 255, 255));
        jtTransaction.setRowHeight(25);
        
        jtSalary.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        jtSalary.getTableHeader().setOpaque(false);
        jtSalary.setRowHeight(25);
    }
    
    public void styleCashierTable(javax.swing.JTable jtTransaction, javax.swing.JTable jtSalary) {
        jtTransaction.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        jtTransaction.getTableHeader().setOpaque(false);
        jtTransaction.getTableHeader().setBackground(new Color(108,197,155));
        jtTransaction.getTableHeader().setForeground(new Color(255, 255, 255));
        jtTransaction.setRowHeight(25);
        
        jtSalary.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        jtSalary.getTableHeader().setOpaque(false);
        jtSalary.setRowHeight(25);
    }
    
    public void styleAdminTable(javax.swing.JTable jtTransaction) {
        jtTransaction.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        jtTransaction.getTableHeader().setOpaque(false);
        jtTransaction.getTableHeader().setBackground(new Color(153,153,0));
        jtTransaction.getTableHeader().setForeground(new Color(255, 255, 255));
        jtTransaction.setRowHeight(25);
    }
    
    // barber page
    public void loadKolomTransaksi(DefaultTableModel model, String pegawai) {
        model.addColumn("ID");
        model.addColumn("Date");
        model.addColumn("Menu");
        model.addColumn(pegawai);
        model.addColumn("Member ID");
        model.addColumn("Total Price");
        model.addColumn("Pay");
        model.addColumn("Discount");
        model.addColumn("Change");
    }
    
    public void loadKolomTransaksiAdmin() {
        modelTransactionAdmin.addColumn("ID");
        modelTransactionAdmin.addColumn("Date");
        modelTransactionAdmin.addColumn("Menu");
        modelTransactionAdmin.addColumn("Barber");
        modelTransactionAdmin.addColumn("Cashier");
        modelTransactionAdmin.addColumn("Member ID");
        modelTransactionAdmin.addColumn("Total Price");
        modelTransactionAdmin.addColumn("Pay");
        modelTransactionAdmin.addColumn("Discount");
        modelTransactionAdmin.addColumn("Change");
    }
    
    public void loadKolomGaji(DefaultTableModel model) {
        model.addColumn("No");
        model.addColumn("Date & Time");
        model.addColumn("Total Price");
        model.addColumn("Salary");
    }
    
    public void loadColumnUser(){
        modelUser.addColumn("NAME");
    }
    
    public void showDataSalary(DefaultTableModel model, DefaultTableModel model2, ArrayList<Transaction> arrTransaksi, ArrayList<Transaction> arrTransaksi2) {
        model.setRowCount(0);
        model2.setRowCount(0);
        int no = 1;
        int no2 = 1;
        int salary, total = 0;
        for (Transaction data : arrTransaksi) {
            total = data.getTotal();
            salary = (total * 30) / 100;
            model.addRow(new Object[]{no, data.getTanggal(), data.getTotal(), salary});
            no++;
        }
        for (Transaction data : arrTransaksi2) {
            total = data.getTotal();
            salary = (total * 30) / 100;
            model2.addRow(new Object[]{no2, data.getTanggal(), data.getTotal(), salary});
            no2++;
        }
    }
    
    public int showDataSalaryCashierMonth(String year, String month) {
        modelMember.setRowCount(0);
        int no2 = 1;
        int salary = 0; 
        int total = 0;
        int salaryTotal = 0;
        FunctionLibrary fl = new FunctionLibrary();
        
        for (Transaction data : daftarTransaksiMember) {
            if (fl.splitMonth(data.getTanggal()).equals(month) && fl.splitYear(data.getTanggal()).equals(year)) {
                total = data.getTotal();
                salary = (total * 20) / 100;
                modelMember.addRow(new Object[]{no2, data.getTanggal(), data.getTotal(), salary});
                no2++;
                salaryTotal += salary;
            }
        }
        return salaryTotal;
    }
    
    public int showDataSalaryBarberMonth(String year, String month) {
        modelMember.setRowCount(0);
        int no2 = 1;
        int salary = 0; 
        int total = 0;
        int salaryTotal = 0;
        FunctionLibrary fl = new FunctionLibrary();
        
        for (Transaction data : daftarTransaksiMember) {
            if (fl.splitMonth(data.getTanggal()).equals(month) && fl.splitYear(data.getTanggal()).equals(year)) {
                total = data.getTotal();
                salary = (total * 30) / 100;
                modelMember.addRow(new Object[]{no2, data.getTanggal(), data.getTotal(), salary});
                no2++;
                salaryTotal += salary;
            }
        }
        return salaryTotal;
    }
    
    public void ShowBarberTransaction() {
        modelTransaksiBarber.setRowCount(0);
        for (Transaction data : daftarTransaksiBarber) {
            modelTransaksiBarber.addRow(new Object[]{data.getId(), data.getTanggal(), data.getMenu(), data.getCashier(), 
                        data.getMember(), data.getTotal(), data.getUangBayar(), data.getDiskon(), 
                        data.getKembalian()});
        }
    }
    
    public void ShowCashierTransaction() {
        modelTransaksiCashier.setRowCount(0);
        modelMember.setRowCount(0);
        for (Transaction data : daftarTransaksiCashier) {
            modelTransaksiCashier.addRow(new Object[]{data.getId(), data.getTanggal(), data.getMenu(), data.getBarber(), 
                        data.getMember(), data.getTotal(), data.getUangBayar(), data.getDiskon(), 
                        data.getKembalian()});
        }
    }
    
    public void ShowAdminTransaction() {
        modelTransactionAdmin.setRowCount(0);
        for (Transaction data : daftarTransaksiAdmin) {
            modelTransactionAdmin.addRow(new Object[]{data.getId(), data.getTanggal(), data.getMenu(), data.getBarber(), 
                        data.getCashier(), data.getMember(), data.getTotal(), data.getUangBayar(), data.getDiskon(), 
                        data.getKembalian()});
        }
    }
    
    public void showUser() {
        modelUser.setRowCount(0);
        for (Users data : daftarUsers) {
            modelUser.addRow(new Object[]{data.getNama()});
        }
    }
    
    public void showUserData(int selectedRows, String nama, javax.swing.JTextField tfEditName, javax.swing.JTextField tfEditNIK, javax.swing.JTextField tfEditGender, javax.swing.JTextField tfEditLevel, javax.swing.JTextArea taEditAddress, javax.swing.JTextField tfEditUsername) {
        FunctionLibrary fl = new FunctionLibrary();
        for (Users data : daftarUsers) {
            if (nama.equals(data.getNama())) {
                tfEditName.setText(data.getNama());
                tfEditNIK.setText(data.getNik());
                tfEditGender.setText(fl.convertGender(data.getJenisKelamin()));
                tfEditLevel.setText(data.getLevel());
                taEditAddress.setText(data.getAlamat());
                tfEditUsername.setText(data.getUsername());
            }
        }
    }
    
    // load data
    public void loadBarberTransaction(String barberName) {
        daftarTransaksiBarber = new ArrayList<>();
        daftarTransaksiMember = new ArrayList<>();
        String query = "SELECT * FROM transaksi WHERE username_barber = ?";
        try {
            PreparedStatement ps = Connection.openConnection().prepareStatement(query);
            ps.setString(1, barberName);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()) {
                int id_transaction = rs.getInt("id_transaksi");
                String tanggal = rs.getString("tanggal");
                String menu = rs.getString("menu");
                String barber = rs.getString("username_barber");
                String cashier = rs.getString("username_cashier");
                String member = rs.getString("id_member");
                int total = rs.getInt("total_harga");
                int uang = rs.getInt("uang_bayar");
                int diskon = rs.getInt("diskon");
                int kembalian = rs.getInt("kembalian");
                Transaction data = new Transaction(id_transaction, tanggal, menu, barber, cashier, member, total, uang, diskon, kembalian);
                daftarTransaksiBarber.add(data);
                daftarTransaksiMember.add(data);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(BarberShop.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void loadCashierTransaction(String cashierName) {
        daftarTransaksiCashier = new ArrayList<>();
        daftarTransaksiMember = new ArrayList<>();
        String query = "SELECT * FROM transaksi WHERE username_cashier = ?";
        try {
            PreparedStatement ps = Connection.openConnection().prepareStatement(query);
            ps.setString(1, cashierName);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()) {
                int id_transaction = rs.getInt("id_transaksi");
                String tanggal = rs.getString("tanggal");
                String menu = rs.getString("menu");
                String barber = rs.getString("username_barber");
                String cashier = rs.getString("username_cashier");
                String member = rs.getString("id_member");
                int total = rs.getInt("total_harga");
                int uang = rs.getInt("uang_bayar");
                int diskon = rs.getInt("diskon");
                int kembalian = rs.getInt("kembalian");
                Transaction data = new Transaction(id_transaction, tanggal, menu, barber, cashier, member, total, uang, diskon, kembalian);
                daftarTransaksiCashier.add(data);
                daftarTransaksiMember.add(data);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CashierPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void loadAdminTransaction() {
        daftarTransaksiAdmin = new ArrayList<>();
        String query = "SELECT * FROM transaksi";
        try {
            PreparedStatement ps = Connection.openConnection().prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()) {
                int id_transaction = rs.getInt("id_transaksi");
                String tanggal = rs.getString("tanggal");
                String menu = rs.getString("menu");
                String barber = rs.getString("username_barber");
                String cashier = rs.getString("username_cashier");
                String member = rs.getString("id_member");
                int total = rs.getInt("total_harga");
                int uang = rs.getInt("uang_bayar");
                int diskon = rs.getInt("diskon");
                int kembalian = rs.getInt("kembalian");
                Transaction data = new Transaction(id_transaction, tanggal, menu, barber, cashier, member, total, uang, diskon, kembalian);
                daftarTransaksiAdmin.add(data);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void loadUser(String category) {
        daftarUsers = new ArrayList<>();
        String query;
        PreparedStatement ps;
        ResultSet rs;
        try {
        if (category.equals("Semua")) {
            query = "SELECT * FROM users WHERE level NOT IN ('admin')";
            ps = Connection.openConnection().prepareStatement(query);
            rs = ps.executeQuery();
        }
        else{
            query = "SELECT * FROM users WHERE level = ?";
            ps = Connection.openConnection().prepareStatement(query);
            ps.setString(1, category);
            rs = ps.executeQuery();
        }
            while(rs.next()) {
                int id_user = rs.getInt("id_user");
                String nama = rs.getString("nama");
                String nik = rs.getString("nik");
                String alamat = rs.getString("alamat");
                int jk = rs.getInt("jenis_kelamin");
                String level = rs.getString("level");
                String username = rs.getString("username");
                String password = rs.getString("password");
                Users data = new Users(id_user,nama,nik,alamat,jk,level,username,password);
                daftarUsers.add(data);
                
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // search
    public void SearchTransactionBarber(String keyword, String usernameBarber) {
        daftarTransaksiBarber = new ArrayList<>();
        String query = "SELECT * FROM transaksi WHERE (id_transaksi LIKE ? OR tanggal LIKE ? OR "
                + "menu LIKE ? OR username_barber LIKE ? OR id_member LIKE ? OR total_harga LIKE ? OR "
                + "uang_bayar LIKE ? OR diskon LIKE ? OR kembalian LIKE ?) AND username_barber = ?";
        try {
            PreparedStatement ps = Connection.openConnection().prepareStatement(query);
            ps.setString(1, "%" + keyword + "%");
            ps.setString(2, "%" + keyword + "%");
            ps.setString(3, "%" + keyword + "%");
            ps.setString(4, "%" + keyword + "%");
            ps.setString(5, "%" + keyword + "%");
            ps.setString(6, "%" + keyword + "%");
            ps.setString(7, "%" + keyword + "%");
            ps.setString(8, "%" + keyword + "%");
            ps.setString(9, "%" + keyword + "%");
            ps.setString(10, usernameBarber);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                int id_transaction = rs.getInt("id_transaksi");
                String tanggal = rs.getString("tanggal");
                String menu = rs.getString("menu");
                String barber = rs.getString("username_barber");
                String cashier = rs.getString("username_cashier");
                String member = rs.getString("id_member");
                int total = rs.getInt("total_harga");
                int uang = rs.getInt("uang_bayar");
                int diskon = rs.getInt("diskon");
                int kembalian = rs.getInt("kembalian");
                Transaction data = new Transaction(id_transaction, tanggal, menu, barber, cashier, member, total, uang, diskon, kembalian);
                daftarTransaksiBarber.add(data);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(BarberPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void searchTransactionCashier(String keyword, String usernameCashier) {
        daftarTransaksiCashier = new ArrayList<>();
        String query = "SELECT * FROM transaksi WHERE (id_transaksi LIKE ? OR tanggal LIKE ? OR "
                + "menu LIKE ? OR username_barber LIKE ? OR id_member LIKE ? OR total_harga LIKE ? OR "
                + "uang_bayar LIKE ? OR diskon LIKE ? OR kembalian LIKE ?) AND username_cashier = ?";
        try {
            PreparedStatement ps = Connection.openConnection().prepareStatement(query);
            ps.setString(1, "%" + keyword + "%");
            ps.setString(2, "%" + keyword + "%");
            ps.setString(3, "%" + keyword + "%");
            ps.setString(4, "%" + keyword + "%");
            ps.setString(5, "%" + keyword + "%");
            ps.setString(6, "%" + keyword + "%");
            ps.setString(7, "%" + keyword + "%");
            ps.setString(8, "%" + keyword + "%");
            ps.setString(9, "%" + keyword + "%");
            ps.setString(10, usernameCashier);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                int id_transaction = rs.getInt("id_transaksi");
                String tanggal = rs.getString("tanggal");
                String menu = rs.getString("menu");
                String barber = rs.getString("username_barber");
                String cashier = rs.getString("username_cashier");
                String member = rs.getString("id_member");
                int total = rs.getInt("total_harga");
                int uang = rs.getInt("uang_bayar");
                int diskon = rs.getInt("diskon");
                int kembalian = rs.getInt("kembalian");
                Transaction data = new Transaction(id_transaction, tanggal, menu, barber, cashier, member, total, uang, diskon, kembalian);
                daftarTransaksiCashier.add(data);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CashierPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void SearchTransactionAdmin(String keyword) {
        daftarTransaksiAdmin = new ArrayList<>();
        String query = "SELECT * FROM transaksi WHERE id_transaksi LIKE ? OR tanggal LIKE ? OR "
                + "menu LIKE ? OR username_barber LIKE ? OR username_cashier LIKE ? OR id_member LIKE ? OR total_harga LIKE ? OR "
                + "uang_bayar LIKE ? OR diskon LIKE ? OR kembalian LIKE ?";
        try {
            PreparedStatement ps = Connection.openConnection().prepareStatement(query);
            ps.setString(1, "%" + keyword + "%");
            ps.setString(2, "%" + keyword + "%");
            ps.setString(3, "%" + keyword + "%");
            ps.setString(4, "%" + keyword + "%");
            ps.setString(5, "%" + keyword + "%");
            ps.setString(6, "%" + keyword + "%");
            ps.setString(7, "%" + keyword + "%");
            ps.setString(8, "%" + keyword + "%");
            ps.setString(9, "%" + keyword + "%");
            ps.setString(10, "%" + keyword + "%");
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                int id_transaction = rs.getInt("id_transaksi");
                String tanggal = rs.getString("tanggal");
                String menu = rs.getString("menu");
                String barber = rs.getString("username_barber");
                String cashier = rs.getString("username_cashier");
                String member = rs.getString("id_member");
                int total = rs.getInt("total_harga");
                int uang = rs.getInt("uang_bayar");
                int diskon = rs.getInt("diskon");
                int kembalian = rs.getInt("kembalian");
                Transaction data = new Transaction(id_transaction, tanggal, menu, barber, cashier, member, total, uang, diskon, kembalian);
                daftarTransaksiAdmin.add(data);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void SearchUsers(String keyword) {
        daftarUsers = new ArrayList<>();
        String query = "SELECT * FROM users WHERE id_user LIKE ? OR nama LIKE ? OR "
                + "alamat LIKE ? OR level LIKE ? OR username LIKE ?";
        try {
            PreparedStatement ps = Connection.openConnection().prepareStatement(query);
            ps.setString(1, "%" + keyword + "%");
            ps.setString(2, "%" + keyword + "%");
            ps.setString(3, "%" + keyword + "%");
            ps.setString(4, "%" + keyword + "%");
            ps.setString(5, "%" + keyword + "%");
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                int id_user = rs.getInt("id_user");
                String nama = rs.getString("nama");
                String nik = rs.getString("nik");
                String alamat = rs.getString("alamat");
                int jk = rs.getInt("jenis_kelamin");
                String level = rs.getString("level");
                String username = rs.getString("username");
                String password = rs.getString("password");
                Users user = new Users(id_user,nama,nik,alamat,jk,level,username,password);
                daftarUsers.add(user);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
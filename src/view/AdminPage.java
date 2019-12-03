package view;

import model.Connection;
import controller.ControllerAdmin;
import controller.TableControl;
import java.awt.Color;
import java.awt.print.PrinterException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import model.Session;

public class AdminPage extends javax.swing.JFrame {
    TableControl tc = new TableControl();
    ControllerAdmin ca = new ControllerAdmin();
    SimpleDateFormat x = new SimpleDateFormat("dd-MM-yyyy");
    Date ys = new Date();
    
    public AdminPage(Session session) {
        initComponents();
        this.setLocationRelativeTo(null);
        
        // loadColumn
        tc.loadColumnUser();
        tc.loadColumnMember();
        tc.loadKolomGaji(tc.getModelMember());
        tc.loadKolomTransaksiAdmin();
        
        // show transaction
        tc.loadAdminTransaction();
        tc.ShowAdminTransaction();
        tc.styleAdminTable(jtTransaction);
        tc.styleAdminTable(jtMember);
        
        // all
        jtUsers.setModel(tc.getModelUser());
        jtTransaction.setModel(tc.getModelTransactionAdmin());
        jtMemberSalary.setModel(tc.getModelMember());
        jtMember.setModel(tc.getModelMemberCukur());
        tfUsernameSession.setText(session.getUsername());
        
        showTransactionHistory(cbShowBy.getSelectedItem().toString(),x.format(ys));
        tfTotalPemasukkan.setText(String.valueOf(tc.getTotal()));
        tfKeuntungan.setText(String.valueOf((tc.getTotal() * 30) / 100));
        tfGaji.setText(String.valueOf((tc.getTotal() * 70) / 100));
        
        showTransactionHistory(cbShowBy.getSelectedItem().toString(),x.format(ys));
    }
    
    public void resetRegister() {
        tfName.setText("");
        tfNik.setText("");
        tfAddress.setText("");
        tfUsername.setText("");
        tfPassword.setText("");
        tfPasswordConfirm.setText("");
        cbGender.setSelectedIndex(0);
        cbLevel.setSelectedIndex(0);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnHistory = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        tfUsernameSession = new javax.swing.JLabel();
        btnMenuRegister = new javax.swing.JButton();
        btnMenuUsers = new javax.swing.JButton();
        btnMember = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        transactionHistory = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTransaction = new javax.swing.JTable();
        tfCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        cbShowBy = new javax.swing.JComboBox();
        cbMonthAdmin = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        tfTotalPemasukkan = new javax.swing.JTextField();
        tfKeuntungan = new javax.swing.JTextField();
        tfGaji = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        btnPrint = new javax.swing.JButton();
        registerPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tfAddress = new javax.swing.JTextArea();
        tfUsername = new javax.swing.JTextField();
        tfPassword = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        cbGender = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        cbLevel = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        tfPasswordConfirm = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        tfNik = new javax.swing.JTextField();
        tfName = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        listUserPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtUsers = new javax.swing.JTable();
        tfCariUser = new javax.swing.JTextField();
        btnCariUser = new javax.swing.JButton();
        btnEditData = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        cbCategoryUser = new javax.swing.JComboBox();
        btnSalary = new javax.swing.JButton();
        tfEditName = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        tfEditNIK = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        tfEditGender = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        tfEditLevel = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        taEditAddress = new javax.swing.JTextArea();
        tfEditUsername = new javax.swing.JTextField();
        btnChangePass = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        employeeInfo = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jlMemberName = new javax.swing.JLabel();
        jlMemberAddress = new javax.swing.JLabel();
        jlMemberNik = new javax.swing.JLabel();
        jlMemberGender = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jlMemberSalary = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtMemberSalary = new javax.swing.JTable();
        jLabel32 = new javax.swing.JLabel();
        jlMemberDataInput = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        cbYear = new javax.swing.JComboBox();
        cbMonth = new javax.swing.JComboBox();
        tfSalaryFiltered = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        memberInfo = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jtMember = new javax.swing.JTable();
        jLabel41 = new javax.swing.JLabel();
        tfIdMember = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        tfTanggalLahir = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        taAlamat = new javax.swing.JTextArea();
        jLabel44 = new javax.swing.JLabel();
        tfNamaMember = new javax.swing.JTextField();
        s = new javax.swing.JLabel();
        tfNoTelp = new javax.swing.JTextField();
        tfEmailMember = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        body.setBackground(new java.awt.Color(255, 255, 255));

        menuPanel.setBackground(new java.awt.Color(153, 153, 0));

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Admin");

        btnHistory.setText("History");
        btnHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoryActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username  :");

        btnLogout.setBackground(new java.awt.Color(255, 51, 51));
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLogoutMouseExited(evt);
            }
        });
        btnLogout.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Logout");
        btnLogout.add(jLabel11);
        jLabel11.setBounds(40, 10, 70, 24);

        tfUsernameSession.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfUsernameSession.setForeground(new java.awt.Color(255, 255, 255));
        tfUsernameSession.setText("azmirf20");

        btnMenuRegister.setText("Register");
        btnMenuRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuRegisterActionPerformed(evt);
            }
        });

        btnMenuUsers.setText("Users");
        btnMenuUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuUsersActionPerformed(evt);
            }
        });

        btnMember.setText("Members");
        btnMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(btnHistory, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfUsernameSession))
                    .addComponent(btnMenuRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMenuUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfUsernameSession))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMenuRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMenuUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMember, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setLayout(new java.awt.CardLayout());

        transactionHistory.setBackground(new java.awt.Color(255, 255, 255));

        jtTransaction.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Date", "Menu", "Barber", "Member ID", "Total Price", "Pay", "Discount", "Changedas"
            }
        ));
        jtTransaction.setFocusable(false);
        jtTransaction.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jtTransaction.setRowHeight(25);
        jtTransaction.setSelectionBackground(new java.awt.Color(108, 200, 186));
        jtTransaction.setShowVerticalLines(false);
        jtTransaction.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtTransaction);

        tfCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCariActionPerformed(evt);
            }
        });

        btnCari.setText("Search");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel12.setText("Transaction History");

        cbShowBy.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All", "Today", "Month", "Year" }));
        cbShowBy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbShowByActionPerformed(evt);
            }
        });

        cbMonthAdmin.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-- Choose Month --", "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember" }));
        cbMonthAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMonthAdminActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pendapatan"));

        tfTotalPemasukkan.setEditable(false);

        tfKeuntungan.setEditable(false);

        tfGaji.setEditable(false);

        jLabel37.setText("Total");

        jLabel39.setText("Keuntungan");

        jLabel40.setText("Gaji");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfTotalPemasukkan, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfKeuntungan, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfGaji, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfGaji, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTotalPemasukkan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfKeuntungan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );

        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout transactionHistoryLayout = new javax.swing.GroupLayout(transactionHistory);
        transactionHistory.setLayout(transactionHistoryLayout);
        transactionHistoryLayout.setHorizontalGroup(
            transactionHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transactionHistoryLayout.createSequentialGroup()
                .addGap(0, 69, Short.MAX_VALUE)
                .addGroup(transactionHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(transactionHistoryLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, transactionHistoryLayout.createSequentialGroup()
                        .addGroup(transactionHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(transactionHistoryLayout.createSequentialGroup()
                                .addComponent(cbShowBy, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbMonthAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfCari, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCari))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(56, 56, 56))))
            .addGroup(transactionHistoryLayout.createSequentialGroup()
                .addGap(373, 373, 373)
                .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        transactionHistoryLayout.setVerticalGroup(
            transactionHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transactionHistoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(transactionHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbShowBy, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMonthAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCari, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        mainPanel.add(transactionHistory, "card3");

        registerPanel.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("Name");

        jLabel4.setText("Address");

        jLabel5.setText("Username");

        jLabel6.setText("Password");

        tfAddress.setColumns(20);
        tfAddress.setRows(5);
        jScrollPane2.setViewportView(tfAddress);

        tfUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUsernameActionPerformed(evt);
            }
        });

        jLabel7.setText("Gender");

        cbGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose gender", "Male", "Female", "Other" }));

        jLabel8.setText("Job");

        cbLevel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose Job", "Cashier", "Barber" }));

        jLabel9.setText("Password Confirm");

        jLabel10.setText("NIK");

        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)
                            .addComponent(jLabel4)
                            .addComponent(jLabel10)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfUsername, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfPasswordConfirm, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbLevel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbGender, 0, 312, Short.MAX_VALUE)
                            .addComponent(tfName)
                            .addComponent(tfNik)
                            .addComponent(jScrollPane2)))
                    .addComponent(btnRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tfNik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfPasswordConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel14.setFont(new java.awt.Font("Rockwell", 0, 36)); // NOI18N
        jLabel14.setText("Register");

        jLabel13.setText("-------------------------------------------------------------------");

        javax.swing.GroupLayout registerPanelLayout = new javax.swing.GroupLayout(registerPanel);
        registerPanel.setLayout(registerPanelLayout);
        registerPanelLayout.setHorizontalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(registerPanelLayout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jLabel14))
                            .addComponent(jLabel13))))
                .addContainerGap(236, Short.MAX_VALUE))
        );
        registerPanelLayout.setVerticalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addGap(4, 4, 4)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.add(registerPanel, "card3");

        listUserPanel.setBackground(new java.awt.Color(255, 255, 255));

        jtUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        jtUsers.setFocusable(false);
        jtUsers.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jtUsers.setRowHeight(25);
        jtUsers.setSelectionBackground(new java.awt.Color(108, 200, 186));
        jtUsers.setShowVerticalLines(false);
        jtUsers.getTableHeader().setReorderingAllowed(false);
        jtUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtUsersMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jtUsers);

        btnCariUser.setText("Search");
        btnCariUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariUserActionPerformed(evt);
            }
        });

        btnEditData.setText("Edit");
        btnEditData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditDataActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel15.setText("Users Data");

        cbCategoryUser.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Semua", "Cashier", "Barber" }));
        cbCategoryUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCategoryUserActionPerformed(evt);
            }
        });

        btnSalary.setText("Salary");
        btnSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalaryActionPerformed(evt);
            }
        });

        tfEditName.setEditable(false);
        tfEditName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEditNameActionPerformed(evt);
            }
        });

        jLabel16.setText("Name");

        jLabel17.setText("NIK");

        tfEditNIK.setEditable(false);

        jLabel18.setText("Gender");

        tfEditGender.setEditable(false);

        jLabel19.setText("Level");

        tfEditLevel.setEditable(false);

        jLabel20.setText("Address");

        taEditAddress.setEditable(false);
        taEditAddress.setColumns(20);
        taEditAddress.setRows(5);
        jScrollPane4.setViewportView(taEditAddress);

        tfEditUsername.setEditable(false);

        btnChangePass.setText("Change Password");
        btnChangePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePassActionPerformed(evt);
            }
        });

        jLabel22.setText("Username");

        javax.swing.GroupLayout listUserPanelLayout = new javax.swing.GroupLayout(listUserPanel);
        listUserPanel.setLayout(listUserPanelLayout);
        listUserPanelLayout.setHorizontalGroup(
            listUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listUserPanelLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(listUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbCategoryUser, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(btnSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(listUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(listUserPanelLayout.createSequentialGroup()
                        .addGroup(listUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addGroup(listUserPanelLayout.createSequentialGroup()
                                .addComponent(tfCariUser, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCariUser, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(134, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listUserPanelLayout.createSequentialGroup()
                        .addGroup(listUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(listUserPanelLayout.createSequentialGroup()
                                .addGroup(listUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(listUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfEditName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfEditGender, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel20))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(listUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel19)
                                    .addComponent(tfEditLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfEditNIK, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnEditData, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(listUserPanelLayout.createSequentialGroup()
                                .addComponent(tfEditUsername)
                                .addGap(18, 18, 18)
                                .addComponent(btnChangePass, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(91, 91, 91))))
        );
        listUserPanelLayout.setVerticalGroup(
            listUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listUserPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addGroup(listUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCategoryUser, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCariUser, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCariUser, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(listUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(listUserPanelLayout.createSequentialGroup()
                        .addGroup(listUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(listUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfEditNIK, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfEditName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(listUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(listUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfEditGender, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfEditLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(listUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfEditUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnChangePass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(listUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditData, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(128, Short.MAX_VALUE))
        );

        mainPanel.add(listUserPanel, "card3");

        employeeInfo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel21.setFont(new java.awt.Font("Rockwell", 0, 36)); // NOI18N
        jLabel21.setText("Employee Info");

        jLabel23.setText("-------------------------------------------------------------------");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Name");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("Address");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("Identification ID");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("Gender");

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText(":");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText(":");

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setText(":");

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setText(":");

        jlMemberName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlMemberName.setText("Muhamad Azmi Rizkifar");

        jlMemberAddress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlMemberAddress.setText("Purwakarta, Jawa Barat");

        jlMemberNik.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlMemberNik.setText("9224418912338992");

        jlMemberGender.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlMemberGender.setText("Male");

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel33.setText("Total Salary");

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setText(":");

        jlMemberSalary.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlMemberSalary.setText("500000");

        jtMemberSalary.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtMemberSalary.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jtMemberSalary.setRowHeight(25);
        jtMemberSalary.setSelectionBackground(new java.awt.Color(108, 200, 186));
        jtMemberSalary.setShowVerticalLines(false);
        jtMemberSalary.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(jtMemberSalary);

        jLabel32.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel32.setText("Transaction Table");

        jlMemberDataInput.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlMemberDataInput.setText("500000");

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setText(":");

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel38.setText("Total Data");

        cbYear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2019", "2020", "2021", "2022", "2023" }));
        cbYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbYearActionPerformed(evt);
            }
        });

        cbMonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All Month", "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember" }));
        cbMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMonthActionPerformed(evt);
            }
        });

        tfSalaryFiltered.setEditable(false);

        jLabel36.setText("Total");

        javax.swing.GroupLayout employeeInfoLayout = new javax.swing.GroupLayout(employeeInfo);
        employeeInfo.setLayout(employeeInfoLayout);
        employeeInfoLayout.setHorizontalGroup(
            employeeInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employeeInfoLayout.createSequentialGroup()
                .addContainerGap(217, Short.MAX_VALUE)
                .addGroup(employeeInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, employeeInfoLayout.createSequentialGroup()
                        .addGroup(employeeInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(employeeInfoLayout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(jLabel23))
                            .addGroup(employeeInfoLayout.createSequentialGroup()
                                .addGroup(employeeInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel24))
                                .addGap(18, 18, 18)
                                .addGroup(employeeInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(employeeInfoLayout.createSequentialGroup()
                                        .addComponent(jLabel28)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jlMemberName))
                                    .addGroup(employeeInfoLayout.createSequentialGroup()
                                        .addComponent(jLabel29)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jlMemberAddress))
                                    .addGroup(employeeInfoLayout.createSequentialGroup()
                                        .addComponent(jLabel30)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jlMemberNik)))
                                .addGap(59, 59, 59)
                                .addGroup(employeeInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(employeeInfoLayout.createSequentialGroup()
                                        .addGroup(employeeInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel27)
                                            .addComponent(jLabel33))
                                        .addGap(10, 10, 10)
                                        .addGroup(employeeInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(employeeInfoLayout.createSequentialGroup()
                                                .addComponent(jLabel31)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jlMemberGender))
                                            .addGroup(employeeInfoLayout.createSequentialGroup()
                                                .addComponent(jLabel34)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jlMemberSalary))))
                                    .addGroup(employeeInfoLayout.createSequentialGroup()
                                        .addComponent(jLabel38)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel35)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jlMemberDataInput))))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(employeeInfoLayout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addComponent(jLabel32))
                            .addGroup(employeeInfoLayout.createSequentialGroup()
                                .addComponent(cbYear, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)
                                .addComponent(jLabel36)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfSalaryFiltered)))
                        .addGap(138, 138, 138))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, employeeInfoLayout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(281, 281, 281))))
        );
        employeeInfoLayout.setVerticalGroup(
            employeeInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employeeInfoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addGroup(employeeInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(employeeInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(employeeInfoLayout.createSequentialGroup()
                            .addGroup(employeeInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel24)
                                .addComponent(jLabel28)
                                .addComponent(jlMemberName))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(employeeInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel25)
                                .addComponent(jLabel29)
                                .addComponent(jlMemberAddress)))
                        .addGroup(employeeInfoLayout.createSequentialGroup()
                            .addComponent(jLabel27)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel33)))
                    .addGroup(employeeInfoLayout.createSequentialGroup()
                        .addGroup(employeeInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(jlMemberGender))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(employeeInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(jlMemberSalary))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(employeeInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(employeeInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel26)
                        .addComponent(jLabel30)
                        .addComponent(jlMemberNik))
                    .addGroup(employeeInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(employeeInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(jlMemberDataInput))
                        .addComponent(jLabel38)))
                .addGap(45, 45, 45)
                .addComponent(jLabel32)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(employeeInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbYear, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(cbMonth)
                    .addComponent(tfSalaryFiltered, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(140, Short.MAX_VALUE))
        );

        mainPanel.add(employeeInfo, "card5");

        memberInfo.setBackground(new java.awt.Color(255, 255, 255));

        jtMember.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtMemberMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jtMember);

        jLabel41.setText("ID Member");

        jLabel42.setText("Nama Member");

        jLabel43.setText("Alamat");

        taAlamat.setColumns(20);
        taAlamat.setRows(5);
        jScrollPane7.setViewportView(taAlamat);

        jLabel44.setText("Tanggal Lahir");

        s.setText("Tanggal Lahir");

        jLabel45.setText("Email");

        jLabel46.setFont(new java.awt.Font("Rockwell", 0, 36)); // NOI18N
        jLabel46.setText("Member Info");

        jLabel47.setText("-------------------------------------------------------------------");

        javax.swing.GroupLayout memberInfoLayout = new javax.swing.GroupLayout(memberInfo);
        memberInfo.setLayout(memberInfoLayout);
        memberInfoLayout.setHorizontalGroup(
            memberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(memberInfoLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(memberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(memberInfoLayout.createSequentialGroup()
                        .addComponent(jLabel45)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(memberInfoLayout.createSequentialGroup()
                        .addGroup(memberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfEmailMember, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel44, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfIdMember, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNamaMember, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTanggalLahir, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(memberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(s)
                            .addGroup(memberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfNoTelp, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(24, 24, 24))))
            .addGroup(memberInfoLayout.createSequentialGroup()
                .addGap(299, 299, 299)
                .addComponent(jLabel47)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, memberInfoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel46)
                .addGap(320, 320, 320))
        );
        memberInfoLayout.setVerticalGroup(
            memberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(memberInfoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel47)
                .addGap(18, 18, 18)
                .addGroup(memberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(memberInfoLayout.createSequentialGroup()
                        .addGroup(memberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41)
                            .addComponent(jLabel43))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(memberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(memberInfoLayout.createSequentialGroup()
                                .addComponent(tfIdMember, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel42)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfNamaMember, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(memberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(memberInfoLayout.createSequentialGroup()
                                .addComponent(jLabel44)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfTanggalLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(memberInfoLayout.createSequentialGroup()
                                .addComponent(s)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNoTelp, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfEmailMember, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        mainPanel.add(memberInfo, "card6");

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoryActionPerformed
        // TODO add your handling code here:
        showTransactionHistory(cbShowBy.getSelectedItem().toString(),x.format(ys));
        tfCari.setText("");
        if (cbShowBy.getSelectedItem().toString().equals("Month")) {
            cbMonthAdmin.setEnabled(true);
        }else{
            cbMonthAdmin.setEnabled(false);
        }
        cbShowBy.setSelectedIndex(0);
        
    }//GEN-LAST:event_btnHistoryActionPerformed

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
        // TODO add your handling code here:
        btnLogout.setBackground(Color.gray);
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutMouseClicked

    private void btnLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseEntered
        // TODO add your handling code here:
        btnLogout.setBackground(Color.darkGray);
    }//GEN-LAST:event_btnLogoutMouseEntered

    private void btnLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseExited
        // TODO add your handling code here:
        btnLogout.setBackground(new Color(255,51,51));
    }//GEN-LAST:event_btnLogoutMouseExited

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        String keyword = tfCari.getText().trim();
        if (keyword.length() == 0) {
            tc.loadAdminTransaction();
            tc.ShowAdminTransaction();
        } else {
            tc.SearchTransactionAdmin(keyword);
            tc.ShowAdminTransaction();
        }
    }//GEN-LAST:event_btnCariActionPerformed

    private void tfUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUsernameActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        String name = tfName.getText();
        String nik = tfNik.getText();
        String address = tfAddress.getText();
        String username = tfUsername.getText();
        String password = String.valueOf(tfPassword.getPassword());
        String passwordConfirm = String.valueOf(tfPasswordConfirm.getPassword());
        int gender = cbGender.getSelectedIndex();
        String level = cbLevel.getSelectedItem().toString();

        ca.register(name, nik, address, username, password, passwordConfirm, gender, cbLevel, level);
        resetRegister();
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnMenuRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuRegisterActionPerformed
        // hapus
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        // tampilkan panel yg mau diisi
        mainPanel.add(registerPanel);
        mainPanel.repaint();
        mainPanel.revalidate();
        resetRegister();
    }//GEN-LAST:event_btnMenuRegisterActionPerformed

    private void btnCariUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariUserActionPerformed
        // TODO add your handling code here:
        String keyword = tfCariUser.getText().trim();
        if (keyword.length() == 0) {
            tc.loadUser("Semua");
            tc.showUser();
        } else {
            tc.SearchUsers(keyword);
            tc.showUser();
        }
    }//GEN-LAST:event_btnCariUserActionPerformed

    private void btnEditDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditDataActionPerformed
        // TODO add your handling code here:
        if (tfEditName.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Fill with Data");
        }else{
            if(btnEditData.getText().equals("Edit")){
                btnEditData.setText("Update");
                tfEditName.setEditable(true);
                tfEditNIK.setEditable(true);
                taEditAddress.setEditable(true);
                
            }
            else if(btnEditData.getText().equals("Update")){
                String nama = tfEditName.getText();
                String nik = tfEditNIK.getText();
                String address = taEditAddress.getText();
                String username = tfEditUsername.getText();
                
                try {
                    String query = "UPDATE users SET nama = ?, nik = ?, alamat = ? WHERE username = ?";
                    PreparedStatement ps = Connection.openConnection().prepareStatement(query);
                    ps.setString(1, nama);
                    ps.setString(2, nik);
                    ps.setString(3, address);
                    ps.setString(4, username);
                    if (ps.executeUpdate() > 0) {
                        JOptionPane.showMessageDialog(null,"Update Successfull");
                        btnEditData.setText("Edit");
                        tfEditName.setEditable(false);
                        tfEditNIK.setEditable(false);
                        taEditAddress.setEditable(false);
                        tc.loadUser("Semua");
                        tc.showUser();
                    }
                    
                }
                catch (SQLException ex){
                    Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnEditDataActionPerformed

    private void btnMenuUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuUsersActionPerformed
        // TODO add your handling code here:
        showUsersData();
        tc.loadUser("Semua");
        tc.showUser();
        tfEditName.setText("");
        tfEditNIK.setText("");
        tfEditGender.setText("");
        tfEditLevel.setText("");
        taEditAddress.setText("");
        tfEditUsername.setText("");
    }//GEN-LAST:event_btnMenuUsersActionPerformed

    private void cbCategoryUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCategoryUserActionPerformed
        // TODO add your handling code here:
        String category = cbCategoryUser.getSelectedItem().toString();
        tc.loadUser(category);
        tc.showUser();
    }//GEN-LAST:event_cbCategoryUserActionPerformed

    private void tfCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCariActionPerformed

    private void jtUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtUsersMouseClicked
        // TODO add your handling code here:
        int selectedRows = jtUsers.getSelectedRow();
        String nama = tc.getModelUser().getValueAt(selectedRows,0).toString();
        tc.showUserData(nama, tfEditName, tfEditNIK, tfEditGender, tfEditLevel, taEditAddress, tfEditUsername);
    }//GEN-LAST:event_jtUsersMouseClicked

    private void btnSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalaryActionPerformed
        // TODO add your handling code here:
        
        if (tfEditName.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Fill with Data");
        } else {
            showSalary();
            String username = tfEditUsername.getText();
            String level = tfEditLevel.getText();
            
            jlMemberName.setText(tfEditName.getText());
            jlMemberAddress.setText(taEditAddress.getText());
            jlMemberNik.setText(tfEditNIK.getText());
            jlMemberGender.setText(tfEditGender.getText());
            
            if (level.equals("Cashier")) {
                tc.loadCashierTransaction(username);
                tc.showDataSalaryCashier(tc.getModelCashier(), tc.getModelMember(), tc.getDaftarTransaksiCashier(), tc.getDaftarTransaksiMember());
                int totalSalary = ca.salaryInfoCashier(username);
                jlMemberSalary.setText(String.valueOf(totalSalary));
                ca.totalDataInputInfoCashier(username, jlMemberDataInput);
            } else if (level.equals("Barber")) {
                tc.loadBarberTransaction(username);
                tc.showDataSalaryBarber(tc.getModelBarber(), tc.getModelMember(), tc.getDaftarTransaksiBarber(), tc.getDaftarTransaksiMember());
                int totalSalary = ca.salaryInfoBarber(username);
                jlMemberSalary.setText(String.valueOf(totalSalary));
                ca.totalDataInputInfoBarber(username, jlMemberDataInput);
            }
            
            cbMonth.setSelectedIndex(0);
        }
    }//GEN-LAST:event_btnSalaryActionPerformed

    private void cbMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMonthActionPerformed
        // TODO add your handling code here:
        int indexMonth = cbMonth.getSelectedIndex();
        int totalSalary = 0;
        String month = String.valueOf(indexMonth);
        String year = cbYear.getSelectedItem().toString();
        
        if (tfEditLevel.getText().equals("Cashier")) {
            tc.loadCashierTransaction(tfEditUsername.getText());
            totalSalary = tc.showDataSalaryCashierMonth(year, month);
        }
        else if(tfEditLevel.getText().equals("Barber")){
            tc.loadBarberTransaction(tfEditUsername.getText());
            totalSalary = tc.showDataSalaryBarberMonth(year, month);
        }
        tfSalaryFiltered.setText(String.valueOf(totalSalary));
        
    }//GEN-LAST:event_cbMonthActionPerformed

    private void btnChangePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePassActionPerformed
        // TODO add your handling code here:
        if (tfEditName.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Fill with Data");
        } else {
            PasswordChange pc = new PasswordChange(tfEditUsername.getText());
            pc.setVisible(true);
            pc.pack();
            pc.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_btnChangePassActionPerformed

    private void cbYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbYearActionPerformed

    private void cbMonthAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMonthAdminActionPerformed
        // TODO add your handling code here:
        showTransactionHistory(cbShowBy.getSelectedItem().toString(),String.valueOf(cbMonthAdmin.getSelectedIndex()));
        tfTotalPemasukkan.setText(String.valueOf(tc.getTotal()));
        tfKeuntungan.setText(String.valueOf((tc.getTotal() * 30) / 100));
        tfGaji.setText(String.valueOf((tc.getTotal() * 70) / 100));
    }//GEN-LAST:event_cbMonthAdminActionPerformed

    private void cbShowByActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbShowByActionPerformed
        // TODO add your handling code here:
        
        if (cbShowBy.getSelectedItem().toString().equals("Month")) {
            cbMonthAdmin.setEnabled(true);
            if (cbMonthAdmin.getSelectedIndex() != 0) {
                showTransactionHistory(cbShowBy.getSelectedItem().toString(),String.valueOf(cbMonthAdmin.getSelectedIndex()));
            }
        }else if (cbShowBy.getSelectedItem().toString().equals("Today")){
            cbMonthAdmin.setEnabled(false);
            showTransactionHistory(cbShowBy.getSelectedItem().toString(),x.format(ys));
            
        }else if (cbShowBy.getSelectedItem().toString().equals("Year")){
            cbMonthAdmin.setEnabled(false);
            showTransactionHistory(cbShowBy.getSelectedItem().toString(),x.format(ys));
        }
        else if (cbShowBy.getSelectedItem().toString().equals("All")){
            cbMonthAdmin.setEnabled(false);
            showTransactionHistory(cbShowBy.getSelectedItem().toString(),x.format(ys));
        }
        tfTotalPemasukkan.setText(String.valueOf(tc.getTotal()));
        tfKeuntungan.setText(String.valueOf((tc.getTotal() * 30) / 100));
        tfGaji.setText(String.valueOf((tc.getTotal() * 70) / 100));
    }//GEN-LAST:event_cbShowByActionPerformed

    private void btnMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemberActionPerformed
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();

        // tampilkan panel yg mau diisi
        mainPanel.add(memberInfo);
        mainPanel.repaint();
        mainPanel.revalidate();
        
        tc.loadMember();
        tc.ShowMember();
        
        tfIdMember.setText("");
        tfNamaMember.setText("");
        tfTanggalLahir.setText("");
        tfEmailMember.setText("");
        taAlamat.setText("");
        tfNoTelp.setText("");
    }//GEN-LAST:event_btnMemberActionPerformed

    private void tfEditNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEditNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEditNameActionPerformed

    private void jtMemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtMemberMouseClicked
        // TODO add your handling code here:
        int selectedRows = jtMember.getSelectedRow();
        String MemberId = tc.getModelMemberCukur().getValueAt(selectedRows,0).toString();
        tc.showMemberData(MemberId, tfIdMember, tfNamaMember, tfTanggalLahir, tfEmailMember, taAlamat, tfNoTelp);
    }//GEN-LAST:event_jtMemberMouseClicked

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // TODO add your handling code here:
        String judul = "Data Transaksi BarberShop";
        MessageFormat header = new MessageFormat(judul);
        try {
            jtTransaction.print(JTable.PrintMode.FIT_WIDTH, header, null);
        } catch (PrinterException ex) {
            Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnCariUser;
    private javax.swing.JButton btnChangePass;
    private javax.swing.JButton btnEditData;
    private javax.swing.JButton btnHistory;
    private javax.swing.JPanel btnLogout;
    private javax.swing.JButton btnMember;
    private javax.swing.JButton btnMenuRegister;
    private javax.swing.JButton btnMenuUsers;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnSalary;
    private javax.swing.JComboBox cbCategoryUser;
    private javax.swing.JComboBox cbGender;
    private javax.swing.JComboBox cbLevel;
    private javax.swing.JComboBox cbMonth;
    private javax.swing.JComboBox cbMonthAdmin;
    private javax.swing.JComboBox cbShowBy;
    private javax.swing.JComboBox cbYear;
    private javax.swing.JPanel employeeInfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel jlMemberAddress;
    private javax.swing.JLabel jlMemberDataInput;
    private javax.swing.JLabel jlMemberGender;
    private javax.swing.JLabel jlMemberName;
    private javax.swing.JLabel jlMemberNik;
    private javax.swing.JLabel jlMemberSalary;
    private javax.swing.JTable jtMember;
    private javax.swing.JTable jtMemberSalary;
    private javax.swing.JTable jtTransaction;
    private javax.swing.JTable jtUsers;
    private javax.swing.JPanel listUserPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel memberInfo;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JPanel registerPanel;
    private javax.swing.JLabel s;
    private javax.swing.JTextArea taAlamat;
    private javax.swing.JTextArea taEditAddress;
    private javax.swing.JTextArea tfAddress;
    private javax.swing.JTextField tfCari;
    private javax.swing.JTextField tfCariUser;
    private javax.swing.JTextField tfEditGender;
    private javax.swing.JTextField tfEditLevel;
    private javax.swing.JTextField tfEditNIK;
    private javax.swing.JTextField tfEditName;
    private javax.swing.JTextField tfEditUsername;
    private javax.swing.JTextField tfEmailMember;
    private javax.swing.JTextField tfGaji;
    private javax.swing.JTextField tfIdMember;
    private javax.swing.JTextField tfKeuntungan;
    private javax.swing.JTextField tfNamaMember;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfNik;
    private javax.swing.JTextField tfNoTelp;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JPasswordField tfPasswordConfirm;
    private javax.swing.JTextField tfSalaryFiltered;
    private javax.swing.JTextField tfTanggalLahir;
    private javax.swing.JTextField tfTotalPemasukkan;
    private javax.swing.JTextField tfUsername;
    private javax.swing.JLabel tfUsernameSession;
    private javax.swing.JPanel transactionHistory;
    // End of variables declaration//GEN-END:variables

     private void showTransactionHistory(String category, String date) {
        // hapus
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        // tampilkan panel yg mau diisi
        mainPanel.add(transactionHistory);
        mainPanel.repaint();
        mainPanel.revalidate();
        tc.loadAdminTransaction();
        tc.ShowAdminTransactionBy(category,date);
    }
    private void showUsersData(){
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        // tampilkan panel yg mau diisi
        mainPanel.add(listUserPanel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }
    
    private void showSalary() {
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();

        // tampilkan panel yg mau diisi
        mainPanel.add(employeeInfo);
        mainPanel.repaint();
        mainPanel.revalidate();
    }
}

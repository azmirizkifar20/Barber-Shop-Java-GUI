package view;

import model.Connection;
import controller.ControllerAdmin;
import controller.TableControl;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Session;

public class AdminPage extends javax.swing.JFrame {
    TableControl tc = new TableControl();
    ControllerAdmin ca = new ControllerAdmin();
    
    public AdminPage(Session session) {
        initComponents();
        this.setLocationRelativeTo(null);
        
        // loadColumn
        tc.loadColumnUser();
        tc.loadKolomGaji(tc.getModelMember());
        tc.loadKolomTransaksiAdmin();
        
        // show transaction
        tc.loadAdminTransaction();
        tc.ShowAdminTransaction();
        tc.styleAdminTable(jtTransaction);
        
        // all
        jtUsers.setModel(tc.getModelUser());
        jtTransaction.setModel(tc.getModelTransactionAdmin());
        jtMemberSalary.setModel(tc.getModelMember());
        tfUsernameSession.setText(session.getUsername());
        showTransactionHistory();
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
        mainPanel = new javax.swing.JPanel();
        transactionHistory = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTransaction = new javax.swing.JTable();
        tfCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
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
        memberInfo = new javax.swing.JPanel();
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
                    .addComponent(btnMenuUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(63, 63, 63)
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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout transactionHistoryLayout = new javax.swing.GroupLayout(transactionHistory);
        transactionHistory.setLayout(transactionHistoryLayout);
        transactionHistoryLayout.setHorizontalGroup(
            transactionHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transactionHistoryLayout.createSequentialGroup()
                .addGroup(transactionHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(transactionHistoryLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(transactionHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE)
                            .addGroup(transactionHistoryLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfCari, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCari))))
                    .addGroup(transactionHistoryLayout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        transactionHistoryLayout.setVerticalGroup(
            transactionHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transactionHistoryLayout.createSequentialGroup()
                .addGroup(transactionHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(transactionHistoryLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(transactionHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCari, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(transactionHistoryLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                                .addComponent(tfUsername, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tfPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tfPasswordConfirm, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tfName, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cbLevel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbGender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(btnRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(tfNik, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addGap(322, 322, 322)
                        .addComponent(jLabel14))
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(jLabel13)))
                .addContainerGap(268, Short.MAX_VALUE))
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
                        .addContainerGap(92, Short.MAX_VALUE))
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
                .addContainerGap(51, Short.MAX_VALUE))
        );

        mainPanel.add(listUserPanel, "card3");

        memberInfo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel21.setFont(new java.awt.Font("Rockwell", 0, 36)); // NOI18N
        jLabel21.setText("Member Info");

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

        cbMonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-- Choose Month --", "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember" }));
        cbMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMonthActionPerformed(evt);
            }
        });

        tfSalaryFiltered.setEditable(false);

        jLabel36.setText("Total");

        javax.swing.GroupLayout memberInfoLayout = new javax.swing.GroupLayout(memberInfo);
        memberInfo.setLayout(memberInfoLayout);
        memberInfoLayout.setHorizontalGroup(
            memberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, memberInfoLayout.createSequentialGroup()
                .addContainerGap(175, Short.MAX_VALUE)
                .addGroup(memberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(memberInfoLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel23))
                    .addGroup(memberInfoLayout.createSequentialGroup()
                        .addGroup(memberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26)
                            .addComponent(jLabel24))
                        .addGap(18, 18, 18)
                        .addGroup(memberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(memberInfoLayout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlMemberName))
                            .addGroup(memberInfoLayout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlMemberAddress))
                            .addGroup(memberInfoLayout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlMemberNik)))
                        .addGap(59, 59, 59)
                        .addGroup(memberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(memberInfoLayout.createSequentialGroup()
                                .addGroup(memberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel33))
                                .addGap(10, 10, 10)
                                .addGroup(memberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(memberInfoLayout.createSequentialGroup()
                                        .addComponent(jLabel31)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jlMemberGender))
                                    .addGroup(memberInfoLayout.createSequentialGroup()
                                        .addComponent(jLabel34)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jlMemberSalary))))
                            .addGroup(memberInfoLayout.createSequentialGroup()
                                .addComponent(jLabel38)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlMemberDataInput))))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(memberInfoLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel32))
                    .addGroup(memberInfoLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel21))
                    .addGroup(memberInfoLayout.createSequentialGroup()
                        .addComponent(cbYear, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfSalaryFiltered)))
                .addGap(138, 138, 138))
        );
        memberInfoLayout.setVerticalGroup(
            memberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(memberInfoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addGroup(memberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(memberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(memberInfoLayout.createSequentialGroup()
                            .addGroup(memberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel24)
                                .addComponent(jLabel28)
                                .addComponent(jlMemberName))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(memberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel25)
                                .addComponent(jLabel29)
                                .addComponent(jlMemberAddress)))
                        .addGroup(memberInfoLayout.createSequentialGroup()
                            .addComponent(jLabel27)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel33)))
                    .addGroup(memberInfoLayout.createSequentialGroup()
                        .addGroup(memberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(jlMemberGender))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(memberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(jlMemberSalary))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(memberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(memberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel26)
                        .addComponent(jLabel30)
                        .addComponent(jlMemberNik))
                    .addGroup(memberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(memberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(jlMemberDataInput))
                        .addComponent(jLabel38)))
                .addGap(45, 45, 45)
                .addComponent(jLabel32)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(memberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbYear, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(cbMonth)
                    .addComponent(tfSalaryFiltered, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        mainPanel.add(memberInfo, "card5");

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
        showTransactionHistory();
        tfCari.setText("");
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
        tc.showUserData(selectedRows, nama, tfEditName, tfEditNIK, tfEditGender, tfEditLevel, taEditAddress, tfEditUsername);
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
                tc.showDataSalary(tc.getModelCashier(), tc.getModelMember(), tc.getDaftarTransaksiCashier(), tc.getDaftarTransaksiMember());
                ca.salaryInfoCashier(username, jlMemberSalary);
                ca.totalDataInputInfoCashier(username, jlMemberDataInput);
            } else if (level.equals("Barber")) {
                tc.loadBarberTransaction(username);
                tc.showDataSalary(tc.getModelBarber(), tc.getModelMember(), tc.getDaftarTransaksiBarber(), tc.getDaftarTransaksiMember());
                ca.salaryInfoBarber(username, jlMemberSalary);
                ca.totalDataInputInfoBarber(username, jlMemberDataInput);
            }
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

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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

        /* Create and display the form */
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
    private javax.swing.JButton btnMenuRegister;
    private javax.swing.JButton btnMenuUsers;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnSalary;
    private javax.swing.JComboBox cbCategoryUser;
    private javax.swing.JComboBox cbGender;
    private javax.swing.JComboBox cbLevel;
    private javax.swing.JComboBox cbMonth;
    private javax.swing.JComboBox cbYear;
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
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JLabel jlMemberAddress;
    private javax.swing.JLabel jlMemberDataInput;
    private javax.swing.JLabel jlMemberGender;
    private javax.swing.JLabel jlMemberName;
    private javax.swing.JLabel jlMemberNik;
    private javax.swing.JLabel jlMemberSalary;
    private javax.swing.JTable jtMemberSalary;
    private javax.swing.JTable jtTransaction;
    private javax.swing.JTable jtUsers;
    private javax.swing.JPanel listUserPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel memberInfo;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JPanel registerPanel;
    private javax.swing.JTextArea taEditAddress;
    private javax.swing.JTextArea tfAddress;
    private javax.swing.JTextField tfCari;
    private javax.swing.JTextField tfCariUser;
    private javax.swing.JTextField tfEditGender;
    private javax.swing.JTextField tfEditLevel;
    private javax.swing.JTextField tfEditNIK;
    private javax.swing.JTextField tfEditName;
    private javax.swing.JTextField tfEditUsername;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfNik;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JPasswordField tfPasswordConfirm;
    private javax.swing.JTextField tfSalaryFiltered;
    private javax.swing.JTextField tfUsername;
    private javax.swing.JLabel tfUsernameSession;
    private javax.swing.JPanel transactionHistory;
    // End of variables declaration//GEN-END:variables

    private void showTransactionHistory() {
        // hapus
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        // tampilkan panel yg mau diisi
        mainPanel.add(transactionHistory);
        mainPanel.repaint();
        mainPanel.revalidate();
        tc.loadAdminTransaction();
        tc.ShowAdminTransaction();
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
        mainPanel.add(memberInfo);
        mainPanel.repaint();
        mainPanel.revalidate();
    }
}

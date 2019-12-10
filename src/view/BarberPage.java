package view;

import model.Session;
import controller.ControllerBarber;
import controller.TableControl;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BarberPage extends javax.swing.JFrame {
    SimpleDateFormat x = new SimpleDateFormat("dd-MM-yyyy");
    ControllerBarber cb = new ControllerBarber();
    TableControl tc = new TableControl();
    Date ys = new Date();

    public BarberPage(Session session) {
        initComponents();
        this.setLocationRelativeTo(null);
        
//        tc.loadKolomTransaksiBarber();
        tc.loadKolomTransaksi(tc.getModelTransaksiBarber(), "Cashier");
        tc.loadKolomGaji(tc.getModelBarber());
        tc.loadBarberTransaction(session.getUsername());
        tc.ShowBarberTransaction();
        tc.styleBarberTable(jtTransaction, jtBarberSalary);
        
        cb.loadYear(cbYear, session.getUsername());
        jtTransaction.setModel(tc.getModelTransaksiBarber());
        jtBarberSalary.setModel(tc.getModelBarber());
        tfUsernameSession.setText(session.getUsername());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        body = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnHistory = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        tfUsernameSession = new javax.swing.JLabel();
        btnBarberInfo = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        transactionHistory = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTransaction = new javax.swing.JTable();
        tfCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        BarberInfo = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLBarberName = new javax.swing.JLabel();
        jlBarberAddress = new javax.swing.JLabel();
        jlIdentificationId = new javax.swing.JLabel();
        jlBarberGender = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jlSalary = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtBarberSalary = new javax.swing.JTable();
        jLabel29 = new javax.swing.JLabel();
        jlDataInput = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        cbYear = new javax.swing.JComboBox();
        cbMonth = new javax.swing.JComboBox();
        jLabel36 = new javax.swing.JLabel();
        tfSalaryFiltered = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        body.setBackground(new java.awt.Color(255, 255, 255));

        menuPanel.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Barber");

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
        jLabel11.setBounds(30, 10, 70, 24);

        tfUsernameSession.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfUsernameSession.setForeground(new java.awt.Color(255, 255, 255));
        tfUsernameSession.setText("azmirf20");

        btnBarberInfo.setText("Barber Info");
        btnBarberInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBarberInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1))
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(menuPanelLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfUsernameSession))
                            .addComponent(btnBarberInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGap(29, 29, 29)
                .addComponent(btnHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBarberInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
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

        btnCari.setText("Search");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel12.setText("Transaction History");

        javax.swing.GroupLayout transactionHistoryLayout = new javax.swing.GroupLayout(transactionHistory);
        transactionHistory.setLayout(transactionHistoryLayout);
        transactionHistoryLayout.setHorizontalGroup(
            transactionHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transactionHistoryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(transactionHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
                    .addGroup(transactionHistoryLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfCari, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCari)))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        mainPanel.add(transactionHistory, "card3");

        BarberInfo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel19.setFont(new java.awt.Font("Rockwell", 0, 36)); // NOI18N
        jLabel19.setText("Barber Info");

        jLabel20.setText("-------------------------------------------------------------------");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Name");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Address");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Identification ID");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Gender");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText(":");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText(":");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText(":");

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText(":");

        jLBarberName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLBarberName.setText("Muhamad Azmi Rizkifar");

        jlBarberAddress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlBarberAddress.setText("Purwakarta, Jawa Barat");

        jlIdentificationId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlIdentificationId.setText("9224418912338992");

        jlBarberGender.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlBarberGender.setText("Male");

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel33.setText("Total Salary");

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setText(":");

        jlSalary.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlSalary.setText("500000");

        jtBarberSalary.setModel(new javax.swing.table.DefaultTableModel(
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
        jtBarberSalary.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jtBarberSalary.setRowHeight(25);
        jtBarberSalary.setSelectionBackground(new java.awt.Color(108, 200, 186));
        jtBarberSalary.setShowVerticalLines(false);
        jtBarberSalary.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jtBarberSalary);

        jLabel29.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel29.setText("Transaction Table");

        jlDataInput.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlDataInput.setText("500000");

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setText(":");

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel38.setText("Total Data");

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

        jLabel36.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel36.setText("Total");

        tfSalaryFiltered.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSalaryFilteredActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BarberInfoLayout = new javax.swing.GroupLayout(BarberInfo);
        BarberInfo.setLayout(BarberInfoLayout);
        BarberInfoLayout.setHorizontalGroup(
            BarberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarberInfoLayout.createSequentialGroup()
                .addGroup(BarberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BarberInfoLayout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel20))
                    .addGroup(BarberInfoLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(BarberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BarberInfoLayout.createSequentialGroup()
                                .addGroup(BarberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel21))
                                .addGap(18, 18, 18)
                                .addGroup(BarberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(BarberInfoLayout.createSequentialGroup()
                                        .addComponent(jLabel25)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLBarberName))
                                    .addGroup(BarberInfoLayout.createSequentialGroup()
                                        .addComponent(jLabel26)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jlBarberAddress))
                                    .addGroup(BarberInfoLayout.createSequentialGroup()
                                        .addComponent(jLabel27)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jlIdentificationId)))
                                .addGap(59, 59, 59)
                                .addGroup(BarberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(BarberInfoLayout.createSequentialGroup()
                                        .addGroup(BarberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel24)
                                            .addComponent(jLabel33))
                                        .addGap(10, 10, 10)
                                        .addGroup(BarberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(BarberInfoLayout.createSequentialGroup()
                                                .addComponent(jLabel28)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jlBarberGender))
                                            .addGroup(BarberInfoLayout.createSequentialGroup()
                                                .addComponent(jLabel34)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jlSalary))))
                                    .addGroup(BarberInfoLayout.createSequentialGroup()
                                        .addComponent(jLabel38)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel35)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jlDataInput))))
                            .addGroup(BarberInfoLayout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addComponent(jLabel29))
                            .addGroup(BarberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BarberInfoLayout.createSequentialGroup()
                                    .addComponent(cbYear, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel36)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfSalaryFiltered, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(BarberInfoLayout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jLabel19)))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        BarberInfoLayout.setVerticalGroup(
            BarberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarberInfoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addGroup(BarberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(BarberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(BarberInfoLayout.createSequentialGroup()
                            .addGroup(BarberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel21)
                                .addComponent(jLabel25)
                                .addComponent(jLBarberName))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(BarberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel22)
                                .addComponent(jLabel26)
                                .addComponent(jlBarberAddress)))
                        .addGroup(BarberInfoLayout.createSequentialGroup()
                            .addComponent(jLabel24)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel33)))
                    .addGroup(BarberInfoLayout.createSequentialGroup()
                        .addGroup(BarberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(jlBarberGender))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(BarberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(jlSalary))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BarberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(BarberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel23)
                        .addComponent(jLabel27)
                        .addComponent(jlIdentificationId))
                    .addGroup(BarberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(BarberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(jlDataInput))
                        .addComponent(jLabel38)))
                .addGap(18, 18, 18)
                .addComponent(jLabel29)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(BarberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbYear, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSalaryFiltered, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        mainPanel.add(BarberInfo, "card5");

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
        // hapus
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        // tampilkan panel yg mau diisi
        mainPanel.add(transactionHistory);
        mainPanel.repaint();
        mainPanel.revalidate();
        
        // get fungsi
        tc.loadBarberTransaction(tfUsernameSession.getText());
        tc.ShowBarberTransaction();
        tfCari.setText("");
    }//GEN-LAST:event_btnHistoryActionPerformed

    private void btnLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseEntered
        // TODO add your handling code here:
        btnLogout.setBackground(Color.darkGray);
    }//GEN-LAST:event_btnLogoutMouseEntered

    private void btnLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseExited
        // TODO add your handling code here:
        btnLogout.setBackground(new Color(255,51,51));
    }//GEN-LAST:event_btnLogoutMouseExited

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
        // TODO add your handling code here:
        btnLogout.setBackground(Color.gray);
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutMouseClicked

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        String keyword = tfCari.getText().trim();
        if (keyword.length() == 0) {
            tc.loadBarberTransaction(tfUsernameSession.getText());
            tc.ShowBarberTransaction();
        } else {
            tc.SearchTransactionBarber(keyword, tfUsernameSession.getText());
            tc.ShowBarberTransaction();
        }
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnBarberInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBarberInfoActionPerformed
        // hapus
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        // tampilkan panel yg mau diisi
        mainPanel.add(BarberInfo);
        mainPanel.repaint();
        mainPanel.revalidate();
        
        // menampilkan info barber
        cb.memberInfo(tfUsernameSession.getText(), jLBarberName, jlBarberAddress, jlBarberGender, jlIdentificationId);
        int totalSalary = cb.salaryInfo(tfUsernameSession.getText());
        jlSalary.setText(String.valueOf(totalSalary));
        cb.totalDataInputInfo(tfUsernameSession.getText(), jlDataInput);
        
        tc.loadBarberTransaction(tfUsernameSession.getText());
        tc.showDataSalaryBarber(tc.getModelBarber(), tc.getModelMember(), tc.getDaftarTransaksiBarber(), tc.getDaftarTransaksiMember());
        tfSalaryFiltered.setText(String.valueOf(totalSalary));
        cbMonth.setSelectedIndex(0);
    }//GEN-LAST:event_btnBarberInfoActionPerformed

    private void cbYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbYearActionPerformed
        // TODO add your handling code here:
        int indexMonth = cbMonth.getSelectedIndex();
        int totalSalary = 0;
        String month = String.valueOf(indexMonth);
        String year = cbYear.getSelectedItem().toString();
        
        tc.loadBarberTransaction(tfUsernameSession.getText());
        totalSalary = tc.showDataSalaryBarberMonth(year, month);
        tfSalaryFiltered.setText(String.valueOf(totalSalary));
    }//GEN-LAST:event_cbYearActionPerformed

    private void cbMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMonthActionPerformed
        // TODO add your handling code here:
        int indexMonth = cbMonth.getSelectedIndex();
        int totalSalary = 0;
        String month = String.valueOf(indexMonth);
        String year = cbYear.getSelectedItem().toString();
        
        tc.loadBarberTransaction(tfUsernameSession.getText());
        totalSalary = tc.showDataSalaryBarberMonth(year, month);
        tfSalaryFiltered.setText(String.valueOf(totalSalary));
    }//GEN-LAST:event_cbMonthActionPerformed

    private void tfSalaryFilteredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSalaryFilteredActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSalaryFilteredActionPerformed

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarberInfo;
    private javax.swing.JPanel body;
    private javax.swing.JButton btnBarberInfo;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHistory;
    private javax.swing.JPanel btnLogout;
    private javax.swing.JComboBox cbMonth;
    private javax.swing.JComboBox cbYear;
    private javax.swing.JLabel jLBarberName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel jlBarberAddress;
    private javax.swing.JLabel jlBarberGender;
    private javax.swing.JLabel jlDataInput;
    private javax.swing.JLabel jlIdentificationId;
    private javax.swing.JLabel jlSalary;
    private javax.swing.JTable jtBarberSalary;
    private javax.swing.JTable jtTransaction;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JTextField tfCari;
    private javax.swing.JTextField tfSalaryFiltered;
    private javax.swing.JLabel tfUsernameSession;
    private javax.swing.JPanel transactionHistory;
    // End of variables declaration//GEN-END:variables
}

package view;

import model.Session;
import controller.ControllerCashier;
import controller.TableControl;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import model.TransactionModel;

public class CashierPage extends javax.swing.JFrame {
    SimpleDateFormat x = new SimpleDateFormat("dd-MM-yyyy");
    ControllerCashier cc = new ControllerCashier();
    TableControl tc = new TableControl();
    Date ys = new Date();

    public CashierPage(Session session) {
        initComponents();
        this.setLocationRelativeTo(null);
        
        cc.loadBarber(cbBarber);
        cc.loadYear(cbYear, session.getUsername());
        tc.loadKolomGaji(tc.getModelCashier());
        tc.loadColumnMember();
        tc.loadKolomTransaksi(tc.getModelTransaksiCashier(), "Barber");
        tc.loadCashierTransaction(tfUsernameSession.getText());
        tc.ShowCashierTransaction();
        
        tc.styleCashierTable(jtTransaction, jtCashierSalary);
        tc.styleCashierTable(jtMember, jtCashierSalary);
        jtTransaction.setModel(tc.getModelTransaksiCashier());
        jtCashierSalary.setModel(tc.getModelCashier());
        jtMember.setModel(tc.getModelMemberCukur());
        tfUsernameSession.setText(session.getUsername());
        tfDate.setText(x.format(ys));
    }

    private void reset() {
        cbMenu.setSelectedIndex(0);
        cbBarber.setSelectedIndex(0);
        tfMember.setText("");
        tfPay.setText("");
        tfNama_member.setText("");
        tfEmailMember.setText("");
        tfAddress.setText("");
        tfPhoneNumber.setText("");
        tfDate.setText(x.format(ys));
        tfDiscount.setText("");
        jdBirthOfDates.setCalendar(null);
        btnProcess.setText("Process");
    }
    
    public String jamMenitDetik() {
        Calendar kal = new GregorianCalendar();
        int jam = kal.get(Calendar.HOUR_OF_DAY);
        int menit = kal.get(Calendar.MINUTE);
        int detik = kal.get(Calendar.SECOND);
        return " " + jam + ":" + menit + ":" + detik;
    }
    
    public void transactionProcess() {
        try {
            String menu = cbMenu.getSelectedItem().toString();
            String date = tfDate.getText() + jamMenitDetik();
            String barber = cbBarber.getSelectedItem().toString();
            String uniqueId_member = tfMember.getText();
            String cashier = tfUsernameSession.getText();
            String price = tfPrice.getText();
            int priceFix = 0;
            int discount = 0;

            String pay = tfPay.getText();
            int checkMember = -1;
            if (!tfMember.getText().equals("")) {
                checkMember = new TransactionModel().checkMember(uniqueId_member);
            }
            
            if (uniqueId_member.equals("")) {
                uniqueId_member = "-";
            } 

            if (checkMember == 0) {
                JOptionPane.showMessageDialog(null, "Member doesn't exists");
            } else if(cbMenu.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "Please select menu!");
            } else if(cbBarber.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "Please select the barber!");
            } else if(tfPay.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please fill the pay field!");
            } else if(Integer.parseInt(pay) < Integer.parseInt(price)) {
                JOptionPane.showMessageDialog(null, "Insufficient payment");
            } else {
                if (checkMember == 1) {
                    String tempDisc = tfDiscount.getText();
                    discount = Integer.parseInt(tempDisc);
                }
                
                priceFix = Integer.parseInt(price);
                if (btnProcess.getText().equals("Process")) {
                    new TransactionModel().addTransactionData(date, menu, barber, cashier, uniqueId_member, priceFix, Integer.parseInt(pay), discount);
                    reset();
                } else if(btnProcess.getText().equals("Update")) {
                    String id_trx = jlIdTrx.getText();
                    new TransactionModel().editTransactionData(menu, barber, uniqueId_member, Integer.parseInt(price), Integer.parseInt(pay), discount, Integer.parseInt(id_trx), Integer.parseInt(tfDiscount.getText()));
                    showTransactionHistory();
                }
            }
        } catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Please Input number format in Pay Field! " + ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        btnAddTransaction = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnHistory = new javax.swing.JButton();
        btnAddMember = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        tfUsernameSession = new javax.swing.JLabel();
        btnCashierInfo = new javax.swing.JButton();
        btnMember = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        addTransaction = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnProcess = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbMenu = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbBarber = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfMember = new javax.swing.JTextField();
        tfDate = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tfPrice = new javax.swing.JTextField();
        tfPay = new javax.swing.JTextField();
        jlIdTrx = new javax.swing.JLabel();
        btnVerificationMember = new javax.swing.JButton();
        tfDiscount = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        transactionHistory = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTransaction = new javax.swing.JTable();
        tfCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        addMember = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        tfNama_member = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tfAddress = new javax.swing.JTextArea();
        tfEmailMember = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        tfPhoneNumber = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        btnProcessMember = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jdBirthOfDates = new com.toedter.calendar.JDateChooser();
        cashierInfo = new javax.swing.JPanel();
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
        jLCashierName = new javax.swing.JLabel();
        jlCashierAddress = new javax.swing.JLabel();
        jlIdentificationId = new javax.swing.JLabel();
        jlCashierGender = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jlSalary = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtCashierSalary = new javax.swing.JTable();
        jLabel29 = new javax.swing.JLabel();
        jlDataInput = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        cbMonth = new javax.swing.JComboBox();
        cbYear = new javax.swing.JComboBox();
        tfSalaryFiltered = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        MemberInfo = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtMember = new javax.swing.JTable();
        jLabel41 = new javax.swing.JLabel();
        tfIdMember = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        tfNamaMember = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        tfTanggalLahir = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        tfEmailMember2 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        taAlamat = new javax.swing.JTextArea();
        s = new javax.swing.JLabel();
        tfNoTelp = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        body.setBackground(new java.awt.Color(255, 255, 255));

        menuPanel.setBackground(new java.awt.Color(108, 197, 155));

        btnAddTransaction.setText("Add Transaction");
        btnAddTransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTransactionActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cashier");

        btnHistory.setText("History");
        btnHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoryActionPerformed(evt);
            }
        });

        btnAddMember.setText("Add Member");
        btnAddMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMemberActionPerformed(evt);
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

        btnCashierInfo.setText("Cashier Info");
        btnCashierInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCashierInfoActionPerformed(evt);
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
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1))
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnHistory, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(btnAddMember, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(btnAddTransaction, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addGroup(menuPanelLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfUsernameSession))
                            .addComponent(btnCashierInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(btnMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                .addGap(18, 18, 18)
                .addComponent(btnAddTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAddMember, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCashierInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMember, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setLayout(new java.awt.CardLayout());

        addTransaction.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 36)); // NOI18N
        jLabel3.setText("Transaction");

        btnProcess.setText("Process");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        jLabel4.setText("Menu");

        jLabel7.setText("Pay");

        cbMenu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-- Choose Menu --", "Haircut", "Haircut & Wash", "Shave", "Senior & Military", "Beard Trim / Lineup", "Design" }));
        cbMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMenuActionPerformed(evt);
            }
        });

        jLabel8.setText("-------------------------------------------------------------------");

        jLabel5.setText("Date");

        jLabel6.setText("Barber");

        jLabel9.setText("ID Member");

        tfDate.setEnabled(false);
        tfDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDateActionPerformed(evt);
            }
        });

        jLabel10.setText("Price");

        tfPrice.setText("0");
        tfPrice.setEnabled(false);
        tfPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPriceActionPerformed(evt);
            }
        });

        jlIdTrx.setForeground(new java.awt.Color(255, 255, 255));
        jlIdTrx.setText("id_trx");

        btnVerificationMember.setText("Check");
        btnVerificationMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificationMemberActionPerformed(evt);
            }
        });

        tfDiscount.setEditable(false);

        jLabel31.setText("Discount");

        javax.swing.GroupLayout addTransactionLayout = new javax.swing.GroupLayout(addTransaction);
        addTransaction.setLayout(addTransactionLayout);
        addTransactionLayout.setHorizontalGroup(
            addTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addTransactionLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(addTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addGap(83, 83, 83)
                .addGroup(addTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(tfPay, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                    .addComponent(tfDate)
                    .addGroup(addTransactionLayout.createSequentialGroup()
                        .addComponent(tfMember, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVerificationMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(99, 99, 99))
            .addGroup(addTransactionLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jlIdTrx)
                .addGap(31, 31, 31)
                .addGroup(addTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addTransactionLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(35, 35, 35)))
                .addContainerGap(246, Short.MAX_VALUE))
            .addGroup(addTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(addTransactionLayout.createSequentialGroup()
                    .addGap(91, 91, 91)
                    .addGroup(addTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addComponent(jLabel4)
                        .addComponent(tfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(addTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cbMenu, javax.swing.GroupLayout.Alignment.LEADING, 0, 220, Short.MAX_VALUE)
                            .addComponent(cbBarber, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addContainerGap(101, Short.MAX_VALUE)))
        );
        addTransactionLayout.setVerticalGroup(
            addTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addTransactionLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(addTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jlIdTrx))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfDate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(4, 4, 4)
                .addGroup(addTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVerificationMember, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(tfMember))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel31)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPay, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(164, Short.MAX_VALUE))
            .addGroup(addTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(addTransactionLayout.createSequentialGroup()
                    .addGap(90, 90, 90)
                    .addComponent(jLabel4)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(cbMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel6)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(cbBarber, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(36, 36, 36)
                    .addComponent(tfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(29, 29, 29)
                    .addComponent(btnProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(100, Short.MAX_VALUE)))
        );

        mainPanel.add(addTransaction, "card2");

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

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
                    .addGroup(transactionHistoryLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfCari, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCari)))
                .addContainerGap())
            .addGroup(transactionHistoryLayout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        mainPanel.add(transactionHistory, "card3");

        addMember.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Rockwell", 0, 36)); // NOI18N
        jLabel13.setText("Add Member");

        jLabel14.setText("Member Name");

        jLabel15.setText("-------------------------------------------------------------------");

        jLabel16.setText("Address");

        tfAddress.setColumns(20);
        tfAddress.setRows(5);
        jScrollPane2.setViewportView(tfAddress);

        jLabel17.setText("Email");

        jLabel18.setText("Phone Number");

        btnProcessMember.setText("Process");
        btnProcessMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessMemberActionPerformed(evt);
            }
        });

        jLabel30.setText("Date Of Birth");

        jdBirthOfDates.setDateFormatString("dd-MM-yyyy");

        javax.swing.GroupLayout addMemberLayout = new javax.swing.GroupLayout(addMember);
        addMember.setLayout(addMemberLayout);
        addMemberLayout.setHorizontalGroup(
            addMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addMemberLayout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addGroup(addMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(addMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addMemberLayout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addGap(117, 117, 117))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addMemberLayout.createSequentialGroup()
                            .addComponent(jLabel15)
                            .addGap(91, 91, 91))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnProcessMember, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(addMemberLayout.createSequentialGroup()
                                .addGroup(addMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16))
                                .addGap(46, 46, 46)
                                .addGroup(addMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jdBirthOfDates, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18)
                                    .addComponent(tfPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel30)))))
                    .addGroup(addMemberLayout.createSequentialGroup()
                        .addGroup(addMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(tfNama_member, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(addMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(tfEmailMember, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(91, 91, 91))
        );
        addMemberLayout.setVerticalGroup(
            addMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addMemberLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel13)
                .addGap(1, 1, 1)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addGroup(addMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addMemberLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNama_member, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addMemberLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfEmailMember, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(addMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(addMemberLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addMemberLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jdBirthOfDates, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnProcessMember, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        mainPanel.add(addMember, "card4");

        cashierInfo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel19.setFont(new java.awt.Font("Rockwell", 0, 36)); // NOI18N
        jLabel19.setText("Cashier Info");

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

        jLCashierName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLCashierName.setText("Muhamad Azmi Rizkifar");

        jlCashierAddress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlCashierAddress.setText("Purwakarta, Jawa Barat");

        jlIdentificationId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlIdentificationId.setText("9224418912338992");

        jlCashierGender.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlCashierGender.setText("Male");

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel33.setText("Total Salary");

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setText(":");

        jlSalary.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlSalary.setText("500000");

        jtCashierSalary.setModel(new javax.swing.table.DefaultTableModel(
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
        jtCashierSalary.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jtCashierSalary.setRowHeight(25);
        jtCashierSalary.setSelectionBackground(new java.awt.Color(108, 200, 186));
        jtCashierSalary.setShowVerticalLines(false);
        jtCashierSalary.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jtCashierSalary);

        jLabel29.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel29.setText("Transaction Table");

        jlDataInput.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlDataInput.setText("500000");

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setText(":");

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel38.setText("Total Data");

        cbMonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All Month", "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember" }));
        cbMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMonthActionPerformed(evt);
            }
        });

        cbYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbYearActionPerformed(evt);
            }
        });

        tfSalaryFiltered.setEditable(false);
        tfSalaryFiltered.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSalaryFilteredActionPerformed(evt);
            }
        });

        jLabel36.setText("Total");

        javax.swing.GroupLayout cashierInfoLayout = new javax.swing.GroupLayout(cashierInfo);
        cashierInfo.setLayout(cashierInfoLayout);
        cashierInfoLayout.setHorizontalGroup(
            cashierInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cashierInfoLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(cashierInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cashierInfoLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel20))
                    .addGroup(cashierInfoLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLabel19))
                    .addGroup(cashierInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(cashierInfoLayout.createSequentialGroup()
                            .addGroup(cashierInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel22)
                                .addComponent(jLabel23)
                                .addComponent(jLabel21))
                            .addGap(18, 18, 18)
                            .addGroup(cashierInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(cashierInfoLayout.createSequentialGroup()
                                    .addComponent(jLabel25)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLCashierName))
                                .addGroup(cashierInfoLayout.createSequentialGroup()
                                    .addComponent(jLabel26)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jlCashierAddress))
                                .addGroup(cashierInfoLayout.createSequentialGroup()
                                    .addComponent(jLabel27)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jlIdentificationId)))
                            .addGap(59, 59, 59)
                            .addGroup(cashierInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(cashierInfoLayout.createSequentialGroup()
                                    .addGroup(cashierInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel24)
                                        .addComponent(jLabel33))
                                    .addGap(10, 10, 10)
                                    .addGroup(cashierInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(cashierInfoLayout.createSequentialGroup()
                                            .addComponent(jLabel28)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jlCashierGender))
                                        .addGroup(cashierInfoLayout.createSequentialGroup()
                                            .addComponent(jLabel34)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jlSalary))))
                                .addGroup(cashierInfoLayout.createSequentialGroup()
                                    .addComponent(jLabel38)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel35)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jlDataInput))))
                        .addGroup(cashierInfoLayout.createSequentialGroup()
                            .addGap(155, 155, 155)
                            .addComponent(jLabel29))
                        .addGroup(cashierInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(cashierInfoLayout.createSequentialGroup()
                                .addComponent(cbYear, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)
                                .addComponent(jLabel36)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfSalaryFiltered))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(91, 91, 91))
        );
        cashierInfoLayout.setVerticalGroup(
            cashierInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cashierInfoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addGroup(cashierInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(cashierInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(cashierInfoLayout.createSequentialGroup()
                            .addGroup(cashierInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel21)
                                .addComponent(jLabel25)
                                .addComponent(jLCashierName))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(cashierInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel22)
                                .addComponent(jLabel26)
                                .addComponent(jlCashierAddress)))
                        .addGroup(cashierInfoLayout.createSequentialGroup()
                            .addComponent(jLabel24)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel33)))
                    .addGroup(cashierInfoLayout.createSequentialGroup()
                        .addGroup(cashierInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(jlCashierGender))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(cashierInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(jlSalary))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cashierInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(cashierInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel23)
                        .addComponent(jLabel27)
                        .addComponent(jlIdentificationId))
                    .addGroup(cashierInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(cashierInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(jlDataInput))
                        .addComponent(jLabel38)))
                .addGap(18, 18, 18)
                .addComponent(jLabel29)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(cashierInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cashierInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbMonth, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                        .addComponent(cbYear, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                    .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfSalaryFiltered, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(27, 27, 27))
        );

        mainPanel.add(cashierInfo, "card5");

        MemberInfo.setBackground(new java.awt.Color(255, 255, 255));

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
        jScrollPane4.setViewportView(jtMember);

        jLabel41.setText("ID Member");

        tfIdMember.setEditable(false);

        jLabel42.setText("Nama Member");

        tfNamaMember.setEditable(false);

        jLabel44.setText("Tanggal Lahir");

        tfTanggalLahir.setEditable(false);

        jLabel45.setText("Email");

        tfEmailMember2.setEditable(false);

        jLabel43.setText("Alamat");

        taAlamat.setEditable(false);
        taAlamat.setColumns(20);
        taAlamat.setRows(5);
        jScrollPane7.setViewportView(taAlamat);

        s.setText("Tanggal Lahir");

        tfNoTelp.setEditable(false);

        jLabel46.setFont(new java.awt.Font("Rockwell", 0, 36)); // NOI18N
        jLabel46.setText("Member Info");

        javax.swing.GroupLayout MemberInfoLayout = new javax.swing.GroupLayout(MemberInfo);
        MemberInfo.setLayout(MemberInfoLayout);
        MemberInfoLayout.setHorizontalGroup(
            MemberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MemberInfoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MemberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel46)
                    .addComponent(jLabel45)
                    .addGroup(MemberInfoLayout.createSequentialGroup()
                        .addGroup(MemberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfEmailMember2)
                            .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel44, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfIdMember, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNamaMember, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTanggalLahir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(MemberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(s)
                            .addGroup(MemberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfNoTelp, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        MemberInfoLayout.setVerticalGroup(
            MemberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MemberInfoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel46)
                .addGap(28, 28, 28)
                .addGroup(MemberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MemberInfoLayout.createSequentialGroup()
                        .addGroup(MemberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41)
                            .addComponent(jLabel43))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MemberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(MemberInfoLayout.createSequentialGroup()
                                .addComponent(tfIdMember, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel42)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfNamaMember, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(MemberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MemberInfoLayout.createSequentialGroup()
                                .addComponent(jLabel44)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfTanggalLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MemberInfoLayout.createSequentialGroup()
                                .addComponent(s)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNoTelp, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfEmailMember2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        mainPanel.add(MemberInfo, "card6");

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

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // TODO add your handling code here:
        transactionProcess();
    }//GEN-LAST:event_btnProcessActionPerformed

    private void cbMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMenuActionPerformed
        // TODO add your handling code here:
        int menu = cc.menuPrice(cbMenu.getSelectedIndex());
        tfPrice.setText(String.valueOf(menu));
    }//GEN-LAST:event_cbMenuActionPerformed

    // fungsi pindah panel
    private void showAddTransaction() {
        // hapus
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        // tampilkan panel yg mau diisi
        mainPanel.add(addTransaction);
        mainPanel.repaint();
        mainPanel.revalidate();
    }
    
    private void showTransactionHistory() {
        // hapus
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        // tampilkan panel yg mau diisi
        mainPanel.add(transactionHistory);
        mainPanel.repaint();
        mainPanel.revalidate();
        
        tc.loadCashierTransaction(tfUsernameSession.getText());
        tc.ShowCashierTransaction();
    }
    
    private void btnAddTransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTransactionActionPerformed
        tfMember.setEnabled(true);
        btnVerificationMember.setEnabled(true);
        cbMenu.setEnabled(true);
        showAddTransaction();
        reset();
    }//GEN-LAST:event_btnAddTransactionActionPerformed

    private void btnHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoryActionPerformed
        // TODO add your handling code here:                                           
        showTransactionHistory();
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

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        String member = "";
        int barisTerpilih = jtTransaction.getSelectedRow();
        jlIdTrx.setText(tc.getModelTransaksiCashier().getValueAt(barisTerpilih, 0).toString());
        tfDate.setText(tc.getModelTransaksiCashier().getValueAt(barisTerpilih, 1).toString());
        cbMenu.setSelectedItem(tc.getModelTransaksiCashier().getValueAt(barisTerpilih, 2));
        cbBarber.setSelectedItem(tc.getModelTransaksiCashier().getValueAt(barisTerpilih, 3));
        
        if (tc.getModelTransaksiCashier().getValueAt(barisTerpilih, 4).toString().equals("-")) {
            member = "";
        } else {
            member = tc.getModelTransaksiCashier().getValueAt(barisTerpilih, 4).toString();
        }
        tfMember.setText(member);
        
        tfPrice.setText(tc.getModelTransaksiCashier().getValueAt(barisTerpilih, 5).toString());
        tfPay.setText(tc.getModelTransaksiCashier().getValueAt(barisTerpilih, 6).toString());
        tfDiscount.setText(tc.getModelTransaksiCashier().getValueAt(barisTerpilih, 7).toString());
        tfMember.setEnabled(false);
        btnVerificationMember.setEnabled(false);
        cbMenu.setEnabled(false);
        
        btnProcess.setText("Update");
        showAddTransaction();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        String keyword = tfCari.getText().trim();
        if (keyword.length() == 0) {
            tc.loadCashierTransaction(tfUsernameSession.getText());
            tc.ShowCashierTransaction();
        } else {
            tc.searchTransactionCashier(keyword, tfUsernameSession.getText());
            tc.ShowCashierTransaction();
        }
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnAddMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMemberActionPerformed
        // hapus
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        // tampilkan panel yg mau diisi
        mainPanel.add(addMember);
        mainPanel.repaint();
        mainPanel.revalidate();
        reset();
    }//GEN-LAST:event_btnAddMemberActionPerformed

    private void btnProcessMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessMemberActionPerformed
        // TODO add your handling code here:
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            String namaMember = tfNama_member.getText();
            String address = tfAddress.getText();
            String email = tfEmailMember.getText();
            String phoneNumber = tfPhoneNumber.getText();
            String date = sdf.format(jdBirthOfDates.getDate());
            cc.addMember(namaMember, address, email, phoneNumber, date);
            reset();
        } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Please fill date field!");
        }
    }//GEN-LAST:event_btnProcessMemberActionPerformed

    private void btnCashierInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCashierInfoActionPerformed
        // TODO add your handling code here:// hapus
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        // tampilkan panel yg mau diisi
        mainPanel.add(cashierInfo);
        mainPanel.repaint();
        mainPanel.revalidate();
        
        // menampilkan data info cashier
        cc.cashierInfo(tfUsernameSession.getText(), jLCashierName, jlCashierAddress, jlCashierGender, jlIdentificationId);
        int totalSalary = cc.salaryInfo(tfUsernameSession.getText());
        jlSalary.setText(String.valueOf(totalSalary));
        cc.totalDataInputInfo(tfUsernameSession.getText(), jlDataInput);
        
        tc.loadCashierTransaction(tfUsernameSession.getText());
        tc.showDataSalaryCashier(tc.getModelCashier(), tc.getModelMember(), tc.getDaftarTransaksiCashier(), tc.getDaftarTransaksiMember());
        tfSalaryFiltered.setText(String.valueOf(totalSalary));
        cbMonth.setSelectedIndex(0);
    }//GEN-LAST:event_btnCashierInfoActionPerformed

    private void btnVerificationMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificationMemberActionPerformed
        // TODO add your handling code here:
        String getUnID = tfMember.getText();
        int checkMember = -1;
        if (!tfMember.getText().equals("")) {
                checkMember = new TransactionModel().checkMember(getUnID);
                
                if (checkMember == 1) {
                    String SttempPrice = tfPrice.getText();
                    int tempPrice = Integer.parseInt(SttempPrice);
                    int discount = new TransactionModel().getDiscount(tempPrice,getUnID);
                    tempPrice = tempPrice - discount;
                    SttempPrice = String.valueOf(tempPrice);
                    tfPrice.setText(SttempPrice);
                    tfDiscount.setText(String.valueOf(discount));
                }
                else{
                    JOptionPane.showMessageDialog(null, "Member Doesn't Exists");
                }
        }
        else{
            JOptionPane.showMessageDialog(null, "Please fill the member name field!");
        }
        
    }//GEN-LAST:event_btnVerificationMemberActionPerformed

    private void tfPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPriceActionPerformed

    private void tfCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCariActionPerformed

    private void cbMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMonthActionPerformed
        // TODO add your handling code here:
        int indexMonth = cbMonth.getSelectedIndex();
        int totalSalary = 0;
        String month = String.valueOf(indexMonth);
        String year = cbYear.getSelectedItem().toString();
        
        tc.loadCashierTransaction(tfUsernameSession.getText());
        totalSalary = tc.showDataSalaryCashierMonth(year, month);
        tfSalaryFiltered.setText(String.valueOf(totalSalary));
    }//GEN-LAST:event_cbMonthActionPerformed

    private void cbYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbYearActionPerformed
        // TODO add your handling code here:
        int indexMonth = cbMonth.getSelectedIndex();
        int totalSalary = 0;
        String month = String.valueOf(indexMonth);
        String year = cbYear.getSelectedItem().toString();
        
        tc.loadCashierTransaction(tfUsernameSession.getText());
        totalSalary = tc.showDataSalaryCashierMonth(year, month);
        tfSalaryFiltered.setText(String.valueOf(totalSalary));
    }//GEN-LAST:event_cbYearActionPerformed

    private void tfDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDateActionPerformed

    private void tfSalaryFilteredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSalaryFilteredActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSalaryFilteredActionPerformed

    private void btnMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemberActionPerformed
        // TODO add your handling code here:
        // hapus
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        // tampilkan panel yg mau diisi
        mainPanel.add(MemberInfo);
        mainPanel.repaint();
        mainPanel.revalidate();
        
        tc.loadMember();
        tc.ShowMember();
        
        tfIdMember.setText("");
        tfNamaMember.setText("");
        tfTanggalLahir.setText("");
        tfEmailMember2.setText("");
        taAlamat.setText("");
        tfNoTelp.setText("");
    }//GEN-LAST:event_btnMemberActionPerformed

    private void jtMemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtMemberMouseClicked
        // TODO add your handling code here:
        int selectedRows = jtMember.getSelectedRow();
        String MemberId = tc.getModelMemberCukur().getValueAt(selectedRows,0).toString();
        tc.showMemberData(MemberId, tfIdMember, tfNamaMember, tfTanggalLahir, tfEmailMember2, taAlamat, tfNoTelp);
    }//GEN-LAST:event_jtMemberMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(CashierPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CashierPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CashierPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CashierPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MemberInfo;
    private javax.swing.JPanel addMember;
    private javax.swing.JPanel addTransaction;
    private javax.swing.JPanel body;
    private javax.swing.JButton btnAddMember;
    private javax.swing.JButton btnAddTransaction;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnCashierInfo;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHistory;
    private javax.swing.JPanel btnLogout;
    private javax.swing.JButton btnMember;
    private javax.swing.JButton btnProcess;
    private javax.swing.JButton btnProcessMember;
    private javax.swing.JButton btnVerificationMember;
    private javax.swing.JPanel cashierInfo;
    private javax.swing.JComboBox cbBarber;
    private javax.swing.JComboBox cbMenu;
    private javax.swing.JComboBox cbMonth;
    private javax.swing.JComboBox cbYear;
    private javax.swing.JLabel jLCashierName;
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
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane7;
    private com.toedter.calendar.JDateChooser jdBirthOfDates;
    private javax.swing.JLabel jlCashierAddress;
    private javax.swing.JLabel jlCashierGender;
    private javax.swing.JLabel jlDataInput;
    private javax.swing.JLabel jlIdTrx;
    private javax.swing.JLabel jlIdentificationId;
    private javax.swing.JLabel jlSalary;
    private javax.swing.JTable jtCashierSalary;
    private javax.swing.JTable jtMember;
    private javax.swing.JTable jtTransaction;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JLabel s;
    private javax.swing.JTextArea taAlamat;
    private javax.swing.JTextArea tfAddress;
    private javax.swing.JTextField tfCari;
    private javax.swing.JTextField tfDate;
    private javax.swing.JTextField tfDiscount;
    private javax.swing.JTextField tfEmailMember;
    private javax.swing.JTextField tfEmailMember2;
    private javax.swing.JTextField tfIdMember;
    private javax.swing.JTextField tfMember;
    private javax.swing.JTextField tfNamaMember;
    private javax.swing.JTextField tfNama_member;
    private javax.swing.JTextField tfNoTelp;
    private javax.swing.JTextField tfPay;
    private javax.swing.JTextField tfPhoneNumber;
    private javax.swing.JTextField tfPrice;
    private javax.swing.JTextField tfSalaryFiltered;
    private javax.swing.JTextField tfTanggalLahir;
    private javax.swing.JLabel tfUsernameSession;
    private javax.swing.JPanel transactionHistory;
    // End of variables declaration//GEN-END:variables
}

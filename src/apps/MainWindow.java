package apps;

import DB.DBConnection;
import java.awt.Graphics;
import java.awt.PrintJob;
import java.awt.Toolkit;
import java.util.Vector;
import javax.sound.midi.SysexMessage;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class MainWindow extends javax.swing.JFrame {

    public MainWindow() {
        initComponents();
    }
    String user;

    public MainWindow(String str) {
        initComponents();
        user = str;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        AddEmployee = new javax.swing.JInternalFrame();
        jPanel4 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jLabel97 = new javax.swing.JLabel();
        SearchUpdateEmp = new javax.swing.JInternalFrame();
        jPanel6 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jTextField32 = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        jTextField34 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        jTextField36 = new javax.swing.JTextField();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        EmployeeList = new javax.swing.JInternalFrame();
        jPanel5 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jTextField37 = new javax.swing.JTextField();
        jButton28 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        AddMedicine = new javax.swing.JInternalFrame();
        jPanel18 = new javax.swing.JPanel();
        jLabel160 = new javax.swing.JLabel();
        jLabel161 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        jLabel163 = new javax.swing.JLabel();
        jLabel164 = new javax.swing.JLabel();
        jLabel165 = new javax.swing.JLabel();
        jLabel166 = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        jLabel168 = new javax.swing.JLabel();
        jTextField139 = new javax.swing.JTextField();
        jTextField140 = new javax.swing.JTextField();
        jTextField141 = new javax.swing.JTextField();
        jTextField142 = new javax.swing.JTextField();
        jTextField143 = new javax.swing.JTextField();
        jTextField144 = new javax.swing.JTextField();
        jTextField145 = new javax.swing.JTextField();
        jTextField146 = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        jButton51 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jLabel98 = new javax.swing.JLabel();
        SearchupdateMedicine = new javax.swing.JInternalFrame();
        jPanel19 = new javax.swing.JPanel();
        jLabel170 = new javax.swing.JLabel();
        jLabel171 = new javax.swing.JLabel();
        jLabel172 = new javax.swing.JLabel();
        jLabel173 = new javax.swing.JLabel();
        jLabel174 = new javax.swing.JLabel();
        jLabel175 = new javax.swing.JLabel();
        jLabel176 = new javax.swing.JLabel();
        jLabel177 = new javax.swing.JLabel();
        jLabel178 = new javax.swing.JLabel();
        jLabel179 = new javax.swing.JLabel();
        jTextField148 = new javax.swing.JTextField();
        jTextField149 = new javax.swing.JTextField();
        jTextField150 = new javax.swing.JTextField();
        jTextField151 = new javax.swing.JTextField();
        jTextField152 = new javax.swing.JTextField();
        jTextField153 = new javax.swing.JTextField();
        jTextField154 = new javax.swing.JTextField();
        jTextField155 = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        jTextField156 = new javax.swing.JTextField();
        jButton53 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jButton56 = new javax.swing.JButton();
        jLabel100 = new javax.swing.JLabel();
        MedicineList = new javax.swing.JInternalFrame();
        jPanel3 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        AddStock = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jLabel99 = new javax.swing.JLabel();
        UpdateStock = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField38 = new javax.swing.JTextField();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jLabel51 = new javax.swing.JLabel();
        jTextField39 = new javax.swing.JTextField();
        ViewStock = new javax.swing.JInternalFrame();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jTextField40 = new javax.swing.JTextField();
        jButton19 = new javax.swing.JButton();
        GenerateBill = new javax.swing.JInternalFrame();
        jPanel8 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jTextField41 = new javax.swing.JTextField();
        jTextField42 = new javax.swing.JTextField();
        jTextField43 = new javax.swing.JTextField();
        jTextField44 = new javax.swing.JTextField();
        jTextField45 = new javax.swing.JTextField();
        jTextField46 = new javax.swing.JTextField();
        jTextField47 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jTextField48 = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        jTextField49 = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        jTextField50 = new javax.swing.JTextField();
        Invoice = new javax.swing.JInternalFrame();
        jPanel10 = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel87 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jButton33 = new javax.swing.JButton();
        ViewInvoice = new javax.swing.JInternalFrame();
        jPanel13 = new javax.swing.JPanel();
        jLabel88 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jTextField51 = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jLabel92 = new javax.swing.JLabel();
        jTextField53 = new javax.swing.JTextField();
        jButton36 = new javax.swing.JButton();
        ViewReorderList = new javax.swing.JInternalFrame();
        jPanel14 = new javax.swing.JPanel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jTextField54 = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        SaleReport = new javax.swing.JInternalFrame();
        jPanel16 = new javax.swing.JPanel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jTextField55 = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        ChangePassword = new javax.swing.JInternalFrame();
        jPanel11 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPasswordField3 = new javax.swing.JPasswordField();
        jPasswordField4 = new javax.swing.JPasswordField();
        CreateAccount2 = new javax.swing.JInternalFrame();
        jPanel15 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jTextField52 = new javax.swing.JTextField();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jPasswordField5 = new javax.swing.JPasswordField();
        jPasswordField6 = new javax.swing.JPasswordField();
        Print_bill = new javax.swing.JInternalFrame();
        jPanel17 = new javax.swing.JPanel();
        jButton37 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jLabel103 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToolBar1.setRollover(true);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/add.png"))); // NOI18N
        jButton1.setToolTipText("Add Medicine");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Search_1.png"))); // NOI18N
        jButton3.setToolTipText("Search/UpdateMedicine");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/UI Details.png"))); // NOI18N
        jButton4.setToolTipText("Medicine List");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/add.png"))); // NOI18N
        jButton5.setToolTipText("Add Medicine");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton5);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/search.png"))); // NOI18N
        jButton7.setToolTipText("Search/update/medicine");
        jButton7.setFocusable(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton7);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/application_view_detail.png"))); // NOI18N
        jButton8.setToolTipText("Medicine List");
        jButton8.setFocusable(false);
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton8);

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/add to cart.png"))); // NOI18N
        jButton9.setToolTipText("Add Stock");
        jButton9.setFocusable(false);
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton9);

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon_info.png"))); // NOI18N
        jButton10.setToolTipText("Update Stock");
        jButton10.setFocusable(false);
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton10);

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/tag-sale-16.png"))); // NOI18N
        jButton11.setToolTipText("View Stock");
        jButton11.setFocusable(false);
        jButton11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton11);

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/yes.png"))); // NOI18N
        jButton13.setToolTipText("View Invoice");
        jButton13.setFocusable(false);
        jButton13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton13.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton13);

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Custumber Report.png"))); // NOI18N
        jButton14.setToolTipText("Reorder List");
        jButton14.setFocusable(false);
        jButton14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton14.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton14);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/save.png"))); // NOI18N
        jButton2.setToolTipText("Sell Report");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/close.png"))); // NOI18N
        jButton20.setToolTipText("Change Password");
        jButton20.setFocusable(false);
        jButton20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton20.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton20);

        jButton29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/no.png"))); // NOI18N
        jButton29.setToolTipText("Create Account");
        jButton29.setFocusable(false);
        jButton29.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton29.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton29);

        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/login.png"))); // NOI18N
        jButton21.setToolTipText("Logout");
        jButton21.setFocusable(false);
        jButton21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton21.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton21);

        getContentPane().add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1870, 30));

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 255));
        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddEmployee.setClosable(true);
        AddEmployee.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        AddEmployee.setTitle("Add Employee");
        AddEmployee.setVisible(false);
        AddEmployee.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 153, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Add Employee");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 1290, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setText("Employee Code");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 130, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setText("Employee Name");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 208, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setText("Date of  Birth");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 296, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setText("Gender");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 389, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setText("Qualification");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 473, -1, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setText("Address");
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 567, -1, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel26.setText("Contact");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 658, -1, -1));

        jTextField15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel4.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 126, 339, -1));

        jTextField16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel4.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 204, 339, -1));

        jTextField17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel4.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 292, 339, -1));

        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButton1.setText("Male");
        jPanel4.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, -1, -1));

        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButton2.setText("Female");
        jPanel4.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, -1, -1));

        jTextField18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel4.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 469, 339, -1));

        jTextField19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel4.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 561, 339, -1));

        jTextField20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel4.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 652, 339, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel27.setText("Email Id");
        jPanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(786, 130, -1, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel28.setText("ID Name");
        jPanel4.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(783, 208, -1, -1));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel29.setText("ID Number");
        jPanel4.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(765, 290, -1, -1));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel30.setText("Date of joining");
        jPanel4.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(736, 383, -1, -1));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel31.setText("User ID");
        jPanel4.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(793, 469, -1, -1));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel32.setText("Password");
        jPanel4.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 565, -1, -1));

        jTextField21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel4.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(903, 126, 363, -1));

        jTextField22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel4.add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(903, 204, 363, -1));

        jTextField23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel4.add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(903, 292, 363, -1));

        jTextField24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField24.setText("It's Take System Date");
        jPanel4.add(jTextField24, new org.netbeans.lib.awtextra.AbsoluteConstraints(903, 379, 363, -1));

        jTextField25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel4.add(jTextField25, new org.netbeans.lib.awtextra.AbsoluteConstraints(903, 465, 363, -1));

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel4.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(903, 561, 363, -1));

        jButton22.setBackground(new java.awt.Color(255, 153, 153));
        jButton22.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton22.setText("Submit");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(812, 657, 178, -1));

        jButton23.setBackground(new java.awt.Color(255, 153, 153));
        jButton23.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton23.setText("Reset");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1086, 657, 180, -1));

        jLabel97.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/add emp.jpg"))); // NOI18N
        jPanel4.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 750));

        AddEmployee.getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1330, 744));

        jDesktopPane1.add(AddEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 1310, 780));

        SearchUpdateEmp.setClosable(true);
        SearchUpdateEmp.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        SearchUpdateEmp.setTitle("SearchUpdateEmp");
        SearchUpdateEmp.setVisible(false);

        jPanel6.setBackground(new java.awt.Color(255, 102, 153));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Search Update Employee");
        jPanel6.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 28, 1330, -1));

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel34.setText("Employee Code");
        jPanel6.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        jLabel35.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel35.setText("Employee Name");
        jPanel6.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 208, -1, -1));

        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel36.setText("Date of  Birth");
        jPanel6.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 296, -1, -1));

        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel37.setText("Gender");
        jPanel6.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 389, -1, -1));

        jLabel38.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel38.setText("Qualification");
        jPanel6.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 473, -1, -1));

        jLabel39.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel39.setText("Address");
        jPanel6.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 567, -1, -1));

        jLabel40.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel40.setText("Contact");
        jPanel6.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 658, -1, -1));

        jTextField26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel6.add(jTextField26, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 126, 240, -1));

        jTextField27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel6.add(jTextField27, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 204, 339, -1));

        jTextField28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel6.add(jTextField28, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 292, 339, -1));

        jRadioButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButton3.setText("Male");
        jPanel6.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 380, -1, -1));

        jRadioButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButton4.setText("Female");
        jPanel6.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 380, -1, -1));

        jTextField29.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel6.add(jTextField29, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 469, 339, -1));

        jTextField30.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel6.add(jTextField30, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 561, 339, -1));

        jTextField31.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel6.add(jTextField31, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 652, 339, -1));

        jLabel41.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel41.setText("Email Id");
        jPanel6.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(786, 130, -1, -1));

        jLabel42.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel42.setText("ID Name");
        jPanel6.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(783, 208, -1, -1));

        jLabel43.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel43.setText("ID Number");
        jPanel6.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(765, 290, -1, -1));

        jLabel44.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel44.setText("Date of joining");
        jPanel6.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(736, 383, -1, -1));

        jLabel45.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel45.setText("User ID");
        jPanel6.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(793, 469, -1, -1));

        jTextField32.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel6.add(jTextField32, new org.netbeans.lib.awtextra.AbsoluteConstraints(903, 126, 363, -1));

        jTextField33.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel6.add(jTextField33, new org.netbeans.lib.awtextra.AbsoluteConstraints(903, 204, 363, -1));

        jTextField34.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel6.add(jTextField34, new org.netbeans.lib.awtextra.AbsoluteConstraints(903, 292, 363, -1));

        jTextField35.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel6.add(jTextField35, new org.netbeans.lib.awtextra.AbsoluteConstraints(903, 379, 363, -1));

        jTextField36.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel6.add(jTextField36, new org.netbeans.lib.awtextra.AbsoluteConstraints(903, 465, 363, -1));

        jButton24.setBackground(new java.awt.Color(255, 102, 153));
        jButton24.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton24.setText("Update");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 580, 150, -1));

        jButton25.setBackground(new java.awt.Color(255, 102, 153));
        jButton25.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton25.setText("Reset");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 580, 150, -1));

        jButton26.setBackground(new java.awt.Color(255, 102, 153));
        jButton26.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/search.png"))); // NOI18N
        jButton26.setText("Search");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 140, -1));

        jButton27.setBackground(new java.awt.Color(255, 102, 153));
        jButton27.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton27.setText("Block Acc");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 580, 140, -1));

        javax.swing.GroupLayout SearchUpdateEmpLayout = new javax.swing.GroupLayout(SearchUpdateEmp.getContentPane());
        SearchUpdateEmp.getContentPane().setLayout(SearchUpdateEmpLayout);
        SearchUpdateEmpLayout.setHorizontalGroup(
            SearchUpdateEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 1364, Short.MAX_VALUE)
        );
        SearchUpdateEmpLayout.setVerticalGroup(
            SearchUpdateEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
        );

        jDesktopPane1.add(SearchUpdateEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 1380, 740));

        EmployeeList.setClosable(true);
        EmployeeList.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        EmployeeList.setTitle("Employee  List");
        EmployeeList.setVisible(false);

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel46.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel46.setText("Employee List");
        jPanel5.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 432, -1));

        jLabel47.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel47.setText("Search");
        jPanel5.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 32, -1, 27));

        jTextField37.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jTextField37.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField37KeyReleased(evt);
            }
        });
        jPanel5.add(jTextField37, new org.netbeans.lib.awtextra.AbsoluteConstraints(767, 32, 367, -1));

        jButton28.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Search_1.png"))); // NOI18N
        jButton28.setText("Search");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(1152, 31, 130, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 1340, 610));

        javax.swing.GroupLayout EmployeeListLayout = new javax.swing.GroupLayout(EmployeeList.getContentPane());
        EmployeeList.getContentPane().setLayout(EmployeeListLayout);
        EmployeeListLayout.setHorizontalGroup(
            EmployeeListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 1354, Short.MAX_VALUE)
        );
        EmployeeListLayout.setVerticalGroup(
            EmployeeListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
        );

        jDesktopPane1.add(EmployeeList, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 1370, 740));

        AddMedicine.setClosable(true);
        AddMedicine.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        AddMedicine.setTitle("Add Medicine");
        AddMedicine.setVisible(false);
        AddMedicine.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel18.setBackground(new java.awt.Color(255, 204, 204));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel160.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel160.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel160.setText("Add Medicine");
        jPanel18.add(jLabel160, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 1280, 44));

        jLabel161.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel161.setText("Medicine Name");
        jPanel18.add(jLabel161, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        jLabel162.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel162.setText("Medicine Formula");
        jPanel18.add(jLabel162, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, -1));

        jLabel163.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel163.setText("Company Name");
        jPanel18.add(jLabel163, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, -1, -1));

        jLabel164.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel164.setText("Company Address");
        jPanel18.add(jLabel164, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, -1, -1));

        jLabel165.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel165.setText("Company Contact");
        jPanel18.add(jLabel165, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, -1, -1));

        jLabel166.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel166.setText("Supplier Name");
        jPanel18.add(jLabel166, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 530, -1, -1));

        jLabel167.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel167.setText("Supplier Contact");
        jPanel18.add(jLabel167, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 600, -1, -1));

        jLabel168.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel168.setText("Medicine Uses");
        jPanel18.add(jLabel168, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 690, -1, -1));

        jTextField139.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel18.add(jTextField139, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 477, -1));

        jTextField140.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel18.add(jTextField140, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 477, -1));

        jTextField141.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel18.add(jTextField141, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 477, -1));

        jTextField142.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel18.add(jTextField142, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, 477, -1));

        jTextField143.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel18.add(jTextField143, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 430, 477, -1));

        jTextField144.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel18.add(jTextField144, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 510, 477, -1));

        jTextField145.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel18.add(jTextField145, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 590, 477, -1));

        jTextField146.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel18.add(jTextField146, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 680, 477, -1));

        jSeparator13.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel18.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 140, 10, 536));

        jButton51.setBackground(new java.awt.Color(255, 204, 204));
        jButton51.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton51.setText("Submit");
        jButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton51ActionPerformed(evt);
            }
        });
        jPanel18.add(jButton51, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 220, 162, -1));

        jButton52.setBackground(new java.awt.Color(255, 204, 204));
        jButton52.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton52.setText("Reset");
        jButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton52ActionPerformed(evt);
            }
        });
        jPanel18.add(jButton52, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 320, 160, -1));

        jLabel98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/add medicine.jpg"))); // NOI18N
        jPanel18.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 770));

        AddMedicine.getContentPane().add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 770));

        jDesktopPane1.add(AddMedicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 1310, 810));

        SearchupdateMedicine.setClosable(true);
        SearchupdateMedicine.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        SearchupdateMedicine.setMaximizable(true);
        SearchupdateMedicine.setTitle("Search/Update Medicine");
        SearchupdateMedicine.setPreferredSize(new java.awt.Dimension(1401, 850));
        SearchupdateMedicine.setVisible(false);
        SearchupdateMedicine.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel19.setBackground(new java.awt.Color(204, 255, 204));
        jPanel19.setForeground(new java.awt.Color(102, 153, 255));
        jPanel19.setMinimumSize(new java.awt.Dimension(1400, 850));
        jPanel19.setPreferredSize(new java.awt.Dimension(1400, 850));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel170.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel170.setForeground(new java.awt.Color(51, 51, 51));
        jLabel170.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel170.setText("Search update Medicine");
        jPanel19.add(jLabel170, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 1400, 44));

        jLabel171.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel171.setText("Medicine Name");
        jPanel19.add(jLabel171, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 97, -1, -1));

        jLabel172.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel172.setText("Medicine Formula");
        jPanel19.add(jLabel172, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 172, -1, -1));

        jLabel173.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel173.setText("Medicine Company");
        jPanel19.add(jLabel173, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 247, -1, -1));

        jLabel174.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel174.setText("Company Address");
        jPanel19.add(jLabel174, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 326, -1, -1));

        jLabel175.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel175.setText("Company Contact");
        jPanel19.add(jLabel175, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 404, -1, -1));

        jLabel176.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel176.setText("Supplier Name");
        jPanel19.add(jLabel176, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 484, -1, -1));

        jLabel177.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel177.setText("Supplier Contact");
        jPanel19.add(jLabel177, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 561, -1, -1));

        jLabel178.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel178.setText("Medicine Uses");
        jPanel19.add(jLabel178, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 646, -1, -1));

        jLabel179.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel179.setText("Registration Date");
        jPanel19.add(jLabel179, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 719, -1, -1));

        jTextField148.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel19.add(jTextField148, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 477, -1));

        jTextField149.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel19.add(jTextField149, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 477, -1));

        jTextField150.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel19.add(jTextField150, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 477, -1));

        jTextField151.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel19.add(jTextField151, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, 477, -1));

        jTextField152.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel19.add(jTextField152, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 477, -1));

        jTextField153.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel19.add(jTextField153, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 470, 477, -1));

        jTextField154.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel19.add(jTextField154, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 550, 477, -1));

        jTextField155.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel19.add(jTextField155, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 640, 477, -1));

        jSeparator14.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel19.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 97, 10, 536));

        jTextField156.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel19.add(jTextField156, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 710, 477, -1));

        jButton53.setBackground(new java.awt.Color(255, 102, 102));
        jButton53.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton53.setForeground(new java.awt.Color(0, 51, 51));
        jButton53.setText("Search");
        jButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton53ActionPerformed(evt);
            }
        });
        jPanel19.add(jButton53, new org.netbeans.lib.awtextra.AbsoluteConstraints(1064, 173, 150, -1));

        jButton54.setBackground(new java.awt.Color(255, 102, 102));
        jButton54.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton54.setForeground(new java.awt.Color(0, 51, 51));
        jButton54.setText("Update");
        jButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton54ActionPerformed(evt);
            }
        });
        jPanel19.add(jButton54, new org.netbeans.lib.awtextra.AbsoluteConstraints(1062, 275, 150, -1));

        jButton55.setBackground(new java.awt.Color(255, 102, 102));
        jButton55.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton55.setForeground(new java.awt.Color(0, 51, 51));
        jButton55.setText("Delete");
        jButton55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton55ActionPerformed(evt);
            }
        });
        jPanel19.add(jButton55, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 380, 150, -1));

        jButton56.setBackground(new java.awt.Color(255, 102, 102));
        jButton56.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton56.setForeground(new java.awt.Color(0, 51, 51));
        jButton56.setText("Reset");
        jButton56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton56ActionPerformed(evt);
            }
        });
        jPanel19.add(jButton56, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 470, 150, -1));

        jLabel100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/search img1.jpg"))); // NOI18N
        jPanel19.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 790));

        SearchupdateMedicine.getContentPane().add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 814));

        jDesktopPane1.add(SearchupdateMedicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 1300, 820));

        MedicineList.setClosable(true);
        MedicineList.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        MedicineList.setTitle("Medicine List");
        MedicineList.setVisible(false);
        MedicineList.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(102, 204, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Medicine List");
        jLabel18.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel18.setInheritsPopupMenu(false);
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 380, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1490, 600));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Search");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 30, 100, -1));

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, 330, -1));

        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/search.png"))); // NOI18N
        jButton6.setText("Search");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 30, 140, -1));

        MedicineList.getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1511, 704));

        jDesktopPane1.add(MedicineList, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 1510, 740));

        AddStock.setClosable(true);
        AddStock.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        AddStock.setTitle("Add Stock");
        AddStock.setVisible(false);
        AddStock.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 50)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Add Medicine Stock");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1280, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Medicine Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 105, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Medicine Formula");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 184, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("Company Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 270, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setText("Mfd Date");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 355, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setText("Exp Date");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 442, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setText("Price");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 531, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setText("Quantity");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 610, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setText("Reorder Level");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 691, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 105, 454, -1));

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 184, 454, -1));

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 270, 454, -1));

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 355, 454, -1));

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 442, 454, -1));

        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 531, 454, -1));

        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 610, 454, -1));

        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 691, 454, -1));

        jButton15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton15.setText("Add Stock");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 170, 160, -1));

        jButton16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton16.setText("Reset");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 280, 170, -1));

        jLabel99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/add stock.jpg"))); // NOI18N
        jPanel1.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 760));

        AddStock.getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 750));

        jDesktopPane1.add(AddStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 150, 1310, 790));

        UpdateStock.setClosable(true);
        UpdateStock.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        UpdateStock.setTitle("Update Stock");
        UpdateStock.setVisible(false);
        UpdateStock.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 51, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 50)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Update Stock");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 1330, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel13.setText("Medicine Name");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 105, -1, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel14.setText("Medicine Formula");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 184, -1, -1));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel15.setText("Company Name");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 270, -1, -1));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel16.setText("Mfd Date");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 355, -1, -1));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel17.setText("Exp Date");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 442, -1, -1));

        jLabel48.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel48.setText("Price");
        jPanel2.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 531, -1, -1));

        jLabel49.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel49.setText("Quantity");
        jPanel2.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 610, -1, -1));

        jLabel50.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel50.setText("Reorder Level");
        jPanel2.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 691, -1, -1));

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 105, 454, -1));

        jTextField9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 184, 454, -1));

        jTextField10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 270, 454, -1));

        jTextField11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 355, 454, -1));

        jTextField12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 442, 454, -1));

        jTextField13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 531, 454, -1));

        jTextField14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 610, 160, -1));

        jTextField38.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(jTextField38, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 691, 454, -1));

        jButton17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton17.setText("Update Stock");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 170, 160, -1));

        jButton18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton18.setText("Reset");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 280, 170, -1));

        jLabel51.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel51.setText("New Quantity");
        jPanel2.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 610, -1, -1));

        jTextField39.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(jTextField39, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 610, 110, -1));

        UpdateStock.getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1354, 750));

        jDesktopPane1.add(UpdateStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 1370, 780));

        ViewStock.setClosable(true);
        ViewStock.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        ViewStock.setTitle("View Stock");
        ViewStock.setVisible(false);
        ViewStock.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(0, 102, 102));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable3);

        jPanel7.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 1450, 590));

        jLabel52.setFont(new java.awt.Font("Times New Roman", 1, 50)); // NOI18N
        jLabel52.setText("View Stock");
        jPanel7.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jLabel53.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel53.setText("Enter Medicine Name");
        jPanel7.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, -1, -1));

        jTextField40.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField40.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField40KeyReleased(evt);
            }
        });
        jPanel7.add(jTextField40, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 50, 330, -1));

        jButton19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/search.png"))); // NOI18N
        jButton19.setText("Search");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 50, 140, -1));

        ViewStock.getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1470, 718));

        jDesktopPane1.add(ViewStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 1490, 750));

        GenerateBill.setClosable(true);
        GenerateBill.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        GenerateBill.setTitle("Generate Bill");
        GenerateBill.setVisible(false);

        jPanel8.setBackground(new java.awt.Color(255, 204, 204));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel54.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("Generate Invoice");
        jPanel8.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 1330, -1));
        jPanel8.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, 280, 10));

        jLabel55.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel55.setText("Medicine Name");
        jPanel8.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 116, -1, -1));

        jLabel56.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel56.setText("Formula");
        jPanel8.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 191, -1, -1));

        jLabel57.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel57.setText("Company Name");
        jPanel8.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 269, -1, -1));

        jLabel58.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel58.setText("Mfd date");
        jPanel8.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 346, -1, -1));

        jLabel59.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel59.setText("Exp Date");
        jPanel8.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 419, -1, -1));

        jLabel60.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel60.setText("Avl . Quantity");
        jPanel8.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 494, -1, -1));

        jLabel61.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel61.setText("Price/Unit");
        jPanel8.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 576, -1, -1));

        jLabel62.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel62.setText("Quantity");
        jPanel8.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 660, -1, -1));

        jComboBox3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel8.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 118, 363, -1));

        jTextField41.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel8.add(jTextField41, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 193, 363, -1));

        jTextField42.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel8.add(jTextField42, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 269, 363, -1));

        jTextField43.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel8.add(jTextField43, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 346, 363, -1));

        jTextField44.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel8.add(jTextField44, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 419, 363, -1));

        jTextField45.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel8.add(jTextField45, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 494, 363, -1));

        jTextField46.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel8.add(jTextField46, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 576, 363, -1));

        jTextField47.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel8.add(jTextField47, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 660, 363, -1));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jTable4);

        jPanel8.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 110, 590, 360));

        jButton30.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton30.setText("Add Cart");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 690, 170, -1));

        jButton31.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton31.setText("Generate Invoice");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 690, -1, -1));

        jButton32.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton32.setText("Reset");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 690, 160, -1));

        jPanel9.setBackground(new java.awt.Color(255, 153, 153));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel63.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel63.setText("Customer Name");
        jPanel9.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 20, -1, -1));

        jTextField48.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel9.add(jTextField48, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 20, 273, -1));

        jLabel68.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel68.setText("Mobile Number");
        jPanel9.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 66, -1, -1));

        jTextField49.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel9.add(jTextField49, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 68, 273, -1));

        jLabel69.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel69.setText("Refered By");
        jPanel9.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 140, -1));

        jTextField50.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel9.add(jTextField50, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 280, -1));

        jPanel8.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 500, 580, 160));

        javax.swing.GroupLayout GenerateBillLayout = new javax.swing.GroupLayout(GenerateBill.getContentPane());
        GenerateBill.getContentPane().setLayout(GenerateBillLayout);
        GenerateBillLayout.setHorizontalGroup(
            GenerateBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 1418, Short.MAX_VALUE)
        );
        GenerateBillLayout.setVerticalGroup(
            GenerateBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
        );

        jDesktopPane1.add(GenerateBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 1370, 790));

        Invoice.setClosable(true);
        Invoice.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        Invoice.setTitle("Bill Details");
        Invoice.setToolTipText("");
        Invoice.setVisible(false);
        Invoice.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel70.setFont(new java.awt.Font("Vivaldi", 1, 48)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(255, 51, 102));
        jLabel70.setText("MediPlus");
        jPanel10.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 13, 226, -1));

        jLabel71.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 102, 153));
        jLabel71.setText(" Sale Invoice ");
        jPanel10.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 30, 220, -1));
        jPanel10.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 91, 1327, 14));
        jPanel10.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 247, 1327, 13));

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(jTable5);

        jPanel10.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 1300, 281));

        jLabel72.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel72.setText("Customer Name");
        jPanel10.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 123, -1, -1));

        jLabel73.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel73.setText("Contact Number");
        jPanel10.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 178, -1, -1));

        jLabel74.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel74.setText("Date");
        jPanel10.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(807, 123, 105, -1));

        jLabel75.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel75.setText("Refered By");
        jPanel10.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(807, 178, -1, -1));

        jLabel80.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel80.setText("jLabel80");
        jPanel10.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 123, 215, -1));

        jLabel81.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel81.setText("jLabel81");
        jPanel10.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 178, 215, -1));

        jLabel82.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel82.setText("jLabel82");
        jPanel10.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(1004, 123, 234, -1));

        jLabel83.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel83.setText("jLabel83");
        jPanel10.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(1004, 178, 234, -1));

        jLabel84.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel84.setText("Net Amount");
        jPanel10.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(674, 577, -1, -1));

        jLabel85.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel85.setText("Discount");
        jPanel10.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(674, 643, -1, -1));

        jLabel86.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel86.setText("Payable Amount");
        jPanel10.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(674, 718, -1, -1));
        jPanel10.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(674, 690, 458, 10));
        jPanel10.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(674, 760, 458, 10));

        jLabel87.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel87.setText("jLabel87");
        jPanel10.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(933, 588, 199, -1));

        jLabel89.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel89.setText("jLabel89");
        jPanel10.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(933, 718, 199, -1));

        jLabel90.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel90.setText("jLabel88");
        jPanel10.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(933, 654, 190, -1));

        jButton33.setBackground(new java.awt.Color(153, 153, 255));
        jButton33.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton33.setForeground(new java.awt.Color(255, 51, 51));
        jButton33.setText("Print Bill");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 620, 140, 50));

        Invoice.getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 780));

        jDesktopPane1.add(Invoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 1380, 820));

        ViewInvoice.setClosable(true);
        ViewInvoice.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        ViewInvoice.setTitle("View Invoice");
        ViewInvoice.setVisible(false);
        ViewInvoice.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(153, 153, 255));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel88.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel88.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel88.setText("View Invoice");
        jPanel13.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 13, 1330, -1));

        jLabel91.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel91.setText("Enter Mobile Number");
        jPanel13.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 150, -1, -1));

        jTextField51.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel13.add(jTextField51, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 152, 435, -1));

        jButton12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/search.png"))); // NOI18N
        jButton12.setText("Search");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(935, 151, 180, -1));

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane6.setViewportView(jTable6);

        jPanel13.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 228, 754, 418));

        jLabel92.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel92.setText("Enter Bill Number");
        jPanel13.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 280, -1, -1));

        jTextField53.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel13.add(jTextField53, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 330, 272, -1));

        jButton36.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton36.setText("View Invoice");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton36, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 390, 200, -1));

        ViewInvoice.getContentPane().add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 0, 1200, 710));

        jDesktopPane1.add(ViewInvoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 1220, 750));

        ViewReorderList.setClosable(true);
        ViewReorderList.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        ViewReorderList.setTitle("View Reorder List");
        ViewReorderList.setToolTipText("");
        ViewReorderList.setVisible(false);
        ViewReorderList.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel14.setBackground(new java.awt.Color(0, 153, 153));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel93.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(255, 255, 255));
        jLabel93.setText("View Reorder List");
        jPanel14.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 29, 510, -1));

        jLabel94.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(255, 255, 255));
        jLabel94.setText("Search");
        jPanel14.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, 95, -1));

        jTextField54.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField54.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField54KeyReleased(evt);
            }
        });
        jPanel14.add(jTextField54, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 50, 441, -1));

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane7.setViewportView(jTable7);

        jPanel14.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 1340, 570));

        ViewReorderList.getContentPane().add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 720));

        jDesktopPane1.add(ViewReorderList, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 1380, 750));

        SaleReport.setClosable(true);
        SaleReport.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        SaleReport.setTitle("Sale Report");
        SaleReport.setVisible(false);
        SaleReport.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel16.setBackground(new java.awt.Color(51, 0, 51));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel95.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(255, 255, 255));
        jLabel95.setText("Sale Report");
        jPanel16.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 42, 260, -1));

        jLabel96.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(255, 255, 255));
        jLabel96.setText("Search");
        jPanel16.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(788, 58, 100, -1));

        jTextField55.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField55.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField55KeyReleased(evt);
            }
        });
        jPanel16.add(jTextField55, new org.netbeans.lib.awtextra.AbsoluteConstraints(928, 66, 324, -1));

        jTable8.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane8.setViewportView(jTable8);

        jPanel16.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 1320, 560));

        SaleReport.getContentPane().add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 704));

        jDesktopPane1.add(SaleReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 1370, 740));

        ChangePassword.setClosable(true);
        ChangePassword.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        ChangePassword.setTitle("Change Password");
        ChangePassword.setVisible(false);

        jPanel11.setBackground(new java.awt.Color(153, 204, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel64.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel64.setText("Change Password");
        jPanel11.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));
        jPanel11.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 360, 30));

        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel65.setText("Old Password");
        jPanel11.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        jLabel66.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel66.setText("New Password");
        jPanel11.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        jLabel67.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel67.setText("Confirm Password");
        jPanel11.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, -1));

        jPanel12.setBackground(new java.awt.Color(255, 204, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton34.setBackground(new java.awt.Color(255, 153, 255));
        jButton34.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton34.setForeground(new java.awt.Color(255, 102, 102));
        jButton34.setText("Submit");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jButton35.setBackground(new java.awt.Color(255, 204, 204));
        jButton35.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton35.setForeground(new java.awt.Color(153, 153, 255));
        jButton35.setText("Reset");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton35, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jPanel11.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 180, 180, 210));

        jPasswordField2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel11.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 380, -1));

        jPasswordField3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel11.add(jPasswordField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 380, -1));

        jPasswordField4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel11.add(jPasswordField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 380, -1));

        ChangePassword.getContentPane().add(jPanel11, java.awt.BorderLayout.CENTER);

        jDesktopPane1.add(ChangePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 1010, 500));

        CreateAccount2.setBackground(new java.awt.Color(255, 255, 255));
        CreateAccount2.setClosable(true);
        CreateAccount2.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        CreateAccount2.setTitle("Create Account");
        CreateAccount2.setVisible(false);

        jPanel15.setBackground(new java.awt.Color(153, 153, 255));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel76.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel76.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel76.setText("Create Account");
        jPanel15.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 960, -1));

        jLabel77.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(255, 255, 255));
        jLabel77.setText("User Name");
        jPanel15.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, 20));

        jLabel78.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(255, 255, 255));
        jLabel78.setText("Password");
        jPanel15.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, -1, -1));

        jLabel79.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(255, 255, 255));
        jLabel79.setText("Confirm Password");
        jPanel15.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, -1, -1));

        jTextField52.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel15.add(jTextField52, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 419, -1));

        jButton38.setBackground(new java.awt.Color(255, 153, 153));
        jButton38.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton38.setForeground(new java.awt.Color(102, 102, 255));
        jButton38.setText("Submit");
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton38, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 140, -1));

        jButton39.setBackground(new java.awt.Color(255, 153, 153));
        jButton39.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton39.setForeground(new java.awt.Color(102, 102, 255));
        jButton39.setText("Reset");
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton39, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 460, 180, -1));

        jPasswordField5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel15.add(jPasswordField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 419, -1));

        jPasswordField6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel15.add(jPasswordField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 419, -1));

        CreateAccount2.getContentPane().add(jPanel15, java.awt.BorderLayout.CENTER);

        jDesktopPane1.add(CreateAccount2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 960, 690));

        Print_bill.setClosable(true);
        Print_bill.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        Print_bill.setTitle("print_bill");
        Print_bill.setVisible(false);
        Print_bill.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel17.setBackground(new java.awt.Color(255, 204, 204));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton37.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/gnome_stock_data_next_16.png"))); // NOI18N
        jButton37.setText("Print");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });
        jPanel17.add(jButton37, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, 130, -1));

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel103.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel103.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel103.setText("Medicine Bill");
        jPanel20.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 550, -1));

        jLabel116.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel116.setText("********************************************************************");
        jPanel20.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 550, 10));

        jLabel101.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel101.setText("Customer Name");
        jPanel20.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 118, 180, 20));

        jLabel102.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel102.setText("jLabel102");
        jPanel20.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 270, -1));

        jLabel104.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel104.setText("Contact number");
        jPanel20.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 180, -1));

        jLabel110.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel110.setText("jLabel110");
        jPanel20.add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 270, 20));

        jLabel105.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel105.setText("Date ");
        jPanel20.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        jLabel111.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel111.setText("jLabel111");
        jPanel20.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 270, -1));

        jLabel106.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel106.setText("Refered By");
        jPanel20.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 120, 30));

        jLabel112.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel112.setText("jLabel112");
        jPanel20.add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 270, -1));

        jLabel107.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel107.setText("Total Amount");
        jPanel20.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 150, -1));

        jLabel113.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel113.setText("jLabel113");
        jPanel20.add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 270, -1));

        jLabel108.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel108.setText("Discount");
        jPanel20.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 140, 30));

        jLabel114.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel114.setText("jLabel114");
        jPanel20.add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, 270, -1));

        jLabel109.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel109.setText("Payable Amount");
        jPanel20.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 180, -1));

        jLabel115.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel115.setText("jLabel115");
        jPanel20.add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, 270, -1));

        jLabel117.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel117.setText("*********************************************************************");
        jPanel20.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 85, 560, 10));

        jPanel17.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 570, 550));

        Print_bill.getContentPane().add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 570));

        jDesktopPane1.add(Print_bill, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 760, 600));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/imf.jpeg"))); // NOI18N
        jDesktopPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1120));

        jMenu6.setText("Employee");

        jMenuItem14.setText("Add Employee");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem14);

        jMenuItem15.setText("Search/Update/Emp");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem15);

        jMenuItem16.setText("Employee List");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem16);

        jMenuBar1.add(jMenu6);

        jMenu1.setText("Product");

        jMenuItem1.setText("Add Medicine");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Search Update Medicine");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Medicine List");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Stock");

        jMenuItem4.setText("Add New Stock");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Update Stock");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("View Stock");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Bill__details");

        jMenuItem10.setText("Generate Bill");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem10);

        jMenuBar1.add(jMenu4);

        jMenu7.setText("Reports");

        jMenuItem17.setText("View Invoice");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem17);

        jMenuItem18.setText("Reorder List");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem18);

        jMenuItem19.setText("Sale Report");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem19);

        jMenuBar1.add(jMenu7);

        jMenu5.setText("Account");
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });

        jMenuItem12.setText("Change Password");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem12);

        jMenuItem7.setText("Create Account");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem7);

        jMenuItem13.setText("Logout");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem13);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

        // Code For Medicine List
        try {
            Vector<String> header = new Vector<String>();
            Vector<Vector<String>> data = new Vector<Vector<String>>();

            header.add("Medicine Name");
            header.add("Medicine Formula");
            header.add("Medicine Company");
            header.add("Company Address");
            header.add("Company Contact");
            header.add("Supplier Name");
            header.add("Supplier Contact");
            header.add("Medicine Purpose");
            header.add("Registration Date");

            DBConnection db = new DBConnection();
            db.pstmt = db.con.prepareStatement("select * from product");
            db.rst = db.pstmt.executeQuery();
            while (db.rst.next()) {
                Vector<String> temp = new Vector<String>();
                temp.add(db.rst.getString(1));
                temp.add(db.rst.getString(2));
                temp.add(db.rst.getString(3));
                temp.add(db.rst.getString(4));
                temp.add(db.rst.getString(5));
                temp.add(db.rst.getString(6));
                temp.add(db.rst.getString(7));
                temp.add(db.rst.getString(8));
                temp.add(db.rst.getString(9));

                data.add(temp);
            }
            jTable1.setModel(new DefaultTableModel(data, header));
            MedicineList.setVisible(true);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // Code For Logout 
        int a = JOptionPane.showConfirmDialog(this, "Do You Want to Logout", "select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            this.setVisible(false);
        }
        new Login_Page().setVisible(true);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        // Code For Link Add Medicine
        AddMedicine.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // Code For Link in toolbar Add Employee
        AddEmployee.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        // Code For link SearchupdateEmployee
        SearchUpdateEmp.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        // Code for Link SearchupdateMedicine
        SearchupdateMedicine.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        // Code For Employee List ToolBar
        try {
            EmployeeList.setVisible(true);
            Vector<String> header = new Vector<String>();
            Vector<Vector<String>> data = new Vector<Vector<String>>();
            header.add("Emp. Code");
            header.add("Emp. Name");
            header.add("date of Birth");
            header.add("Gender");
            header.add("Qualification");
            header.add("Address");
            header.add("Contact");
            header.add("Email");
            header.add("Id Name");
            header.add("Id Number");
            header.add("User Name");
            header.add("Date of Joining");
            DBConnection db = new DBConnection();
            db.pstmt = db.con.prepareStatement("select * from emp_mstr");
            db.rst = db.pstmt.executeQuery();
            while (db.rst.next()) {
                Vector<String> temp = new Vector<String>();
                temp.add(db.rst.getString(1));
                temp.add(db.rst.getString(2));
                temp.add(db.rst.getString(3));
                temp.add(db.rst.getString(4));
                temp.add(db.rst.getString(5));
                temp.add(db.rst.getString(6));
                temp.add(db.rst.getString(7));
                temp.add(db.rst.getString(8));
                temp.add(db.rst.getString(9));
                temp.add(db.rst.getString(10));
                temp.add(db.rst.getString(11));
                temp.add(db.rst.getString(12));
                data.add(temp);
            }
            jTable2.setModel(new DefaultTableModel(data, header));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // Code For Reset button
        jTextField15.setText("");
        jTextField16.setText("");
        jTextField17.setText("");
        jTextField18.setText("");
        jTextField19.setText("");
        jTextField20.setText("");
        jTextField21.setText("");
        jTextField22.setText("");
        jTextField23.setText("");
        jTextField25.setText("");
        jPasswordField1.setText("");


    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed

        // Code For Submit Button Add Employee
        try {
            DBConnection db = new DBConnection();
            db.pstmt = db.con.prepareStatement("INSERT INTO emp_mstr(ecode,ename,edob,egen,equal,eaddr,econt,email,id_name,id_number,user,doj) VALUES(?,?,?,?,?,?,?,?,?,?,?,CURDATE())");
            String gen = "";
            if (jRadioButton1.isSelected()) {
                gen = "Male";
                jRadioButton2.setVisible(false);
            }
            if (jRadioButton2.isSelected()) {
                gen = "Female";
                jRadioButton1.setVisible(false);
            }
            db.pstmt.setString(1, jTextField15.getText());
            db.pstmt.setString(2, jTextField16.getText());
            db.pstmt.setString(3, jTextField17.getText());
            db.pstmt.setString(4, gen);
            db.pstmt.setString(5, jTextField18.getText());
            db.pstmt.setString(6, jTextField19.getText());
            db.pstmt.setString(7, jTextField20.getText());
            db.pstmt.setString(8, jTextField21.getText());
            db.pstmt.setString(9, jTextField22.getText());
            db.pstmt.setString(10, jTextField23.getText());
            db.pstmt.setString(11, jTextField25.getText());
            int i1 = db.pstmt.executeUpdate();
            db.pstmt = db.con.prepareStatement("INSERT INTO login (user_id,password,utype,ac_status) VALUES(?,?,'Employee','1')");
            db.pstmt.setString(1, jTextField25.getText());
            db.pstmt.setString(2, jPasswordField1.getText());

            int i2 = db.pstmt.executeUpdate();

            if (i1 > 0 && i2 > 0) {
                JOptionPane.showMessageDialog(this, "Employee Registration Sucessfully");
                jTextField15.setText("");
                jTextField16.setText("");
                jTextField17.setText("");
                jTextField18.setText("");
                jTextField19.setText("");
                jTextField20.setText("");
                jTextField21.setText("");
                jTextField22.setText("");
                jTextField23.setText("");
                jTextField25.setText("");
                jPasswordField1.setText("");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e);

        }
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed

        // Code For Link Add Employee
        AddEmployee.setVisible(true);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed

        // Code For update Employee
        try {
            String code = jTextField26.getText();
            String name = jTextField27.getText();
            String dob = jTextField28.getText();
            String gen = "";
            if (jRadioButton3.isSelected()) {
                gen = "Male";
            }
            if (jRadioButton4.isSelected()) {
                gen = "Female";
            }
            String qual = jTextField29.getText();
            String addr = jTextField30.getText();
            String cont = jTextField31.getText();
            String mail = jTextField32.getText();
            String id = jTextField33.getText();
            String idnum = jTextField34.getText();

            DBConnection db = new DBConnection();
            db.pstmt = db.con.prepareStatement("UPDATE emp_mstr SET ename=?,edob=?,egen=?,equal=?,eaddr=?,econt=?,email=?,id_name=?,id_number=? WHERE ecode=?");
            db.pstmt.setString(1, name);
            db.pstmt.setString(2, dob);
            db.pstmt.setString(3, gen);
            db.pstmt.setString(4, qual);
            db.pstmt.setString(5, addr);
            db.pstmt.setString(6, cont);
            db.pstmt.setString(7, mail);
            db.pstmt.setString(8, id);
            db.pstmt.setString(9, idnum);
            db.pstmt.setString(10, code);

            int i = db.pstmt.executeUpdate();

            if (i > 0) {
                JOptionPane.showMessageDialog(this, "Update Sucessfully");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showConfirmDialog(this, e);
        }
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed

        // Code For Reset button Search Employee
        jTextField26.setText("");
        jTextField27.setText("");
        jTextField28.setText("");
        jTextField29.setText("");
        jTextField30.setText("");
        jTextField31.setText("");
        jTextField32.setText("");
        jTextField33.setText("");
        jTextField34.setText("");
        jTextField35.setText("");
        jTextField36.setText("");

    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed

        // Code For Search Employee
        try {
            String code = jTextField26.getText();
            String user = jTextField36.getText();
            DBConnection db = new DBConnection();
            db.pstmt = db.con.prepareStatement("select * from emp_mstr where ecode=? or user=?");
            db.pstmt.setString(1, code);
            db.pstmt.setString(2, user);

            db.rst = db.pstmt.executeQuery();
            if (db.rst.next()) {
                jTextField26.setText(db.rst.getString(1));
                jTextField27.setText(db.rst.getString(2));
                jTextField28.setText(db.rst.getString(3));
                String gen = db.rst.getString(4);
                if (gen.equals("Male")) {
                    jRadioButton3.setSelected(true);
                }
                if (gen.equals("Female")) {
                    jRadioButton4.setSelected(true);
                }
                jTextField29.setText(db.rst.getString(5));
                jTextField30.setText(db.rst.getString(6));
                jTextField31.setText(db.rst.getString(7));
                jTextField32.setText(db.rst.getString(8));
                jTextField33.setText(db.rst.getString(9));
                jTextField34.setText(db.rst.getString(10));
                jTextField36.setText(db.rst.getString(11));
                jTextField35.setText(db.rst.getString(12));
                jTextField35.setEditable(false);
//               jTextField36.setEditable(false);
            } else {
                JOptionPane.showMessageDialog(this, "Record Not Found");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed

        // Code For Link Search Employee in MenuItem
        SearchUpdateEmp.setVisible(true);
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed

        // Code For Block Account
        try {
            String user = jTextField36.getText();
            DBConnection db = new DBConnection();
            db.pstmt = db.con.prepareStatement("UPDATE login SET ac_status='0' WHERE user_id=?");
            db.pstmt.setString(1, user);
            int i1 = db.pstmt.executeUpdate();
            db.pstmt = db.con.prepareStatement("UPDATE emp_mstr SET dol=CURDATE() WHERE USER=?");
            db.pstmt.setString(1, user);
            int i2 = db.pstmt.executeUpdate();

            if (i1 > 0 && i2 > 0) {
                JOptionPane.showMessageDialog(this, "Account Blocked Sucessfully");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e);
        }

    }//GEN-LAST:event_jButton27ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed

        // Code For Employee List
        try {
            EmployeeList.setVisible(true);
            Vector<String> header = new Vector<String>();
            Vector<Vector<String>> data = new Vector<Vector<String>>();
            header.add("Emp. Code");
            header.add("Emp. Name");
            header.add("date of Birth");
            header.add("Gender");
            header.add("Qualification");
            header.add("Address");
            header.add("Contact");
            header.add("EMail");
            header.add("Id Name");
            header.add("Id Number");
            header.add("User Name");
            header.add("Date of Joining");
            DBConnection db = new DBConnection();
            db.pstmt = db.con.prepareStatement("select * from emp_mstr");
            db.rst = db.pstmt.executeQuery();
            while (db.rst.next()) {
                Vector<String> temp = new Vector<String>();
                temp.add(db.rst.getString(1));
                temp.add(db.rst.getString(2));
                temp.add(db.rst.getString(3));
                temp.add(db.rst.getString(4));
                temp.add(db.rst.getString(5));
                temp.add(db.rst.getString(6));
                temp.add(db.rst.getString(7));
                temp.add(db.rst.getString(8));
                temp.add(db.rst.getString(9));
                temp.add(db.rst.getString(10));
                temp.add(db.rst.getString(11));
                temp.add(db.rst.getString(12));
                data.add(temp);
            }
            jTable2.setModel(new DefaultTableModel(data, header));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed

        // Code For Search button Employee List
        try {
            Vector<String> header = new Vector<String>();
            Vector<Vector<String>> data = new Vector<Vector<String>>();
            header.add("Emp. Code");
            header.add("Emp. Name");
            header.add("date of Birth");
            header.add("Gender");
            header.add("Qualification");
            header.add("Address");
            header.add("Contact");
            header.add("EMail");
            header.add("Id Name");
            header.add("Id Number");
            header.add("User Name");
            header.add("Date of Joining");
            String key = jTextField37.getText();
            DBConnection db = new DBConnection();
            db.pstmt = db.con.prepareStatement("select * from emp_mstr where ecode=? or ename=? or edob=?");
            db.pstmt.setString(1, key);
            db.pstmt.setString(2, key);
            db.pstmt.setString(3, key);

            db.rst = db.pstmt.executeQuery();
            while (db.rst.next()) {
                Vector<String> temp = new Vector<String>();
                temp.add(db.rst.getString(1));
                temp.add(db.rst.getString(2));
                temp.add(db.rst.getString(3));
                temp.add(db.rst.getString(4));
                temp.add(db.rst.getString(5));
                temp.add(db.rst.getString(6));
                temp.add(db.rst.getString(7));
                temp.add(db.rst.getString(8));
                temp.add(db.rst.getString(9));
                temp.add(db.rst.getString(10));
                temp.add(db.rst.getString(11));
                temp.add(db.rst.getString(12));
                data.add(temp);
            }
            jTable2.setModel(new DefaultTableModel(data, header));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton52ActionPerformed

        // Code For reset button 
        jTextField139.setText("");
        jTextField140.setText("");
        jTextField141.setText("");
        jTextField142.setText("");
        jTextField143.setText("");
        jTextField144.setText("");
        jTextField145.setText("");
        jTextField146.setText("");

    }//GEN-LAST:event_jButton52ActionPerformed

    private void jButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton51ActionPerformed

        // Code For Add Medicine Submit Button
        try {
            DBConnection db = new DBConnection();
            db.pstmt = db.con.prepareStatement("INSERT INTO product(med_name,med_formula,med_company,comp_add,comp_contact,vend_name,vend_contact,med_use,reg_date) VALUES(?,?,?,?,?,?,?,?,CURDATE())");
            db.pstmt.setString(1, jTextField139.getText());
            db.pstmt.setString(2, jTextField140.getText());
            db.pstmt.setString(3, jTextField141.getText());
            db.pstmt.setString(4, jTextField142.getText());
            db.pstmt.setString(5, jTextField143.getText());
            db.pstmt.setString(6, jTextField144.getText());
            db.pstmt.setString(7, jTextField145.getText());
            db.pstmt.setString(8, jTextField146.getText());

            int i = db.pstmt.executeUpdate();
            if (i > 0) {
                JOptionPane.showMessageDialog(this, "Medicine Added Sucessfully");
                jTextField139.setText("");
                jTextField140.setText("");
                jTextField141.setText("");
                jTextField142.setText("");
                jTextField143.setText("");
                jTextField144.setText("");
                jTextField145.setText("");
                jTextField146.setText("");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e);
        }

    }//GEN-LAST:event_jButton51ActionPerformed

    private void jButton53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton53ActionPerformed

        // Code For Search Medicine Button
        try {
            String med_name = jTextField148.getText();
            DBConnection db = new DBConnection();
            db.pstmt = db.con.prepareStatement("select * from product where med_name=?");
            db.pstmt.setString(1, med_name);
            db.rst = db.pstmt.executeQuery();
            if (db.rst.next()) {
                jTextField149.setText(db.rst.getString(2));
                jTextField150.setText(db.rst.getString(3));
                jTextField151.setText(db.rst.getString(4));
                jTextField152.setText(db.rst.getString(5));
                jTextField153.setText(db.rst.getString(6));
                jTextField154.setText(db.rst.getString(7));
                jTextField155.setText(db.rst.getString(8));
                jTextField156.setText(db.rst.getString(9));
                jTextField156.setEditable(false);
            } else {
                JOptionPane.showMessageDialog(this, "Record Not Found");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jButton53ActionPerformed

    private void jButton54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton54ActionPerformed

        // Code For Update Medicine button
        try {
            DBConnection db = new DBConnection();
            db.pstmt = db.con.prepareStatement("UPDATE product SET med_formula=?,med_company=?,comp_add=?,comp_contact=?,vend_name=?,vend_contact=?,med_use=? WHERE med_name=?");
            db.pstmt.setString(1, jTextField149.getText());
            db.pstmt.setString(2, jTextField150.getText());
            db.pstmt.setString(3, jTextField151.getText());
            db.pstmt.setString(4, jTextField152.getText());
            db.pstmt.setString(5, jTextField153.getText());
            db.pstmt.setString(6, jTextField154.getText());
            db.pstmt.setString(7, jTextField155.getText());
            db.pstmt.setString(8, jTextField148.getText());

            int i = db.pstmt.executeUpdate();
            if (i > 0) {
                JOptionPane.showMessageDialog(this, "Record Update Sucessfully");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jButton54ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        // Code For Link Add Medicine ToolBar
        AddMedicine.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        // Code For link SearchUpdateMedicine toolBar
        SearchupdateMedicine.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton55ActionPerformed

        // Code For Delete medicine 
        try {
            DBConnection db = new DBConnection();
            db.pstmt = db.con.prepareStatement("delete from product where med_name=?");
            db.pstmt.setString(1, jTextField148.getText());

            int i = db.pstmt.executeUpdate();

            if (i > 0) {
                JOptionPane.showMessageDialog(this, "Record Delete Sucessfully");
                jTextField148.setText("");
                jTextField149.setText("");
                jTextField150.setText("");
                jTextField151.setText("");
                jTextField152.setText("");
                jTextField153.setText("");
                jTextField154.setText("");
                jTextField155.setText("");
                jTextField156.setText("");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jButton55ActionPerformed

    private void jButton56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton56ActionPerformed

        // Code For Reset button Search Medicine
        jTextField148.setText("");
        jTextField149.setText("");
        jTextField150.setText("");
        jTextField151.setText("");
        jTextField152.setText("");
        jTextField153.setText("");
        jTextField154.setText("");
        jTextField155.setText("");
        jTextField156.setText("");
    }//GEN-LAST:event_jButton56ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        // Code For Medicine list tool bar
        try {
            Vector<String> header = new Vector<String>();
            Vector<Vector<String>> data = new Vector<Vector<String>>();

            header.add("Medicine Name");
            header.add("Medicine Formula");
            header.add("Medicine Company");
            header.add("Company Address");
            header.add("Company Contact");
            header.add("Supplier Name");
            header.add("Suppiler Contact");
            header.add("Medicine Purpose");
            header.add("Registration Date");

            DBConnection db = new DBConnection();
            db.pstmt = db.con.prepareStatement("select * from product");
            db.rst = db.pstmt.executeQuery();
            while (db.rst.next()) {
                Vector<String> temp = new Vector<String>();
                temp.add(db.rst.getString(1));
                temp.add(db.rst.getString(2));
                temp.add(db.rst.getString(3));
                temp.add(db.rst.getString(4));
                temp.add(db.rst.getString(5));
                temp.add(db.rst.getString(6));
                temp.add(db.rst.getString(7));
                temp.add(db.rst.getString(8));
                temp.add(db.rst.getString(9));

                data.add(temp);
            }
            jTable1.setModel(new DefaultTableModel(data, header));
            MedicineList.setVisible(true);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        // Code For Search button Medicine List table
        try {
            Vector<String> header = new Vector<String>();
            Vector<Vector<String>> data = new Vector<Vector<String>>();

            header.add("Medicine Name");
            header.add("Medicine Formula");
            header.add("Company Name");
            header.add("Company Address");
            header.add("Company Contact");
            header.add("Supplier Name");
            header.add("Suppiler Contact");
            header.add("Medicine Purpose");
            header.add("Registration Date");

            String ket = jTextField1.getText();

            DBConnection db = new DBConnection();
            db.pstmt = db.con.prepareStatement("select * from product where med_name=? or med_company=?");
            db.pstmt.setString(1, ket);
            db.pstmt.setString(2, ket);

            db.rst = db.pstmt.executeQuery();
            while (db.rst.next()) {
                Vector<String> temp = new Vector<String>();
                temp.add(db.rst.getString(1));
                temp.add(db.rst.getString(2));
                temp.add(db.rst.getString(3));
                temp.add(db.rst.getString(4));
                temp.add(db.rst.getString(5));
                temp.add(db.rst.getString(6));
                temp.add(db.rst.getString(7));
                temp.add(db.rst.getString(8));
                temp.add(db.rst.getString(9));

                data.add(temp);
            }
            jTable1.setModel(new DefaultTableModel(data, header));
            MedicineList.setVisible(true);

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e);
        }

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed

        // Code For display medicne name in combo box which are not added in stock
        try {
            DBConnection db = new DBConnection();
            db.pstmt = db.con.prepareStatement("select med_name from product");
            db.rst = db.pstmt.executeQuery();
            jComboBox1.removeAllItems();
            jComboBox1.addItem("Select Medicine Name");
            while (db.rst.next()) {
                String mname = db.rst.getString(1);
                java.sql.PreparedStatement ps = db.con.prepareStatement("select * from stock where med_name=?");
                ps.setString(1, mname);
                java.sql.ResultSet rs = ps.executeQuery();
                if (!rs.next()) {
                    jComboBox1.addItem(mname);
                }
            }
            AddStock.setVisible(true);

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

        // code for display medicine name in ComboBox 
        try {
            DBConnection db = new DBConnection();
            db.pstmt = db.con.prepareStatement("select med_name from product");
            db.rst = db.pstmt.executeQuery();
            jComboBox1.removeAllItems();
            jComboBox1.addItem("select Medicine Name");
            while (db.rst.next()) {
                String mname = db.rst.getString(1);
                java.sql.PreparedStatement ps = db.con.prepareStatement("select * from stock where med_name=?");
                ps.setString(1, mname);
                java.sql.ResultSet rs = ps.executeQuery();
                if (!rs.next()) {
                    jComboBox1.addItem(mname);
                }
            }
            AddStock.setVisible(true);

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e);
        }

    }//GEN-LAST:event_jButton9ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

        // Display Medicine Details
        try {
            String mname = jComboBox1.getSelectedItem().toString();
            DBConnection db = new DBConnection();
            db.pstmt = db.con.prepareStatement("select med_formula,med_company from product where med_name=?");
            db.pstmt.setString(1, mname);
            db.rst = db.pstmt.executeQuery();
            if (db.rst.next()) {
                jTextField2.setText(db.rst.getString(1));
                jTextField3.setText(db.rst.getString(2));
            }
        } catch (Exception e) {
            e.printStackTrace();
//            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed

        // Code For Add Stock Submit Button
        try {
            String mname = jComboBox1.getSelectedItem().toString();
            String mfddate = jTextField4.getText();
            String expdate = jTextField5.getText();
            String price = jTextField6.getText();
            String qult = jTextField7.getText();
            String reorder = jTextField8.getText();

            DBConnection db = new DBConnection();
            db.pstmt = db.con.prepareStatement("insert into stock (med_name,mfd_date,exp_date,price,dsc,qult,reorder) values(?,?,?,?,'10',?,?)");
            db.pstmt.setString(1, mname);
            db.pstmt.setString(2, mfddate);
            db.pstmt.setString(3, expdate);
            db.pstmt.setString(4, price);
            db.pstmt.setString(5, qult);
            db.pstmt.setString(6, reorder);

            int i = db.pstmt.executeUpdate();
            if (i > 0) {
                JOptionPane.showMessageDialog(this, "Stock added Sucessfully");
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
                jTextField5.setText("");
                jTextField6.setText("");
                jTextField7.setText("");
                jTextField8.setText("");
                jComboBox1.removeItem(mname);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed

        // Code For Reset
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jComboBox1.removeItem("");
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed

        //Code For how medicine in jcombobox 
        try {
            String mname = jComboBox2.getSelectedItem().toString();
            DBConnection db = new DBConnection();
            db.pstmt = db.con.prepareStatement("select product.med_formula,product.med_company,stock.mfd_date,stock.exp_date,stock.price,stock.qult,stock.reorder from stock,product where product.med_name=stock.med_name and stock.med_name=?");
            db.pstmt.setString(1, mname);
            db.rst = db.pstmt.executeQuery();
            if (db.rst.next()) {
                jTextField9.setText(db.rst.getString(1));
                jTextField10.setText(db.rst.getString(2));
                jTextField11.setText(db.rst.getString(3));
                jTextField12.setText(db.rst.getString(4));
                jTextField13.setText(db.rst.getString(5));
                jTextField14.setText(db.rst.getString(6));
                jTextField38.setText(db.rst.getString(7));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed

        // Code For Update Stock Button
        try {
            String mname = jComboBox2.getSelectedItem().toString();
            String formula = jTextField9.getText();
            String company = jTextField10.getText();
            String mfddate = jTextField11.getText();
            String expdate = jTextField12.getText();
            String price = jTextField13.getText();
            int qty = Integer.parseInt(jTextField14.getText()) + Integer.parseInt(jTextField39.getText());
            String reorder = jTextField38.getText();

            DBConnection db = new DBConnection();
            db.pstmt = db.con.prepareStatement("update stock set med_formula=?,comp_name=?,mfd_date=?,exp_date=?,price=?,reorder=?,qult=? where med_name=?");
            db.pstmt.setString(1, formula);
            db.pstmt.setString(2, company);
            db.pstmt.setString(3, mfddate);
            db.pstmt.setString(4, expdate);
            db.pstmt.setString(5, price);
            db.pstmt.setString(6, reorder);
            db.pstmt.setString(7, "" + qty);
            db.pstmt.setString(8, mname);

            int i = db.pstmt.executeUpdate();
            if (i > 0) {
                JOptionPane.showMessageDialog(this, "Record Update Sucessfully");
                jComboBox2.setSelectedIndex(0);
                jTextField9.setText("");
                jTextField10.setText("");
                jTextField11.setText("");
                jTextField12.setText("");
                jTextField13.setText("");
                jTextField14.setText("");
                jTextField38.setText("");
                jTextField39.setText("");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed

        // Code For update Stock Reset button
        jTextField9.setText("");
        jTextField10.setText("");
        jTextField11.setText("");
        jTextField12.setText("");
        jTextField13.setText("");
        jTextField14.setText("");
        jTextField38.setText("");
        jTextField39.setText("");
        jComboBox2.removeItem("");
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed

        // Code For Add Medicine in jComboBox from stock table
        try {
            UpdateStock.setVisible(true);
            jComboBox2.removeAllItems();
            jComboBox2.addItem("Select Medicine Name");
            DBConnection db = new DBConnection();
            db.pstmt = db.con.prepareStatement("select med_name from stock");
            db.rst = db.pstmt.executeQuery();
            while (db.rst.next()) {
                jComboBox2.addItem(db.rst.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

        // Code For Add Medicine name in jComboBox Tool Bar button
        try {
            UpdateStock.setVisible(true);
            jComboBox2.removeAllItems();
            jComboBox2.addItem("Select Medicine Name");
            DBConnection db = new DBConnection();
            db.pstmt = db.con.prepareStatement("select med_name from stock");
            db.rst = db.pstmt.executeQuery();
            while (db.rst.next()) {
                jComboBox2.addItem(db.rst.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed

        // Code For View Stock
        try {
            Vector<String> header = new Vector<String>();
            Vector<Vector<String>> data = new Vector<Vector<String>>();

            header.add("Medicine Name");
            header.add("Medicine Formula");
            header.add("Medicine Company");
            header.add("Mfd date");
            header.add("Exp date");
            header.add("Price");
            header.add("Discount");
            header.add("Quantaty");
            header.add("Reorder");

            DBConnection db = new DBConnection();
            db.pstmt = db.con.prepareStatement("select * from stock");
            db.rst = db.pstmt.executeQuery();
            while (db.rst.next()) {
                Vector<String> temp = new Vector<String>();
                temp.add(db.rst.getString(1));
                temp.add(db.rst.getString(2));
                temp.add(db.rst.getString(3));
                temp.add(db.rst.getString(4));
                temp.add(db.rst.getString(5));
                temp.add(db.rst.getString(6));
                temp.add(db.rst.getString(7));
                temp.add(db.rst.getString(8));
                temp.add(db.rst.getString(9));

                data.add(temp);
            }
            jTable3.setModel(new DefaultTableModel(data, header));
            ViewStock.setVisible(true);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

        // Code For View Stock tool Bar button
        try {
            Vector<String> header = new Vector<String>();
            Vector<Vector<String>> data = new Vector<Vector<String>>();

            header.add("Medicine Name");
            header.add("Medicine Formula");
            header.add("Medicine Company");
            header.add("Mfd date");
            header.add("Exp date");
            header.add("Price");
            header.add("Discount");
            header.add("Quantaty");
            header.add("Reorder");

            DBConnection db = new DBConnection();
            db.pstmt = db.con.prepareStatement("select * from stock");
            db.rst = db.pstmt.executeQuery();
            while (db.rst.next()) {
                Vector<String> temp = new Vector<String>();
                temp.add(db.rst.getString(1));
                temp.add(db.rst.getString(2));
                temp.add(db.rst.getString(3));
                temp.add(db.rst.getString(4));
                temp.add(db.rst.getString(5));
                temp.add(db.rst.getString(6));
                temp.add(db.rst.getString(7));
                temp.add(db.rst.getString(8));
                temp.add(db.rst.getString(9));

                data.add(temp);
            }
            jTable3.setModel(new DefaultTableModel(data, header));
            ViewStock.setVisible(true);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed

        // Code For View Stock Search Button
        try {
            Vector<String> header = new Vector<String>();
            Vector<Vector<String>> data = new Vector<Vector<String>>();

            header.add("Medicine Name");
            header.add("Medicine Formula");
            header.add("Medicine Company");
            header.add("Mfd date");
            header.add("Exp date");
            header.add("Price");
            header.add("Discount");
            header.add("Quantaty");
            header.add("Reorder");

            String ket = jTextField40.getText();
            DBConnection db = new DBConnection();
            db.pstmt = db.con.prepareStatement("select * from stock where med_name=? or comp_name=?");
            db.pstmt.setString(1, ket);
            db.pstmt.setString(2, ket);
            db.rst = db.pstmt.executeQuery();
            while (db.rst.next()) {
                Vector<String> temp = new Vector<String>();
                temp.add(db.rst.getString(1));
                temp.add(db.rst.getString(2));
                temp.add(db.rst.getString(3));
                temp.add(db.rst.getString(4));
                temp.add(db.rst.getString(5));
                temp.add(db.rst.getString(6));
                temp.add(db.rst.getString(7));
                temp.add(db.rst.getString(8));
                temp.add(db.rst.getString(9));

                data.add(temp);
            }
            jTable3.setModel(new DefaultTableModel(data, header));
            ViewStock.setVisible(true);

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed

        // Code For Logout Button ToolBar
        int a = JOptionPane.showConfirmDialog(this, "Do You Want to Logout", "select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            this.setVisible(false);
        }
        new Login_Page().setVisible(true);
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        // Code for Change Password Submit
        try {
            String opswd = new String(jPasswordField2.getPassword());
            String npswd = new String(jPasswordField3.getPassword());
            String cpswd = new String(jPasswordField4.getPassword());

            DBConnection db = new DBConnection();
            db.pstmt = db.con.prepareStatement("SELECT user_id,PASSWORD, ac_status FROM login WHERE user_id=? AND PASSWORD=? AND ac_status='1'");
            db.pstmt.setString(1, user);
            db.pstmt.setString(2, opswd);
            db.rst = db.pstmt.executeQuery();

            if (db.rst.next()) {
                if (npswd.equals(cpswd)) {
                    db.pstmt = db.con.prepareStatement("update login set password=? where user_id=?");
                    db.pstmt.setString(1, npswd);
                    db.pstmt.setString(2, user);
                    int i = db.pstmt.executeUpdate();
                    if (i > 0) {
                        JOptionPane.showMessageDialog(this, "Password Updated Sucessfully");
                        jPasswordField2.setText(null);
                        jPasswordField3.setText(null);
                        jPasswordField4.setText(null);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Old and Confirm password does not Match");
                }

            } else {
                JOptionPane.showMessageDialog(this, "Incorrect User Name or Password");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        // Code For Reset ChangePassword
        jPasswordField2.setText(null);
        jPasswordField3.setText(null);
        jPasswordField4.setText(null);
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // Code For ChangePassword Button
        ChangePassword.setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // Code For ChangePassword ToolBar
        ChangePassword.setVisible(true);
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        // Code For Create Account Submit Button
        try {
            String user = jTextField52.getText();
            String pswd = jPasswordField5.getText();
            String cpswd = jPasswordField6.getText();

            DBConnection db = new DBConnection();
            if (pswd.equals(cpswd)) {
                db.pstmt = db.con.prepareStatement("insert into login(user_id,password,utype,ac_status) value(?,?,'Employee','1')");
            }
            db.pstmt.setString(1, user);
            db.pstmt.setString(2, pswd);
            int i = db.pstmt.executeUpdate();

            if (1 > 0) {
                JOptionPane.showMessageDialog(this, "User Created");
                jTextField52.setText("");
                jPasswordField5.setText("");
                jPasswordField6.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Password does not Match");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        // Code For Change Account Reset Password
        jTextField52.setText("");
        jPasswordField5.setText("");
        jPasswordField6.setText("");
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed

    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        // Code For Link Create Account ToolBar Button
        CreateAccount2.setVisible(true);
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // Code For Link Create Account
        CreateAccount2.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // Code for Generate Bill Menu Item
        try {

            System.out.println("ok");
            GenerateBill.setVisible(true);
            DBConnection db = new DBConnection();
            System.out.println("ok1");
            db.pstmt = db.con.prepareStatement("select med_name from stock");
            db.rst = db.pstmt.executeQuery();
            System.out.println("ok2");
            jComboBox3.removeAllItems();
            jComboBox3.addItem("select Medicine Name");
            while (db.rst.next()) {
                jComboBox3.addItem(db.rst.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed

        //Code on ComboBox for Select Medicine
        try {
            String mname = jComboBox3.getSelectedItem().toString();
            DBConnection db = new DBConnection();
            db.pstmt = db.con.prepareStatement("select product.med_formula,product.med_company,stock.mfd_date,stock.exp_date,stock.qult,stock.price from product, stock where product.med_name=stock.med_name and stock.med_name=?");
            db.pstmt.setString(1, mname);
            db.rst = db.pstmt.executeQuery();

            if (db.rst.next()) {
                jTextField41.setText(db.rst.getString(1));
                jTextField42.setText(db.rst.getString(2));
                jTextField43.setText(db.rst.getString(3));
                jTextField44.setText(db.rst.getString(4));
                jTextField45.setText(db.rst.getString(5));
                jTextField46.setText(db.rst.getString(6));
                jTextField41.setEditable(false);
                jTextField42.setEditable(false);
                jTextField43.setEditable(false);
                jTextField44.setEditable(false);
                jTextField45.setEditable(false);
                jTextField46.setEditable(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jComboBox3ActionPerformed
    int invc = 0;
    Vector<Vector<String>> data = new Vector<Vector<String>>();
    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // Code For Add Stock
        try {
            Vector<String> header = new Vector<String>();
            header.add("Medicine Name");
            header.add("Formula");
            header.add("Company Name");
            header.add("Mfd. Date");
            header.add("Exp. Date");
            header.add("Price");
            header.add("Quantity");
            DBConnection db = new DBConnection();
            db.pstmt = db.con.prepareStatement("select max(invc_no) from invoice_mstr");
            db.rst = db.pstmt.executeQuery();
            if (db.rst.next()) {
                invc = db.rst.getInt(1);
            }
            invc++;
            String mname = jComboBox3.getSelectedItem().toString();
            String formula = jTextField41.getText();
            String cname = jTextField42.getText();
            String mfd_date = jTextField43.getText();
            String exp_date = jTextField44.getText();
            String avl_qty = jTextField45.getText();
            String price = jTextField46.getText();
            int qty = Integer.parseInt(jTextField47.getText());
            db.pstmt = db.con.prepareStatement("select qult from stock where med_name=?");
            db.pstmt.setString(1, mname);
            db.rst = db.pstmt.executeQuery();
            int avlqty = 0;
            if (db.rst.next()) {
                avlqty = db.rst.getInt(1);
            }
            if (avlqty >= qty) {
                db.pstmt = db.con.prepareStatement("insert into invoice_tras(invc,med_name,mfd_date,exp_date,price,qty,pay_amt,date) values(?,?,?,?,?,?,?,curdate()) ");
                db.pstmt.setInt(1, invc);
                db.pstmt.setString(2, mname);
                db.pstmt.setString(3, mfd_date);
                db.pstmt.setString(4, exp_date);
                db.pstmt.setString(5, price);
                db.pstmt.setInt(6, qty);
                db.pstmt.setInt(7, Integer.parseInt(price) * qty);
                int i = db.pstmt.executeUpdate();
                if (i > 0) {
                    Vector<String> temp = new Vector<String>();
                    temp.add(mname);
                    temp.add(formula);
                    temp.add(cname);
                    temp.add(mfd_date);
                    temp.add(exp_date);
                    temp.add(price);
                    temp.add("" + qty);
                    data.add(temp);
                    jTable4.setModel(new DefaultTableModel(data, header));
                    jComboBox3.setSelectedIndex(0);
                    jTextField41.setText("");
                    jTextField42.setText("");
                    jTextField43.setText("");
                    jTextField44.setText("");
                    jTextField45.setText("");
                    jTextField46.setText("");
                    jTextField47.setText("");

                }
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Quantity!!!!!!!!!!!");
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed

        // Code For Reset Generate Bill
        jTextField48.setText("");
        jTextField49.setText("");
        jTextField50.setText("");
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed

        // Code For Generate Invoice button
        try {
            String cust_name = jTextField48.getText();
            String cust_number = jTextField49.getText();
            DBConnection db = new DBConnection();
            db.pstmt = db.con.prepareStatement("select sum(pay_amt) from invoice_tras where invc=?");
            db.pstmt.setInt(1, invc);
            db.rst = db.pstmt.executeQuery();
            int pay_amt = 0;
            if (db.rst.next()) {
                pay_amt = db.rst.getInt(1);
            }
            db.pstmt = db.con.prepareStatement("insert into invoice_mstr(invc_no,cust_name,cust_number,pay_amt,invc_date) values(?,?,?,?,?)");
            db.pstmt.setInt(1, invc);
            db.pstmt.setString(2, cust_name);
            db.pstmt.setString(3, cust_number);
            db.pstmt.setInt(4, pay_amt);
            db.pstmt.setString(5, new java.util.Date().toString());
            int i = db.pstmt.executeUpdate();
            if (i > 0) {
                jTextField48.setText("");
                jTextField49.setText("");

//                Invoice drsplay Code or Bill details
                jLabel80.setText(cust_name);
                jLabel81.setText(cust_number);
                jLabel82.setText(new java.util.Date().toString());
                jLabel83.setText(jTextField50.getText());

                Vector<String> header = new Vector<>();
                Vector<Vector<String>> data1 = new Vector<>();
                header.add("Medicine Name");
                header.add("Mfd Date");
                header.add("Exp Date");
                header.add("Price/Unit");
                header.add("Quantity");
                header.add("Payable Amount");
                db.pstmt = db.con.prepareStatement("select med_name,mfd_date,exp_date,price,qty,pay_amt from invoice_tras where invc=?");
                db.pstmt.setInt(1, invc);
                db.rst = db.pstmt.executeQuery();
                int amt = 0;
                while (db.rst.next()) {
                    Vector<String> temp = new Vector<>();
                    temp.add(db.rst.getString(1));
                    temp.add(db.rst.getString(2));
                    temp.add(db.rst.getString(3));
                    temp.add(db.rst.getString(4));
                    temp.add(db.rst.getString(5));
                    temp.add(db.rst.getString(6));
                    amt = amt + Integer.parseInt(db.rst.getString(6));
                    data1.add(temp);
                }
                jLabel87.setText("" + amt);
                // jLabel90.setText("10%  A");
                int dis = (amt * 10) / 100;
                amt = amt - (amt * 10) / 100;

                jLabel90.setText("10% : Amt = " + dis);
                jLabel89.setText("" + amt);
                jTable5.setModel(new DefaultTableModel(data1, header));
                //----------------------------------------------------------------
                // Code For Update stock Quantity after some medicine sell
                db.pstmt = db.con.prepareStatement("SELECT med_name,qty FROM invoice_tras WHERE invc=?");
                db.pstmt.setInt(1, invc);
                db.rst = db.pstmt.executeQuery();
                while (db.rst.next()) {
                    String mname = db.rst.getString(1);
                    System.out.println();
                    int qt = Integer.parseInt(db.rst.getString(2));
                    db.pstmt = db.con.prepareStatement("UPDATE stock SET qult=qult-? WHERE med_name=?");
                    db.pstmt.setInt(1, qt);
                    db.pstmt.setString(2, mname);
                    db.pstmt.executeUpdate();
                }
                //------------------------------------------------------------------
                Invoice.setVisible(true);
                GenerateBill.setVisible(false);

            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e);
        }

    }//GEN-LAST:event_jButton31ActionPerformed

    private void jTextField37KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField37KeyReleased

        // Code For show Search from table
        DefaultTableModel table = (DefaultTableModel) jTable2.getModel();
        TableRowSorter<DefaultTableModel> table1 = new TableRowSorter<>(table);
        jTable2.setRowSorter(table1);
        table1.setRowFilter(RowFilter.regexFilter(jTextField37.getText()));

    }//GEN-LAST:event_jTextField37KeyReleased

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed

        // Code For Add View Invoice
        ViewInvoice.setVisible(true);
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

        // Code For View Invoice Search Button
        try {
            String mob_no = jTextField51.getText();
            Vector<String> header = new Vector<>();
            Vector<Vector<String>> date = new Vector<>();
            header.add("Date and Time");
            header.add("Bill Number");
            DBConnection db = new DBConnection();
            db.pstmt = db.con.prepareStatement("SELECT invc_date,invc_no FROM invoice_mstr WHERE cust_number=?");
            db.pstmt.setString(1, mob_no);
            db.rst = db.pstmt.executeQuery();
            int count = 0;
            while (db.rst.next()) {
                Vector<String> temp = new Vector<>();
                temp.add(db.rst.getString(1));
                temp.add(db.rst.getString(2));
                data.add(temp);
                count++;
            }
            if (count > 0) {
                jTable6.setModel(new DefaultTableModel(data, header));
            } else {
                JOptionPane.showMessageDialog(this, "Record does not found");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed

        // Code For View Invoice
        try {
            String cust_name = "", cust_number = "";
            String invc = jTextField53.getText();
            DBConnection db = new DBConnection();
            db.pstmt = db.con.prepareStatement("SELECT cust_name,cust_number FROM invoice_mstr WHERE invc_no=?");
            db.pstmt.setString(1, invc);
            db.rst = db.pstmt.executeQuery();
            if (db.rst.next()) {
                cust_name = db.rst.getString(1);
                cust_number = db.rst.getString(2);
            }
            db.pstmt = db.con.prepareStatement("select SUM(pay_amt) from invoice_tras where invc=?");
            db.pstmt.setString(1, invc);
            db.rst = db.pstmt.executeQuery();
            int pay_amt = 0;
            if (db.rst.next()) {
                pay_amt = db.rst.getInt(1);
            }
            jLabel80.setText(cust_name);
            jLabel81.setText(cust_number);
            jLabel82.setText(new java.util.Date().toString());
            jLabel83.setText(jTextField50.getText());
            Vector<String> header = new Vector<>();
            Vector<Vector<String>> data1 = new Vector<Vector<String>>();
            header.add("Medicine Name");
            header.add("Mfd Date");
            header.add("Exp Date");
            header.add("Price/Unit");
            header.add("Quantity");
            header.add("Payable Amount");
            db.pstmt = db.con.prepareStatement("SELECT med_name,mfd_date,exp_date,price,qty,pay_amt FROM invoice_tras WHERE invc=?");
            db.pstmt.setString(1, invc);
            db.rst = db.pstmt.executeQuery();
            int amt = 0;
            while (db.rst.next()) {
                Vector<String> temp = new Vector<>();
                temp.add(db.rst.getString(1));
                temp.add(db.rst.getString(2));
                temp.add(db.rst.getString(3));
                temp.add(db.rst.getString(4));
                temp.add(db.rst.getString(5));
                temp.add(db.rst.getString(6));
                amt = amt + Integer.parseInt(db.rst.getString(6));
                data1.add(temp);
            }
            jLabel87.setText("" + amt);
            // jLabel90.setText("10%  A");
            int dis = (amt * 10) / 100;
            amt = amt - (amt * 10) / 100;

            jLabel90.setText("10% : Amt = " + dis);
            jLabel89.setText("" + amt);
            jTable5.setModel(new DefaultTableModel(data1, header));
            ViewInvoice.setVisible(false);
            Invoice.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed

        // Code For Add View Invoice on ToolBar
        ViewInvoice.setVisible(true);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed

        // Code For Show Reorder List
        try {
            ViewReorderList.setVisible(true);
            Vector<String> header = new Vector<>();
            Vector<Vector<String>> date = new Vector<>();
            header.add("Medicine Name");
            header.add("Company Name");
            header.add("Medicine Formula");
            header.add("Vender Name");
            header.add("Vender Contact");
            header.add("Quantity");

            DBConnection db = new DBConnection();
            db.pstmt = db.con.prepareStatement("SELECT product.med_name,product.med_company,product.med_formula,product.vend_name,product.vend_contact,stock.qult FROM product,stock WHERE product.med_name=stock.med_name AND stock.qult<=stock.reorder");
            db.rst = db.pstmt.executeQuery();
            while (db.rst.next()) {
                Vector<String> temp = new Vector<>();
                temp.add(db.rst.getString(1));
                temp.add(db.rst.getString(2));
                temp.add(db.rst.getString(3));
                temp.add(db.rst.getString(4));
                temp.add(db.rst.getString(5));
                temp.add(db.rst.getString(6));

                data.add(temp);
            }
            jTable7.setModel(new DefaultTableModel(data, header));
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed

        // Code For Add Reorder List in ToolBar
        try {
            ViewReorderList.setVisible(true);
            Vector<String> header = new Vector<>();
            Vector<Vector<String>> date = new Vector<>();
            header.add("Medicine Name");
            header.add("Company Name");
            header.add("Medicine Formula");
            header.add("Vender Name");
            header.add("Vender Contact");
            header.add("Quantity");

            DBConnection db = new DBConnection();
            db.pstmt = db.con.prepareStatement("SELECT product.med_name,product.med_company,product.med_formula,product.vend_name,product.vend_contact,stock.qult FROM product,stock WHERE product.med_name=stock.med_name AND stock.qult<=stock.reorder");
            db.rst = db.pstmt.executeQuery();
            while (db.rst.next()) {
                Vector<String> temp = new Vector<>();
                temp.add(db.rst.getString(1));
                temp.add(db.rst.getString(2));
                temp.add(db.rst.getString(3));
                temp.add(db.rst.getString(4));
                temp.add(db.rst.getString(5));
                temp.add(db.rst.getString(6));

                data.add(temp);
            }
            jTable7.setModel(new DefaultTableModel(data, header));
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e);
        }

    }//GEN-LAST:event_jButton14ActionPerformed

    private void jTextField54KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField54KeyReleased

        // Code For show Search from table
        DefaultTableModel table = (DefaultTableModel) jTable7.getModel();
        TableRowSorter<DefaultTableModel> table1 = new TableRowSorter<>(table);
        jTable7.setRowSorter(table1);
        table1.setRowFilter(RowFilter.regexFilter(jTextField54.getText()));
    }//GEN-LAST:event_jTextField54KeyReleased

    private void jTextField55KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField55KeyReleased

        // Code For show Search from table
        DefaultTableModel table = (DefaultTableModel) jTable8.getModel();
        TableRowSorter<DefaultTableModel> table1 = new TableRowSorter<>(table);
        jTable8.setRowSorter(table1);
        table1.setRowFilter(RowFilter.regexFilter(jTextField55.getText()));
    }//GEN-LAST:event_jTextField55KeyReleased

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        // Code For Add Sale Report

        try {
            SaleReport.setVisible(true);
            Vector<String> header = new Vector<String>();
            Vector<Vector<String>> data = new Vector<Vector<String>>();
            header.add("Bill Number");
            header.add("Invoice Date");
            header.add("Customer Name");
            header.add("Customer Number");
            header.add("Bill Amount");
            DBConnection db = new DBConnection();
            db.pstmt = db.con.prepareStatement("SELECT invc_no, invc_date,cust_name,cust_number,pay_amt FROM invoice_mstr");
            db.rst = db.pstmt.executeQuery();
            while (db.rst.next()) {
                Vector<String> temp = new Vector<String>();
                temp.add(db.rst.getString(1));
                temp.add(db.rst.getString(2));
                temp.add(db.rst.getString(3));
                temp.add(db.rst.getString(4));
                temp.add(db.rst.getString(5));
                data.add(temp);
            }
            jTable8.setModel(new DefaultTableModel(data, header));
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e);
        }

    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Code For Add Sale Report on ToolBar
        try {
            SaleReport.setVisible(true);
            Vector<String> header = new Vector<String>();
            Vector<Vector<String>> data = new Vector<Vector<String>>();
            header.add("Bill Number");
            header.add("Invoice Date");
            header.add("Customer Name");
            header.add("Customer Number");
            header.add("Bill Amount");
            DBConnection db = new DBConnection();
            db.pstmt = db.con.prepareStatement("SELECT invc_no, invc_date,cust_name,cust_number,pay_amt FROM invoice_mstr");
            db.rst = db.pstmt.executeQuery();
            while (db.rst.next()) {
                Vector<String> temp = new Vector<String>();
                temp.add(db.rst.getString(1));
                temp.add(db.rst.getString(2));
                temp.add(db.rst.getString(3));
                temp.add(db.rst.getString(4));
                temp.add(db.rst.getString(5));
                data.add(temp);
            }
            jTable8.setModel(new DefaultTableModel(data, header));
        } catch (Exception e) {
            //  e.printStackTrace();
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField40KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField40KeyReleased

        // Code For show Search from table View Stock
        DefaultTableModel table = (DefaultTableModel) jTable3.getModel();
        TableRowSorter<DefaultTableModel> table1 = new TableRowSorter<>(table);
        jTable3.setRowSorter(table1);
        table1.setRowFilter(RowFilter.regexFilter(jTextField40.getText()));
    }//GEN-LAST:event_jTextField40KeyReleased

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // Code For show Search from table
        DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        TableRowSorter<DefaultTableModel> table1 = new TableRowSorter<>(table);
        jTable1.setRowSorter(table1);
        table1.setRowFilter(RowFilter.regexFilter(jTextField1.getText()));
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        // Code For Link Print_bill
        jLabel102.setText(jLabel80.getText());
        jLabel110.setText(jLabel81.getText());
        jLabel111.setText(jLabel82.getText());
        jLabel112.setText(jLabel83.getText());
        jLabel113.setText(jLabel87.getText());
        jLabel114.setText("10%");
        jLabel115.setText(jLabel89.getText());

        Print_bill.setVisible(true);
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        // Code For Print_bill
        Toolkit tkp = jButton33.getToolkit();
        PrintJob pjp = tkp.getPrintJob(this, null, null);
        Graphics g = pjp.getGraphics();
        jPanel20.paint(g);
        g.dispose();
        pjp.end();
    }//GEN-LAST:event_jButton37ActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame AddEmployee;
    private javax.swing.JInternalFrame AddMedicine;
    private javax.swing.JInternalFrame AddStock;
    private javax.swing.JInternalFrame ChangePassword;
    private javax.swing.JInternalFrame CreateAccount2;
    private javax.swing.JInternalFrame EmployeeList;
    private javax.swing.JInternalFrame GenerateBill;
    private javax.swing.JInternalFrame Invoice;
    private javax.swing.JInternalFrame MedicineList;
    private javax.swing.JInternalFrame Print_bill;
    private javax.swing.JInternalFrame SaleReport;
    private javax.swing.JInternalFrame SearchUpdateEmp;
    private javax.swing.JInternalFrame SearchupdateMedicine;
    private javax.swing.JInternalFrame UpdateStock;
    private javax.swing.JInternalFrame ViewInvoice;
    private javax.swing.JInternalFrame ViewReorderList;
    private javax.swing.JInternalFrame ViewStock;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
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
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JPasswordField jPasswordField4;
    private javax.swing.JPasswordField jPasswordField5;
    private javax.swing.JPasswordField jPasswordField6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField139;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField140;
    private javax.swing.JTextField jTextField141;
    private javax.swing.JTextField jTextField142;
    private javax.swing.JTextField jTextField143;
    private javax.swing.JTextField jTextField144;
    private javax.swing.JTextField jTextField145;
    private javax.swing.JTextField jTextField146;
    private javax.swing.JTextField jTextField148;
    private javax.swing.JTextField jTextField149;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField150;
    private javax.swing.JTextField jTextField151;
    private javax.swing.JTextField jTextField152;
    private javax.swing.JTextField jTextField153;
    private javax.swing.JTextField jTextField154;
    private javax.swing.JTextField jTextField155;
    private javax.swing.JTextField jTextField156;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextField jTextField47;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JTextField jTextField49;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField50;
    private javax.swing.JTextField jTextField51;
    private javax.swing.JTextField jTextField52;
    private javax.swing.JTextField jTextField53;
    private javax.swing.JTextField jTextField54;
    private javax.swing.JTextField jTextField55;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}

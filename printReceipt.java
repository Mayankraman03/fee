
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.ResultSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author HP
 */
public class printReceipt extends javax.swing.JFrame {

    /**
     * Creates new form printReceipt
     */
    public printReceipt() {
        initComponents();
        //1963 1092
        setSize(1963,1092);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setTitle("print Receipt");
        getRecords();
    }
    
    public void getRecords(){
        try{
             
            ResultSet rs = DBLoader.executeSQL("select * from feedetails order by receiptNo desc limit 1");
            
        while(rs.next()){
             receipt_lbl.setText(rs.getString("receiptNo"));
             payment_lbl.setText(rs.getString("payment_mode"));
             
             String paymentmode = rs.getString("payment_mode");
             
             if(paymentmode.equalsIgnoreCase("cash")){
                 txt_cheque.setText("");
                 cheque_dd_lbl.setText("");
                 bankname_lbl.setText("");
                 text_bank.setText("");
             }
             if(paymentmode.equalsIgnoreCase("cheque")){
                 txt_cheque.setText("Cheque NO :");
                 cheque_dd_lbl.setText(rs.getString("chequeNo"));
                 bankname_lbl.setText(rs.getString("bankname"));
                 text_bank.setText("Bank Name :");
             }
             if(paymentmode.equalsIgnoreCase("dd")){
                 txt_cheque.setText("DD NO :");
                 cheque_dd_lbl.setText(rs.getString("ddno"));
                 bankname_lbl.setText(rs.getString("bankname"));
                 text_bank.setText("Bank Name :");
             }
             if(paymentmode.equalsIgnoreCase("card")){
                 txt_cheque.setText("");
                 cheque_dd_lbl.setText("");
                 bankname_lbl.setText(rs.getString("bankname"));
                 text_bank.setText("Bank Name :");
             }
             received_lbl.setText(rs.getString("studentName"));
             date_lbl.setText(rs.getString("date"));
             gst_lbl.setText(rs.getString("gstno"));
             roll_lbl.setText(rs.getString("Rollno"));
             year1_lbl.setText(rs.getString("year1"));
             year2_lbl.setText(rs.getString("year2"));
             course_lbl.setText(rs.getString("courseName"));
             amount_lbl.setText(rs.getString("amount"));
             cgst_lbl.setText(rs.getString("cgst"));
             sgst_lbl.setText(rs.getString("sgst"));
             total_lbl.setText(rs.getString("totalAmount"));
             totalInWords_lbl.setText(rs.getString("total_in_words"));
             remark_lbl.setText(rs.getString("remarks")); 
        }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sidepanel = new javax.swing.JPanel();
        courselist_btn = new javax.swing.JButton();
        viewall_btn = new javax.swing.JButton();
        back_btn = new javax.swing.JButton();
        logout_btn = new javax.swing.JButton();
        home_btn = new javax.swing.JButton();
        searchRecord_btn = new javax.swing.JButton();
        edit_btn = new javax.swing.JButton();
        print_btn = new javax.swing.JButton();
        panel_print = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        receipt_lbl = new javax.swing.JLabel();
        cheque_dd_lbl = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        amount_lbl = new javax.swing.JLabel();
        payment_lbl = new javax.swing.JLabel();
        txt_cheque = new javax.swing.JLabel();
        text_bank = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        bankname_lbl = new javax.swing.JLabel();
        received_lbl = new javax.swing.JLabel();
        year1_lbl = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        roll_lbl = new javax.swing.JLabel();
        date_lbl = new javax.swing.JLabel();
        gst_lbl = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        year2_lbl = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cgst_lbl = new javax.swing.JLabel();
        sgst_lbl = new javax.swing.JLabel();
        total_lbl = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        remark_lbl = new javax.swing.JLabel();
        totalInWords_lbl = new javax.swing.JLabel();
        course_lbl = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        sidepanel.setBackground(new java.awt.Color(0, 153, 153));
        sidepanel.setLayout(null);

        courselist_btn.setBackground(new java.awt.Color(0, 204, 204));
        courselist_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        courselist_btn.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\OneDrive\\Documents\\NetBeansProjects\\Fee_management\\src\\feeimages\\list.png")); // NOI18N
        courselist_btn.setText("COURSE LIST");
        courselist_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        courselist_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sidepanel.add(courselist_btn);
        courselist_btn.setBounds(120, 180, 250, 80);

        viewall_btn.setBackground(new java.awt.Color(0, 204, 204));
        viewall_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        viewall_btn.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\OneDrive\\Documents\\NetBeansProjects\\Fee_management\\src\\feeimages\\view all record.png")); // NOI18N
        viewall_btn.setText("VIEW ALL RECORDS");
        viewall_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewall_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewall_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewall_btnActionPerformed(evt);
            }
        });
        sidepanel.add(viewall_btn);
        viewall_btn.setBounds(120, 280, 250, 80);

        back_btn.setBackground(new java.awt.Color(0, 204, 204));
        back_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        back_btn.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\OneDrive\\Documents\\NetBeansProjects\\Fee_management\\src\\feeimages\\back-button.png")); // NOI18N
        back_btn.setText("BACK");
        back_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        back_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });
        sidepanel.add(back_btn);
        back_btn.setBounds(120, 380, 250, 80);

        logout_btn.setBackground(new java.awt.Color(0, 204, 204));
        logout_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        logout_btn.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\OneDrive\\Documents\\NetBeansProjects\\Fee_management\\src\\feeimages\\logout.png")); // NOI18N
        logout_btn.setText("LOG OUT");
        logout_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        logout_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        logout_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_btnActionPerformed(evt);
            }
        });
        sidepanel.add(logout_btn);
        logout_btn.setBounds(120, 480, 250, 80);

        home_btn.setBackground(new java.awt.Color(0, 204, 204));
        home_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        home_btn.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\OneDrive\\Documents\\NetBeansProjects\\Fee_management\\src\\feeimages\\home.png")); // NOI18N
        home_btn.setText("HOME");
        home_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        home_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_btnActionPerformed(evt);
            }
        });
        sidepanel.add(home_btn);
        home_btn.setBounds(120, 10, 250, 70);

        searchRecord_btn.setBackground(new java.awt.Color(0, 204, 204));
        searchRecord_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        searchRecord_btn.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\OneDrive\\Documents\\NetBeansProjects\\Fee_management\\src\\feeimages\\search2.png")); // NOI18N
        searchRecord_btn.setText("SEARCH RECORD");
        searchRecord_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        searchRecord_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchRecord_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchRecord_btnActionPerformed(evt);
            }
        });
        sidepanel.add(searchRecord_btn);
        searchRecord_btn.setBounds(120, 90, 250, 70);

        edit_btn.setBackground(new java.awt.Color(0, 204, 204));
        edit_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        edit_btn.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\OneDrive\\Documents\\NetBeansProjects\\Fee_management\\src\\feeimages\\edit2.png")); // NOI18N
        edit_btn.setText("EDIT");
        edit_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        edit_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        edit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_btnActionPerformed(evt);
            }
        });
        sidepanel.add(edit_btn);
        edit_btn.setBounds(120, 680, 250, 90);

        print_btn.setBackground(new java.awt.Color(0, 204, 204));
        print_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        print_btn.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\OneDrive\\Documents\\NetBeansProjects\\Fee_management\\src\\feeimages\\printer-.png")); // NOI18N
        print_btn.setText("PRINT");
        print_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        print_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        print_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print_btnActionPerformed(evt);
            }
        });
        sidepanel.add(print_btn);
        print_btn.setBounds(120, 580, 250, 80);

        getContentPane().add(sidepanel);
        sidepanel.setBounds(0, 0, 540, 1040);

        panel_print.setBackground(new java.awt.Color(255, 255, 255));
        panel_print.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("MANAWALA , AMRITSAR , PUNJAB (143109)");
        panel_print.add(jLabel1);
        jLabel1.setBounds(340, 70, 410, 40);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("AFFILATED BY :- PTU (PUNJAB TECHNICAL UNIVERSITY) KAPURTHALA");
        panel_print.add(jLabel3);
        jLabel3.setBounds(170, 40, 840, 40);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setText("AMRITSAR GROUP OF COLLEGES ");
        panel_print.add(jLabel4);
        jLabel4.setBounds(270, 2, 580, 48);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 102));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 102));
        panel_print.add(jSeparator2);
        jSeparator2.setBounds(10, 400, 1200, 20);

        receipt_lbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        receipt_lbl.setText("receipt no :     ");
        panel_print.add(receipt_lbl);
        receipt_lbl.setBounds(210, 140, 130, 30);

        cheque_dd_lbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cheque_dd_lbl.setText("cheque_dd");
        panel_print.add(cheque_dd_lbl);
        cheque_dd_lbl.setBounds(210, 210, 140, 30);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("receipt no :        AGC");
        panel_print.add(jLabel7);
        jLabel7.setBounds(10, 140, 180, 30);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Payment Mode :");
        panel_print.add(jLabel8);
        jLabel8.setBounds(10, 180, 160, 30);

        amount_lbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        amount_lbl.setText("Amount");
        panel_print.add(amount_lbl);
        amount_lbl.setBounds(800, 410, 110, 30);

        payment_lbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        payment_lbl.setText("payment");
        panel_print.add(payment_lbl);
        payment_lbl.setBounds(210, 180, 140, 30);

        txt_cheque.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_cheque.setText("cheque_dd :");
        panel_print.add(txt_cheque);
        txt_cheque.setBounds(10, 210, 110, 30);

        text_bank.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        text_bank.setText("Bank Name :");
        panel_print.add(text_bank);
        text_bank.setBounds(10, 250, 110, 30);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Received From :");
        panel_print.add(jLabel12);
        jLabel12.setBounds(10, 290, 140, 30);

        bankname_lbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bankname_lbl.setText("bank");
        panel_print.add(bankname_lbl);
        bankname_lbl.setBounds(210, 250, 110, 30);

        received_lbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        received_lbl.setText("received");
        panel_print.add(received_lbl);
        received_lbl.setBounds(210, 290, 380, 30);

        year1_lbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        year1_lbl.setText("2020");
        panel_print.add(year1_lbl);
        year1_lbl.setBounds(500, 320, 50, 30);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setText("-");
        panel_print.add(jLabel16);
        jLabel16.setBounds(560, 320, 20, 30);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setText("Amount(Rs/)");
        panel_print.add(jLabel17);
        jLabel17.setBounds(790, 370, 110, 30);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setText("Head");
        panel_print.add(jLabel18);
        jLabel18.setBounds(400, 370, 70, 30);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setText("The following payment in the college office for the year :");
        panel_print.add(jLabel19);
        jLabel19.setBounds(10, 320, 490, 30);

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel20.setText("Date :");
        panel_print.add(jLabel20);
        jLabel20.setBounds(620, 150, 110, 30);

        roll_lbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        roll_lbl.setText("roll number");
        panel_print.add(roll_lbl);
        roll_lbl.setBounds(750, 230, 110, 30);

        date_lbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        date_lbl.setText("date");
        panel_print.add(date_lbl);
        date_lbl.setBounds(750, 150, 220, 30);

        gst_lbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        gst_lbl.setText("GSTIN");
        panel_print.add(gst_lbl);
        gst_lbl.setBounds(750, 190, 210, 30);

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel24.setText("Sr No");
        panel_print.add(jLabel24);
        jLabel24.setBounds(30, 370, 80, 30);

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel25.setText("1 .");
        panel_print.add(jLabel25);
        jLabel25.setBounds(40, 420, 50, 20);

        jSeparator3.setBackground(new java.awt.Color(0, 0, 102));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 102));
        panel_print.add(jSeparator3);
        jSeparator3.setBounds(700, 640, 250, 20);

        jSeparator4.setBackground(new java.awt.Color(0, 0, 102));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 102));
        panel_print.add(jSeparator4);
        jSeparator4.setBounds(10, 360, 1200, 10);

        year2_lbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        year2_lbl.setText("2024");
        panel_print.add(year2_lbl);
        year2_lbl.setBounds(600, 320, 50, 30);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("cgst 9%");
        panel_print.add(jLabel13);
        jLabel13.setBounds(400, 450, 110, 30);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("sgst 9%");
        panel_print.add(jLabel14);
        jLabel14.setBounds(400, 490, 110, 30);

        cgst_lbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cgst_lbl.setText("cgst");
        panel_print.add(cgst_lbl);
        cgst_lbl.setBounds(800, 450, 110, 30);

        sgst_lbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sgst_lbl.setText("sgst");
        panel_print.add(sgst_lbl);
        sgst_lbl.setBounds(800, 490, 110, 30);

        total_lbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        total_lbl.setText("Total");
        panel_print.add(total_lbl);
        total_lbl.setBounds(800, 540, 90, 30);

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel26.setText("Reciever signature");
        panel_print.add(jLabel26);
        jLabel26.setBounds(750, 650, 170, 30);

        remark_lbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        remark_lbl.setText("remarks");
        panel_print.add(remark_lbl);
        remark_lbl.setBounds(180, 590, 380, 40);

        totalInWords_lbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        totalInWords_lbl.setText("Total_in_words");
        panel_print.add(totalInWords_lbl);
        totalInWords_lbl.setBounds(180, 550, 480, 30);

        course_lbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        course_lbl.setText("course");
        panel_print.add(course_lbl);
        course_lbl.setBounds(400, 410, 220, 40);

        jSeparator5.setBackground(new java.awt.Color(0, 0, 102));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 102));
        panel_print.add(jSeparator5);
        jSeparator5.setBounds(10, 130, 1200, 20);

        jSeparator6.setBackground(new java.awt.Color(0, 0, 102));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 102));
        panel_print.add(jSeparator6);
        jSeparator6.setBounds(700, 530, 250, 20);

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel28.setText("Total in words :");
        panel_print.add(jLabel28);
        jLabel28.setBounds(20, 550, 130, 30);

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel29.setText("Remarks :");
        panel_print.add(jLabel29);
        jLabel29.setBounds(20, 590, 100, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\OneDrive\\Documents\\NetBeansProjects\\Fee_management\\src\\feeimages\\agc.jpeg")); // NOI18N
        panel_print.add(jLabel5);
        jLabel5.setBounds(10, 0, 150, 130);

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel22.setText("GST NO :");
        panel_print.add(jLabel22);
        jLabel22.setBounds(620, 190, 110, 30);

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel23.setText("Roll No :");
        panel_print.add(jLabel23);
        jLabel23.setBounds(620, 230, 110, 30);

        getContentPane().add(panel_print);
        panel_print.setBounds(560, 50, 1220, 860);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("PRINT RECEIPT");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(1000, 10, 170, 20);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 102));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 102));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(950, 40, 270, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        // TODO add your handling code here:
        Home obj = new Home();
        obj.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_back_btnActionPerformed

    private void logout_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_btnActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_logout_btnActionPerformed

    private void edit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_btnActionPerformed
        // TODO add your handling code here:
        updateFeeDetails obj = new updateFeeDetails();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_edit_btnActionPerformed

    private void print_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print_btnActionPerformed
        // TODO add your handling code here:
        PrinterJob job = PrinterJob.getPrinterJob();
            job.setJobName("Print Data");
            
            job.setPrintable(new Printable(){
            public int print(Graphics pg,PageFormat pf, int pageNum){
                    pf.setOrientation(PageFormat.LANDSCAPE);
                 if(pageNum > 0){
                    return Printable.NO_SUCH_PAGE;
                }
                
                Graphics2D g2 = (Graphics2D)pg;
                g2.translate(pf.getImageableX(), pf.getImageableY());
                g2.scale(0.47,0.47);
                
                panel_print.print(g2);
         
               
                return Printable.PAGE_EXISTS;
                         
                
            }
    });
            boolean ok = job.printDialog();
        if(ok){
        try{
            
        job.print();
        }
        catch (PrinterException ex){
	ex.printStackTrace();
        }
        }

    }//GEN-LAST:event_print_btnActionPerformed

    private void home_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_btnActionPerformed
        // TODO add your handling code here:
        Home obj = new Home();
        obj.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_home_btnActionPerformed

    private void searchRecord_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchRecord_btnActionPerformed
        // TODO add your handling code here:
        SearchRecord obj = new SearchRecord();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_searchRecord_btnActionPerformed

    private void viewall_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewall_btnActionPerformed
        // TODO add your handling code here:
        viewAllRecords  obj = new viewAllRecords();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_viewall_btnActionPerformed

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
            java.util.logging.Logger.getLogger(printReceipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(printReceipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(printReceipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(printReceipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new printReceipt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amount_lbl;
    private javax.swing.JButton back_btn;
    private javax.swing.JLabel bankname_lbl;
    private javax.swing.JLabel cgst_lbl;
    private javax.swing.JLabel cheque_dd_lbl;
    private javax.swing.JLabel course_lbl;
    private javax.swing.JButton courselist_btn;
    private javax.swing.JLabel date_lbl;
    private javax.swing.JButton edit_btn;
    private javax.swing.JLabel gst_lbl;
    private javax.swing.JButton home_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JButton logout_btn;
    private javax.swing.JPanel panel_print;
    private javax.swing.JLabel payment_lbl;
    private javax.swing.JButton print_btn;
    private javax.swing.JLabel receipt_lbl;
    private javax.swing.JLabel received_lbl;
    private javax.swing.JLabel remark_lbl;
    private javax.swing.JLabel roll_lbl;
    private javax.swing.JButton searchRecord_btn;
    private javax.swing.JLabel sgst_lbl;
    private javax.swing.JPanel sidepanel;
    private javax.swing.JLabel text_bank;
    private javax.swing.JLabel totalInWords_lbl;
    private javax.swing.JLabel total_lbl;
    private javax.swing.JLabel txt_cheque;
    private javax.swing.JButton viewall_btn;
    private javax.swing.JLabel year1_lbl;
    private javax.swing.JLabel year2_lbl;
    // End of variables declaration//GEN-END:variables
}
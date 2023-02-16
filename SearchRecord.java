
import java.sql.ResultSet;
import java.util.*;
import javax.swing.*;
import javax.swing.table.AbstractTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author HP
 */
public class SearchRecord extends javax.swing.JFrame {
    ArrayList<SRecord> sr;
    mytablemodel tm;
    JTable jt;
    JScrollPane jsp;

    /**
     * Creates new form SearchRecord
     */
    public SearchRecord() {
        initComponents();
        sr = new ArrayList<>();
//        sr.add(new SRecord("abc","afklsdf","klafj"));
        tm = new mytablemodel();
        jt = new JTable();
        jsp =new JScrollPane(jt);
        jt.setModel(tm);
        jsp.setBounds(580,160,890,620);
        add(jsp);
        
        setSize(1900,1100);
        setTitle("SEARCH RECORD");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setRecordToTable();
        
    
    }
    class mytablemodel extends AbstractTableModel{

        @Override
        public int getRowCount() {
            return sr.size();
        }

        @Override
        public int getColumnCount() {
            return 6;
        }
        @Override
        public String getColumnName(int j) {
            String s[] ={"ReceiptNo","StudentName","Payment Mode","Course","Amount","Remarks"};
            return s[j];
        }

        @Override
        public Object getValueAt(int i, int j) {
            SRecord sd = sr.get(i);
            if(j==0)
                return sd.receiptNo;
            else if(j==1)
                return sd.studentName;
            else if(j==2)
                return sd.paymentMode;
            else if(j==3)
                return sd.course;
            else if(j==4)
                return sd.amount;
            else
                return sd.remark;
        }
        
    }
    public void setRecordToTable(){
        sr.clear();
        try{
            ResultSet rs = DBLoader.executeSQL("select * from feedetails");
            while(rs.next()){
                String rec = rs.getString("receiptNo");
                String stud = rs.getString("studentName");
                String pay = rs.getString("payment_mode");
                String cors = rs.getString("courseName");
                String amt = rs.getString("totalAmount");
                String rem  = rs.getString("remarks");
                
                sr.add(new SRecord(rec,stud,pay,cors,amt,rem));
            }
            tm.fireTableDataChanged();
            
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
        search_title = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        student_lbl = new javax.swing.JLabel();
        search_tf = new javax.swing.JTextField();
        search_btn = new javax.swing.JButton();

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
        courselist_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courselist_btnActionPerformed(evt);
            }
        });
        sidepanel.add(courselist_btn);
        courselist_btn.setBounds(120, 300, 250, 80);

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
        viewall_btn.setBounds(120, 430, 250, 80);

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
        back_btn.setBounds(120, 570, 250, 70);

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
        logout_btn.setBounds(120, 690, 250, 70);

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
        home_btn.setBounds(120, 60, 250, 80);

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
        searchRecord_btn.setBounds(120, 180, 250, 80);

        getContentPane().add(sidepanel);
        sidepanel.setBounds(0, 0, 540, 1040);

        search_title.setBackground(new java.awt.Color(51, 204, 255));
        search_title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        search_title.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\OneDrive\\Documents\\NetBeansProjects\\Fee_management\\src\\feeimages\\search2.png")); // NOI18N
        search_title.setText("Search Records");
        getContentPane().add(search_title);
        search_title.setBounds(840, 10, 260, 60);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 204, 255));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(630, 80, 780, 20);

        student_lbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        student_lbl.setText("ENTER NAME OF STUDENT :");
        getContentPane().add(student_lbl);
        student_lbl.setBounds(610, 90, 240, 40);

        search_tf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(search_tf);
        search_tf.setBounds(890, 90, 280, 50);

        search_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        search_btn.setText("SEARCH");
        search_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_btnActionPerformed(evt);
            }
        });
        getContentPane().add(search_btn);
        search_btn.setBounds(1230, 101, 100, 30);

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

    private void home_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_btnActionPerformed
        // TODO add your handling code here:
        Home obj = new Home();
        obj.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_home_btnActionPerformed

    private void searchRecord_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchRecord_btnActionPerformed
        // TODO add your handling code here:
         SearchRecord obj =new SearchRecord();
         obj.setVisible(true);
         
         this.dispose();
    }//GEN-LAST:event_searchRecord_btnActionPerformed

    private void courselist_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courselist_btnActionPerformed
        // TODO add your handling code here:
        viewCourse obj = new viewCourse();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_courselist_btnActionPerformed

    private void viewall_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewall_btnActionPerformed
        // TODO add your handling code here:
        viewAllRecords obj = new viewAllRecords();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_viewall_btnActionPerformed

    private void search_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_btnActionPerformed
        // TODO add your handling code here:
         sr.clear();
         String search = (String)search_tf.getText();
        try{
            
            ResultSet rs = DBLoader.executeSQL("select * from feedetails where studentName='"+search+"'");
            while(rs.next()){
                String rec = rs.getString("receiptNo");
                String stud = rs.getString("studentName");
                String pay = rs.getString("payment_mode");
                String cors = rs.getString("courseName");
                String amt = rs.getString("totalAmount");
                String rem  = rs.getString("remarks");
                
                sr.add(new SRecord(rec,stud,pay,cors,amt,rem));
            }
            tm.fireTableDataChanged();
            
        }
        catch(Exception ex){
            
            ex.printStackTrace();
        }
    }//GEN-LAST:event_search_btnActionPerformed

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
            java.util.logging.Logger.getLogger(SearchRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_btn;
    private javax.swing.JButton courselist_btn;
    private javax.swing.JButton home_btn;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton logout_btn;
    private javax.swing.JButton searchRecord_btn;
    private javax.swing.JButton search_btn;
    private javax.swing.JTextField search_tf;
    private javax.swing.JLabel search_title;
    private javax.swing.JPanel sidepanel;
    private javax.swing.JLabel student_lbl;
    private javax.swing.JButton viewall_btn;
    // End of variables declaration//GEN-END:variables
}
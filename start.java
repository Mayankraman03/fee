/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author HP
 */
public class start extends javax.swing.JFrame {

    /**
     * Creates new form start
     */
    public start() {
        initComponents();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("START");
        setSize(650,700);
        setVisible(true);
        setLayout(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        accountant_btn = new javax.swing.JButton();
        admin_btn = new javax.swing.JButton();
        user_btn = new javax.swing.JButton();
        logout_btn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        accountant_btn.setBackground(new java.awt.Color(51, 204, 255));
        accountant_btn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        accountant_btn.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\OneDrive\\Documents\\NetBeansProjects\\Fee_management\\src\\feeimages\\login.png")); // NOI18N
        accountant_btn.setText("ACCOUNTANT");
        accountant_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        accountant_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        accountant_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountant_btnActionPerformed(evt);
            }
        });
        getContentPane().add(accountant_btn);
        accountant_btn.setBounds(150, 370, 260, 100);

        admin_btn.setBackground(new java.awt.Color(51, 204, 255));
        admin_btn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        admin_btn.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\OneDrive\\Documents\\NetBeansProjects\\Fee_management\\src\\feeimages\\admin.png")); // NOI18N
        admin_btn.setText("ADMIN");
        admin_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        admin_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        admin_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_btnActionPerformed(evt);
            }
        });
        getContentPane().add(admin_btn);
        admin_btn.setBounds(143, 87, 260, 100);

        user_btn.setBackground(new java.awt.Color(51, 204, 255));
        user_btn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        user_btn.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\OneDrive\\Documents\\NetBeansProjects\\Fee_management\\src\\feeimages\\new-user.png")); // NOI18N
        user_btn.setText("USER");
        user_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        user_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        user_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_btnActionPerformed(evt);
            }
        });
        getContentPane().add(user_btn);
        user_btn.setBounds(150, 230, 260, 100);

        logout_btn.setBackground(new java.awt.Color(51, 204, 255));
        logout_btn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        logout_btn.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\OneDrive\\Documents\\NetBeansProjects\\Fee_management\\src\\feeimages\\logout.png")); // NOI18N
        logout_btn.setText("LOGOUT");
        logout_btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        logout_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        logout_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_btnActionPerformed(evt);
            }
        });
        getContentPane().add(logout_btn);
        logout_btn.setBounds(190, 510, 190, 90);

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));
        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 630, 660);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void admin_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_btnActionPerformed
        // TODO add your handling code here:
        Admin obj = new Admin();
        obj.setVisible(true);
    }//GEN-LAST:event_admin_btnActionPerformed

    private void accountant_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountant_btnActionPerformed
        // TODO add your handling code here:
        AccountantLogin obj = new AccountantLogin();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_accountant_btnActionPerformed

    private void user_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_btnActionPerformed
        // TODO add your handling code here:
         login obj = new login();
         obj.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_user_btnActionPerformed

    private void logout_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_btnActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_logout_btnActionPerformed

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
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new start().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accountant_btn;
    private javax.swing.JButton admin_btn;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logout_btn;
    private javax.swing.JButton user_btn;
    // End of variables declaration//GEN-END:variables
}
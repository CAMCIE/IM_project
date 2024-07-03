package com.mycompany.mavenwithdatabase;

import java.net.URL;
import javax.swing.ImageIcon;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form TenantLog
     */
    public Home() {
        initComponents();
      
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TENANT_BTTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        VISITOR_BTTN = new javax.swing.JButton();
        ADMIN_BTTN = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(171, 194, 112));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(250, 401));

        TENANT_BTTN.setBackground(new java.awt.Color(254, 200, 104));
        TENANT_BTTN.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 18)); // NOI18N
        TENANT_BTTN.setForeground(new java.awt.Color(71, 60, 51));
        TENANT_BTTN.setText("T E N A N T");
        TENANT_BTTN.setBorder(null);
        TENANT_BTTN.setPreferredSize(new java.awt.Dimension(150, 50));
        TENANT_BTTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TENANT_BTTNActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(71, 60, 51));
        jLabel1.setText(" WELCOME! ");

        VISITOR_BTTN.setBackground(new java.awt.Color(253, 167, 105));
        VISITOR_BTTN.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 18)); // NOI18N
        VISITOR_BTTN.setForeground(new java.awt.Color(71, 60, 51));
        VISITOR_BTTN.setText("V I S I T O R");
        VISITOR_BTTN.setBorder(null);
        VISITOR_BTTN.setPreferredSize(new java.awt.Dimension(150, 50));
        VISITOR_BTTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VISITOR_BTTNActionPerformed(evt);
            }
        });

        ADMIN_BTTN.setBackground(new java.awt.Color(171, 194, 112));
        ADMIN_BTTN.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 18)); // NOI18N
        ADMIN_BTTN.setForeground(new java.awt.Color(71, 60, 51));
        ADMIN_BTTN.setText("A D M I N");
        ADMIN_BTTN.setBorder(null);
        ADMIN_BTTN.setPreferredSize(new java.awt.Dimension(150, 50));
        ADMIN_BTTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADMIN_BTTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(TENANT_BTTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VISITOR_BTTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ADMIN_BTTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(TENANT_BTTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(VISITOR_BTTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(ADMIN_BTTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.WEST);

        jPanel2.setBackground(new java.awt.Color(171, 194, 112));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesNew/main logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel2)
                .addContainerGap(121, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel2)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TENANT_BTTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TENANT_BTTNActionPerformed
        // TODO add your handling code here:
        TenantLog GoToTenant = new TenantLog();
        GoToTenant.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_TENANT_BTTNActionPerformed

    private void VISITOR_BTTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VISITOR_BTTNActionPerformed
        // TODO add your handling code here:
        VisitorLog GoToVisitor = new VisitorLog();
        GoToVisitor.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VISITOR_BTTNActionPerformed

    private void ADMIN_BTTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADMIN_BTTNActionPerformed
        // TODO add your handling code here:
        AdminLog GoToAdmin = new AdminLog();
        GoToAdmin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ADMIN_BTTNActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADMIN_BTTN;
    private javax.swing.JButton TENANT_BTTN;
    private javax.swing.JButton VISITOR_BTTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}

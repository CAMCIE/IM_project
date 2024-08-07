/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mavenwithdatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class BillingHistory extends javax.swing.JFrame {
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;

    /**
     * Creates new form VisitHistory
     */
    public BillingHistory() {
        initComponents();
        conn = Mavenwithdatabase.conn();
        fetchBillingData();
    }
    private void closeResources(Connection conn, PreparedStatement pst, ResultSet rs) {
    try {
        if (rs != null) rs.close();
        if (pst != null) pst.close();
        if (conn != null) conn.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error closing resources: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        BILLING_TABLE = new javax.swing.JTable();
        BACKTenantinfo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        SEARCH_BAR = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        SEARCH = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        BILLING_TABLE.setBackground(new java.awt.Color(51, 51, 51));
        BILLING_TABLE.setForeground(new java.awt.Color(255, 255, 255));
        BILLING_TABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "ROOM NO.", "TOTAL BILL", "PAYMENT STATUS", "DUE DATE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        BILLING_TABLE.setGridColor(new java.awt.Color(51, 51, 51));
        BILLING_TABLE.setSelectionBackground(new java.awt.Color(51, 51, 51));
        BILLING_TABLE.setSelectionForeground(new java.awt.Color(51, 51, 51));
        BILLING_TABLE.setShowGrid(true);
        jScrollPane2.setViewportView(BILLING_TABLE);

        BACKTenantinfo.setBackground(new java.awt.Color(171, 194, 112));
        BACKTenantinfo.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 18)); // NOI18N
        BACKTenantinfo.setForeground(new java.awt.Color(71, 60, 51));
        BACKTenantinfo.setText("B A C K");
        BACKTenantinfo.setPreferredSize(new java.awt.Dimension(150, 50));
        BACKTenantinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKTenantinfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BACKTenantinfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BACKTenantinfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(171, 194, 112));
        jPanel2.setPreferredSize(new java.awt.Dimension(661, 50));

        SEARCH_BAR.setBackground(new java.awt.Color(255, 255, 255));
        SEARCH_BAR.setColumns(20);
        SEARCH_BAR.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 12)); // NOI18N
        SEARCH_BAR.setForeground(new java.awt.Color(51, 51, 51));
        SEARCH_BAR.setRows(1);
        SEARCH_BAR.setTabSize(2);
        jScrollPane1.setViewportView(SEARCH_BAR);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesNew/search.png"))); // NOI18N

        SEARCH.setBackground(new java.awt.Color(255, 255, 255));
        SEARCH.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        SEARCH.setForeground(new java.awt.Color(171, 194, 112));
        SEARCH.setText("SEARCH NAME");
        SEARCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEARCHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(249, Short.MAX_VALUE)
                .addComponent(SEARCH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SEARCH)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BACKTenantinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKTenantinfoActionPerformed
        // TODO add your handling code here:
        ADMINCITE GoToADMINCITE = new ADMINCITE();
        GoToADMINCITE.setVisible(true);
        this.dispose();
        closeResources(conn, pst, rs);
    }//GEN-LAST:event_BACKTenantinfoActionPerformed

    private void SEARCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEARCHActionPerformed
        // TODO add your handling code here:
        String searching = SEARCH_BAR.getText();
        
        try {
        String sql = "SELECT b.BillingID, a.Tenant_Name, a.RoomNo, b.Total_Billing, b.Payment_Stat, b.Due_Date " +
                     "FROM billing_t b " +
                     "JOIN admin a ON b.TenantID = a.TenantID " +
                     "WHERE a.Tenant_Name LIKE ? " + 
                     "ORDER BY b.Due_Date";
        pst = conn.prepareStatement(sql);
        pst.setString(1, "%" + searching + "%"); 
        rs = pst.executeQuery();

        DefaultTableModel model = (DefaultTableModel) BILLING_TABLE.getModel();
        model.setRowCount(0); 

        while (rs.next()) {
            int billingID = rs.getInt("BillingID");
            String tenantNameResult = rs.getString("Tenant_Name");
            String roomNo = rs.getString("RoomNo");
            float totalBilling = rs.getFloat("Total_Billing");
            String paymentStat = rs.getString("Payment_Stat");
            String dueDate = rs.getString("Due_Date");

            model.addRow(new Object[]{billingID, tenantNameResult, roomNo, totalBilling, paymentStat, dueDate});
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
    }//GEN-LAST:event_SEARCHActionPerformed
    
    private void fetchBillingData() {
        try {
            String sql = "SELECT b.BillingID, a.Tenant_Name, a.RoomNo, b.Total_Billing, b.Payment_Stat, b.Due_Date " +
                         "FROM billing_t b " +
                         "JOIN admin a ON b.TenantID = a.TenantID " + 
                         "ORDER BY b.Due_Date";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            DefaultTableModel model = (DefaultTableModel) BILLING_TABLE.getModel();
            model.setRowCount(0); 

            while (rs.next()) {
                int billingID = rs.getInt("BillingID");
                String tenantName = rs.getString("Tenant_Name");
                String roomNo = rs.getString("RoomNo");
                float totalBilling = rs.getFloat("Total_Billing");
                String paymentStat = rs.getString("Payment_Stat");
                String dueDate = rs.getString("Due_Date");

                model.addRow(new Object[]{billingID, tenantName, roomNo, totalBilling, paymentStat, dueDate});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } 
    }
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
            java.util.logging.Logger.getLogger(BillingHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillingHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillingHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillingHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
       try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BillingHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillingHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillingHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillingHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillingHistory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BACKTenantinfo;
    private javax.swing.JTable BILLING_TABLE;
    private javax.swing.JButton SEARCH;
    private javax.swing.JTextArea SEARCH_BAR;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}

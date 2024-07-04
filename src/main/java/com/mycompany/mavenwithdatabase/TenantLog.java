package com.mycompany.mavenwithdatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class TenantLog extends javax.swing.JFrame {
       
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;
    /**
     * Creates new form TenantLog
     */
    public TenantLog() {
        initComponents();
        conn = Mavenwithdatabase.conn();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TenantName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TenantLogin_bttn = new javax.swing.JButton();
        ContactNo = new javax.swing.JTextField();
        BackBTTN = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        sign_up_BTTN = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        sign_name = new javax.swing.JTextField();
        sign_address = new javax.swing.JTextField();
        sign_contact = new javax.swing.JTextField();
        sign_contract = new javax.swing.JTextField();
        sign_room = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(171, 194, 112));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(250, 401));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(71, 60, 51));
        jLabel1.setText(" WELCOME! ");

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(71, 60, 51));
        jLabel2.setText("TENANT ID:");

        TenantName.setBackground(new java.awt.Color(255, 255, 255));
        TenantName.setForeground(new java.awt.Color(71, 60, 51));
        TenantName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(253, 167, 105), new java.awt.Color(253, 167, 105), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));
        TenantName.setName("TENANT ID"); // NOI18N
        TenantName.setSelectedTextColor(new java.awt.Color(71, 60, 51));
        TenantName.setSelectionColor(new java.awt.Color(171, 194, 112));
        TenantName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TenantNameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(71, 60, 51));
        jLabel3.setText("PASSWORD:");

        TenantLogin_bttn.setBackground(new java.awt.Color(254, 200, 104));
        TenantLogin_bttn.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 18)); // NOI18N
        TenantLogin_bttn.setForeground(new java.awt.Color(71, 60, 51));
        TenantLogin_bttn.setText("LOG IN");
        TenantLogin_bttn.setBorder(null);
        TenantLogin_bttn.setPreferredSize(new java.awt.Dimension(150, 50));
        TenantLogin_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TenantLogin_bttnActionPerformed(evt);
            }
        });

        ContactNo.setBackground(new java.awt.Color(255, 255, 255));
        ContactNo.setForeground(new java.awt.Color(71, 60, 51));
        ContactNo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(253, 167, 105), new java.awt.Color(253, 167, 105), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));
        ContactNo.setName("PASS"); // NOI18N
        ContactNo.setSelectedTextColor(new java.awt.Color(71, 60, 51));
        ContactNo.setSelectionColor(new java.awt.Color(171, 194, 112));
        ContactNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContactNoActionPerformed(evt);
            }
        });

        BackBTTN.setBackground(new java.awt.Color(253, 167, 105));
        BackBTTN.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 18)); // NOI18N
        BackBTTN.setForeground(new java.awt.Color(71, 60, 51));
        BackBTTN.setText("BACK");
        BackBTTN.setBorder(null);
        BackBTTN.setPreferredSize(new java.awt.Dimension(150, 50));
        BackBTTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBTTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TenantName))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(7, 7, 7)
                        .addComponent(ContactNo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TenantLogin_bttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BackBTTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 44, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TenantName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(TenantLogin_bttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(BackBTTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        TenantName.getAccessibleContext().setAccessibleName("TENANT ID");
        TenantName.getAccessibleContext().setAccessibleDescription("");
        ContactNo.getAccessibleContext().setAccessibleName("PASS");

        getContentPane().add(jPanel1, java.awt.BorderLayout.WEST);

        jPanel2.setBackground(new java.awt.Color(171, 194, 112));

        sign_up_BTTN.setBackground(new java.awt.Color(255, 255, 255));
        sign_up_BTTN.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 18)); // NOI18N
        sign_up_BTTN.setForeground(new java.awt.Color(71, 60, 51));
        sign_up_BTTN.setText("SIGN UP");
        sign_up_BTTN.setBorder(null);
        sign_up_BTTN.setName("SIGN UP"); // NOI18N
        sign_up_BTTN.setPreferredSize(new java.awt.Dimension(150, 50));
        sign_up_BTTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_up_BTTNActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(71, 60, 51));
        jLabel4.setText("TENANT NAME:");

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(71, 60, 51));
        jLabel5.setText("TENANT ADDRESS:");

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(71, 60, 51));
        jLabel6.setText("TENANT CONTACT NO.:");

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(71, 60, 51));
        jLabel7.setText("CONTRACT PERIOD:");

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(71, 60, 51));
        jLabel8.setText("ROOM NO.:");

        sign_name.setBackground(new java.awt.Color(255, 255, 255));
        sign_name.setForeground(new java.awt.Color(71, 60, 51));
        sign_name.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(253, 167, 105), new java.awt.Color(253, 167, 105), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));
        sign_name.setName("NAME"); // NOI18N
        sign_name.setSelectedTextColor(new java.awt.Color(71, 60, 51));
        sign_name.setSelectionColor(new java.awt.Color(171, 194, 112));
        sign_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_nameActionPerformed(evt);
            }
        });

        sign_address.setBackground(new java.awt.Color(255, 255, 255));
        sign_address.setForeground(new java.awt.Color(71, 60, 51));
        sign_address.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(253, 167, 105), new java.awt.Color(253, 167, 105), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));
        sign_address.setName("ADDRESS"); // NOI18N
        sign_address.setSelectedTextColor(new java.awt.Color(71, 60, 51));
        sign_address.setSelectionColor(new java.awt.Color(171, 194, 112));
        sign_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_addressActionPerformed(evt);
            }
        });

        sign_contact.setBackground(new java.awt.Color(255, 255, 255));
        sign_contact.setForeground(new java.awt.Color(71, 60, 51));
        sign_contact.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(253, 167, 105), new java.awt.Color(253, 167, 105), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));
        sign_contact.setName("CONTACT"); // NOI18N
        sign_contact.setSelectedTextColor(new java.awt.Color(71, 60, 51));
        sign_contact.setSelectionColor(new java.awt.Color(171, 194, 112));
        sign_contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_contactActionPerformed(evt);
            }
        });

        sign_contract.setBackground(new java.awt.Color(255, 255, 255));
        sign_contract.setForeground(new java.awt.Color(71, 60, 51));
        sign_contract.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(253, 167, 105), new java.awt.Color(253, 167, 105), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));
        sign_contract.setName("CONTRACT"); // NOI18N
        sign_contract.setSelectedTextColor(new java.awt.Color(71, 60, 51));
        sign_contract.setSelectionColor(new java.awt.Color(171, 194, 112));
        sign_contract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_contractActionPerformed(evt);
            }
        });

        sign_room.setBackground(new java.awt.Color(255, 255, 255));
        sign_room.setForeground(new java.awt.Color(71, 60, 51));
        sign_room.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(253, 167, 105), new java.awt.Color(253, 167, 105), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));
        sign_room.setName("ROOM"); // NOI18N
        sign_room.setSelectedTextColor(new java.awt.Color(71, 60, 51));
        sign_room.setSelectionColor(new java.awt.Color(171, 194, 112));
        sign_room.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_roomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sign_up_BTTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sign_room))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sign_name))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sign_address, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sign_contact))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sign_contract)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(sign_name, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(sign_address, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(sign_contact, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(sign_contract, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(sign_room, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(sign_up_BTTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        sign_name.getAccessibleContext().setAccessibleName("NAME");
        sign_address.getAccessibleContext().setAccessibleName("ADDRESS");
        sign_contact.getAccessibleContext().setAccessibleName("CONTACT");
        sign_contract.getAccessibleContext().setAccessibleName("CONTRACT");
        sign_room.getAccessibleContext().setAccessibleName("ROOM");

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sign_up_BTTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign_up_BTTNActionPerformed
        // TODO add your handling code here:
        String S_name = sign_name.getText();
        String S_address = sign_address.getText();
        String S_contact = sign_contact.getText();
        String S_room = sign_room.getText();
    
        try {
        // Check if the record already exists
        if (recordExists(S_name, S_address, S_contact, S_room)) {
            JOptionPane.showMessageDialog(this, "A record with the same details already exists. Cannot create another sign-up.", "Duplicate Entry", JOptionPane.WARNING_MESSAGE);
            clearFields();
            return;
        }
        
        // Insert new record into the database
        String SignQuery = "INSERT INTO admin(Tenant_name, Tenant_Address, Tenant_ContactNo, RoomNo) VALUES(?,?,?,?)";
        pst = conn.prepareStatement(SignQuery);
        pst.setString(1, S_name);
        pst.setString(2, S_address);
        pst.setString(3, S_contact);
        pst.setString(4, S_room);
        
        pst.executeUpdate();
        
        JOptionPane.showMessageDialog(this, "Record inserted successfully! Try logging in!\nUSERNAME: " + S_name + " CONTACT: " + S_contact);
        
        clearFields(); // Clear the input fields after successful insertion
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "SQL error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        } finally {
        // Close resources in the finally block
        try {
            if (pst != null) {
                pst.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error closing PreparedStatement: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
                
    }//GEN-LAST:event_sign_up_BTTNActionPerformed

    private void TenantNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TenantNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TenantNameActionPerformed

    private void TenantLogin_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TenantLogin_bttnActionPerformed
        // TODO add your handling code here:
        String Name = TenantName.getText();
        String contact = ContactNo.getText();
        try{
            String query = "SELECT * FROM admin WHERE Tenant_Name=? AND Tenant_ContactNo=?";
            pst = conn.prepareStatement(query);
            pst.setString(1, Name);
            pst.setString(2, contact);
            rs = pst.executeQuery();
            
            if (rs.next()) {
                int tenantID = rs.getInt("TenantID");

                // Query to retrieve billing information based on TenantID
                String billingQuery = "SELECT * FROM billing_t WHERE TenantID=? ORDER BY Due_Date DESC LIMIT 1";
                pst = conn.prepareStatement(billingQuery);
                pst.setInt(1, tenantID);
                rs = pst.executeQuery();

                if (rs.next()) {
                    float waterBill = rs.getFloat("Water_Bill");
                    float electricBill = rs.getFloat("Electric_Bill");
                    float roomRent = rs.getFloat("Room_Rent");
                    float maintenanceBill = rs.getFloat("Maintenance_Bill");
                    float totalBilling = rs.getFloat("Total_Billing");
                    String paymentStatus = rs.getString("Payment_Stat");
                    String dueDate = rs.getString("Due_Date");
                    clearFields();
                    this.dispose();

                    // Create and show the TenantInfo JFrame with retrieved data
                    TenantInfo tenantInfoFrame = new TenantInfo(waterBill, electricBill, roomRent, maintenanceBill, totalBilling, paymentStatus, dueDate);
                    tenantInfoFrame.setVisible(true);
                    
                } else {
                    JOptionPane.showMessageDialog(null, "No billing information found for this tenant.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "USERNAME OR PASSWORD IS INCORRECT");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_TenantLogin_bttnActionPerformed
    private boolean recordExists( String name, String address, String contact, String room) {
    try {
        // SQL query to check for existing record
        String checkQuery = "SELECT COUNT(*) FROM admin WHERE Tenant_name = ? AND Tenant_Address = ? AND Tenant_ContactNo = ? AND RoomNo = ?";
        pst = conn.prepareStatement(checkQuery);
        
        // Set parameters
        pst.setString(1, name);
        pst.setString(2, address);
        pst.setString(3, contact);
        pst.setString(4, room);
        
        // Execute query
        rs = pst.executeQuery();
        
        // Check if a record exists
        if (rs.next() && rs.getInt(1) > 0) {
            return true; // Record exists
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "SQL error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace();
    } finally {
        // Close resources in the finally block
        try {
            if (rs != null) {
                rs.close();
            }
            if (pst != null) {
                pst.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error closing resources: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
    
    return false; // No record found
}

// Method to clear the text fields
    private void clearFields() {
    sign_name.setText("");
    sign_address.setText("");
    sign_contact.setText("");
    sign_contract.setText("");
    sign_room.setText("");
}
    private void ContactNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContactNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContactNoActionPerformed

    private void sign_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sign_nameActionPerformed

    private void sign_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sign_addressActionPerformed

    private void sign_contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sign_contactActionPerformed

    private void sign_contractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign_contractActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sign_contractActionPerformed

    private void sign_roomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign_roomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sign_roomActionPerformed

    private void BackBTTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBTTNActionPerformed
        // TODO add your handling code here:
        Home GoToHome = new Home();
        GoToHome.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackBTTNActionPerformed

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
            java.util.logging.Logger.getLogger(TenantLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TenantLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TenantLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TenantLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TenantLog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBTTN;
    private javax.swing.JTextField ContactNo;
    private javax.swing.JButton TenantLogin_bttn;
    private javax.swing.JTextField TenantName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField sign_address;
    private javax.swing.JTextField sign_contact;
    private javax.swing.JTextField sign_contract;
    private javax.swing.JTextField sign_name;
    private javax.swing.JTextField sign_room;
    private javax.swing.JButton sign_up_BTTN;
    // End of variables declaration//GEN-END:variables
}

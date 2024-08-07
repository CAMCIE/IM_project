package com.mycompany.mavenwithdatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class VisitorLog extends javax.swing.JFrame {
    
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;

    /**
     * Creates new form TenantLog
     */
    public VisitorLog() {
        initComponents();
        conn = Mavenwithdatabase.conn();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TOname = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        TOroom = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        TOtenant = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        TOtimeout = new javax.swing.JTextField();
        TIMEOUTbttn = new javax.swing.JButton();
        TOdate = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        TIaddress = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TInumber = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TIdate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TItimein = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TItenant = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TIroom = new javax.swing.JTextField();
        BackHome = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TIname = new javax.swing.JTextField();
        TIMEIN_BTTN = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(171, 194, 112));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(250, 401));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(71, 60, 51));
        jLabel1.setText("TIME OUT");

        jLabel10.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(71, 60, 51));
        jLabel10.setText("NAME:");

        TOname.setBackground(new java.awt.Color(255, 255, 255));
        TOname.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        TOname.setForeground(new java.awt.Color(51, 51, 51));
        TOname.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(253, 167, 105), new java.awt.Color(253, 167, 105)));
        TOname.setName("VISITORNAME"); // NOI18N
        TOname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TOnameActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(71, 60, 51));
        jLabel11.setText("ROOM VISITED:");

        TOroom.setBackground(new java.awt.Color(255, 255, 255));
        TOroom.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        TOroom.setForeground(new java.awt.Color(51, 51, 51));
        TOroom.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(253, 167, 105), new java.awt.Color(253, 167, 105)));
        TOroom.setName("ROOMVISITED"); // NOI18N

        jLabel12.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(71, 60, 51));
        jLabel12.setText("TENANT VISITED:");

        TOtenant.setBackground(new java.awt.Color(255, 255, 255));
        TOtenant.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        TOtenant.setForeground(new java.awt.Color(51, 51, 51));
        TOtenant.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(253, 167, 105), new java.awt.Color(253, 167, 105)));
        TOtenant.setName("TENANTVISITED"); // NOI18N

        jLabel13.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(71, 60, 51));
        jLabel13.setText("TIME OUT");

        TOtimeout.setBackground(new java.awt.Color(255, 255, 255));
        TOtimeout.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        TOtimeout.setForeground(new java.awt.Color(51, 51, 51));
        TOtimeout.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(253, 167, 105), new java.awt.Color(253, 167, 105)));
        TOtimeout.setName("TIMEOUT"); // NOI18N

        TIMEOUTbttn.setBackground(new java.awt.Color(254, 200, 104));
        TIMEOUTbttn.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 18)); // NOI18N
        TIMEOUTbttn.setForeground(new java.awt.Color(71, 60, 51));
        TIMEOUTbttn.setText("TIME OUT");
        TIMEOUTbttn.setBorder(null);
        TIMEOUTbttn.setPreferredSize(new java.awt.Dimension(100, 40));
        TIMEOUTbttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TIMEOUTbttnActionPerformed(evt);
            }
        });

        TOdate.setBackground(new java.awt.Color(255, 255, 255));
        TOdate.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        TOdate.setForeground(new java.awt.Color(51, 51, 51));
        TOdate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(253, 167, 105), new java.awt.Color(253, 167, 105)));
        TOdate.setName("TIMEOUT"); // NOI18N

        jLabel16.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(71, 60, 51));
        jLabel16.setText("DATE:");

        jLabel17.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(71, 60, 51));
        jLabel17.setText("YYYY-MM-DD");

        jLabel18.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(71, 60, 51));
        jLabel18.setText("HH:mm:ss");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel10)
                            .addComponent(TOname, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(TOroom, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(TOtenant, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TOtimeout, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TOdate, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 3, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(TIMEOUTbttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TOname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TOroom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TOtenant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TOtimeout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TOdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(TIMEOUTbttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        TOname.getAccessibleContext().setAccessibleName("VISITORNAME");
        TOroom.getAccessibleContext().setAccessibleName("ROOMVISITED");
        TOtenant.getAccessibleContext().setAccessibleName("TENANTVISITED");
        TOtimeout.getAccessibleContext().setAccessibleName("TIMEOUT");

        getContentPane().add(jPanel1, java.awt.BorderLayout.WEST);

        jPanel2.setBackground(new java.awt.Color(171, 194, 112));

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(71, 60, 51));
        jLabel3.setText("ADDRESS:");

        TIaddress.setBackground(new java.awt.Color(255, 255, 255));
        TIaddress.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        TIaddress.setForeground(new java.awt.Color(51, 51, 51));
        TIaddress.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(253, 167, 105), new java.awt.Color(253, 167, 105)));
        TIaddress.setName("VADDRESS"); // NOI18N

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(71, 60, 51));
        jLabel4.setText("PHONE NO:");

        TInumber.setBackground(new java.awt.Color(255, 255, 255));
        TInumber.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        TInumber.setForeground(new java.awt.Color(51, 51, 51));
        TInumber.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(253, 167, 105), new java.awt.Color(253, 167, 105)));
        TInumber.setName("VPHONE"); // NOI18N

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(71, 60, 51));
        jLabel5.setText("DATE:");

        TIdate.setBackground(new java.awt.Color(255, 255, 255));
        TIdate.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        TIdate.setForeground(new java.awt.Color(51, 51, 51));
        TIdate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(253, 167, 105), new java.awt.Color(253, 167, 105)));
        TIdate.setName("DATE"); // NOI18N

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(71, 60, 51));
        jLabel6.setText("TIME IN:");

        TItimein.setBackground(new java.awt.Color(255, 255, 255));
        TItimein.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        TItimein.setForeground(new java.awt.Color(51, 51, 51));
        TItimein.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(253, 167, 105), new java.awt.Color(253, 167, 105)));
        TItimein.setName("TIMEIN"); // NOI18N

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(71, 60, 51));
        jLabel7.setText("TENANT TO VISIT:");

        TItenant.setBackground(new java.awt.Color(255, 255, 255));
        TItenant.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        TItenant.setForeground(new java.awt.Color(51, 51, 51));
        TItenant.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(253, 167, 105), new java.awt.Color(253, 167, 105)));
        TItenant.setName("TENANTTOVISIT"); // NOI18N

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(71, 60, 51));
        jLabel8.setText("ROOM TO VISIT:");

        TIroom.setBackground(new java.awt.Color(255, 255, 255));
        TIroom.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        TIroom.setForeground(new java.awt.Color(51, 51, 51));
        TIroom.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(253, 167, 105), new java.awt.Color(253, 167, 105)));
        TIroom.setName("ROOM"); // NOI18N

        BackHome.setBackground(new java.awt.Color(253, 167, 105));
        BackHome.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 18)); // NOI18N
        BackHome.setForeground(new java.awt.Color(71, 60, 51));
        BackHome.setText("BACK");
        BackHome.setBorder(null);
        BackHome.setPreferredSize(new java.awt.Dimension(100, 40));
        BackHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackHomeActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(71, 60, 51));
        jLabel9.setText("TIME IN ");

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(71, 60, 51));
        jLabel2.setText("NAME:");

        TIname.setBackground(new java.awt.Color(255, 255, 255));
        TIname.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        TIname.setForeground(new java.awt.Color(51, 51, 51));
        TIname.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(253, 167, 105), new java.awt.Color(253, 167, 105)));
        TIname.setName("VNAME"); // NOI18N

        TIMEIN_BTTN.setBackground(new java.awt.Color(254, 200, 104));
        TIMEIN_BTTN.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 18)); // NOI18N
        TIMEIN_BTTN.setForeground(new java.awt.Color(71, 60, 51));
        TIMEIN_BTTN.setText("TIME IN");
        TIMEIN_BTTN.setBorder(null);
        TIMEIN_BTTN.setPreferredSize(new java.awt.Dimension(100, 40));
        TIMEIN_BTTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TIMEIN_BTTNActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(71, 60, 51));
        jLabel14.setText("YYYY-MM-DD");

        jLabel15.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(71, 60, 51));
        jLabel15.setText("HH:mm:ss");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TIdate, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TIname, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TInumber, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(339, 339, 339)
                                .addComponent(BackHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TIMEIN_BTTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TIaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(TIroom, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TItenant, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TItimein, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TIname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TIaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TInumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TIdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TItimein, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TItenant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TIroom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(TIMEIN_BTTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BackHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );

        TIaddress.getAccessibleContext().setAccessibleName("VADDRESS");
        TInumber.getAccessibleContext().setAccessibleName("VPHONE");
        TIdate.getAccessibleContext().setAccessibleName("DATE");
        TItimein.getAccessibleContext().setAccessibleName("TIMEIN");
        TItenant.getAccessibleContext().setAccessibleName("TENANTTOVISIT");
        TIroom.getAccessibleContext().setAccessibleName("ROOM");
        TIname.getAccessibleContext().setAccessibleName("VNAME");

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TIMEOUTbttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TIMEOUTbttnActionPerformed
        // TODO add your handling code here:
        String Vname = TOname.getText();
        String Ttenant = TOtenant.getText();
        String Troom = TOroom.getText();
        String Vtimeout = TOtimeout.getText();
        String VDATE = TOdate.getText();

        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        java.sql.Date sqlDate = null;
        java.sql.Time sqlTimeOut = null;

        
        try {
            java.util.Date parsedDate = sdf.parse(VDATE);
            sqlDate = new java.sql.Date(parsedDate.getTime());
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "Invalid date format. Please use YYYY-MM-DD.", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            return;
        }

        
        try {
            sqlTimeOut = java.sql.Time.valueOf(Vtimeout);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, "Invalid time format. Please use HH:mm:ss.", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            return;
        }

        try {
            
            String checkQuery = "SELECT COUNT(*), VisitorID FROM visitor WHERE Visitor_Name = ? AND Date = ? AND Time_in IS NOT NULL AND Time_Out IS NULL";
            pst = conn.prepareStatement(checkQuery);
            pst.setString(1, Vname);
            pst.setDate(2, sqlDate);
            rs = pst.executeQuery();

            if (rs.next() && rs.getInt(1) > 0) {
                int visitorID = rs.getInt("VisitorID");

                
                String updateSQL = "UPDATE visitor SET Time_Out = ? WHERE VisitorID = ?";
                pst = conn.prepareStatement(updateSQL);
                pst.setTime(1, sqlTimeOut);
                pst.setInt(2, visitorID);

                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Time out recorded successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                clearFields();
            } else {
                JOptionPane.showMessageDialog(this, "Record does not exist. Please proceed to time in.", "Record Not Found", JOptionPane.WARNING_MESSAGE);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "SQL error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }  
    }//GEN-LAST:event_TIMEOUTbttnActionPerformed

    private void BackHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackHomeActionPerformed
        // TODO add your handling code here:
        Home GoToHome = new Home();
        GoToHome.setVisible(true);
        this.dispose();
        closeResources(conn, pst, rs);
    }//GEN-LAST:event_BackHomeActionPerformed

    private void TIMEIN_BTTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TIMEIN_BTTNActionPerformed
        // TODO add your handling code here:
        String vName = TIname.getText();
        String vAddress = TIaddress.getText();
        String vNumber = TInumber.getText();
        String vDate = TIdate.getText(); 
        String vTimeIn = TItimein.getText(); 
        String Tname = TItenant.getText();
        String Troom = TIroom.getText();

        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        java.sql.Date sqlDate = null;
        java.sql.Time sqlTimeIn = null;
        
        try {
            
            java.util.Date parsedDate = sdf.parse(vDate);
            sqlDate = new java.sql.Date(parsedDate.getTime());
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "Invalid date format. Please use YYYY-MM-DD.", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            return;
        }

        
        try {
            sqlTimeIn = java.sql.Time.valueOf(vTimeIn);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, "Invalid time format. Please use HH:mm:ss.", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            return;
        }

        try {
            
            if (recordExists(vName, sqlDate, sqlTimeIn, vNumber)) {
                JOptionPane.showMessageDialog(this, "A record with the same details already exists. Cannot create Time in again.", "Duplicate Entry", JOptionPane.WARNING_MESSAGE);
                clearFields();
                return;
            }

            
            String query = "SELECT TenantID FROM admin WHERE Tenant_Name = ? AND RoomNo = ?";
            pst = conn.prepareStatement(query);
            pst.setString(1, Tname);
            pst.setString(2, Troom);
            rs = pst.executeQuery();

            if (rs.next()) {
                int tenantID = rs.getInt("TenantID");

                
                String insertSQL = "INSERT INTO visitor (Visitor_Name, Date, Time_in, Visitor_Address, Visitor_ContactNo, TenantID) VALUES (?, ?, ?, ?, ?, ?)";
                pst = conn.prepareStatement(insertSQL);
                pst.setString(1, vName);
                pst.setDate(2, sqlDate); 
                pst.setTime(3, sqlTimeIn); 
                pst.setString(4, vAddress);
                pst.setString(5, vNumber);
                pst.setInt(6, tenantID);

                
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Record inserted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                clearFields();
            } else {
                JOptionPane.showMessageDialog(this, "Tenant name or room does not exist.", "Invalid Tenant", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "SQL error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_TIMEIN_BTTNActionPerformed
    private boolean recordExists(String Vname, java.sql.Date Vdate, java.sql.Time Vtimein, String Vcontact) {
        try {

            String checkQuery = "SELECT COUNT(*) FROM visitor WHERE Visitor_Name = ? AND Date = ? AND Time_in = ? AND Visitor_ContactNo = ?";
            pst = conn.prepareStatement(checkQuery);

            
            pst.setString(1, Vname);
            pst.setDate(2, Vdate); 
            pst.setTime(3, Vtimein); 
            pst.setString(4, Vcontact);

            
            rs = pst.executeQuery();

            
            if (rs.next() && rs.getInt(1) > 0) {
                return true; 
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "SQL error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        return false;
    }

    private void clearFields() {
        TIname.setText("");
        TIaddress.setText("");
        TInumber.setText("");
        TIdate.setText("");
        TItimein.setText("");
        TItenant.setText("");
        TIroom.setText("");
        
        TOname.setText("");
        TOtenant.setText("");
        TOroom.setText("");
        TOtimeout.setText("");
        TOdate.setText("");
    }
    
    private void TOnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TOnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TOnameActionPerformed

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
            java.util.logging.Logger.getLogger(VisitorLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisitorLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisitorLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisitorLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisitorLog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackHome;
    private javax.swing.JButton TIMEIN_BTTN;
    private javax.swing.JButton TIMEOUTbttn;
    private javax.swing.JTextField TIaddress;
    private javax.swing.JTextField TIdate;
    private javax.swing.JTextField TIname;
    private javax.swing.JTextField TInumber;
    private javax.swing.JTextField TIroom;
    private javax.swing.JTextField TItenant;
    private javax.swing.JTextField TItimein;
    private javax.swing.JTextField TOdate;
    private javax.swing.JTextField TOname;
    private javax.swing.JTextField TOroom;
    private javax.swing.JTextField TOtenant;
    private javax.swing.JTextField TOtimeout;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}

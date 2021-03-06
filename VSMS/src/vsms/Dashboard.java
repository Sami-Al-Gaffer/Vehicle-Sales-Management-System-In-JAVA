/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vsms;

import vsms.folder.MyFunction;

/**
 *
 * @author SAMI
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        show_record();
    }
    public void show_record(){
        
    customerJlabel.setText(Integer.toString(MyFunction.countData("customer")));
    userJlabel.setText(Integer.toString(MyFunction.countData("users")));
    vehicleJlabel.setText(Integer.toString(MyFunction.countVehileData("vehicles")));
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
        logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        userJlabel = new javax.swing.JLabel();
        customerJlabel = new javax.swing.JLabel();
        vehicleJlabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        dashboard = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        addEmployee = new javax.swing.JMenuItem();
        allEmployee = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        addManufacturer = new javax.swing.JMenuItem();
        addModel = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        allVechiles = new javax.swing.JMenuItem();
        soldVechiles = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Capture2 (2).PNG"))); // NOI18N
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Total Customer");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Total User");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Total Vechiles");

        userJlabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        customerJlabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        vehicleJlabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(userJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(customerJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(vehicleJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vehicleJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 51, 51));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 5));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setAlignmentX(5.0F);
        jMenuBar1.setAlignmentY(5.0F);
        jMenuBar1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jMenuBar1.setMargin(new java.awt.Insets(10, 10, 10, 10));

        dashboard.setBackground(new java.awt.Color(0, 102, 102));
        dashboard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 5));
        dashboard.setText("Dashboard     ");
        dashboard.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardActionPerformed(evt);
            }
        });
        jMenuBar1.add(dashboard);

        jMenu2.setBackground(new java.awt.Color(0, 51, 51));
        jMenu2.setText("Manage Employee     ");
        jMenu2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        addEmployee.setText("Add Employee");
        addEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmployeeActionPerformed(evt);
            }
        });
        jMenu2.add(addEmployee);

        allEmployee.setText("All Employee");
        allEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allEmployeeActionPerformed(evt);
            }
        });
        jMenu2.add(allEmployee);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Manufacturer & Model     ");
        jMenu3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        addManufacturer.setText("Add Manufacturer");
        addManufacturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addManufacturerActionPerformed(evt);
            }
        });
        jMenu3.add(addManufacturer);

        addModel.setText("Add Model");
        addModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addModelActionPerformed(evt);
            }
        });
        jMenu3.add(addModel);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Vechiles     ");
        jMenu4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        allVechiles.setText("All Vechiles");
        allVechiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allVechilesActionPerformed(evt);
            }
        });
        jMenu4.add(allVechiles);

        soldVechiles.setText("Sold Vechiles");
        soldVechiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soldVechilesActionPerformed(evt);
            }
        });
        jMenu4.add(soldVechiles);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_dashboardActionPerformed

    private void addEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmployeeActionPerformed
        // TODO add your handling code here:
        AddEmployee addemp = new AddEmployee();
        addemp.setVisible(true);
        dispose();
    }//GEN-LAST:event_addEmployeeActionPerformed

    private void addManufacturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addManufacturerActionPerformed
        // TODO add your handling code here:
        AddManufacturer manufacturer = new AddManufacturer();
        manufacturer.setVisible(true);
        dispose();
    }//GEN-LAST:event_addManufacturerActionPerformed

    private void addModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addModelActionPerformed
        // TODO add your handling code here:
        AddModel model = new AddModel();
        model.setVisible(true);
        dispose();
    }//GEN-LAST:event_addModelActionPerformed

    private void allVechilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allVechilesActionPerformed
        // TODO add your handling code here:
        AllVechiles allvechiles = new AllVechiles();
        allvechiles.setVisible(true);
        dispose();
    }//GEN-LAST:event_allVechilesActionPerformed

    private void soldVechilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soldVechilesActionPerformed
        // TODO add your handling code here:
        SoldVechiles soldvechiles = new SoldVechiles();
        soldvechiles.setVisible(true);
        dispose();
    }//GEN-LAST:event_soldVechilesActionPerformed

    private void allEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allEmployeeActionPerformed
        // TODO add your handling code here:
         AllEmployee allemp = new AllEmployee();
         allemp.setVisible(true);
         dispose();
    }//GEN-LAST:event_allEmployeeActionPerformed
        
   
    
    
    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_logoutActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addEmployee;
    private javax.swing.JMenuItem addManufacturer;
    private javax.swing.JMenuItem addModel;
    private javax.swing.JMenuItem allEmployee;
    private javax.swing.JMenuItem allVechiles;
    public static javax.swing.JLabel customerJlabel;
    private javax.swing.JMenu dashboard;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logout;
    private javax.swing.JMenuItem soldVechiles;
    public static javax.swing.JLabel userJlabel;
    public static javax.swing.JLabel vehicleJlabel;
    // End of variables declaration//GEN-END:variables
}

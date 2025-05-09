/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdminWorkArea;
import Model.Role.HealthCampRole;
import Model.Role.DriverRole;
import Model.Ecosystem;
import Model.Driver.Driver;
import Model.UserAccount.UserAccount;
import javax.swing.table.DefaultTableModel;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import java.awt.CardLayout;
/**
 *
 * @author varshakuruva
 */
public class Managedriver extends javax.swing.JPanel {

    
    JPanel ipcUserProcessContainer;
    Ecosystem ipcSystem;
    private UserAccount ipcAccount;
    
    
    public Managedriver(JPanel ipcUserProcessContainer, Ecosystem ipcSystem) {
        initComponents();
        this.ipcUserProcessContainer = ipcUserProcessContainer;
        this.ipcSystem = ipcSystem;
//        this.ipcAccount = ipcAccount;
        
        ipcPopulateDriverTable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDriverManage = new javax.swing.JTable();
        btnView1 = new javax.swing.JButton();
        btnDelete1 = new javax.swing.JButton();
        lbName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lbUserName = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        lbPassword = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        btnAdd1 = new javax.swing.JButton();
        lb1 = new javax.swing.JLabel();
        btnBack1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(214, 209, 222));
        jPanel1.setForeground(new java.awt.Color(63, 40, 101));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbDriverManage.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name ", "Username", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbDriverManage);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 520, 91));

        btnView1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnView1.setForeground(new java.awt.Color(63, 40, 101));
        btnView1.setText("VIEW");
        btnView1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnView1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnView1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnView1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 180, 60, 30));

        btnDelete1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnDelete1.setForeground(new java.awt.Color(63, 40, 101));
        btnDelete1.setText("DELETE");
        btnDelete1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 180, 70, 30));

        lbName.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lbName.setForeground(new java.awt.Color(63, 40, 101));
        lbName.setText("Name");
        jPanel1.add(lbName, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 230, 70, 30));
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 230, 100, -1));

        lbUserName.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lbUserName.setForeground(new java.awt.Color(63, 40, 101));
        lbUserName.setText("Username");
        jPanel1.add(lbUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, 110, 30));
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 310, 100, -1));

        lbPassword.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lbPassword.setForeground(new java.awt.Color(63, 40, 101));
        lbPassword.setText("Password");
        jPanel1.add(lbPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 310, 100, -1));
        jPanel1.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 270, 100, -1));

        btnAdd1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnAdd1.setForeground(new java.awt.Color(63, 40, 101));
        btnAdd1.setText("Add");
        btnAdd1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 370, 100, 40));

        lb1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lb1.setForeground(new java.awt.Color(63, 40, 101));
        lb1.setText("MANAGE DRIVER");
        jPanel1.add(lb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 218, -1));

        btnBack1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-back-arrow-64 (2) (1).png"))); // NOI18N
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 40, 30));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img2/aa.gif"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1080, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1063, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnView1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnView1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = tbDriverManage.getSelectedRow();
        if (selectedRow >= 0) {
        UserAccount driverSelected = (UserAccount) tbDriverManage.getValueAt(selectedRow, 0);
        txtName.setText(driverSelected.getIpcname());
        txtUserName.setText(driverSelected.getIpcuserName());
        txtPassword.setText(driverSelected.getIpcpassword());
        //        btnadd.setEnabled(false);
        }
        else  
        {
            JOptionPane.showMessageDialog(null, "to view the Driver details, Please select a row");
        }  
    }//GEN-LAST:event_btnView1ActionPerformed

    private void btnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = tbDriverManage.getSelectedRow();
        if (selectedRow >= 0) {
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Confirm delete?", "Warning", selectionButton);
            if (selectionResult == JOptionPane.YES_OPTION) {
                String username = (String) tbDriverManage.getValueAt(selectedRow, 1);
                String pwd = (String) tbDriverManage.getValueAt(selectedRow, 2);
                UserAccount user = ipcSystem.getUserAccountDirectory().authenticateUser(username, pwd);

                ipcSystem.getUserAccountDirectory().deleteUserAccount(user);
                ipcSystem.getDriverDirectory().deleteDriver(user.getIpcuserName());
                ipcPopulateDriverTable();
            }
        } else {
            JOptionPane.showMessageDialog(null, "to delete the Driver details, Please select a row");
        }
    }//GEN-LAST:event_btnDelete1ActionPerformed

    private void btnAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd1ActionPerformed
        // TODO add your handling code here:
        if (ipcSystem.getUserAccountDirectory().checkIfUsernameIsUnique(txtUserName.getText())) {
            UserAccount userAccount = ipcSystem.getUserAccountDirectory().createUserAccount(txtName.getText(), txtUserName.getText(), txtPassword.getText(), null, new DriverRole());
            Driver driver = ipcSystem.getDriverDirectory().createUserAccount(txtUserName.getText());
            System.out.println("health camp username while adding : "+ txtUserName.getText());
            ipcPopulateDriverTable();
            txtName.setText("");
            txtUserName.setText("");
            txtPassword.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Please enter Unique User Name");
        }
    }//GEN-LAST:event_btnAdd1ActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        // TODO add your handling code here:
        ipcUserProcessContainer.remove(this);
        CardLayout layout = (CardLayout) ipcUserProcessContainer.getLayout();
        layout.previous(ipcUserProcessContainer);
    }//GEN-LAST:event_btnBack1ActionPerformed
public void ipcPopulateDriverTable() {
        DefaultTableModel tablemodel = (DefaultTableModel) tbDriverManage.getModel();

        tablemodel.setRowCount(0);
        for (UserAccount user : ipcSystem.getUserAccountDirectory().getUserAccountList()) {

            if (user.getRole().getClass().getName().equals("Model.Role.DriverRole")) {
                Object[] row = new Object[3];
                row[0] = user;
                row[1] = user.getIpcuserName();
                row[2] = user.getIpcpassword();
                tablemodel.addRow(row);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd1;
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnView1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbUserName;
    private javax.swing.JTable tbDriverManage;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}

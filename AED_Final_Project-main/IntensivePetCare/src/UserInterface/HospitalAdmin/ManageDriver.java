/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.HospitalAdmin;
import java.util.regex.Matcher;
import javax.swing.JPanel;
import Model.Ecosystem;
import java.util.regex.Pattern;
import Model.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.CardLayout;


/**
 *
 * @author saran
 */
public class ManageDriver extends javax.swing.JPanel {

    /**
     * Creates new form ManageDriver
     */
    JPanel ipcUserProcessContainer;
    Ecosystem ipcSystem;
    private UserAccount ipcAccount;

    public ManageDriver(JPanel ipcUserProcessContainer, Ecosystem ipcSystem) {
        initComponents();
        this.ipcUserProcessContainer = ipcUserProcessContainer;
        this.ipcSystem = ipcSystem;
        this.ipcAccount = ipcAccount;
        ipcPopulateManageDriverTable();
    }

     private boolean validateInputFields() {

        Pattern p = Pattern.compile("^[A-Za-z0-9 ]+$");
        Matcher m = p.matcher(txt1.getText());
        
        Pattern p7 = Pattern.compile("^[A-Za-z0-9]+$");
        Matcher m7 = p7.matcher(txt2.getText());
        
        Pattern p1 = Pattern.compile("^[A-Za-z0-9]+$");
        Matcher m1 = p1.matcher(txt3.getText());
        
        
        if (!m.matches()) {

            JOptionPane.showMessageDialog(this, "Please try again by entering valid name");
            return false;
        } else if (!m7.matches()) {

            JOptionPane.showMessageDialog(this, "Please try again by entering valid username");
            return false;
        }
        else if (!m1.matches()) {

            JOptionPane.showMessageDialog(this, "Please try again by entering valid password");
            return false;
        }
        else {
            return true;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        lb2 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        lb3 = new javax.swing.JLabel();
        txt2 = new javax.swing.JTextField();
        lb4 = new javax.swing.JLabel();
        btn4 = new javax.swing.JButton();
        lb1 = new javax.swing.JLabel();
        btn5 = new javax.swing.JButton();
        txt3 = new javax.swing.JPasswordField();
        lb5 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 219, 65));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tb1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tb1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 520, 130));

        btn1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btn1.setForeground(new java.awt.Color(153, 0, 51));
        btn1.setText("VIEW");
        btn1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 60, 30));

        btn2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btn2.setForeground(new java.awt.Color(153, 0, 51));
        btn2.setText("UPDATE");
        btn2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 110, 30));

        btn3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btn3.setForeground(new java.awt.Color(153, 0, 0));
        btn3.setText("DELETE");
        btn3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, 80, 30));

        lb2.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lb2.setForeground(new java.awt.Color(153, 0, 51));
        lb2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb2.setText("NAME");
        jPanel1.add(lb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, 60, 30));

        txt1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        jPanel1.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 210, 120, 30));

        lb3.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lb3.setForeground(new java.awt.Color(153, 0, 51));
        lb3.setText("USERNAME");
        jPanel1.add(lb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, 80, 30));

        txt2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        jPanel1.add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 260, 120, 30));

        lb4.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lb4.setForeground(new java.awt.Color(153, 0, 51));
        lb4.setText("PASSWORD");
        jPanel1.add(lb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, 90, 30));

        btn4.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btn4.setForeground(new java.awt.Color(153, 0, 51));
        btn4.setText("ADD DRIVER");
        btn4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel1.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 380, 120, 40));

        lb1.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        lb1.setForeground(new java.awt.Color(153, 0, 51));
        lb1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb1.setText("MANAGE DRIVER");
        jPanel1.add(lb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 290, -1));

        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/login.png"))); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel1.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 70, 30));

        txt3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        jPanel1.add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 320, 120, 30));

        lb5.setBackground(new java.awt.Color(51, 153, 255));
        lb5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img2/doggie2.gif"))); // NOI18N
        jPanel1.add(lb5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 800, 610));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 930, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        int ipcselectedRow = tb1.getSelectedRow();
        if (ipcselectedRow >= 0) {
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Confirm delete?", "Warning", selectionButton);
            if (selectionResult == JOptionPane.YES_OPTION) {
                String ipcusername = (String) tb1.getValueAt(ipcselectedRow, 1);
                String ipcpwd = (String) tb1.getValueAt(ipcselectedRow, 2);
                UserAccount user = ipcSystem.getUserAccountDirectory().authenticateUser(ipcusername, ipcpwd);

                ipcSystem.getUserAccountDirectory().deleteUserAccount(user);
                ipcSystem.getLabAssistantDirectory().deleteLabAssistant(user.getIpcuserName());
                ipcPopulateManageDriverTable();
            }
        } else 
        {
            JOptionPane.showMessageDialog(null, "Please select a row in order to delete the details of Driver");
        }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn4ActionPerformed
  
    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        ipcUserProcessContainer.remove(this);
        CardLayout layout = (CardLayout) ipcUserProcessContainer.getLayout();
        layout.previous(ipcUserProcessContainer);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        int ipcselectRow = tb1.getSelectedRow();
        if (ipcselectRow >= 0) {
            String name = (String) tb1.getValueAt(ipcselectRow, 0);
            String username = (String) tb1.getValueAt(ipcselectRow, 1);
            String password = (String) tb1.getValueAt(ipcselectRow, 2);

            txt1.setText(name + "");
            txt2.setText(username + "");
            txt3.setText(password + "");
            btn4.setEnabled(false);
        }
 else  {
            JOptionPane.showMessageDialog(null, "Please select a row in order to view the details of Driver");
        }         
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        int ipcselectRow = tb1.getSelectedRow();
        if (ipcselectRow >= 0) {
        String name = (String) tb1.getValueAt(ipcselectRow, 0);
        String username = (String) tb1.getValueAt(ipcselectRow, 1);
        String password = (String) tb1.getValueAt(ipcselectRow, 2);
        ipcAccount = ipcSystem.getUserAccountDirectory().authenticateUser(username, password);
        ipcSystem.getUserAccountDirectory().updateUserAccount(ipcAccount, txt1.getText(), txt2.getText(), txt3.getText());
        ipcPopulateManageDriverTable();

        txt1.setText("");
        txt2.setText("");
        txt3.setText("");
        btn4.setEnabled(true);
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select a row in order to update the details of Driver");
             }
    }//GEN-LAST:event_btn2ActionPerformed

private void ipcPopulateManageDriverTable() {
        DefaultTableModel tablemodel = (DefaultTableModel) tb1.getModel();
        tablemodel.setRowCount(0);
        
         for (UserAccount user : ipcSystem.getUserAccountDirectory().getUserAccountList()) {

            if (user.getRole().getClass().getName().equals("Model.Role.DriverRole")) {
                Object[] row = new Object[3];
                row[0] = user.getIpcname();
                row[1] = user.getIpcuserName();
                row[2] = user.getIpcpassword();
                tablemodel.addRow(row);
            }
         }
        }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JTable tb1;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JPasswordField txt3;
    // End of variables declaration//GEN-END:variables

    
    
}



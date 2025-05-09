/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Hospital;

import javax.swing.JOptionPane;
import Model.LabAssistant.LabAssistant;
import javax.swing.JPanel;
import Model.Ecosystem;
import javax.swing.table.DefaultTableModel;
import Model.UserAccount.UserAccount;
import Model.PetVolunteer.PetVolunteer;
/**
 *
 * @author saran
 */
public class LabAssistantWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form LabAssistantWorkArea
     */
    
    JPanel ipcUserProcessContainer;
    Ecosystem ipcSystem;
    private UserAccount ipcAccount;
    
    public LabAssistantWorkArea(JPanel ipcUserProcessContainer, UserAccount ipcAccount, Ecosystem ipcSystem) {
        initComponents();
        
        this.ipcUserProcessContainer = ipcUserProcessContainer;
        this.ipcSystem = ipcSystem;
        this.ipcAccount = ipcAccount;
        ipcPopulateTable();
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        lb3 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        btn1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Pet Owner", "Pet Type", "Health Camp", "Test Result"
            }
        ));
        jScrollPane1.setViewportView(tb1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 730, 200));

        lb3.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lb3.setForeground(new java.awt.Color(153, 0, 0));
        lb3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb3.setText("RESULT OF LAB TEST");
        add(lb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 210, 30));

        txt1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, 220, 30));

        btn1.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btn1.setForeground(new java.awt.Color(153, 0, 51));
        btn1.setText("UPDATE STATUS");
        btn1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, 140, 30));

        jPanel1.setBackground(new java.awt.Color(102, 0, 51));

        lb1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lb1.setForeground(new java.awt.Color(255, 255, 255));
        lb1.setText("LAB REPRESENTATIVE MANAGEMENT ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(536, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));

        lb2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lb2.setForeground(new java.awt.Color(153, 0, 51));
        lb2.setText("Change the status of lab tests here !!");
        add(lb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 280, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        String ipcstatus = txt1.getText();
        for(LabAssistant labAssistant: ipcSystem.getLabAssistantDirectory().getLabAssistantDirectory()) {
            ipcSystem.getLabAssistantDirectory().updateLabAssistantTestResult(labAssistant, ipcstatus);
            System.out.println("Lab Result updation has been completed successfully");
        }
        for(LabAssistant labAssistant: ipcSystem.getLabAssistantDirectory().getLabAssistantDirectory()) {
            for(PetVolunteer petVolunteer: ipcSystem.getPetVolunteerDirectory().getPetVolunteerDirectory()) {
                if(petVolunteer.getIpcName().equals(labAssistant.getIpcpetOwner())){
                    ipcSystem.getPetVolunteerDirectory().updatePetVolunteerLabStatus(petVolunteer, ipcstatus);
                    System.out.println("Lab Result updation has been completed successfully");
                }
            }
        }
        JOptionPane.showMessageDialog(this, "Lab Result updation has been completed successfully");
        ipcPopulateTable();
    }//GEN-LAST:event_btn1ActionPerformed

      public void ipcPopulateTable() {
        DefaultTableModel tablemodel = (DefaultTableModel) tb1.getModel();
        tablemodel.setRowCount(0);
        for (LabAssistant labAssistant : ipcSystem.getLabAssistantDirectory().getLabAssistantDirectory()) {
            if (labAssistant.getIpcuserName().equals(ipcAccount.getIpcuserName())) {
                System.out.println("Lab assistant : " + labAssistant.getIpcuserName());
                System.out.println("Lab assistant : " + labAssistant.getIpcpetOwner());
                System.out.println("Lab assistant : " + labAssistant.getIpcpetType());
                Object[] row = new Object[4];
                row[0] = labAssistant.getIpcpetOwner();
                row[1] = labAssistant.getIpcpetType();
                row[2] = labAssistant.getIpchealthCamp();
                row[3] = labAssistant.getIpclabResultStatus() == null ? "N/A" : labAssistant.getIpclabResultStatus();
                tablemodel.addRow(row);
            }

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JTable tb1;
    private javax.swing.JTextField txt1;
    // End of variables declaration//GEN-END:variables
}

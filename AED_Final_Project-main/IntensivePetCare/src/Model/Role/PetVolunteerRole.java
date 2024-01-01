/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Role;
import javax.swing.JPanel;
import Model.Ecosystem;
import Model.UserAccount.UserAccount;
import UserInterface.HospitalAdmin.HospitalAdminWorkArea;
import UserInterface.PetVolunteer.PetVolunteer;
/**
 *
 * @author saran
 */
public class PetVolunteerRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel ipcuserProcessContainer, UserAccount ipcaccount, Ecosystem ipcsystem) {
          return new PetVolunteer(ipcuserProcessContainer, ipcaccount, ipcsystem);
    }
}

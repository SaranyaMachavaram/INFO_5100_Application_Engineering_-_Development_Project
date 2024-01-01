/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Role;

import javax.swing.JPanel;
import Model.Ecosystem;
import Model.Organization;
import Model.UserAccount.UserAccount;
/**
 *
 * @author saran
 */
public abstract class Role {
   public enum RoleType {
        SysAdmin("Sysadmin"),
        HospitalAdmin("HospitalAdmin"),
        HealthCampOrganizer("HealthCampOrganizer"),
        HealthCampVolunteer("HealthCampVolunteer"),
        FundRaisingAgency("FundRaisingAgency"),
        Vet("Vet"),
        LabAssistant("LabAssistant"),
        PetVolunteer("PetVolunteer"),
        Driver("Driver"),
        Pharmacy("Pharmacy"),
        Sponsor("Sponsor");
        private String ipcvalue;

        private RoleType(String value) {
            this.ipcvalue = value;
        }

        public String getValue() {
            return ipcvalue;
        }
        
        

        @Override
        public String toString() {
            return ipcvalue;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel ipcuserProcessContainer, UserAccount ipcaccount, Ecosystem ipcbusiness);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
}

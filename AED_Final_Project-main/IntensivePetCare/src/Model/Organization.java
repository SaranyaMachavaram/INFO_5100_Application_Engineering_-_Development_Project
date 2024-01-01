/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


import Model.HealthCamp.HealthCampDirectory;
import Model.Hospital.HospitalDirectory;
import Model.Person.PersonDirectory;
import Model.Role.Role;
import Model.UserAccount.UserAccountDirectory;
import java.util.ArrayList;
/**
 *
 * @author saran
 */
public abstract class Organization {
    
    private String ipcname;
    private PersonDirectory ipcpersonDirectory;
    private UserAccountDirectory ipcuserAccountDirectory;
    private HospitalDirectory ipchospitalDirectory;
    private HealthCampDirectory ipchealthCampDirectory;
    private int ipcorganizationID;
    private static int counter = 0;

    public enum Type {
        SysAdmin("SysAdmin"),
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

        private Type(String ipcvalue) {
            this.ipcvalue = ipcvalue;
        }

        public String getValue() {
            return ipcvalue;
        }
    }

    public Organization(String ipcname) {
        this.ipcname = ipcname;
        ipcpersonDirectory = new PersonDirectory();
        ipcuserAccountDirectory = new UserAccountDirectory();
        ipchospitalDirectory = new HospitalDirectory();
        ipchealthCampDirectory = new HealthCampDirectory();
        ipcorganizationID = counter;
        ++counter;
    }

    public Organization() {

    }

    public abstract ArrayList<Role> getSupportedRole();

    public UserAccountDirectory getUserAccountDirectory() {
        return ipcuserAccountDirectory;
    }

    public int getOrganizationID() {
        return ipcorganizationID;
    }

    public PersonDirectory getPersonDirectory() {
        return ipcpersonDirectory;
    }
    
    
    public HealthCampDirectory getHealthCampDirectory() {
        return ipchealthCampDirectory;
    }

    public String getName() {
        return ipcname;
    }

    public void setName(String ipcname) {
        this.ipcname = ipcname;
    }

    @Override
    public String toString() {
        return ipcname;
    }
}   

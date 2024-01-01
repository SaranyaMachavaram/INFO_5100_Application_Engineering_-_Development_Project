/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.HealthCamp;
import Model.PetVolunteer.PetVolunteer;
import java.util.ArrayList;

/**
 *
 * @author poojitha
 */
public class HealthCamp {
    private String ipcname;
    private String ipcuserName;
    private String ipcAddress;
    private String ipcNumber;
    private String ipchealthCampName;
    private ArrayList<PetVolunteer> petVolunteerList;

    public String getIpcname() {
        return ipcname;
    }

    public void setIpcname(String ipcname) {
        this.ipcname = ipcname;
    }

    public String getIpcuserName() {
        return ipcuserName;
    }

    public void setIpcuserName(String ipcuserName) {
        this.ipcuserName = ipcuserName;
    }

    public String getIpcAddress() {
        return ipcAddress;
    }

    public void setIpcAddress(String ipcAddress) {
        this.ipcAddress = ipcAddress;
    }

    public String getIpcNumber() {
        return ipcNumber;
    }

    public void setIpcNumber(String ipcNumber) {
        this.ipcNumber = ipcNumber;
    }

    public String getIpchealthCampName() {
        return ipchealthCampName;
    }

    public void setIpchealthCampName(String ipchealthCampName) {
        this.ipchealthCampName = ipchealthCampName;
    }

    public ArrayList<PetVolunteer> getPetVolunteerList() {
        return petVolunteerList;
    }

    public void setPetVolunteerList(ArrayList<PetVolunteer> petVolunteerList) {
        this.petVolunteerList = petVolunteerList;
    }
    
    public HealthCamp(String ipcuserName) {
        this.ipcuserName = ipcuserName;
        System.out.println("Health camp username : Health camp constructor : " + this.ipcuserName);
    }
    
    public void addPetVolunteer(String petVolName) {
        PetVolunteer petVolunteer = new PetVolunteer(petVolName);
        petVolunteer.setIpchealthCamp(ipchealthCampName);
    }
    
     @Override
    public String toString() {
        return ipcname;
    }
    
}

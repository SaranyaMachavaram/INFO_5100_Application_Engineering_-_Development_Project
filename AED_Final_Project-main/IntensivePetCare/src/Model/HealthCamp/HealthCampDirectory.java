/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.HealthCamp;

import java.util.ArrayList;

/**
 *
 * @author poojitha
 */
public class HealthCampDirectory {
    private ArrayList<HealthCamp> healthCampDirectory;
    private HealthCamp healthCamp;

    public HealthCampDirectory() {
        healthCampDirectory = new ArrayList<HealthCamp>();
    }
    
    public ArrayList<HealthCamp> getHealthCampDirectory() {
        return healthCampDirectory;
    }

    public void setHealthCampDirectory(ArrayList<HealthCamp> healthCampDirectory) {
        this.healthCampDirectory = healthCampDirectory;
    }


    public HealthCamp getHealthCamp() {
        return healthCamp;
    }

    public void setHealthCamp(HealthCamp healthCamp) {
        this.healthCamp = healthCamp;
    }

    public HealthCamp createUserAccount(String username) {
        healthCamp = new HealthCamp(username);
        healthCampDirectory.add(healthCamp);
        return healthCamp;
    }

    
    public void updateHealthCampInfo(HealthCamp healthCamp, String ipcname, String ipcaddress, String ipcnumber, String ipchealthCampName) {
        healthCamp.setIpcname(ipcname);
        healthCamp.setIpcAddress(ipcaddress);
        healthCamp.setIpchealthCampName(ipchealthCampName);
        healthCamp.setIpcNumber(ipcnumber);
    }

    public void deleteHealthCamp(String username) {
        for (int i = 0; i < healthCampDirectory.size(); i++) {
            if (healthCampDirectory.get(i).getIpcuserName() == username) {
                healthCampDirectory.remove(i);
            }
        }
    }
}

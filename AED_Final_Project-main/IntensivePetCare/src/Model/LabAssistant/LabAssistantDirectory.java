/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.LabAssistant;

import java.util.ArrayList;

/**
 *
 * @author saran
 */
public class LabAssistantDirectory {
    
    private ArrayList<LabAssistant> labAssistantDirectory;
    private LabAssistant labAssistant;

    public LabAssistantDirectory() {
        labAssistantDirectory = new ArrayList<LabAssistant>();
    }
    
    public ArrayList<LabAssistant> getLabAssistantDirectory() {
        return labAssistantDirectory;
    }

    public void setLabAssistantDirectory(ArrayList<LabAssistant> LabAssistantDirectory) {
        this.labAssistantDirectory = labAssistantDirectory;
    }


    public LabAssistant getLabAssistant() {
        return labAssistant;
    }

    public void setLabAssistant(LabAssistant ipclabAssistant) {
        this.labAssistant = ipclabAssistant;
    }

    public LabAssistant createUserAccount(String ipcuserName) {
        labAssistant = new LabAssistant(ipcuserName);
        labAssistantDirectory.add(labAssistant);
        return labAssistant;
    }

    public void updateLabAssistantInfo(LabAssistant ipclabAssistant, String ipcvetName, String ipcpetOwner, String ipcpetType, String ipchealthCamp) {
        labAssistant.setIpcpetOwner(ipcpetOwner);
        labAssistant.setIpcvetName(ipcvetName);
        labAssistant.setIpcpetType(ipcpetType);
        labAssistant.setIpchealthCamp(ipchealthCamp);
    }
    
    public void updateLabAssistantHospitalInfo(LabAssistant ipclabAssistant, String ipchospitalName) {
        ipclabAssistant.setIpchospitalName(ipchospitalName);
    }

    public void deleteLabAssistant(String ipcuserName) {
        for (int i = 0; i < labAssistantDirectory.size(); i++) {
            if (labAssistantDirectory.get(i).getIpcuserName() == ipcuserName) {
                labAssistantDirectory.remove(i);
            }
        }
    }
    
    public void updateLabAssistantTestResult(LabAssistant ipclabAssistant, String ipcstatus) {
        ipclabAssistant.setIpclabResultStatus(ipcstatus);
    }
}

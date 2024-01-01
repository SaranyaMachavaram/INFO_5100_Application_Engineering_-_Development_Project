/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.PetVolunteer;

/**
 *
 * @author saran
 */
public class PetVolunteer {
    
    private String ipcName;
    private String ipcuserName;
    private String ipcpetType;
    private String ipchealthCamp;
    private String ipchospitalName;
    private String ipcdriver;
    private String ipcvetName;
    private String ipcpetStatus;
    private String ipclabResultStatus;

    public String getIpcName() {
        return ipcName;
    }

    public void setIpcName(String ipcName) {
        this.ipcName = ipcName;
    }

    public String getIpcuserName() {
        return ipcuserName;
    }

    public void setIpcuserName(String ipcuserName) {
        this.ipcuserName = ipcuserName;
    }

    public String getIpcpetType() {
        return ipcpetType;
    }

    public void setIpcpetType(String ipcpetType) {
        this.ipcpetType = ipcpetType;
    }

    public String getIpchealthCamp() {
        return ipchealthCamp;
    }

    public void setIpchealthCamp(String ipchealthCamp) {
        this.ipchealthCamp = ipchealthCamp;
    }

    public String getIpchospitalName() {
        return ipchospitalName;
    }

    public void setIpchospitalName(String ipchospitalName) {
        this.ipchospitalName = ipchospitalName;
    }

    public String getIpcdriver() {
        return ipcdriver;
    }

    public void setIpcdriver(String ipcdriver) {
        this.ipcdriver = ipcdriver;
    }

    public String getIpcvetName() {
        return ipcvetName;
    }

    public void setIpcvetName(String ipcvetName) {
        this.ipcvetName = ipcvetName;
    }

    public String getIpcpetStatus() {
        return ipcpetStatus;
    }

    public void setIpcpetStatus(String ipcpetStatus) {
        this.ipcpetStatus = ipcpetStatus;
    }

    public String getIpclabResultStatus() {
        return ipclabResultStatus;
    }

    public void setIpclabResultStatus(String ipclabResultStatus) {
        this.ipclabResultStatus = ipclabResultStatus;
    }
    
    
    public PetVolunteer(String username) {
        this.ipcuserName = username;
    }

        @Override
    public String toString() {
        return ipcName;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.LabAssistant;

/**
 *
 * @author saran
 */
public class LabAssistant {
    private String ipcName;
    private String ipcuserName;
    private String ipcpetType;
    private String ipcpetOwner;
    private String ipchealthCamp;
    private String ipchospitalName;
    private String ipclabResultStatus;
      private String ipcvetName;

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

    public String getIpcpetOwner() {
        return ipcpetOwner;
    }

    public void setIpcpetOwner(String ipcpetOwner) {
        this.ipcpetOwner = ipcpetOwner;
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

    public String getIpclabResultStatus() {
        return ipclabResultStatus;
    }

    public void setIpclabResultStatus(String ipclabResultStatus) {
        this.ipclabResultStatus = ipclabResultStatus;
    }

    public LabAssistant(String username) {
        this.ipcuserName = username;
    }

    public String getIpcvetName() {
        return ipcvetName;
    }

    public void setIpcvetName(String ipcvetName) {
        this.ipcvetName = ipcvetName;
    }
     
    
    
    @Override
    public String toString() {
        return ipcName;
    }
}

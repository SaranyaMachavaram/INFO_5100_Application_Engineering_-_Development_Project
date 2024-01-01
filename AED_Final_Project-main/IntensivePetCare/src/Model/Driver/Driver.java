/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Driver;

/**
 *
 * @author poojitha
 */
public class Driver {
    private String ipcuserName;
    private String ipcname;
    private String ipcpetOwner;
    private String ipcpetType;
    private String ipchealthCamp;
    private String ipchospitalName;
    private String ipcdropOffStatus;
    
    public Driver(String ipcuserName, String ipcname, String ipcpetOwner,String ipcpetType,String ipchealthCamp, String ipchospitalName, String ipcdropOffStatus) {
        this.ipcuserName = ipcuserName;
        this.ipcname = ipcname;
        this.ipcpetOwner = ipcpetOwner;
        this.ipcpetType = ipcpetType;
        this.ipchealthCamp = ipchealthCamp;
        this.ipchospitalName = ipchospitalName;
        this.ipcdropOffStatus = ipcdropOffStatus;
    }
     public Driver(String ipcuserName) {
        this.ipcuserName = ipcuserName;
    }

    public String getIpcuserName() {
        return ipcuserName;
    }

    public void setIpcuserName(String ipcuserName) {
        this.ipcuserName = ipcuserName;
    }

    public String getIpcname() {
        return ipcname;
    }

    public void setIpcname(String ipcname) {
        this.ipcname = ipcname;
    }

    public String getIpcpetOwner() {
        return ipcpetOwner;
    }

    public void setIpcpetOwner(String ipcpetOwner) {
        this.ipcpetOwner = ipcpetOwner;
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

    public String getIpcdropOffStatus() {
        return ipcdropOffStatus;
    }

    public void setIpcdropOffStatus(String ipcdropOffStatus) {
        this.ipcdropOffStatus = ipcdropOffStatus;
    }

   @Override
    public String toString() {
        return ipcuserName;
    }
    
      
}

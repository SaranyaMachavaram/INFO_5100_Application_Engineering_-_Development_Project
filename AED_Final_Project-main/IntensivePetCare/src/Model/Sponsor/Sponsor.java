/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Sponsor;

/**
 *
 * @author varshakuruva
 */
public class Sponsor {
   
    private String ipcname;
    private String ipcuserName;
    private String ipcpetOwner;
    private String ipcpetType;
    private String ipchospitalName;
    private String ipchealthCamp;

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

    public String getIpchospitalName() {
        return ipchospitalName;
    }

    public void setIpchospitalName(String ipchospitalName) {
        this.ipchospitalName = ipchospitalName;
    }

    public String getIpchealthCamp() {
        return ipchealthCamp;
    }

    public void setIpchealthCamp(String ipchealthCamp) {
        this.ipchealthCamp = ipchealthCamp;
    }
    
    public Sponsor(String ipcuserName) {
        this.ipcuserName = ipcuserName;
    }
    
     @Override
    public String toString() {
        return ipcuserName;
    }
    
}

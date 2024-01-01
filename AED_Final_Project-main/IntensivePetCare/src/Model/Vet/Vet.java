/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Vet;

/**
 *
 * @author varshakuruva
 */
public class Vet {
    
    private String ipcname;
    private String ipcuserName;
    private String ipcpetOwner;
    private String ipcpetType;
    private String ipchealthCamp;
    private String ipchospitalName;

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
    
    public Vet(String ipcuserName, String ipchospitalName) {
        this.ipcuserName = ipcuserName;
        this.ipchospitalName = ipchospitalName;
    }
    
    @Override
    public String toString() {
        return ipcuserName;
    }
    
}

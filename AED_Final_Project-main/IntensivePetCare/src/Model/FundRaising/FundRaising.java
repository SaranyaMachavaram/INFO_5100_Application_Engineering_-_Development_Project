/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.FundRaising;

/**
 *
 * @author poojitha
 */
public class FundRaising {
    private String ipcname;
    private String ipcuserName;
    private String ipcpetType;
    private String ipchospitalName;
    private String ipcpetOwner;
    private String ipchealthCamp;;    
    private String ipcsponsor;
    private String ipcsponsorStatus;

     public FundRaising(String ipcuserName) {
        this.ipcuserName = ipcuserName;
    }
     
    public String getIpcname() {
        return ipcname;
    }

    public String getIpchealthCamp() {
        return ipchealthCamp;
    }

    public void setIpchealthCamp(String ipchealthCamp) {
        this.ipchealthCamp = ipchealthCamp;
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

    public String getIpcpetOwner() {
        return ipcpetOwner;
    }

    public void setIpcpetOwner(String ipcpetOwner) {
        this.ipcpetOwner = ipcpetOwner;
    }


    public String getIpcsponsor() {
        return ipcsponsor;
    }

    public void setIpcsponsor(String ipcsponsor) {
        this.ipcsponsor = ipcsponsor;
    }

    public String getIpcsponsorStatus() {
        return ipcsponsorStatus;
    }

    public void setIpcsponsorStatus(String ipcsponsorStatus) {
        this.ipcsponsorStatus = ipcsponsorStatus;
    }
 
    
 @Override
    public String toString() {
        return ipcuserName;
    }
    
}

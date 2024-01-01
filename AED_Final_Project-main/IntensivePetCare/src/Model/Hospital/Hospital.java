/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Hospital;

/**
 *
 * @author poojitha
 */
public class Hospital {
    private String ipcname;
    private String ipcuserName;
    private String ipcAddress;
    private String ipcNumber;
    private String ipcdriverName;

    public String getIpcname() {
        return ipcname;
    }
  
    
    public Hospital(String ipcuserName, String ipcname) {
        this.ipcuserName = ipcuserName;
        this.ipcname = ipcname;
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

    public String getIpcdriverName() {
        return ipcdriverName;
    }

    public void setIpcdriverName(String ipcdriverName) {
        this.ipcdriverName = ipcdriverName;
    }
    
    @Override
    public String toString() {
        return ipcname;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Driver;

import java.util.ArrayList;

/**
 *
 * @author poojitha
 */
public class DriverDirectory {
    private ArrayList<Driver> driverDirectory;
    private Driver driver;

    public DriverDirectory() {
        driverDirectory = new ArrayList<Driver>();
    }

    public ArrayList<Driver> getDriverDirectory() {
        return driverDirectory;
    }

    public void setPetVolunteerDirectory(ArrayList<Driver> driverDirectory) {
        this.driverDirectory = driverDirectory;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setPetVolunteer(Driver petVolunteer) {
        this.driver = petVolunteer;
    }

    public Driver createUserAccount(String username) {
        driver = new Driver(username);
        driverDirectory.add(driver);
        return driver;
    }

    
    public void updateDriverInfo(Driver driver, String ipcname, String ipcpetOwner, String ipcpetType, String ipchealthCamp, String ipchospitalName) {
        driver.setIpcname(ipcname);
        driver.setIpcpetType(ipcpetOwner);
        driver.setIpcpetOwner(ipcpetType);
        driver.setIpchealthCamp(ipchealthCamp);
        driver.setIpchospitalName(ipchospitalName);
    }
    
    public void updateDriverPersonalInfo(Driver driver, String ipcname, String ipcuserName) {
        driver.setIpcname(ipcname);
        driver.setIpcuserName(ipcuserName);
    }
    
    public void updateDriverHealthCampInfo(Driver driver, String ipcpetOwner, String ipcpetType, String ipchealthCamp, String ipchospitalName){
        driver.setIpcpetType(ipcpetOwner);
        driver.setIpcpetOwner(ipcpetType);
        driver.setIpchealthCamp(ipchealthCamp);
        driver.setIpchospitalName(ipchospitalName);

    }
    
    public void updateDropOffStatus(Driver driver, String status) {
        driver.setIpcdropOffStatus(status);
    }

    public void deleteDriver(String username) {
        for (int i = 0; i < driverDirectory.size(); i++) {
            if (driverDirectory.get(i).getIpcuserName() == username) {
                driverDirectory.remove(i);
            }
        }
    }
}

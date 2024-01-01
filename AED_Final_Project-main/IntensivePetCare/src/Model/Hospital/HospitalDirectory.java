/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Hospital;

import java.util.ArrayList;

/**
 *
 * @author poojitha
 */
public class HospitalDirectory {
    private ArrayList<Hospital> hospitalDirectory;
    private Hospital hospital;

    public HospitalDirectory() {
        hospitalDirectory = new ArrayList<Hospital>();
    }
    
    public ArrayList<Hospital> getHospitalDirectory() {
        return hospitalDirectory;
    }

    public void setHospitalDirectory(ArrayList<Hospital> hospitalDirectory) {
        this.hospitalDirectory = hospitalDirectory;
    }


    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public Hospital createUserAccount(String username, String name) {
        hospital = new Hospital(username, name);
        hospitalDirectory.add(hospital);
        return hospital;
    }

    public void updateHospitalInfo(Hospital hospital, String ipcname,String ipcphoneNumber, String ipcAddress, String ipcdriverName) {
        hospital.setIpcname(ipcname);
        hospital.setIpcAddress(ipcAddress);
        hospital.setIpcNumber(ipcphoneNumber);
        hospital.setIpcdriverName(ipcdriverName);
    }

    public void deleteHospital(String ipcuserName) {
        for (int i = 0; i < hospitalDirectory.size(); i++) {
            if (hospitalDirectory.get(i).getIpcuserName() == ipcuserName) {
                hospitalDirectory.remove(i);
            }
        }

    }
}

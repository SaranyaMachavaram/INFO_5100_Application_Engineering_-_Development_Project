/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.PetVolunteer;

import java.util.ArrayList;
import java.util.List;
import static java.util.stream.Collectors.toList;

/**
 *
 * @author saran
 */
public class PetVolunteerDirectory {
    
  private ArrayList<PetVolunteer> petVolunteerDirectory;
    private PetVolunteer petVolunteer;

    public PetVolunteerDirectory() {
        petVolunteerDirectory = new ArrayList<PetVolunteer>();
    }

    public ArrayList<PetVolunteer> getPetVolunteerDirectory() {
        return petVolunteerDirectory;
    }

    public void setPetVolunteerDirectory(ArrayList<PetVolunteer> petVolunteerDirectory) {
        this.petVolunteerDirectory = petVolunteerDirectory;
    }

    public PetVolunteer getPetVolunteer() {
        return petVolunteer;
    }

    public void setPetVolunteer(PetVolunteer ipcpetVolunteer) {
        this.petVolunteer = ipcpetVolunteer;
    }

    public PetVolunteer createUserAccount(String ipcusername) {
        petVolunteer = new PetVolunteer(ipcusername);
        petVolunteerDirectory.add(petVolunteer);
        return petVolunteer;
    }

    public void updatePetVolunteerInfo(PetVolunteer ipcpetVolunteer, String ipcname, String ipcpetType, String ipchealthCamp) {
        ipcpetVolunteer.setIpcName(ipcname);
        ipcpetVolunteer.setIpcpetType(ipcpetType);
        ipcpetVolunteer.setIpchealthCamp(ipchealthCamp);
    }

    public void updatePetVolunteerHospitalInfo(PetVolunteer ipcpetVolunteer, String ipchospitalName, String ipcdriverName) {
        ipcpetVolunteer.setIpcdriver(ipcdriverName);
        ipcpetVolunteer.setIpchospitalName(ipchospitalName);
    }

    public void deletePetVolunteer(String ipcuserName) {
        for (int i = 0; i < petVolunteerDirectory.size(); i++) {
            if (petVolunteerDirectory.get(i).getIpcuserName() == ipcuserName) {
                petVolunteerDirectory.remove(i);
            }
        }
    }

    public void updatePetType(String ipcuserName, String ipcpetType) {
        for (int i = 0; i < petVolunteerDirectory.size(); i++) {
            if (petVolunteerDirectory.get(i).getIpcuserName() == ipcuserName) {
                petVolunteerDirectory.get(i).setIpcpetType(ipcpetType);
            }
        }
    }

    public void updatePetVolunteerLabStatus(PetVolunteer ipcpetVolunteer, String ipcstatus) {
        petVolunteer.setIpclabResultStatus(ipcstatus);
    }

    public List<PetVolunteer> findPetVolunteerByHealthCampName(String ipchealthCampName) {

        return petVolunteerDirectory.stream().filter(p -> p.getIpchealthCamp().equals(ipchealthCampName)).collect(toList());

    }
}

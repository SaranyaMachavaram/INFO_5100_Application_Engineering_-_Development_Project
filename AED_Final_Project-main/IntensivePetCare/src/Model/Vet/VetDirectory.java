/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Vet;

import java.util.ArrayList;

/**
 *
 * @author varshakuruva
 */
public class VetDirectory {
    
    private ArrayList<Vet> vetDirectory;
    private Vet vet;

    public VetDirectory() {
        vetDirectory = new ArrayList<Vet>();
    }

    public ArrayList<Vet> getVetDirectory() {
        return vetDirectory;
    }

    public void setVetDirectory(ArrayList<Vet> vetDirectory) {
        this.vetDirectory = vetDirectory;
    }

    public Vet getVet() {
        return vet;
    }

    public void setVet(Vet vet) {
        this.vet = vet;
    }

    public Vet createUserAccount(String ipcuserName, String ipchospitalName) {
        vet = new Vet(ipcuserName,ipchospitalName);
        vetDirectory.add(vet);
        return vet;
    }

    public void updateVetInfo(Vet vet, String ipcpetOwner, String ipcpetType, String ipchealthCamp, String ipchospitalName) {
//        vet.setName(name);
        vet.setIpcpetOwner(ipcpetOwner);
        vet.setIpchealthCamp(ipchealthCamp);
        vet.setIpcpetType(ipcpetType);
        vet.setIpchospitalName(ipchospitalName);
    }

    public void deleteVet(String ipcuserName) {
        for (int i = 0; i < vetDirectory.size(); i++) {
            if (vetDirectory.get(i).getIpcuserName() == ipcuserName) {
                vetDirectory.remove(i);
            }
        }
    }
}

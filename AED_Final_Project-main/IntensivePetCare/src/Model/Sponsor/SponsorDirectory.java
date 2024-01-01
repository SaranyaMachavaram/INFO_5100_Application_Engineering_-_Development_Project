/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Sponsor;

import java.util.ArrayList;

/**
 *
 * @author varshakuruva
 */
public class SponsorDirectory {
    
    private ArrayList<Sponsor> sponsorDirectory;
    private Sponsor sponsor;

    public ArrayList<Sponsor> getSponsorDirectory() {
        return sponsorDirectory;
    }

    public void setSponsorDirectory(ArrayList<Sponsor> sponsorDirectory) {
        this.sponsorDirectory = sponsorDirectory;
    }

    public Sponsor getSponsor() {
        return sponsor;
    }

    public void setSponsor(Sponsor sponsor) {
        this.sponsor = sponsor;
    }
    
    
    public SponsorDirectory() {
        sponsorDirectory = new ArrayList<Sponsor>();
    }
    
    public Sponsor createUserAccount(String ipcuserName) {
        sponsor = new Sponsor(ipcuserName);
        sponsorDirectory.add(sponsor);
        return sponsor;
    }
    
    public void deleteSponsor(String ipcuserName) {
        for (int i = 0; i < sponsorDirectory.size(); i++) {
            if (sponsorDirectory.get(i).getIpcuserName() == ipcuserName) {
                sponsorDirectory.remove(i);
            }
        }
    }
    
    public void updateSponsorPetOwnerInfo(Sponsor sponsor, String ipcpetOwner, String ipcpetType, String ipchealthCamp, String ipchospitalName) {
        sponsor.setIpcpetOwner(ipcpetOwner);
        sponsor.setIpcpetOwner(ipcpetOwner);
        sponsor.setIpcpetType(ipcpetType);
        sponsor.setIpchealthCamp(ipchealthCamp);
        sponsor.setIpchospitalName(ipchospitalName);
    }
    
}

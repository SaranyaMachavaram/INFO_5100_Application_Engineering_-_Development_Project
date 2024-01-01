/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.FundRaising;

import java.util.ArrayList;

/**
 *
 * @author poojitha
 */
public class FundRaisingDirectory {
    private ArrayList<FundRaising> fundRaisingDirectory;
    private FundRaising fundRaising;
    
    public ArrayList<FundRaising> getFundRaisingDirectory() {
        return fundRaisingDirectory;
    }

    public void setFundRaisingDirectory(ArrayList<FundRaising> fundRaisingDirectory) {
        this.fundRaisingDirectory = fundRaisingDirectory;
    }
    
    public FundRaisingDirectory() {
        fundRaisingDirectory = new ArrayList<FundRaising>();
    }
    
   public FundRaising createUserAccount(String ipcuserName) {
        fundRaising = new FundRaising(ipcuserName);
        fundRaisingDirectory.add(fundRaising);
        return fundRaising;
    }
        public void deleteFundRaiser(String username) {
        for (int i = 0; i < fundRaisingDirectory.size(); i++) {
            if (fundRaisingDirectory.get(i).getIpcuserName() == username) {
                fundRaisingDirectory.remove(i);
            }
        }
    }
    
    public void updateFundRaisingSponsorStatus(FundRaising fundRaising, String status) {
        fundRaising.setIpcsponsorStatus(status);
    }
    public void updateFundRaisingInfo(FundRaising fundRaising, String ipcpetOwner, String ipcpetType, String ipchealthCamp, String ipchospitalName) {
//        fundRaising.setHealthCamp(healthCamp);
        fundRaising.setIpcpetOwner(ipcpetOwner);
        fundRaising.setIpcpetType(ipcpetType);
        fundRaising.setIpchealthCamp(ipchealthCamp);
//        fundRaising.setSponsor(sponsor);
        fundRaising.setIpchospitalName(ipchospitalName);
    }
}

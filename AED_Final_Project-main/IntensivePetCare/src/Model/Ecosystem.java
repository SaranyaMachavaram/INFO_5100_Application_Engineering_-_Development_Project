/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


import Model.Driver.DriverDirectory;
import Model.FundRaising.FundRaisingDirectory;
import Model.HealthCamp.HealthCampDirectory;
import Model.Hospital.HospitalDirectory;
import Model.LabAssistant.LabAssistantDirectory;
import Model.PetVolunteer.PetVolunteerDirectory;
import Model.Role.Role;
import Model.Role.SystemAdminRole;
import Model.Sponsor.SponsorDirectory;
import Model.Vet.VetDirectory;
import java.util.ArrayList;
/**
 *
 * @author saran
 */
 public class Ecosystem extends Organization{

    private static Ecosystem IntensivePetCare;
    private HospitalDirectory ipchospitalDirectory;
    private VetDirectory ipcvetDirectory;
    private PetVolunteerDirectory ipcpetVolunteerDirectory;
    private HealthCampDirectory ipchealthCampDirectory;
    private FundRaisingDirectory ipcfundRaisingDirectory;
    private LabAssistantDirectory ipclabAssistantDirectory;
    private SponsorDirectory ipcsponsorDirectory;
    private DriverDirectory ipcdriverDirectory;

    public Ecosystem(HospitalDirectory ipchospitalDirectory, VetDirectory ipcvetDirectory, PetVolunteerDirectory ipcpetVolunteerDirectory, HealthCampDirectory ipchealthCampDirectory, FundRaisingDirectory ipcfundRaisingDirectory, LabAssistantDirectory ipclabAssistantDirectory,SponsorDirectory ipcsponsorDirectory,DriverDirectory ipcdriverDirectory) {
        this.ipchospitalDirectory = ipchospitalDirectory;
        this.ipcvetDirectory = ipcvetDirectory;
        this.ipcpetVolunteerDirectory = ipcpetVolunteerDirectory;
        this.ipchealthCampDirectory = ipchealthCampDirectory;
        this.ipcfundRaisingDirectory = ipcfundRaisingDirectory;
        this.ipclabAssistantDirectory = ipclabAssistantDirectory;
        this.ipcsponsorDirectory = ipcsponsorDirectory;
        this.ipcdriverDirectory = ipcdriverDirectory;
    }

    public static Ecosystem getInstance() {
        if (IntensivePetCare == null) {
            IntensivePetCare = new Ecosystem();
        }
        return IntensivePetCare;
    }

    public static void setInstance(Ecosystem ipcsystem) {
        IntensivePetCare = ipcsystem;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> ipcroleList = new ArrayList<Role>();
        ipcroleList.add(new SystemAdminRole());
        return ipcroleList;
    }

    private Ecosystem() {
        super(null);
    }

    public boolean checkIfUserIsUnique(String ipcuserName) {
        
        return false;
    }

    public HospitalDirectory getHospitalDirectory() {
        if (ipchospitalDirectory == null) {
            ipchospitalDirectory = new HospitalDirectory();
        }
        return ipchospitalDirectory;
    }

    public VetDirectory getVetDirectory() {
        if (ipcvetDirectory == null) {
            ipcvetDirectory = new VetDirectory();
        }
        return ipcvetDirectory;
    }

    public PetVolunteerDirectory getPetVolunteerDirectory() {
        if (ipcpetVolunteerDirectory == null) {
            ipcpetVolunteerDirectory = new PetVolunteerDirectory();
            System.out.println("This should not show up");
        }
        return ipcpetVolunteerDirectory;
    }

    public HealthCampDirectory getHealthCampDirectory() {
        if (ipchealthCampDirectory == null) {
            ipchealthCampDirectory = new HealthCampDirectory();
        }
        return ipchealthCampDirectory;
    }
    
    public LabAssistantDirectory getLabAssistantDirectory() {
        if (ipclabAssistantDirectory == null) {
            ipclabAssistantDirectory = new LabAssistantDirectory();
        }
        return ipclabAssistantDirectory;
    }
    
    
    public FundRaisingDirectory getFundRaisingDirectory() {
        if (ipcfundRaisingDirectory == null) {
            ipcfundRaisingDirectory = new FundRaisingDirectory();
        }
        return ipcfundRaisingDirectory;
    }
    
    public SponsorDirectory getSponsorDirectory() {
        if (ipcsponsorDirectory == null) {
            ipcsponsorDirectory = new SponsorDirectory();
        }
        return ipcsponsorDirectory;
    }
    
     public DriverDirectory getDriverDirectory() {
        if (ipcdriverDirectory == null) {
            ipcdriverDirectory = new DriverDirectory();
        }
        return ipcdriverDirectory;
    }
}

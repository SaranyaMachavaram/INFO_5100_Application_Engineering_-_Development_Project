/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.UserAccount;

import Model.Person.Person;
import Model.Role.Role;

/**
 *
 * @author varshakuruva
 */
public class UserAccount {
    
    private String ipcname;
    private String ipcuserName;
    private String ipcpassword;
    private Person person;
    private Role role;
//    private WorkQueue workQueue;

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

    public String getIpcpassword() {
        return ipcpassword;
    }

    public void setIpcpassword(String ipcpassword) {
        this.ipcpassword = ipcpassword;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    

    @Override
    public String toString() {
        return ipcname;
    }
}

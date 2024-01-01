/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.UserAccount;

import Model.Person.Person;
import Model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author varshakuruva
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String ipcuserName, String ipcpassword){
        for (UserAccount ua : userAccountList)
            if (ua.getIpcuserName().equals(ipcuserName) && ua.getIpcpassword().equals(ipcpassword)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String ipcname, String ipcuserName, String ipcpassword, Person person, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setIpcname(ipcname);
        userAccount.setIpcuserName(ipcuserName);
        userAccount.setIpcpassword(ipcpassword);
        userAccount.setPerson(person);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String ipcuserName){
        for (UserAccount ua : userAccountList){
            if (ua.getIpcuserName().equals(ipcuserName))
                return false;
        }
        return true;
    }
    
    public void updateUserAccount(UserAccount user,String ipcname,String ipcuserName, String ipcpassword){
       
        user.setIpcname(ipcname);
        user.setIpcuserName(ipcuserName);
        user.setIpcpassword(ipcpassword);
    }
    
    public void deleteUserAccount(UserAccount user){
        userAccountList.remove(user);
    }
    
}

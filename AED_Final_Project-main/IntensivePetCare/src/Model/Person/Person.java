/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Person;

/**
 *
 * @author saran
 */
public class Person {
    private String ipcname;
    private int ipcid;
    private static int count = 1;

    public Person() {
        ipcid = count;
        count++;
    }

    public String getIpcname() {
        return ipcname;
    }

    public void setIpcname(String ipcname) {
        this.ipcname = ipcname;
    }

    public int getIpcid() {
        return ipcid;
    }

    
    @Override
    public String toString() {
        return ipcname;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Person;

import java.util.ArrayList;

/**
 *
 * @author saran
 */
public class PersonDirectory {
    private ArrayList<Person> personList;

    public PersonDirectory() {
        personList = new ArrayList();
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public Person createPerson(String ipcname) {
        Person ipcperson = new Person();
        ipcperson.setIpcname(ipcname);
        personList.add(ipcperson);
        return ipcperson;
    }
}

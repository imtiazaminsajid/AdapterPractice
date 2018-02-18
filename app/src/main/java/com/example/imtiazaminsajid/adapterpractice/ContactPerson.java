package com.example.imtiazaminsajid.adapterpractice;

import java.util.ArrayList;

/**
 * Created by Imtiaz Amin Sajid on 2/19/2018.
 */

public class ContactPerson {
    private String personName;
    private String phoneNumber;
    private int personImage;

    public ContactPerson() {
    }

    public ContactPerson(String personName, String phoneNumber) {
        this.personName = personName;
        this.phoneNumber = phoneNumber;
    }

    public ContactPerson(String personName, String phoneNumber, int personImage) {
        this.personName = personName;
        this.phoneNumber = phoneNumber;
        this.personImage = personImage;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPersonImage() {
        return personImage;
    }

    public void setPersonImage(int personImage) {
        this.personImage = personImage;
    }

    public ArrayList<ContactPerson> getAllPersons(){
        ArrayList<ContactPerson> persons = new ArrayList<>();
        persons.add(new ContactPerson("Imtiaz Amin", "01677006082"));
        persons.add(new ContactPerson("Sayed Mahmud Sakib", "01673535025"));
        persons.add(new ContactPerson("Estiack Amin", "01726297807"));
        persons.add(new ContactPerson("Fahima Amin", "01820278202"));
        persons.add(new ContactPerson("Shahin Ara Begum", "01715533712"));
        persons.add(new ContactPerson("Nurul Amin", "01720278202"));
        persons.add(new ContactPerson("Aysa Amin", "01720278202"));
        persons.add(new ContactPerson("Sajid Amin", "01720278202"));
        persons.add(new ContactPerson("Shamim Khan", "01720278202"));
        persons.add(new ContactPerson("Shoel Chowdury", "01720278202"));
        persons.add(new ContactPerson("Kala Mia", "01720278202"));
        persons.add(new ContactPerson("Nurul Amin", "01720278202"));
        persons.add(new ContactPerson("Shopon Amin", "01720278202"));
        persons.add(new ContactPerson("Afridi Amin", "01720278202"));

        return persons;

    }
}

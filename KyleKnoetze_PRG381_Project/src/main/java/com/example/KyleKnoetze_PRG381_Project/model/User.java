package com.example.KyleKnoetze_PRG381_Project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue
    private long id;
    private String firstName;
    private String address;
    private String password;
    private String email;
    private String coursename;
    private long Adman_id;
    private String adman_name;
    private String adman_password;
    private int contact;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public long getAdman_id() {
        return Adman_id;
    }

    public void setAdman_id(long adman_id) {
        Adman_id = adman_id;
    }

    public String getAdman_name() {
        return adman_name;
    }

    public void setAdman_name(String adman_name) {
        this.adman_name = adman_name;
    }

    public String getAdman_password() {
        return adman_password;
    }

    public void setAdman_password(String adman_password) {
        this.adman_password = adman_password;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }
}

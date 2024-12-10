package com.itheima.bean;

import java.util.ArrayList;

public class Department {
    private String name;
    private ArrayList<Doctor> doctors;

    public Department() {
    }

    public Department(String name, ArrayList<Doctor> doctors) {
        this.name = name;
        this.doctors = doctors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(Doctor doctor) {
        this.doctors.add(doctor);
    }
}

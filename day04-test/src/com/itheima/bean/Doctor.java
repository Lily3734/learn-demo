package com.itheima.bean;

import java.time.LocalDate;
import java.util.ArrayList;

public class Doctor {
    private String name;
    private String doctorID;
    private String departmentName;
    private String gender;
    private int age;
    private String specialty;
    private LocalDate joinDate;
    private ArrayList<Schedule> schedules;

    public Doctor() {
    }

    public Doctor(String name, String doctorID, String departmentName, String gender, int age, String specialty, LocalDate joinDate, ArrayList<Schedule> schedules) {
        this.name = name;
        this.doctorID = doctorID;
        this.departmentName = departmentName;
        this.gender = gender;
        this.age = age;
        this.specialty = specialty;
        this.joinDate = joinDate;
        this.schedules = schedules;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(String doctorID) {
        this.doctorID = doctorID;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }

    public ArrayList<Schedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(Schedule schedules) {
        this.schedules.add(schedules);
    }
}

package com.itheima.bean;

import java.time.LocalDateTime;

public class Appointment {
    private String username;
    private String sex;
    private int age;
    private String tel;
    private String desc;
    private String doctorName;
    private String doctorID;
    private LocalDateTime appointmentTime;

    public Appointment() {
    }

    public Appointment(String username, String sex, int age, String tel, String desc, String doctorName, String doctorID, LocalDateTime appointmentTime) {
        this.username = username;
        this.sex = sex;
        this.age = age;
        this.tel = tel;
        this.desc = desc;
        this.doctorName = doctorName;
        this.doctorID = doctorID;
        this.appointmentTime = appointmentTime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(String doctorID) {
        this.doctorID = doctorID;
    }

    public LocalDateTime getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(LocalDateTime appointmentTime) {
        this.appointmentTime = appointmentTime;
    }
}

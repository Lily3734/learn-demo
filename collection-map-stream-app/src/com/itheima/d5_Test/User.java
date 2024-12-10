package com.itheima.d5_Test;

import java.time.LocalDate;

public class User {
    private Integer ID;
    private String name;
    private String gender;
    private LocalDate birthday;

    public User() {
    }

    public User(Integer ID, String name, String gender, LocalDate birthday) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}

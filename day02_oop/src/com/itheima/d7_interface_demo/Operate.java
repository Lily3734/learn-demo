package com.itheima.d7_interface_demo;

import java.util.ArrayList;

public class Operate implements Option_1,Option_2{
    private ArrayList<Student> students = new ArrayList<>();

    public Operate() {
    }

    public Operate(ArrayList<Student> students) {
        this.students = students;
    }

    public double sum(){
        Student temp = new Student();
        double sum = 0.0;
        for (int i = 0; i < students.size(); i++) {
            temp = students.get(i);
            sum += temp.getScore();
        }
        return sum;
    }

    @Override
    public void print() {
        Student temp = new Student();
        for (int i = 0; i < students.size(); i++) {
            temp = students.get(i);
            System.out.println("第"+(i+1)+"个学生的成绩");
            System.out.println("姓名："+temp.getName());
            System.out.println("性别："+temp.getGender());
            System.out.println("成绩："+temp.getScore());
            System.out.println("----------------------");
        }
    }

    @Override
    public void skin() {
        System.out.println("全班平均成绩为："+(sum() / students.size()+"分"));
    }

    @Override
    public void printProMax() {
        print();
        int man = 0,wen = 0;
        Student temp = new Student();
        for (int i = 0; i < students.size(); i++) {
            temp = students.get(i);
            if(temp.getGender().equals("男")){
                man++;
            }
            else {
                wen++;
            }
        }
        System.out.println("男生人数："+man);
        System.out.println("女生人数："+wen);
    }

    @Override
    public void skinPromax() {
        Student scoreTemp = students.get(0);
        double max = scoreTemp.getScore(),min = scoreTemp.getScore();
        for (int i = 0; i < students.size(); i++) {
            scoreTemp = students.get(i);
            if(max < scoreTemp.getScore()){
                max = scoreTemp.getScore();
            }
            if(min > scoreTemp.getScore()){
                min = scoreTemp.getScore();
            }
        }
        System.out.println("去掉最高分和最低分后的平均成绩为："+(sum() - (max + min)) / (students.size() - 2)+"分");
    }
}

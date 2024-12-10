package com.itheima.bean;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class HospitalManager {
    private ArrayList<Department> departments = new ArrayList<>();
    private ArrayList<Doctor> doctors = new ArrayList<>();
    private ArrayList<Schedule> schedules = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    public void start() {
        System.out.println("==========欢迎来到芙蕾雅学院隶属医院管理系统==========");
        while (true) {
            System.out.println("1、科室管理-添加科室");
            System.out.println("2、科室管理-删除科室");
            System.out.println("3、科室管理-修改科室");
            System.out.println("4、医生管理-录入个人信息");
            System.out.println("5、医生管理-修改个人信息");
            System.out.println("6、医生管理-设置医生当前和未来6天的坐诊信息");
            System.out.println("7、医生管理-按照科室展示全部医生当前和未来6天的坐诊信息");
            System.out.println("8、医生管理-搜索某个医生当前和未来6天的坐诊信息（每个病人的的具体信息）");
            System.out.println("搜素功能-");

            System.out.println("请选择您的操作");
            int n = sc.nextInt();
            if (n < 1 || n > 8) {
                System.out.println("您输入的指令无效");
                continue;
            }
                switch (n) {
                    case 1:addDepartment();
                        break;

                    case 2:deleteDepartment();
                        break;

                    case 3:
                        break;

                    case 4:addDoctor();
                        break;

                    case 5:reviseDoctorInfo();
                        break;

                    case 6:scheduleInfo();
                        break;

                    case 7:show();
                        break;
                }

        }


    }
    private void addDepartment() {
        while (true) {
            Department department = new Department();
            System.out.println("请您输入科室名字：");
            String name = sc.next();
            department.setName(name);
            System.out.println("是否自动导入对应医生的信息？");
            Doctor doctor = new Doctor();
            if ((sc.next().equals("是"))) {
                for (int i = 0; i < doctors.size(); i++) {
                    doctor = doctors.get(i);
                    if (Objects.equals(name, doctor.getDepartmentName())) department.setDoctors(doctor);
                }
            }
            departments.add(department);
            System.out.println("创建成功！");
            System.out.println("请输入您的指令：");
            System.out.println("1、继续创建科室：");
            System.out.println("2、退出");
            if ((sc.nextInt() == 2)) break;

        }
    }
    private void deleteDepartment(){
        if(departments.size() == 0){
            System.out.println("系统当前没有科室，请先创建");
            return;
        }
        for (int i = 0; i < departments.size(); i++) {
            System.out.println("以下是已经创建好的科室：");
            System.out.println((1+i)+"、"+departments.get(i).getName());
        }
            Department department = new Department();
        while (true) {
            System.out.println("请输入您要删除的科室前的数字~");
            int number = sc.nextInt();
            department = departments.get(number - 1);
            if(department.getDoctors().size() != 0){
                System.out.println("您不能删除该科室");
                continue;
            }
            else {
                departments.remove(number - 1);
                System.out.println("删除成功！");
            }
            System.out.println("是否退出？");
            if((sc.next().equals("是"))) break;
        }
    }
    private void reviseDepartment(){

    }

    private void addDoctor () {
        if(departments.size() == 0) {
            System.out.println("系统当前没有科室，请先创建");
            return;
        }
        Doctor doctor = new Doctor();
        Department department = new Department();
        while (true) {
            System.out.println("录入医生信息~");
            System.out.println("请输入医生的所属科室：");
            for (int i = 0; i < departments.size(); i++) {
                department = departments.get(i);
                System.out.println(i+1+"、"+department.getName());
            }
            System.out.println("请选择：");
            int number = sc.nextInt();
            if(number < 1 || number > departments.size()){
                System.out.println("您输入的指令无效");
                continue;
            }
            else doctor.setDepartmentName(departments.get(number-1).getName());
            System.out.println("请输入医生的名字：");
            doctor.setName(sc.next());
            System.out.println("请输入医生的ID：");
            doctor.setDoctorID(sc.next());
            System.out.println("请输入医生的性别：");
            doctor.setGender(sc.next());
            System.out.println("请输入医生的年龄：");
            doctor.setAge(sc.nextInt());
            System.out.println("请输入医生的主治方向：");
            doctor.setSpecialty(sc.next());
            System.out.println("请输入医生的入职时间：(格式：yyyy-mm-dd)");
            doctor.setJoinDate(LocalDate.parse(sc.next()));
            doctors.add(doctor);
            departments.get(number-1).setDoctors(doctor);
            System.out.println("是否退出");
            if ((sc.next().equals("是"))) break;
        }
    }
    private void reviseDoctorInfo(){
        Doctor doctor = new Doctor();
        if(doctors.size() == 0) {
            System.out.println("该系统数据库中还没有医生信息，请先录入医生信息");
            return;
        }
        while (true) {
            boolean flag = true;
            System.out.println("请您输入医生的ID");
            for (int i = 0; i < doctors.size(); i++) {
                if(Objects.equals(doctors.get(i).getDoctorID(),sc.next())){
                    doctor = doctors.get(i);
                    flag = false;
                    break;
                }
            }
            if(flag) System.out.println("没有该名医生的信息~");
            else break;
        }
        System.out.println("-----医生信息修改选项-----");
        System.out.println("请选择您要修改的选项");
        switch (sc.nextInt()){
            case 1:
                System.out.println("请输入您修改后的信息");
                doctor.setName(sc.next());
            case 2:
                System.out.println("请输入您修改后的信息");
                doctor.setDoctorID(sc.next());
            case 3:
                System.out.println("请输入您修改后的信息");
                doctor.setDepartmentName(sc.next());
            case 4:
                System.out.println("请输入您修改后的信息");
                doctor.setGender(sc.next());
            case 5:
                System.out.println("请输入您修改后的信息");
                doctor.setAge(sc.nextInt());
            case 6:
                System.out.println("请输入您修改后的信息");
                doctor.setSpecialty(sc.next());
            case 7:
                System.out.println("请输入您修改后的时间：（格式：yyyy-mm-dd）");
                doctor.setJoinDate(LocalDate.parse(sc.next()));
        }
    }
    private void scheduleInfo(){
        if(doctors.size() == 0){
            System.out.println("该系统还没有医生的信息，请先录入医生信息");
            return;
        }
        Doctor doctor = new Doctor();
        while (true) {
            boolean flag = true;
            System.out.println("请输入要设置的医生的ID");
            for (int i = 0; i < doctors.size(); i++) {
                doctor = doctors.get(i);
                if(Objects.equals(doctor.getDoctorID(),sc.next())){
                    flag = false;
                    break;
                }
            }
            if(flag)System.out.println("没有找到该名医生~");
            else break;
        }
        Schedule schedule = new Schedule();
        System.out.println("-------医生当天及未来六天坐诊信息设置------");
        int i = 1;
        while (true) {
            System.out.println("请输入您第"+i+"天的设置");
            System.out.println("请输入当天的日期：(格式：yyyy-mm-dd)");
            schedule.setToday(LocalDate.parse(sc.next()));

            System.out.println("您当天早上是否坐诊？");
            schedule.setMorning(sc.hasNext());
            System.out.println("可预约人数：");
            schedule.setmTotalNumber(sc.nextInt());
            System.out.println("已预约人数：");
            schedule.setaAppoinNumber(sc.nextInt());
            System.out.println("请输入早上上班时间：(格式：hh:mm:ss)");
            schedule.setMend(LocalTime.parse(sc.next()));
            System.out.println("请输入早上下班时间：(格式：hh:mm:ss)");
            schedule.setMend(LocalTime.parse(sc.next()));

            System.out.println("您当天下午是否坐诊？");
            schedule.setAfternoon(sc.hasNext());
            System.out.println("可预约人数：");
            schedule.setaTotalNumber(sc.nextInt());
            System.out.println("已预约人数：");
            schedule.setaAppoinNumber(sc.nextInt());
            System.out.println("请输入下午上班时间：(格式：hh:mm:ss)");
            schedule.setMend(LocalTime.parse(sc.next()));
            System.out.println("请输入下午下班时间：(格式：hh:mm:ss)");
            schedule.setMend(LocalTime.parse(sc.next()));

            doctor.setSchedules(schedule);

            System.out.println("设置成功！");
            System.out.println("是否退出？");
            if((sc.next().equals("是"))) break;
        }


    }
    private void show() {
        if (departments.size() == 0) {
            System.out.println("系统当前没有科室，请先创建");
            return;
        }
        Department department = new Department();
        System.out.println("以下是以创建好的科室：");
        for (int i = 0; i < departments.size(); i++) {
            department = departments.get(i);
            System.out.println((i+1)+"、"+department.getName());
        }
        while (true) {
            System.out.println("请选择您的选项：");
            int number = sc.nextInt();
            if(number < 1 || number > departments.size()){
                System.out.println("您的操作无效~");
            }
            Doctor doctor = new Doctor();
            Schedule schedule = new Schedule();
            department = departments.get(number-1);
            for (int i = 0; i < department.getDoctors().size(); i++) {
                doctor = department.getDoctors().get(i);
                for (int j = 0; j < doctor.getSchedules().size(); j++) {
                    schedule = doctor.getSchedules().get(j);
                    System.out.println("日期："+schedule.getToday());
                    System.out.println("当天早上是否坐诊："+(schedule.getMorning()?"是":"否"));
                    System.out.println("早上上班时间："+schedule.getMstart());
                    System.out.println("早上下班时间："+schedule.getMend());
                    System.out.println("早上可预约人数："+schedule.getmTotalNumber());
                    System.out.println("早上已预约人数："+schedule.getmAppoinNumber());
                    System.out.println("当天下午是否坐诊："+(schedule.getAfternoon()?"是":"否"));
                    System.out.println("下午上班时间："+schedule.getAstart());
                    System.out.println("下午下班时间："+schedule.getAend());
                    System.out.println("下午可预约人数："+schedule.getaTotalNumber());
                    System.out.println("下午已预约人数："+schedule.getmAppoinNumber());
                    System.out.println("---------------------------------------");
                }
            }
            System.out.println("1、退出");
            System.out.println("2、继续");
            if(sc.nextInt() == 1) break;
        }
    }
}
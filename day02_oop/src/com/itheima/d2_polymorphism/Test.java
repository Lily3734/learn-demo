package com.itheima.d2_polymorphism;

public class Test {
    public static void main(String[] args) {
        //目标：认识多态
        //好处：可以实现解耦合，右边对象可以随时切换，后续业务随时改变
        People p1 = new Teacher();
        p1.run();
        p1.run2();
        

        //好处2：可以使用父类类型的变量作为形参，可以接受一切子类对象
        Student stu = new Student();
        go(stu);
        Teacher tes = new Teacher();
        go(tes);
    }
    public static void go(People p){
        if(p instanceof Student){
            Student s1 = (Student) p;
            s1.test();
        }
        else {
            Teacher s1 = (Teacher) p;
            s1.test();
        }

    }
}

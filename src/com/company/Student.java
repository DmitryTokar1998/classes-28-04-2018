package com.company;

public class Student
{
    public int str_ar_index;
    public String name;
    public int age;   //public enum Namelist{Ivan,Alexandr,Andrew,Dmitry,Ihor,Maxim,Artem,Vladimir,Vladislav,Sergey,Nicolai,Vasiliy,Alexey,Egor};
    public static Student create()
    {
        String[]en={"Ivan","Alexandr","Andrew","Dmitry","Ihor","Maxim","Artem","Vladimir","Vladislav","Sergey","Nicolai","Vasiliy","Alexey","Egor"};

        Student student=new Student();
        student.age=(int)(Math.random()*(31-16))+16;
        //student.str_ar_index=;
        student.name=en[(int)Math.floor(Math.random()*en.length)];
        return student;
    }

    @Override
    public String toString() {
        return String.format("Student %s , he is %d years old", name, age);
    }
}
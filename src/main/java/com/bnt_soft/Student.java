package com.bnt_soft;

public class Student {

    private  String name;
    private String email;
    private int mark;


    public Student(String name, String email, int mark) {
        this.name = name;
        this.email = email;
        this.mark = mark;
    }


    public void display(){
        System.out.println("student name is : "+name);
        System.out.println("student email is : "+email);
        System.out.println("student marks is : "+mark);
    }

}

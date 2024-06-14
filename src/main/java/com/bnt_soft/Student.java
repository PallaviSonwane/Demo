package com.bnt_soft;

public class Student {

    private  String name;
    private String email;
    private int mark;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display(){
        System.out.println("student name is : "+name);
        System.out.println("student email is : "+email);
        System.out.println("student maeks is : "+mark);
    }

}

package com.bnt_soft;

public class Airtel implements Sim {

    public Airtel(){
        System.out.println("constructor called");
    }
    @Override
    public void calling() {
        System.out.println("i am calling methos in airtel");
    }

    @Override
    public void data() {
        System.out.println("i am data methos in airtel");
    }

}

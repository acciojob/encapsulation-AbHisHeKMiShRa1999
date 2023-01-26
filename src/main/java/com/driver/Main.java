package com.driver;

public class Main {

    public static void main(String[] args){

        RWOnly obj = new RWOnly();
        // Error -name has private access in com.driver.RWOnly
        obj.setName("Abhishek");
        System.out.println(obj.getName());
    }

}
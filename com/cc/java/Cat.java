package com.cc.java;

public class Cat {
    
    public String name;
    public int age; 

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void tellYourAddress() {
      System.out.println("Blick von innen: " + this);  
    }

    public String tellYourName() {
        return this.name;
    }

    public int tellYourAge() {
        return this.age;   
    }

}
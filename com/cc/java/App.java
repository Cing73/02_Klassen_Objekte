package com.cc.java;

public class App {
   
 public static void main(String[] args) {

    Cat cat = new Cat("Grizabella", 29);
    output(cat.getName());
    output(String.valueOf(cat.getAge()));

    output("Name: " + cat.getName());
    output("Alter: " + cat.getAge());
    
   //  System.out.println(cat.getName());
   //  System.out.println(cat.getAge());
    
   // output(inputStr: "hi");

    System.out.println("------------------");

    Cat cat1 = new Cat("Alonzo", 35);
    System.out.println(cat1.getName());
    System.out.println(cat1.getAge());

 }

private static void output(String inputStr) {
   System.out.println(inputStr);
}
// private static void output(int inputNum) {
//    System.out.println(inputNum);
// }

}
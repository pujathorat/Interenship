package com.java.julymonth;

class Parent {
    public void print(int num) {
        System.out.println("Parent class: " + num);
    }
}

class Child extends Parent {
    @Override
    public void print(int num) {
        System.out.println("Child class: " + (num * num));
    }
}

public class Main {
    public static void main(String[] args) {
        int num = 6;

        Parent parentObj = new Parent();
        Child childObj = new Child();

        parentObj.print(num); // This will call the print method of Parent class
        childObj.print(num); // This will call the print method of Child class
    }
}


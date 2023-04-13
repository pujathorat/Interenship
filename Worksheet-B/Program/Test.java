package com.java.WorksheetB;

public class A {
public A(int i){
System.out.println(i);
}
}
 public class B extends A{
 public B(){
 super(6);
 this();
 }
 }
public class Test{
public static void main (String[] args){
B b = new B();
}
}

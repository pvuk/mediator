package com.java.inheritance.examples;
// A Java program to demonstrate that both super class 
// and subclass constructors refer to same object 
  
// super class 
class Fruit 
{ 
    public Fruit() 
    { 
        System.out.println("Super class constructor"); 
        System.out.println("Super class object hashcode :" + 
                           this.hashCode()); 
        System.out.println(this.getClass().getName()); 
    } 
}
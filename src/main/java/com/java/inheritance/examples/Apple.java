package com.java.inheritance.examples;
// sub class 
class Apple extends Fruit 
{ 
    public Apple() 
    { 
        System.out.println("Subclass constructor invoked"); 
        System.out.println("Sub class object hashcode :" + 
                           this.hashCode()); 
        System.out.println(this.hashCode() + "   " + 
                           super.hashCode()); 
  
        System.out.println(this.getClass().getName() + "  " + 
                           super.getClass().getName()); 
    } 
}
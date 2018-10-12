package com.java.finalkeyword.example;

/**
 * 
 * @author venkataudaykiranp
 *
 *<b>Ref: </b><a href="https://www.geeksforgeeks.org/final-keyword-java/">final keyword in java</a>
 *
 *<p>
 *	When a final variable is created inside a method/constructor/block, it is called local final variable, and it must initialize once where it is created. See below program for local final variable
 *</p>
 */
// Java program to demonstrate 
// local final variable 
  
// The following program compiles and runs fine 
  
class LocalFinalVariable 
{ 
    public static void main(String args[]) 
    { 
        // local final variable 
        final int i; 
        i = 20;  
        System.out.println(i); 
    } 
}
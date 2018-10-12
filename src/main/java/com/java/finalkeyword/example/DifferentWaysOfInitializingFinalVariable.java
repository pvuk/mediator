package com.java.finalkeyword.example;

/**
 * 
 * @author venkataudaykiranp
 *
 *<p>
 *<b>Ref: </b><a href="https://www.geeksforgeeks.org/final-keyword-java/">final keyword in java</a>
 *
 *<h1>final keyword in java</h1>
<p>final keyword is used in different contexts. First of all, final is a non-access modifier applicable only to a variable, a method or a class.Following are different contexts where final is used.<p>

<ul>
	<li>Final Variable &nbsp=> To create constant variables</li>
	<li>Final Methods => Prevent Method Overriding</li>
	<li>Final Classes &nbsp&nbsp=> Prevent Inheritance</li>
</ul>

<h1 align="center">Final variables</h1>

When a variable is declared with final keyword, its value can’t be modified, essentially, a constant. This also means that you must initialize a final variable. If the final variable is a reference, this means that the variable cannot be re-bound to reference another object, but internal state of the object pointed by that reference variable can be changed i.e. you can add or remove elements from final array or final collection. It is good practice to represent final variables in all uppercase, using underscore to separate words.
 *
 *<b>Initializing a final variable :</b>
We must initialize a final variable, otherwise compiler will throw compile-time error.A final variable can only be initialized once, either via an initializer or an assignment statement. There are three ways to initialize a final variable :

<ol start="1">
	<li>You can initialize a final variable when it is declared.This approach is the most common. A final variable is called <b>blank final variable</b>,if it is <b>not</b> initialized while declaration. Below are the two ways to initialize a blank final variable.</li>
	<li>A blank final variable can be initialized inside instance-initializer block or inside constructor. If you have more than one constructor in your class then it must be initialized in all of them, otherwise compile time error will be thrown.</li>
	<li>A blank final static variable can be initialized inside static block.</li>
</ol>

<b>When to use a final variable :</b>

The only difference between a normal variable and a final variable is that we can re-assign value to a normal variable but we cannot change the value of a final variable once assigned. Hence final variables must be used only for the values that we want to remain constant throughout the execution of program.
</p>

 *<p>Let us see above different ways of initializing a final variable through an example.</p>
 */
//Java program to demonstrate different 
// ways of initializing a final variable 
class DifferentWaysOfInitializingFinalVariable  
{ 
    // a final variable 
    // direct initialize 
    final int THRESHOLD = 5; 
      
    // a blank final variable 
    final int CAPACITY; 
      
    // another blank final variable 
    final int  MINIMUM; 
      
    // a final static variable PI 
    // direct initialize 
    static final double PI = 3.141592653589793; 
      
    // a  blank final static  variable 
    static final double EULERCONSTANT; 
      
    // instance initializer block for  
    // initializing CAPACITY 
    { 
        CAPACITY = 25; 
    } 
      
    // static initializer block for  
    // initializing EULERCONSTANT 
    static{ 
        EULERCONSTANT = 2.3; 
    } 
      
    // constructor for initializing MINIMUM 
    // Note that if there are more than one 
    // constructor, you must initialize MINIMUM 
    // in them also 
    public DifferentWaysOfInitializingFinalVariable()  
    { 
        MINIMUM = -1; 
    } 
          
}
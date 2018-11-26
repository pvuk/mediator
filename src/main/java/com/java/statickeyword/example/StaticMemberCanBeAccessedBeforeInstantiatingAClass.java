package com.java.statickeyword.example;

/**
 * <a href="https://www.geeksforgeeks.org/static-keyword-java/">static keyword in java</a>
 * 
 * <p>
 * static is a non-access modifier in Java which is applicable for the following:

<ol>
	<li>blocks</li>
	<li>variables</li>
	<li>methods</li>
	<li>nested classes</li>
</ol>

To create a static member(block,variable,method,nested class), precede its declaration with the keyword static. 
When a member is declared static, it can be accessed before any objects of its class are created, and without reference to any object. 
For example, in below java program, we are accessing static method m1() without creating any object of Test class.

</br>
<b>Output:</b>

<code>from m1</code>
 * </p>
 * 
 * @author venkataudaykiranp
 *
 */
// Java program to demonstrate that a static member 
// can be accessed before instantiating a class 
class StaticMemberCanBeAccessedBeforeInstantiatingAClass 
{ 
    // static method 
    static void m1() 
    { 
        System.out.println("from m1"); 
    } 
  
    public static void main(String[] args) 
    { 
          // calling m1 without creating 
          // any object of class Test 
           m1(); 
    } 
} 
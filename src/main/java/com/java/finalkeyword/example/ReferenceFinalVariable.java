package com.java.finalkeyword.example;

/**
 * 
 * @author venkataudaykiranp
 *
 *
 *<p>
 *<b>Ref: </b><a href="https://www.geeksforgeeks.org/final-keyword-java/">final keyword in java</a>
 *	<h1>Reference final variable :</h1> 
	When a final variable is a reference to an object, then this final variable is called reference final variable. For example, a final StringBuffer variable looks like</p>
	
	<code>final StringBuffer sb;</code>
<p>
	As you know that a final variable cannot be re-assign. But in case of a reference final variable, internal state of the object pointed by that reference variable can be changed. Note that this is not re-assigning. This property of final is called non-transitivity. To understand what is mean by internal state of the object, see below example :
</p>
 *
 */
//Java program to demonstrate  
//reference final variable 

class ReferenceFinalVariable 
{ 
    public static void main(String[] args)  
    { 
        // a final reference variable sb 
        final StringBuilder sb = new StringBuilder("Geeks"); 
          
        System.out.println(sb); 
          
        // changing internal state of object 
        // reference by final reference variable sb 
        sb.append("ForGeeks"); 
          
        System.out.println(sb); 
    }     
}

//Output:
//
//Geeks
//GeeksForGeeks
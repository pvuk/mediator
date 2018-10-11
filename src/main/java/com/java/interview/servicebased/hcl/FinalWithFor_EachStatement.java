package com.java.interview.servicebased.hcl;

/**
 * 
 * @author venkataudaykiranp
 *
 *<p>Output:</p>
	<code>
		1 2 3
	</code>
	
	<p>
	<b>Explanation :</b> Since the i variable goes out of scope with each iteration of the loop, it is actually re-declaration each iteration, allowing the same token (i.e. i) to be used to represent multiple variables.
	
	</p>
 */
// Java program to demonstrate final 
// with for-each statement 
  
class FinalWithFor_EachStatement  
{ 
    public static void main(String[] args)  
    { 
        int arr[] = {1, 2, 3}; 
          
        // final with for-each statement 
        // legal statement 
        for (final int i : arr) 
            System.out.print(i + " "); 
    }     
}
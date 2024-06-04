package com.exception;

    // if there is no exception in try block then catch block are not execute....  
public class TryCatchBlocks {
public static void main (String [] arg) {
	
	try {
		System.out.println("Ashish");
	}
	catch (NullPointerException e)
	{
		System.out.println(10/0);
	}
	System.out.println("rest of the application");
	
	                    //Ashish
	                   //rest of the application
}
}
	
	
	     




















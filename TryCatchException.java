package com.exception;

public class TryCatchException 
         {
	public static void main(String[] args) {
		
	
	try {
		System.out.println(10/0);
	}
	catch (ArithmeticException e)
	{
		System.out.println("ratan".charAt(7));
	                          // StringIndexOutOfBoundsException
	}
}
}
 



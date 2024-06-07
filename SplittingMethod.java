package com.sathya.Example;

public class SplittingMethod {

	public static void main(String[] args) {


	     String letters = "alpha, b,eta, gama,, de,,lta, si,gma";

	        // splitting the letters string using comma delimiter.
	        String result[] = letters.split(",");

	        //using java loop to print elements of string array 
	       for (int i = 0; i < result.length; i++) {
	            System.out.print(result[i]);
	       }
	}

}

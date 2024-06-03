package com.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheakedException {
public static void main(String [] arg) {
	try {
		FileInputStream obj=new FileInputStream("Mark.text");
	}
	catch(FileNotFoundException e)
	{
		System.out.println("File is not available in data...");
		
		System.out.println(e);
		         //java.io.FileNotFoundException
	}
}
}

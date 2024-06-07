package com.sathya.Example;

public class RemoveSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="   hey          Ashu we   miss  you     yar    ";
		
	       String str=s.replaceAll("( )+", " ");
	       
	       System.out.println(str);
	}
	}
package com.gorang;

import java.util.ArrayDeque;

public class ArrayDequieExample {

	public static void main(String[] args) {
		
		ArrayDeque<String> name=new ArrayDeque<>();
             
		 name.add("ash");
		 name.add("hjdk");
		 name.add("jdfklsj");
		 System.out.println(name);
		 name.remove();
		 System.out.println(name);
		 name.add("jdfkl");
		 System.out.println(name);
	}

}

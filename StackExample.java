package com.gorang;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		
		Stack<String> non=new Stack<>();
		non.push("ash");
		non.push("bhairav");
		non.push("kal");
		
		System.out.println(non);
		non.pop();
		System.out.println(non);
		non.push("kalla");
		System.out.println( non);
	}

}

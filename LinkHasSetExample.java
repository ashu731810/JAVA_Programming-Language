
 //                 <-------LinkedHashSet---->

//             # LinkedHashSet Insertion order is presented...


package com.gorang;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkHasSetExample {

	public static void main(String[] args) {
		

		Set<String> obj=new LinkedHashSet<>();
//		obj.add(6);
//		obj.add(3);
//		obj.add(5);
//		obj.add(4);
//		obj.add(2);
//		obj.add(1);
		
		obj.add("ashish");
		obj.add("anish");
		obj.add("Rajneesh");
		obj.add("Priyansu");
		obj.add("Ankush");
		obj.add("ashish");
		for(String value: obj) 
		{
		System.out.println(value);	
		}
	}

}

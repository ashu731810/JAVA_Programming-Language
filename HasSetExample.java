//                             SET

//           In Interface Set All Implemented Classes Duplicate Value Are Not Allow............

//            #--> HasSet insertion order not Presented......


package com.gorang;

import java.util.HashSet;
import java.util.Set;

public class HasSetExample {

	public static void main(String[] args) {
		

		Set<String> value=new HashSet<>();
		
//		value.add(5);
//		value.add(1);
//		value.add(6);
//		value.add(5);
//		value.add(6);
//		value.add(7);                 // output---> 1 5 6 7
		
		value.add("Sweta");
		value.add("Kittu");
		value.add("Sonam");
		value.add("Ruman");
		value.add("Neha");
		value.add("Ritu");
		for(String num:value)
		{
			System.out.println(num);       
			
		}
	}
}
                                       //output---> Neha Kittu Sweta Sonam Ruman Ritu

package com.gorang;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		

		LinkedList<String> name =new LinkedList<>();
		name.add("Ash");
		name.add("Kittu");
		name.add("Shweta");
         System.out.println(name);
         name.addLast("Aman");
         System.out.println(name);
         name.addFirst("kranti");
         System.out.println(name);
         name.add(2,"jai Hind");
         System.out.println(name);
         for(String arr:name) {
        	 System.out.println(arr);
         }
         name.removeFirst();
         System.out.println(name);
         name.removeLast();
         System.out.println(name);
         
		       
	}

}

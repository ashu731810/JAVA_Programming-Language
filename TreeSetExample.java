
//            #TreeSet insertion order not presented

package com.gorang;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class TreeSetExample {

	public static void main(String[] args) {
		

		Set<Integer> name=new TreeSet<>();
		name.add(5);
		name.add(2);
		name.add(4);
		name.add(7);
		name.add(3);
		name.add(1);
		System.out.println(name);
		
		Iterator itr=name.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	}
}

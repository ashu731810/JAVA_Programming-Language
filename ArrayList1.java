
// list has duplicate value are allowed......... 


package com.gorang;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> obj=new ArrayList();
        obj.add(5);
        obj.add(4);
        obj.add(3);
        obj.add(4);
        obj.add(5);
        obj.forEach( (n)-> { System.out.println(n); } );
	}
}























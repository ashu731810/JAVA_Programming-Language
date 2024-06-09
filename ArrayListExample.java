
// list has duplicate value are allowed......... 


package com.gorang;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
           ArrayList<String> obj=new ArrayList<>();
           obj.add("Ash");
           obj.add("Kittu");
           obj.add("Shweta");
           System.out.println(obj);
           obj.add("asheta");
           System.out.println(obj);
          // cheack size of element 
           System.out.println(obj.size());
           obj.add(1,"ashi");
           System.out.println(obj);
           obj.remove(4);
           System.out.println(obj);
           obj.set(2,"Honey");
           System.out.println(obj);
          System.out.println(obj.get(3));
          System.out.println(obj.toArray());
          obj.clear();
          System.out.println(obj);
		
		
	}
}


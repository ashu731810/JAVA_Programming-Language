package com.sathya.states.info;



import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo {
public static void main(String [] args)throws IOException{
	FileReader reader= new FileReader("abc.txt");
	FileWriter writer=new FileWriter("xyz.txt");
System.out.println("Channel created successfully.....");

int c ;
while ((c=reader.read())!=-1) {
	writer.write(c);
}
  System.out.println("Read & write operations are completed .....");

   reader.close();
   writer.close();
  System.out.println("Channel released successfully....."); 

 }
}


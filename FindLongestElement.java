package com.sathya.Example;

import java.util.Scanner;

public class FindLongestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
        System.out.println("Please enter the string for finding longest word");
        Scanner sc1 = new Scanner(System.in);
        String str = sc1.nextLine(), x=null;
        String str2[] = str.split(" ");

        x=str2[0];
        int i=0, j = 0;
        for( i =0; i< str2.length; i = j)
        {
            for( j =i+1; j < str2.length; j++)
            {
                if(x.length() < str2[j].length())
                {
                    x = str2[j];
                    break;
                }
            }
        }
        System.out.println("the longest string is: " + x + " and it's length is: " + x.length());

    }
}
  
package com.thirteen.day;
import java.util.ArrayList;
public class LongestValue {
    public static void main(String[] args)
    {
    String s="you are Ashish java Developer";
    String[]arr=s.split(" ");
    int count=0,longest=0;
    String newword="";
		for(int i=0;i<arr.length;i++) {
        String word=arr[i];
        count=0;
        for (int j=0;j<word.length();j++) {
            char ch=word.charAt(j);
            count++;
            if(count>longest) {
                longest=count;
                newword=word;
            }
        }
    }
		System.out.println("longest word: "+newword+"\n And letter: "+longest);
}

}



package com.sathya.Example;

public class SiftEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] arr= {3,4,5,6,7,8,10};
		  for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr.length;j++) {   //if j=i+1 ====even,
					if(arr[j]%2==0) {                // (2==0 ---> odd RHS) ,  (2!=0 --->RHS)
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
				   
			   }

		            for(int i=0;i<arr.length;i++)
		            	System.out.print(arr[i]);
		   }
	}	   
	

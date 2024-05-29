package com.thirteen.day;


public class LinearSearch {

    public static int LinearSearch(int[]arr,int target) {

        for (int i =0; i<=arr.length; i++) {
            if (target==arr[i])
                return i;
        }
        return -1;

    }
    public static void main (String[]args)
    {
        int[] arr= {2,3,4,5,6,};
        int target=6;
        int result =LinearSearch.LinearSearch(arr , target);
        if (result!=1);
        System.out.println("Element found of element"+" "+result);



    }
}



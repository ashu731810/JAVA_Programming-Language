package com.thirteen.day;

import java.util.Scanner;
public class PerfectNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        int sum=0;

        for ( int i= 1; i<n ;i++) {
            if (n%i==0)
                sum=sum+i;
        }
        if (sum==n)
            System.out.println("this is perfect number"+n);
        else
            System.out.println("this is not perfect number"+n);

    }
}


package com.thirteen.day;

import java.util.Scanner;

public class PrimeNum {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any positive num");
        int n= sc.nextInt();

        boolean isprime = true;
        for (int i= 0; i<=n;i++) {

            if (n%2==0) {

                isprime=false;
                break;
            }
        }
        if (isprime==true)


            System.out.println("The given number is Prime num.."+ " "+n);

        else
            System.out.println("The given number is not Prime num.."+ " "+n);
    }

}
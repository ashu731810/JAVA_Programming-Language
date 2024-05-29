package com.thirteen.day;

import java.util.Scanner;
public class Polindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ener a number");
        int n = sc.nextInt();
        int OriginalNum=n;
        int reverse=0;
        while(n>0) {
            int rem=n%10;
            reverse=reverse*10+rem;
            n=n/10;
        }

        if (reverse==OriginalNum)
            System.out.print(OriginalNum+" "+" is a polindrom num");
        else
            System.out.print(OriginalNum+" "+"is not  polindrom num");

    }
}


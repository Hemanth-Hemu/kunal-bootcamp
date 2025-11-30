package com.hemanth.kunal.Day1;

import java.util.Scanner;

public class FindMax {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers to find the maximum:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
//        int max = findMax(a, b, c);
        int max =Math.max(c,Math.max(a,b));
        System.out.println("The maximum number is: " + max);
    }

    private static int findMax(int a, int b, int c) {
        int max=a;
        if(b> max){
            max=b;
        }
        if(c > max){
            max=c;
        }
        return max;
    }
}

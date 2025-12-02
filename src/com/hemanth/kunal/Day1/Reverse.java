package com.hemanth.kunal.Day1;

public class Reverse {
    static void main() {
        int num = 12443599;
        int rev = 0;
        while (num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        System.out.println("Reversed number is: " + rev);
    }
    }

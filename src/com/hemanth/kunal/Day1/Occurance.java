package com.hemanth.kunal.Day1;

public class Occurance {
    public static void main() {
        int num = 1222333;
        int find = 3;
        int count = 0;
        while (num > 0) {
            int lDigit = num % 10;
            if (lDigit == find) {
                count++;
            }
            num /= 10;
        }
        System.out.println("The digit " + find + " occurs " + count + " times");

    }
}

package com.hemanth.kunal.Day2;

public class Amstrong {
    static void main() {
        // System.out.println(isAmstrong(153));
        for (int i = 100; i < 1000; i++) {
            if (isAmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isAmstrong(int num) {
        int sum = 0;
        int temp = num;
        while (num > 0) {
            int rem = num % 10;
            int cube = rem * rem * rem;
            sum = sum + cube;
            num /= 10;
        }
        return sum == temp;
    }
}

package com.hemanth.kunal.Day2;

public class Isprime {
    public static void main() {
        //  System.out.println(isPrime(83));
        for (int i = 2; i < 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }
        //only even prime num
        if (num == 2) {
            return true;
        }
        int i = 2;
        // go till sqrt(num) because after its sqrt, it will repeat again
        while (i * i <= num) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return i * i > num;
    }
}

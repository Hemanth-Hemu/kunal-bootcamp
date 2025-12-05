package com.hemanth.kunal.Day4;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class Even1295 {
    public static void main(String[] args) {
        int[] nums={1,3456,2,6,7896};
        System.out.println(countEven(nums));
    }

   static int countEven(int[] arr){
        int count=0;
        for(int num : arr){
            if(even(num)){
                count++;
            }
        }
        return count;
   }

    static boolean even(int num){
        return numofDigits2(num) % 2 == 0;
    }

    static int numOfdigits(int num){
        int count=0;
        while (num>0){
            count++;
            num/=10;
        }
        return count;
    }
    static int numofDigits2(int num){
        return (int) (Math.log10(num)) + 1;
    }
}

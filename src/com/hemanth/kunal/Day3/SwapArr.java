package com.hemanth.kunal.Day3;

import java.util.Arrays;

public class SwapArr {
    static void main(String[] args) {
        int[] arr = {20, 1, 4, 6, 78, 9, 100};
        Reverse(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void Reverse(int[] arr, int start, int end) {
        for (int i = start, j = end; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

  /*      using while loop
        while (start < end){
            int temp= arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
   */
    }

}

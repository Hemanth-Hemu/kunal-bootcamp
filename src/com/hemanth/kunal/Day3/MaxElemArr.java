package com.hemanth.kunal.Day3;

public class MaxElemArr {
    static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println(maxRange(arr,1,5));
    }

     static int maxRange(int[] arr, int from, int to){
         if(arr==null || from > to || arr.length ==0){
             return -1;
         }
        int max = Integer.MIN_VALUE;
         for(int i=from;i<=to;i++){
             if(arr[i] > max){
                 max=arr[i];
             }
         }
         return max;
     }

}

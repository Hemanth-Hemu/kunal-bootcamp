package com.hemanth.kunal.BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] ascArr = {-5,7,11,45,78,96,111};
        int[] descArr= {111,77,55,44,21,11,0,-11,-5};
        int target=11;
        System.out.println(orderAgnosticBS(descArr,target));
    }
    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[end] > arr[start];
        while (start <= end){
            int mid = start + (end - start)/2;
            if(target > arr[mid]){
                if(isAsc){
                    start= mid+1;
                }
                else{
                    end = mid -1;
                }
            }
            else if (target < arr[mid]) {
               if(isAsc){
                   end = mid-1;
               }
               else{
                   start=mid+1;
               }
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}

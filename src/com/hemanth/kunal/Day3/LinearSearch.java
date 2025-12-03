package com.hemanth.kunal.Day3;

public class LinearSearch {
    static void main(String[] args) {
        int[] arr = {10, 98, 74, 12, 5, 6};
        int ans = linearSearchInIntegerArr(arr, 100);
        System.out.println(ans);
        boolean ans2 = linearSearchInString("Hemanth", 'z');
        System.out.println(ans2);
    }

    static int linearSearchInIntegerArr(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target) {
                return index;
            }
        }
        return -1;
    }

    static boolean linearSearchInString(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return true;
            }
        }

//        for (char ch : str.toCharArray()){
//            if(ch==target){
//                return true;
//            }
//        }
        return false;
    }
}

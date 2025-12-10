package com.hemanth.kunal.BinarySearch.questions;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/submissions/1851766080/
public class NextGreatestLetter {
    public static void main(String[] args) {
        char[] chars = {'c', 'f', 'j', 'k' };
        char target = 'l';
        System.out.println(nextGreatestLetter(chars, target));
    }

    public static char nextGreatestLetter(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[start % arr.length];
    }
}

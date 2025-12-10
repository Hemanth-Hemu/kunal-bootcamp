package com.hemanth.kunal.BinarySearch.questions;

import java.util.Arrays;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/solutions/6753678/video-binary-search-solution-by-niits-jewi/
public class FindLastAndFirstPosition {
    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 7, 7, 7, 8, 8, 11};
        int target = 7;
        System.out.println(Arrays.toString(firstAndlast(arr, target)));

    }

    static int[] firstAndlast(int[] nums, int target) {
        int[] ans = {-1, -1};
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, true);
        }
        return ans;
    }

    static int search(int[] arr, int target, boolean firstIndex) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                ans = mid;
                if (firstIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
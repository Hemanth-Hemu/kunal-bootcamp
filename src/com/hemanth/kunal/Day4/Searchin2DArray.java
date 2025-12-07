package com.hemanth.kunal.Day4;

import java.util.Arrays;

public class Searchin2DArray {
    public static void main(String[] args) {
        int[][] arr = {{11, 6, 30}, {41, 15, 2}, {21, 4, 99, 6}};
        int target = 6;
        //  System.out.println(Arrays.toString(lSearch(arr, target)));
        System.out.println(lSearchforMax(arr));
    }

    static int[] lSearch(int[][] arr, int target) {
        int[] index = new int[2];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    index[0] = row;
                    index[1] = col;
                    //new int[]{row,col};
                }
            }
        }
        return index;
    }

    static int lSearchforMax(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] row : arr) {
            for (int ele : row) {
                if (ele > max) {
                    max = ele;
                }
            }
        }
        return max;
    }
}

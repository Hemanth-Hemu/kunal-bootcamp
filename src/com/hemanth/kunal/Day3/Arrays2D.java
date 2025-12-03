package com.hemanth.kunal.Day3;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays2D {
    static void main(String[] args) {
        /*
     {
     arr[0]-->   { 1, 2, 3,4 },  //size of rows can be different
     arr[1]-->   { 4, 5 },
     arr[2]-->   { 6,7,8 }
           }
         */
        int[][] arr = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = scanner.nextInt();
            }
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
//            alternative way to print each row
//            System.out.println(Arrays.toString(arr[row]));

            System.out.println();
        }

//        can directly print 2D array using deepToString
//        System.out.println(Arrays.deepToString(arr));
    }
}

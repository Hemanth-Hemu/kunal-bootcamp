package com.hemanth.kunal.Day4;

//https://leetcode.com/problems/richest-customer-wealth/description/
public class Wealth1672 {
    public static void main(String[] args) {
         int[][] accounts ={{2,8,7},{7,1,3},{1,9,5}};
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        int max=Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int rowsum=0;
            for (int account = 0; account < accounts[person].length; account++) {
                    rowsum = rowsum + accounts[person][account];
            }
//            if(rowsum > max){
//                max= rowsum;
//            }
            max = Math.max(max,rowsum);
        }
        return max;
    }
}

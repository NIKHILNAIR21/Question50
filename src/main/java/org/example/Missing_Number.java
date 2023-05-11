package org.example;

public class Missing_Number {
    public static void main(String[] args) {
        int [] arr = {2,4,0,1};
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] nums) {
        int N = nums.length;
        int res = N*(N+1)/2;
        int temp = 0;
        for(int a:nums){
            temp+=a;
        }

        return res-temp;

    }
}

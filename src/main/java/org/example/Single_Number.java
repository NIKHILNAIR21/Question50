package org.example;
import java.util.*;
public class Single_Number {
    public static void main(String[] args) {

   int [] arr = {1,2,3,2,4,3};
   System.out.println(singleNumber(arr));

    }
    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums.length ==1){
            return nums[0];
        }
        for(int i=0;i<nums.length-1;i+=2){
            if(nums[i]!=nums[i+1]){
                return nums[i];
            }

        }
        return nums[nums.length-1];

    }
}

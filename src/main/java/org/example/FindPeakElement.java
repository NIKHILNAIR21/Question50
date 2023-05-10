package org.example;

import java.util.Arrays;

public class FindPeakElement {
    public static void main(String[] args) {
        int[] arr ={1,3,5,2,4};
        System.out.println((findPeakElement(arr)));
    }
    public static int findPeakElement(int[] nums) {
        int left=0;int right=nums.length-1;
        while(left<=right){
            int mid = (right+left)/2;
            if(nums.length == 1){
                return 0;
            }
            if(mid == 0){
                if(nums[mid]>nums[mid+1]){
                    return mid;
                }else{
                    left = mid+1;
                }
            }else if(mid ==nums.length-1){
                if(nums[mid-1]<nums[mid]){
                    return mid;
                }else{
                    right =mid-1;
                }
            }else{
                if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                    return mid;
                }else if(nums[mid]<nums[mid-1]){
                    right = mid-1;

                }else{
                    left = mid+1;
                }
            }

        }
        return -1;
    }
}

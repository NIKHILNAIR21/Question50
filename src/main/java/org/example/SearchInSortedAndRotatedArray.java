package org.example;

import java.util.Arrays;

public class SearchInSortedAndRotatedArray {
    public static void main(String[] args) {
        int [] arr = {3,1};
        System.out.println(search(arr,1));
    }
    public static int search(int[] nums, int target) {
        int left = 0 ; int right = nums.length-1;

        while(left<=right){
            int mid = (left+right)/2;
            if(target == nums[mid]){
                return mid;
            }
            //left part sorted
            if(nums[left]<=nums[mid]){
                if(target>=nums[left] && target<nums[mid]){
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }
            //right part sorted
            else{
                if(target<=nums[right] && target>nums[mid]){
                    left =mid+1;
                }else{
                    right=mid-1;
                }
            }
        }
        return -1;
    }
}

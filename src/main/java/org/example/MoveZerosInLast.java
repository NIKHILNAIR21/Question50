package org.example;

import java.util.Arrays;

public class MoveZerosInLast {
    public  static  void main(String[]args){
        int[] arr ={1,0,2,3,0,3} ;
        System.out.println(Arrays.toString(moveZeroes(arr)));
    }
    //the code
    public static int[] moveZeroes(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[count] = nums[i];
                count++;
            }
        }
        //filling remaining place with zeros
        for (int i = count; i < nums.length; i++) {
            nums[i] = 0;
        }

return nums;
    }
}


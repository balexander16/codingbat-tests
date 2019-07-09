package edu.cnm.deepdive;

import java.util.Arrays;

public class Array2 {

  public boolean either24(int[] nums) {
    boolean two = false;
    boolean four = false;
    for (int i = 0; i < nums.length-1; i++){
      if (nums[i] == 2 && nums[i+1] == 2){
        two = true;
      }
      if(nums[i] == 4 && nums[i+1] == 4) {
        four = true;
      }
    }
    return !(two == four);
  }

  public int[] pre4(int[] nums) {
    int[] x = {};
    for (int i = 0; i< nums.length; i++) {
      if (nums[i] == 4){
        x = Arrays.copyOfRange(nums,0,i);
        break;
      }
    }
    return x;
  }

}

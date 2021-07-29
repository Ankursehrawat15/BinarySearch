//https://binarysearch.com/problems/Largest-Gap
import java.util.*;

class Solution {
    public int solve(int[] nums) {
        Arrays.sort(nums);
        int maxDiff = Integer.MIN_VALUE;
        for(int i =1;i<nums.length;i++){
              if(nums[i] - nums[i-1] > maxDiff){
                  maxDiff = nums[i] - nums[i-1];
              }
        }

        return maxDiff;
    }
}

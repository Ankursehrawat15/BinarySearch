import java.util.*;

class Solution {
    public boolean solve(int[] nums) {
       
       int count = 0;
       for(int num : nums){
               if(num == 1) {
                       count++;
               }
       }

           for(int i =0;i<nums.length;i++){
                if(nums[i] == 1){
                    int j = i;
                   while(j < nums.length && nums[j] == 1){
                         
                          count--;
                           j++;
                   }

                   if(count == 0){
                           return true;
                   }else{
                           return false;
                   }
               }

               
        }

        return false;
    }
}
// https://binarysearch.com/problems/Merging-Two-Sorted-Lists

import java.util.*;

class Solution {
    public int[] solve(int[] a, int[] b) {
            
        if(a.length == 0 || b.length == 0){
                return a.length == 0 ? b : a;
        }
        int [] ans = new int[a.length+b.length];
        int i = 0;
        int j = 0;
         int k =0;
        while(i < a.length && j < b.length){

            if(a[i] < b[j]){
               ans[k] = a[i++];
            }
            else{
                ans[k] = b[j++];
            }

            k++;
        }

        if(j == b.length){
            while(i < a.length){
                ans[k++] = a[i++];
               
            }
        }
        else if(i == a.length){
            while(j < b.length){
                ans[k++] = b[j++];
               
            }
        }
        return ans;
    }
}

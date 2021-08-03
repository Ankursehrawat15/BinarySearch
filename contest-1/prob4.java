 // https://binarysearch.com/problems/Collatz-Sequence
import java.util.*;

class Solution {
    public int solve(int n) {
       
       int length = 1;
       while(n != 1){
         if(n % 2 == 0){
            n = n / 2;
        }else{
            n = 3 * n + 1;
        }

        length++;
       }
       
       return length;
        
    }
}

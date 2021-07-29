// https://binarysearch.com/problems/Sum-of-First-N-Odd-Integers
import java.util.*;

class Solution {
    public int solve(int n) {
       int sum = 0;
       int count = 0;
       int num = 1;
       while(count < n){

           if(num % 2 != 0){
               sum += num;
               count++;
           }

           num++;
           
       }

       return sum;
       
    }
}

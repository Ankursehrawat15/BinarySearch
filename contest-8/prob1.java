// https://binarysearch.com/problems/Generate-Primes
import java.util.*;

class Solution {
 
     private boolean checkPrime(int n ){

             for(int i =2;i*i <= n;i++){
                     if(n % i == 0){
                             return false;
                     }
             }

             return true;
     }


    public int[] solve(int n) {
        List<Integer> list = new ArrayList<>();

        for(int i =2;i<=n;i++){

               if( checkPrime(i)){
                   list.add(i);
               }
        }

        int [] ans = new int[list.size()];
          int index = 0;
        for(int elm : list){
                ans[index++] = elm;
        }

        return ans;
    }
}
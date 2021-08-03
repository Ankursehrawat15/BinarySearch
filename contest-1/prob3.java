// https://binarysearch.com/problems/Check-Palindrome
import java.util.*;

class Solution {
    public boolean solve(String s) {
        int start = 0;
        int end = s.length()-1;

        while(start < end){
            if(s.charAt(start++) != s.charAt(end--)){
                return false;
            }
        }

        return true;
    }
}

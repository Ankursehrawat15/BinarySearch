// https://binarysearch.com/problems/Length-of-a-Linked-List
import java.util.*;

/**
 * class LLNode {
 *   int val;
 *   LLNode next;
 * }
 */
class Solution {
    public int solve(LLNode node) {
        LLNode temp = node;
        int length = 0;
        while(temp != null){
            temp = temp.next;
            length++;
        }

        return length;
    }
}

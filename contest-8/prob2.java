
// https://binarysearch.com/problems/Reverse-a-Linked-List
import java.util.*;

/**
 * class LLNode { int val; LLNode next; }
 */
class Solution {
    public LLNode solve(LLNode node) {

        LLNode prev = null;
        LLNode curr = node;

        while (curr != null) {
            LLNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;

    }
}
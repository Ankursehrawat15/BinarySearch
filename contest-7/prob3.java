
// https://binarysearch.com/problems/Kth-Last-Node-of-a-Linked-List

// can also do this by reversing the linked list
import java.util.*;

/**
 * class LLNode { int val; LLNode next; }
 */
class Solution {

    public int solve(LLNode node, int k) {

        int length = 0;
        LLNode temp = node;
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        int traverse = length - k;

        int index = 0;
        temp = node;
        while (index++ < traverse - 1) {
            temp = temp.next;
        }

        return temp.val;

    }
}
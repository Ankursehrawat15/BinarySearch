
// https://binarysearch.com/problems/Insert-Into-Linked-List
import java.util.*;

/**
 * class LLNode { int val; LLNode next; }
 */
class Solution {
    public LLNode solve(LLNode head, int pos, int val) {
        LLNode newNode = new LLNode();
        newNode.val = val;

        if (pos == 0) {
            newNode.next = head;
            return newNode;
        }

        int index = 0;
        LLNode traverse = head;

        while (index < pos - 1) {

            traverse = traverse.next;
            index++;
        }

        LLNode temp = traverse.next;
        traverse.next = newNode;
        newNode.next = temp;

        return head;

    }
}
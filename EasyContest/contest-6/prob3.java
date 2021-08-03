import java.util.*;

/**
 * class LLNode { int val; LLNode next; }
 */
class Solution {
    public int solve(LLNode node) {
        LLNode fast = node;
        LLNode slow = node;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow.val;

    }
}
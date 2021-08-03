import java.util.*;

/**
 * public class Tree { int val; Tree left; Tree right; }
 */
class Solution {

    public int solve(Tree root, int lo, int hi) {
        int count = 0;
        if (root == null)
            return 0;

        if (root.val >= lo && root.val <= hi) {
            count++;
            int leftCount = solve(root.left, lo, hi);
            int rightCount = solve(root.right, lo, hi);
            return leftCount + rightCount + count;
        }

        else if (root.val > hi) {
            return solve(root.left, lo, hi);
        } else if (root.val < lo) {
            return solve(root.right, lo, hi);
        }

        return -1;

    }
}
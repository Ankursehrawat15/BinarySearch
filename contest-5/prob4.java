import java.util.*;

/**
 * public class Tree { int val; Tree left; Tree right; }
 */
class Solution {
    public boolean solve(Tree root, int target) {
        if (root == null)
            return false;

        if (root.val == target) {
            return true;
        }

        boolean ispresentLeft = solve(root.left, target);
        if (ispresentLeft)
            return true;

        boolean ispresentRight = solve(root.right, target);
        return ispresentRight;
    }
}

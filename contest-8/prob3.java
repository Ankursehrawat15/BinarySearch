
// https://binarysearch.com/problems/Partition-Tree
import java.util.*;

/**
 * public class Tree { int val; Tree left; Tree right; }
 */
class Solution {

    private void solve(Tree root, int[] arr) {
        if (root == null)
            return;

        solve(root.left, arr);
        solve(root.right, arr);

        if (root.left == null && root.right == null) {
            arr[0] = arr[0] + 1;
        } else {
            arr[1] = arr[1] + 1;
        }

    }

    public int[] solve(Tree root) {

        int[] arr = new int[2];
        solve(root, arr);
        return arr;

    }
}

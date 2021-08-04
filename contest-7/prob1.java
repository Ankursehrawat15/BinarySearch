// https://binarysearch.com/problems/Fixed-Point

import java.util.*;

class Solution {
    public int solve(int[] nums) {

        int start = 0;
        int end = nums.length - 1;
        int ans = Integer.MAX_VALUE;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] == mid && mid < ans) {

                ans = mid;

            }
            if (nums[mid] >= mid) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        if (ans != Integer.MAX_VALUE) {
            return ans;
        } else {
            return -1;
        }

    }
}
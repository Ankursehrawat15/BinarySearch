
// https://binarysearch.com/problems/Mixed-Sorting
import java.util.*;

// My approach 
class Solution {
    public int[] solve(int[] nums) {
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

        for (int num : nums) {
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }

        Collections.sort(even);
        Collections.sort(odd, Collections.reverseOrder());

        int oddIndex = 0;
        int evenIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                nums[i] = even.get(evenIndex++);
            } else {
                nums[i] = odd.get(oddIndex++);
            }
        }

        return nums;

    }
}

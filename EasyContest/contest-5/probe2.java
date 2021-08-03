
import java.util.*;

class Solution {
    public boolean solve(int[][] votes) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < votes.length; i++) {

            if (map.containsKey(votes[i][1])) {
                return true;
            } else {
                map.put(votes[i][1], votes[i][0]);
            }
        }

        return false;
    }
}
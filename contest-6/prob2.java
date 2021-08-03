import java.util.*;

class Solution {
    public boolean solve(int n) {

        for (int i = 0; i * i <= n; i++) {

            if (i * i == n) {
                return true;
            }
        }

        return false;
    }
}
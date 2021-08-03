import java.util.*;

class Solution {

    // discuss section solution
    public String[] solve(int n) {
        String[] ans = new String[n];
        for (int i = 1; i <= n; i++) {
            String s = Integer.toString(i);

            if (i % 3 == 0 || s.contains("3") || s.contains("6") || s.contains("9")) {
                ans[i - 1] = "clap";
            } else {
                ans[i - 1] = s;
            }
        }

        return ans;
    }

    public String[] solve(int n) {
        String[] ans = new String[n];
        int num = 1;
        int index = 0;
        while (num < n + 1) {

            if (num % 3 == 0) {
                ans[index++] = "clap";
            } else {

                int x = num;
                int marked = 0;
                while (x != 0) {

                    int digit = x % 10;

                    if (digit == 3 || digit == 6 || digit == 9) {
                        ans[index++] = "clap";
                        marked++;
                        break;
                    }

                    x = x / 10;
                }
                if (marked == 0) {
                    ans[index++] = "" + num;
                }

            }

            num++;

        }

        return ans;
    }
}

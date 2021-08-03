import java.util.*;

class Solution {
    public String[] solve(String s) {
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();
        int open = 0;
        int close = 0;

        for (int i = 0; i < s.length(); i++) {

            sb.append(s.charAt(i));
            if (s.charAt(i) == '(')
                open++;
            else if (s.charAt(i) == ')')
                close++;

            if (open == close) {
                list.add(sb.toString());
                open = 0;
                close = 0;
                sb.delete(0, sb.length());
            }
        }

        String[] ans = new String[list.size()];
        int index = 0;
        for (String small : list) {
            ans[index++] = small;
        }

        return ans;
    }
}
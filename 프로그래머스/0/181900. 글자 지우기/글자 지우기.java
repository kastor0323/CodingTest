import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder();
        boolean[] isRemoved = new boolean[my_string.length()];
        for (int idx : indices) {
            isRemoved[idx] = true;
        }

        for (int i = 0; i < my_string.length(); i++) {
            if (!isRemoved[i]) {
                sb.append(my_string.charAt(i));
            }
        }

        return sb.toString();
    }
}
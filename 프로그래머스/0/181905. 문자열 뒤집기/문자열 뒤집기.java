import java.util.*;
class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String a = my_string.substring(0,s);
        StringBuilder b = new StringBuilder(my_string.substring(s, e + 1));
        b.reverse();
        String c = my_string.substring(e + 1);
        answer = a + b + c;
        
        return answer;
    }
}
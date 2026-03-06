import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char[] beforeChars = before.toCharArray();
        char[] afterChars = after.toCharArray();
        
        Arrays.sort(beforeChars);
        Arrays.sort(afterChars);
        
        String sortedBefore = new String(beforeChars);
        String sortedAfter = new String(afterChars);
        
        if(sortedBefore.equals(sortedAfter)){
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
}
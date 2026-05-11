import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        Arrays.sort(d);
        
        for(int i = 0; i < d.length; i++){
            int temp = sum + d[i];
            if(temp <= budget){
                sum = temp;
                answer ++;
            } else {
                break;
            }
        }
        return answer;
    }
}
import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        int num = num_list.length;
        int[] answer = new int[num - 5];
        for(int i = 5; i < num; i++){
            answer[i - 5] = num_list[i];
        }
        return answer;
    }
}
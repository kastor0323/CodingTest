import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int answerIdx = 0;
        for(int[] i : commands){
            int[] cut = new int[i[1] - i[0] + 1];
            int idx = 0;
            for(int j = i[0] - 1; j < i[1]; j++){
                cut[idx] = array[j];
                idx++;
            }
            Arrays.sort(cut);
            answer[answerIdx] = cut[i[2] -1];
            answerIdx++;
        }
        return answer;
    }
}
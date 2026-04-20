class Solution {
    public int[] solution(int n, int k) {
        int index = n / k;
        int idx = 0;
        int[] answer = new int[index];
        for(int i = 1; i <= index; i++){
            answer[idx] = k * i;
            idx++;
        }
        return answer;
    }
}
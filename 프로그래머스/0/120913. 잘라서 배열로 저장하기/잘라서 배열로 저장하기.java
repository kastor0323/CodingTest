class Solution {
    public String[] solution(String my_str, int n) {
        String[] arr = my_str.split("");
        int idx = 0;
        int a = my_str.length();
        //result 배열크기 정하기
        int answer_idx = 0;
        if(a % n == 0){
            answer_idx = a / n;
        } else{
            answer_idx = (a / n) + 1;
        }
        String[] answer = new String[answer_idx];
        for(int i = 0; i < answer_idx; i++) answer[i] = "";
        
        for(int i = 0; i < a; i++){
            answer[idx] += arr[i];
            if((i+1) % n == 0){
                idx++;
            }
        }
        return answer;
    }
}
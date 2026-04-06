class Solution {
    public int solution(String num_str) {
        int answer = 0;
        int idx = num_str.length();
        String[] numbers = num_str.split("");
        for(int i = 0; i < idx; i++){
            answer += Integer.parseInt(numbers[i]);
            
        }
        return answer;
    }
}
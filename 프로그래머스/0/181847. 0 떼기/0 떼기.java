class Solution {
    public String solution(String n_str) {
        String answer = "";
        
        //int로 바꾸어서 0을 다 날리기
        int number = Integer.parseInt(n_str);
        answer = Integer.toString(number);
        return answer;
        
    }
}
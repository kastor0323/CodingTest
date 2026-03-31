class Solution {
    public int solution(String my_string, String target) {
        int answer = 0;
        //부분 문자열 확인.contains(target);
        if(my_string.contains(target) == true)
            answer = 1;
        else
            answer = 0;
        return answer;
    }
}
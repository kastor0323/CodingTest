class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = n ; i >= 0; i-=2){
            answer += (n % 2 == 1)? i : i*i;
        }
        return answer;
    }
}

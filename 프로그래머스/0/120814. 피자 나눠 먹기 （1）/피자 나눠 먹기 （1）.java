class Solution {
    public int solution(int n) {
        int answer = 0;
        int pizza = n / 7;
        if(n%7 > 0) pizza += 1;
        answer = pizza;
        return answer;
    }
}
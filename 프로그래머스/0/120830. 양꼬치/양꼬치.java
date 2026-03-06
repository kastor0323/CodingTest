class Solution {
    public int solution(int n, int k) {
        int answer = n * 12_000 + k * 2_000 -  n / 10  * 2_000;
        return answer;
    }

}
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int len = numbers.length;
        for(int i = 0; i < len; i++){
            for(int j = 0; j < len; j++){
                if(i == j){
                    continue;
                }else{
                    if(answer >= numbers[i] * numbers[j]){
                        continue;
                    }else
                        answer = numbers[i] * numbers[j]; 
                }
            }
        }
        return answer;
    }
}
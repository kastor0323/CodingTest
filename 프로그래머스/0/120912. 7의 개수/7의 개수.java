class Solution {
    public int solution(int[] array) {
        int answer = 0; 
        for(int i = 0; i < array.length; i++){
            int num = 0;
            while(array[i] > 0){
                num = array[i] % 10;
                if(num == 7){
                    answer += 1;
                }
                array[i] /=10;
            }
            
        }
        return answer;
    }
}
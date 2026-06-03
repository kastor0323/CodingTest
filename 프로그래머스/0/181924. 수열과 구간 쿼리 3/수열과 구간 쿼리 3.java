class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int [arr.length];
        for(int i = 0; i < arr.length; i++){
            answer[i] = arr[i];
        }
        
        for(int[] query : queries){
            int temp = answer[query[0]];
            
            answer[query[0]] = answer[query[1]];
            answer[query[1]] = temp;
        }
        return answer;
    }
}
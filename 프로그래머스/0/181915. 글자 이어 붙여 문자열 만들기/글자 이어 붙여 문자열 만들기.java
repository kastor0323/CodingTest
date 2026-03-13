class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        String[] arr = my_string.split("");
        for(int i = 0; i < index_list.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(index_list[i] == j){
                    answer += arr[j];
                }
            }
        }
        return answer;
    }
}
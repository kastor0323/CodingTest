class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String arr1 = "";
        String arr2 = "";
        arr1 = Integer.toString(a) + Integer.toString(b);
        arr2 = Integer.toString(b) + Integer.toString(a);
        if(Integer.parseInt(arr1) < Integer.parseInt(arr2)){ 
            answer = Integer.parseInt(arr2);
        } else {          
            answer = Integer.parseInt(arr1);
        }
        return answer;
    }
}
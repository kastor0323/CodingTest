import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++){
            for(int j = i + 1; j < nums.length - 1; j++){
                for(int k = j + 1; k < nums.length; k++){
                    if(isPrime(nums[i], nums[j], nums[k]))
                        answer++;
                    }
                }
            }
        return answer;
    }
    
    public boolean isPrime(int i, int j, int k){

        int sum = i + j + k;
        boolean result = true;
        for(int num = 2; num <= Math.sqrt(sum); num++){
            if(sum % num == 0)
                return false;
        }
        
        return result;
    }
}
    
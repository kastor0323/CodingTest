class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a = 0;
        int b = 0;
        int[] answer = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                int sum = nums[i] + nums[j];
                if(target == sum){
                    a = i;
                    b = j;
                }
            }
        }
        answer[0] = a;
        answer[1] = b;

        return answer;
    }
}
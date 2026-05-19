class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        backtrack(new ArrayList<>(), nums, answer);
        return answer;
    }

    private void backtrack(List<Integer> curr, int[] nums, List<List<Integer>> answer){
        if(curr.size() == nums.length){
            answer.add(new ArrayList<>(curr));
            return;
        }

        for(int num : nums){
            if(!curr.contains(num)){
                curr.add(num);
                backtrack(curr, nums, answer);
                curr.remove(curr.size() - 1);
            }
        }
    }
}
/*
조합 방식 순서를 중요하지 않다. [1,2] [2,1]은 같다고 생각 그러기에 이전을 봐야한다.
stack도 사용해야하지 않을까?
 */

class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> combine(int n, int k) {
        ans = new ArrayList<>();
        int[] nums = new int[n];
        for(int i = 0; i < n ; i++){
            nums[i] = i+1;
        }
        dfs(nums, k, new ArrayList<>(), 0);
        return ans;
    }

    void dfs(int[] nums, int k, List<Integer> curr, int start){
        if(curr.size() == k){
            ans.add(new ArrayList<>(curr));
            return;
        }

        for(int i = start; i < nums.length; i++){
            curr.add(nums[i]);

            dfs(nums, k, curr, i+1);

            curr.remove(curr.size() - 1);
        }
        return;
    }
}
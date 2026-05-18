/*
visited[] boolean을 만들어서 TF방식

순회하면서 Set으로 만들어서 Queue방식으로 빠질때 set을 제거하는 방식? -> 근데 이러면 다른것 순회할때 어려울 수 있을 듯
 */
class Solution {
    List<List<Integer>> answer;

    public List<List<Integer>> permute(int[] nums) {
        int m = nums.length;
        answer = new ArrayList<>();
        dfs(nums, m, new ArrayList<>(), new boolean[nums.length]);
        return answer;

        }

        void dfs(int[] nums, int m, List<Integer>curr, boolean[] visited){
           
            if(curr.size() == nums.length){
                answer.add(new ArrayList<>(curr));
                return;
            }
            for(int i = 0; i < nums.length; i++){
                if(!visited[i]){
                    curr.add(nums[i]);
                    visited[i] = true;
                    dfs(nums, m, curr, visited);
                    visited[i] = false;
                    curr.remove(curr.size() - 1);

                }
        }
        return;
    }
}
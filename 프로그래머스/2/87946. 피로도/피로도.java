
class Solution {
    int answer;
    public int solution(int k, int[][] dungeons) {
        answer = 0;
        int n = dungeons.length;
        dfs(dungeons, n, k, new boolean[n], 0);       
        return answer;
    }
    
    void dfs(int[][] dungeons, int n, int k, boolean[] visited, int count){
        answer = Math.max(answer, count);
        
        for(int i = 0; i < n; i++){
            if(!visited[i] && dungeons[i][0] <= k){
                visited[i] = true;
                dfs(dungeons, n, k - dungeons[i][1], visited, count + 1);
                visited[i] = false;
            }
        }
        return;
    }
}
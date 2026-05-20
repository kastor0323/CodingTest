/*
기존 grid를 다루는 것처럼 생각하며 bfs 방식으로 접근해야한다 생각한다
*/
import java.util.*;

class Solution {
    int n, m;
    int[] oil;
    public int solution(int[][] land) {
        n = land.length;
        m = land[0].length;
        oil = new int[m];
        
        boolean[][] visited = new boolean[n][m];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                //만약land == 1이고 방문을 안하면 dfs를 시작
                if(land[i][j] == 1 && !visited[i][j]){
                    dfs(land, visited, i, j);
                }
            }
        }
        int answer = Arrays.stream(oil).max().getAsInt();
        return answer;
    }
    
    void dfs(int[][] land, boolean[][] visited, int x, int y){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x,y});
        visited[x][y] = true;
        
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        
        int count = 1;
        
        Set<Integer> set = new HashSet<>();
        
        while(!q.isEmpty()){
            int[] now = q.poll();
            set.add(now[1]);
            
            for(int i = 0; i < 4; i++){
                int nx = now[0] + dx[i];
                int ny = now[1] + dy[i];
                
                if(!checkRange(nx, ny)){
                    continue;
                }
                
                if(land[nx][ny] == 1 && visited[nx][ny] == false){
                    q.add(new int[]{nx, ny});
                    visited[nx][ny] = true;
                    count += 1;
                }
            }
        }
        
        for(int index : set){
            oil[index] += count;
        }
    }
    
    boolean checkRange(int x, int y){
        if(x < 0 || x >= n || y < 0 || y >= m){
            return false;
        }
        return true;
    }
    
}
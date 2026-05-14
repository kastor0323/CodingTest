import java.util.*;

class Solution {
    int raws;
    int cols;
    int[][] directions = {{0, -1}, {-1, 0}, {1, 0}, {0, 1}};

    public int solution(String[] maps) {
        raws = maps.length;
        cols = maps[0].length();
        
        int[][] grid = new int[raws][cols];
        int[] start = new int[2];
        int[] leverPos = new int[2];
        int[] exitPos = new int[2];

        for(int i = 0; i < raws; i++){
            for(int j = 0; j < cols; j++){
                char cell = maps[i].charAt(j);      
                switch(cell){
                    case 'S': start = new int[]{i, j}; break;
                    case 'L': leverPos = new int[]{i, j}; break;
                    case 'E': exitPos = new int[]{i, j}; break;
                    case 'X': grid[i][j] = 1; break; // 벽만 1로 표시
                }        
            }
        }
        
        // 1. 레버 찾기
        int toLever = bfs(grid, start, leverPos);
        if(toLever == -1) return -1;
        
        // 2. 출구 찾기
        int toExit = bfs(grid, leverPos, exitPos);
        if(toExit == -1) return -1;
        
        return toLever + toExit;
    }
    
    private int bfs(int[][] grid, int[] start, int[] target){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{start[0], start[1], 0});
        
        boolean[][] visited = new boolean[raws][cols];
        visited[start[0]][start[1]] = true;
        
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int r = curr[0];
            int c = curr[1];
            int dist = curr[2];
            
            if(r == target[0] && c == target[1]){
                return dist;
            }
            
            for(int[] d : directions){
                int nr = r + d[0];
                int nc = c + d[1];

                if(nr >= 0 && nc >= 0 && nr < raws && nc < cols && 
                   grid[nr][nc] == 0 && !visited[nr][nc]){
                    visited[nr][nc] = true;
                    q.add(new int[]{nr, nc, dist + 1});
                }
            }  
        }
        return -1;
    }
}
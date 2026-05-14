/*
0,0에서 n,n까지 이동하는 최단거리를 구하기 8방향으로 가능
최단거리이기에 BFS방식으로 찾으면 좋을듯?
 */
import java.util.*;

class Solution {
    int[][] directions = {
    {-1,-1}, {-1,0}, {-1,1}, 
    {0,-1},          {0,1}, 
    {1,-1},  {1,0},  {1,1}
};
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;

        if (grid[0][0] == 1 || grid[n-1][n-1] == 1) return -1;

        return bfs(grid, n);
    }

    private int bfs(int[][] grid, int n){
        Queue<int[]> q = new LinkedList<>();

        q.add(new int[]{0, 0});
        grid[0][0] = 1;

        while(!q.isEmpty()){
            int[] curr = q.poll();

            int r = curr[0];
            int c = curr[1];

           if(r == n -1 && c == n - 1){
            return grid[r][c];
           }

           for(int[] d : directions){
                int nr = r + d[0];
                int nc = c + d[1];

                if(nr >= 0 && nc >= 0 && nr < n && nc < n && grid[nr][nc] == 0){
                    grid[nr][nc] = grid[r][c] + 1;
                    q.add(new int[]{nr, nc});
                }
            }  
        }
        return -1;
    }
}
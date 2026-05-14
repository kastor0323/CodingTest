/*
최단 거리를 구하기 문제
따라서 처음으로 목적지에 도달하는 순간이 무조건 최단거리임이 보장됩니다. 도착하자마자 탐색을 종료할 수 있어 훨씬 빠릅니다.
*/
import java.util.*;

class Solution {
    //상하 좌우 이동
    int[] dr = {-1, 1, 0, 0};
    int[] dc = {0, 0, -1, 1};    
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        
        return bfs(maps, n, m);
    }
    
    private int bfs(int[][] maps, int n, int m){
        Queue<int[]> q = new LinkedList<>();
        
        //시작점 설정
        q.add(new int[]{0, 0});
        
        while(!q.isEmpty()){
            //시작 할땐 0,0 이후 이동하는 거 뽑음
            int[] curr = q.poll();
            
            //x값
            int r= curr[0];
            //y값
            int c = curr[1];
            
            //(n,m)에 도달하면 종료
            if(r == n - 1 && c == m - 1){
                return maps[r][c];
            }
            
            for(int i = 0; i < 4; i++){
                int nr = r + dr[i];
                int nc = c + dc[i];
                
                if(nr >= 0 && nc >= 0 && nr < n && nc < m && maps[nr][nc] == 1){
                    maps[nr][nc] = maps[r][c] + 1;
                    q.add(new int[]{nr, nc});
                }
            }
        }

        return -1;
    }
}
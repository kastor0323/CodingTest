/*
서로 연결된 네트워크 갯수를 세자
예제1는 0과 1이 연결 2는 분리 따라서 네트워크 갯수 2
예제2는 0,1,2연결 하나의 네트워크임

DFS방식이 좋을듯

*/
import java.util.*;

class Solution {
    public int solution(int n, int[][] computers) {
        //노드 방문 했는지 체크
        boolean[] visited = new boolean[n];
        int answer = 0;
        
        for(int i = 0; i < n; i++){
            if(!visited[i]){
                dfs(i , n ,computers, visited);
                answer++;
            }
        }
        return answer;
    }
    
    void dfs(int current, int n, int[][] computers, boolean[] visited){
        visited[current] = true;
        
        for(int next = 0; next < n; next++){
            if(computers[current][next] == 1 && !visited[next]){
                dfs(next, n, computers, visited);
            }
            
        }
    }
}
/*
최단경로는 
BFS방식
edge를 그래프로 전환
*/
import java.util.*;

class Solution {
    public int solution(int n, int[][] edge) {
        // 1. 인접 리스트 생성
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        
        for (int[] e : edge) {
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }
        
        // 2. 방문 여부 및 거리 저장 배열
        int[] distance = new int[n + 1];
        boolean[] visited = new boolean[n + 1];
        
        // 3. BFS 준비
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        visited[1] = true;
        
        int maxDist = 0;
        
        // 4. BFS 실행
        while (!queue.isEmpty()) {
            int current = queue.poll();
            
            for (int neighbor : graph.get(current)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    distance[neighbor] = distance[current] + 1;
                    maxDist = Math.max(maxDist, distance[neighbor]);
                    queue.add(neighbor);
                }
            }
        }
        
        // 5. 가장 먼 노드 개수 세기
        int answer = 0;
        for (int d : distance) {
            if (d == maxDist) answer++;
        }
        
        return answer;
    }
}
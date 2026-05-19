import java.util.*;

class Solution {
    private List<List<Integer>> graph;
    private int[] subtreeSize;
    private boolean[] visited;
    
    public int solution(int n, int[][] wires) {
        // 인접 리스트 구성
        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] wire : wires) {
            graph.get(wire[0]).add(wire[1]);
            graph.get(wire[1]).add(wire[0]);
        }
        
        subtreeSize = new int[n + 1];
        visited = new boolean[n + 1];
        
        // 1번 노드를 루트로 DFS 수행
        dfs(1);
        
        // 모든 노드의 서브트리 크기로 최소 차이 계산
        int answer = Integer.MAX_VALUE;
        for (int i = 2; i <= n; i++) {
            int diff = Math.abs(n - 2 * subtreeSize[i]);
            answer = Math.min(answer, diff);
        }
        
        return answer;
    }
    
    private int dfs(int node) {
        visited[node] = true;
        subtreeSize[node] = 1;  // 자기 자신 포함
        
        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor);
                subtreeSize[node] += subtreeSize[neighbor];
            }
        }
        
        return subtreeSize[node];
    }
}
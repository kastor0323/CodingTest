import java.util.*;

class Solution {
    private static final int[] dr = {-1, 1, 0, 0};
    private static final int[] dc = {0, 0, -1, 1};

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        int count = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    bfs(grid, i, j, rows, cols);
                }
            }
        }
        return count;
    }

    private void bfs(char[][] grid, int r, int c, int rows, int cols) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{r, c});
        grid[r][c] = '0'; // 시작점 방문 처리

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int currR = curr[0];
            int currC = curr[1];

            for (int i = 0; i < 4; i++) {
                int nr = currR + dr[i];
                int nc = currC + dc[i];

                // 범위를 벗어나지 않고, 아직 육지('1')인 경우만 큐에 삽입
                if (nr >= 0 && nr < rows && nc >= 0 && nc < cols && grid[nr][nc] == '1') {
                    grid[nr][nc] = '0'; // 큐에 넣을 때 방문 처리 (중복 방지 핵심)
                    queue.offer(new int[]{nr, nc});
                }
            }
        }
    }
}
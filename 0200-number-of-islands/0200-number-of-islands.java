class Solution {
    // 상하좌우 이동을 위한 방향 배열
    private static final int[] dr = {-1, 1, 0, 0};
    private static final int[] dc = {0, 0, -1, 1};

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        int count = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // 육지를 발견하면 새로운 섬 카운트 시작
                if (grid[i][j] == '1') {
                    count++;
                    dfs(grid, i, j, rows, cols);
                }
            }
        }
        return count;
    }

    private void dfs(char[][] grid, int r, int c, int rows, int cols) {
        // 1. 범위를 벗어나거나 바다('0')인 경우 즉시 종료
        if (r < 0 || r >= rows || c < 0 || c >= cols || grid[r][c] == '0') {
            return;
        }

        // 2. 방문 처리 (육지를 바다로 변경)
        grid[r][c] = '0';

        // 3. 4방향 탐색 (반복문으로 처리)
        for (int i = 0; i < 4; i++) {
            dfs(grid, r + dr[i], c + dc[i], rows, cols);
        }
    }
}
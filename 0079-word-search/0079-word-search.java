class Solution {
    // 4 possible directions: Up, Down, Left, Right
    private final int[][] DIRECTIONS = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;
        boolean[][] visited = new boolean[rows][cols];
        
        // Try to find the start of the word anywhere in the grid
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // If the first letter matches, start the DFS
                if (board[i][j] == word.charAt(0)) {
                    if (dfs(board, word, visited, i, j, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, boolean[][] visited, int r, int c, int index) {
        // Base Case: If we matched all characters, we found the word!
        if (index == word.length()) {
            return true;
        }
        
        // Boundary and Validity Checks
        if (r < 0 || r >= board.length || c < 0 || c >= board[0].length // Out of bounds
            || visited[r][c]                                            // Already visited
            || board[r][c] != word.charAt(index)) {                     // Wrong character
            return false;
        }
        
        // 1. Choose: Mark the current cell as visited
        visited[r][c] = true;
        
        // 2. Explore: Search all 4 adjacent directions for the NEXT character (index + 1)
        for (int[] dir : DIRECTIONS) {
            int nextRow = r + dir[0];
            int nextCol = c + dir[1];
            
            if (dfs(board, word, visited, nextRow, nextCol, index + 1)) {
                return true; // If any direction succeeds, propagate true upwards
            }
        }
        
        // 3. Un-choose (Backtrack): Reset visited status for other paths to use
        visited[r][c] = false;
        
        return false;
    }
}
/* 
그리드에서 row와 col에 +하면서 1이 있음 같은 섬으로 판단
프로그래머스 네트워크 문제와 유사 dfs로 접근
재귀함수를 생각해보고 answer++로 접근
*/

class Solution {
    int rows;
    int cols;

    public int numIslands(char[][] grid) {
        int count = 0;
        rows = grid.length;
        cols = grid[0].length;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(grid[i][j] == '1'){
                    count++;
                    dfs(grid, i, j);
                }
            }
        }
        return count;
    }

    private void dfs(char[][] grid, int r, int c){
        rows = grid.length;
        cols = grid[0].length;

        if(r < 0 || c < 0 || r >= rows || c >= cols || grid[r][c] == '0'){
            return;
        }

        grid[r][c] = '0';

        dfs(grid, r - 1, c);
        dfs(grid, r + 1, c);
        dfs(grid, r, c -1);
        dfs(grid, r, c + 1);
    }
}
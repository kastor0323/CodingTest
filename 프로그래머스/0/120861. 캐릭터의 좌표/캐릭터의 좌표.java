class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int x = 0;
        int y = 0;
        
        int xLimit = board[0] / 2;
        int yLimit = board[1] / 2;
        
        for (String s : keyinput) {
            switch (s) {
                case "left":
                    if (x > -xLimit) x--;
                    break;
                case "right":
                    if (x < xLimit) x++;
                    break;
                case "up":
                    if (y < yLimit) y++;
                    break;
                case "down":
                    if (y > -yLimit) y--;
                    break;
            }
        }
        
        return new int[]{x, y};
    }
}
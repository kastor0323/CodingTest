class Solution {
    public int solution(int[][] dots) {
        int weight = 0;
        int height = 0;
        for(int i = 0; i < dots.length; i++){
            for(int j = 0; j < dots.length; j++){
                //가로 길이 구하기
                if(dots[i][0] == dots[j][0]){
                    continue;
                }
                if(dots[i][1] == dots[j][1]){
                    continue;
                }
                weight = Math.abs(dots[i][0] - dots[j][0]);
                height = Math.abs(dots[i][1] - dots[j][1]);
            }
        }
        return weight * height;
    }
}
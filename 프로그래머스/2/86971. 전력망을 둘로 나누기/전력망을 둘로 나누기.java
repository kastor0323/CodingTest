class Solution {
    int length;
    boolean visited[];
    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;    
        length = wires.length;
        
        for(int i = 0; i<length; i++){
            int rootNode = wires[i][0];
            visited = new boolean[length];
            visited[i] = true;
            answer = Math.min(answer, Math.abs(2*getNodeAmount(rootNode, wires) - n));
            
        }
        return answer;
    }
    
    public int getNodeAmount(int rootNode, int[][]wires){
        int count = 1;

        for(int i = 0; i<length; i++){
            if(visited[i]) continue;
            if(rootNode == wires[i][1]){
                visited[i] = true;
                count += getNodeAmount(wires[i][0], wires);
            } 
            if(rootNode == wires[i][0]){
                visited[i] = true;
                count += getNodeAmount(wires[i][1], wires);
            } 
        }
        
        return count;
        
    }
    
    
}
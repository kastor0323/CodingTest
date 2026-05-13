import java.util.*;
/*
BFS방식
Queue를 통해 키를 꺼내서 찾고 찾은 키를 Queue에 add
*/

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];

        //첫번째 0번방 접근 true
        visited[0] = true;

        //열쇠를 담을 주머니 준비
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);

        int count = 1;

        while(!queue.isEmpty()){
            int currentKey = queue.poll();

            for(int key : rooms.get(currentKey)){
                if(!visited[key]){
                    visited[key] = true;
                    queue.add(key);
                    count++;
                }
            }
        }
        return count == rooms.size();
    }
}
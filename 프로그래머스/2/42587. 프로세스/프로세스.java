import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        //PriorityQueue 우선순위를 정해주는 큐 Collections.reverseOrder()을 하면 우선순위가 높은 숫자가 먼저 나옴
        // Collections.reverseOrder()없으면 숫자 낮은게 우선순위임
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        int answer = 0;
        
        for(int process : priorities){
            q.offer(process);
        }
        
        while(!q.isEmpty()){
            
            for(int i = 0; i < priorities.length; i++){
                if(q.peek() == priorities[i]){
                    q.poll();
                    answer++;
                    
                    if(location == i)
                        return answer;

                }
                
                
            }
        }
        return answer;
    }
}
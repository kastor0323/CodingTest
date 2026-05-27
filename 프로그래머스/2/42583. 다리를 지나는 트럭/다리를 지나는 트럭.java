import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> q = new LinkedList<Integer>();
        
        int sum = 0;
        for(int t : truck_weights){
            
            while(true){
                //큐가 시작하거나 한 트럭만 지난 상황이 끝났을 때
                if(q.isEmpty()){
                    q.offer(t);
                    sum += t;
                    answer++;
                    break;
                }
                //다리에 트럭이 모두 올라가고 난 후
                else if(q.size() == bridge_length){
                    sum -= q.poll();
                }
                //큐가 아직 비어있지 않을때
                else {
                    //트럭 무게가 다리보다 크다면?
                    if(sum + t > weight){
                        q.offer(0);
                        answer++;
                    }
                    else {
                        q.offer(t);
                        sum += t;
                        answer++;
                        break;
                    }
                }
            }
            
        }
        return answer + bridge_length;
    }
}
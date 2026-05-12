import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Queue<Integer> queue =  new LinkedList<>();
        for(int i = 0; i < progresses.length; i++){
            //큐에 남은 작업일수를 넣기 바로 나누어지면 값 그대로 나누지 않으면 하루 추가
            if((100 - progresses[i]) % speeds[i] == 0)
                queue.offer((100 - progresses[i]) / speeds[i]);
            else
                queue.offer(((100 - progresses[i]) / speeds[i]) + 1);
        }
        
        int now = queue.poll();
        int count = 1;
        
        //가장 빠른 작업 일수가 다음 작업일수보다 크면 count++를 하여 배포할 수 있는 기능 수 추가
        // 아니면 그대로 기능 수를 answer리스트에 저장하고 now와 count를 초기화
        while(!queue.isEmpty()){
            if(now >= queue.peek()){
                count++;
                queue.poll();
            } else {
                answer.add(count);
                count = 1;
                now = queue.poll();
            }
        }
        answer.add(count);
      
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
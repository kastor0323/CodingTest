import java.util.*;

class Solution {
    /*
    목적 : 한 번호가 다른 번호에 시작번호인가? 아니면 true 맞으면 false 반환해라
    HashMap에 번호를 집어넣고 이중 for문 써서 체크
    시간복잡도 : O(n^2)
    */
    
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Map<String, Integer> phoneMap = new HashMap<>();
        for(int i = 0; i < phone_book.length; i++){
            phoneMap.put(phone_book[i], i);
        }
        
        for(int i = 0; i < phone_book.length; i++){
            for(int j = 0; j < phone_book[i].length(); j++){
                if(phoneMap.containsKey(phone_book[i].substring(0,j)))
                    answer = false;
            }
        }
        return answer;
    }
}
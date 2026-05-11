import java.util.*;

class Solution {
    public String solution(String new_id) {
        //1단계 toLowerCase()로 모두 소문자로 전환
        String answer = new_id.toLowerCase();
        
        //2단계 !,@,#,* 제거
        answer = answer.replaceAll("[^-_.a-z0-9]", "");
        
        //3단계 마침표 2번 이상 연속된 부분 하나의 마침표 전환
        answer = answer.replaceAll("[.]{2,}", ".");
        
        //4단계 앞뒤 마침표 제거
        answer = answer.replaceAll("^[.]|[.]$", "");
        
        //5단계 빈 문자열 a로 치환
        if(answer.equals(""))
            answer = "a";
        
        //6단계 16자 이상
        if(answer.length() >= 16){
            answer = answer.substring(0, 15);
            answer = answer.replaceAll("[.]$", "");
        }
        
        //7단계 아이디 길이가 2자 이하
        while (answer.length() < 3) {
            answer += answer.charAt(answer.length() - 1);
        }
        
        return answer;
    }
}
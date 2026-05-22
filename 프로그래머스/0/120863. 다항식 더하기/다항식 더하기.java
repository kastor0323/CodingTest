import java.util.*;

class Solution {
    public String solution(String polynomial) {

        String[] terms = polynomial.split(" \\+ ");
        
        int xSum = 0;
        int nSum = 0;
        
        for(String term : terms){
            if(term.contains("x")){
                if(term.equals("x")){
                    xSum += 1;
                } else{
                    xSum += Integer.parseInt(term.replace("x", ""));
                }
            } else {
                nSum += Integer.parseInt(term);
            }
        }
        String answer = "";
        
        if(xSum > 0){
            answer = (xSum == 1) ? "x" : xSum + "x";
        }
        
        if(nSum > 0){
            if(answer.equals("")){
                answer += nSum;
            } else {
                answer += " + " + nSum; 
            }
        }
        return answer;
    }
}
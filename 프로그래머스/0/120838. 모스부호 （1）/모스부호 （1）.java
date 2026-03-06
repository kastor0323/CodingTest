class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = letter.split(" ");
        String[] moresList = {
            ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."
        };
        
        for(String s : morse){
            for(int i = 0; i< moresList.length; i++){
                if(s.equals(moresList[i])){
                    answer += Character.toString(i+'a');
                }
            }
        }
    
        return answer;
    }
}
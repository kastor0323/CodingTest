class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i < words.length; i++){
            //valueOf를 잘기.
            s = s.replaceAll(words[i], String.valueOf(i));
        }

        return Integer.parseInt(s);
    }
}
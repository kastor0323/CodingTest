class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i = 0; i < quiz.length; i++){
            String[] arr = quiz[i].split(" ");
            
            int X = Integer.parseInt(arr[0]);
            int Y = Integer.parseInt(arr[2]);
            int Z = Integer.parseInt(arr[4]);
            
            int result = arr[1].equals("+") ? (X + Y) : (X - Y);
            
            answer[i] = (result == Z) ? "O" : "X";
            
        }
        return answer;
    }
}
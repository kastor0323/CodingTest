import java.util.HashSet;

class Solution {

    HashSet<Integer> primeSet = new HashSet<>();
    
    public int solution(String numbers) {
        String[] str = numbers.split("");
        int n = str.length;
        
        dfs(str, n, new boolean[n], "");
        
        return primeSet.size();
    }
    
    void dfs(String[] str, int n, boolean[] visited, String current){
        
        if (!current.equals("")) {
            int num = Integer.parseInt(current);
            if (isPrime(num)) { 
                primeSet.add(num); 
            }
        }
        
        for(int i = 0; i < n; i++){
            if(!visited[i]){
                visited[i] = true;
                dfs(str, n, visited, current + str[i]);
                visited[i] = false;
            }
        }
    }
    
    boolean isPrime(int num){
        if(num <= 1) return false; 
        
        for(int num2 = 2; num2 <= Math.sqrt(num); num2++){
            if(num % num2 == 0){
                return false;
            }
        }
        return true;
    }
}
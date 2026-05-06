class Solution {
    public int solution(String binomial) {
        int a = Integer.parseInt(binomial.split(" ")[0]);
        int b = Integer.parseInt(binomial.split(" ")[2]);
        String op = binomial.split(" ")[1];
        if(op.equals("+"))
            return a + b;
        else if(op.equals("-"))
            return a - b;
        else
            return a * b;
    }
}
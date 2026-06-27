class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        boolean a = false;
        boolean b = false;
        if(x1 == true || x2 == true)
            a = true;
        if(x3 == true || x4 == true)
            b = true;
        if(a == true && b == true)
            answer = true;
        else 
            answer = false;
        return answer;
    }
}
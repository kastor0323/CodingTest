class Solution {
    public int solution(int n, String control) {
        int resultNum = n;
        for (int i=0; i<control.length(); i++) {
            switch(control.charAt(i)) {
                case 'w':    // 'w'인 경우
                    resultNum += 1;    // 값을 1 증가
                    break;
                    
                case 's':    // 's'인 경우
                    resultNum -= 1;    // 값을 1 감소
                    break;
                    
                case 'd':    // 'd'인 경우
                    resultNum += 10;   // 값을 10 증가
                    break;
                    
                case 'a':    // 'a'인 경우
                    resultNum -= 10;   // 값을 10 감소
                    break;
            }
        }
        
        // 최종 결과값 반환
        return resultNum;
    }
}
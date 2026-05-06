import java.util.HashMap;

class Solution {
    public boolean solution(String[] phone_book) {
        // 1. 모든 전화번호를 해시맵에 담는다.
        HashMap<String, Integer> map = new HashMap<>();
        for (String number : phone_book) {
            map.put(number, 1);
        }

        // 2. 다시 모든 번호를 꺼내어 접두사가 존재하는지 확인한다.
        for (String number : phone_book) {
            for (int i = 1; i < number.length(); i++) {
                // 번호를 한 글자씩 잘라가며(substring) 해시맵에 있는지 체크
                if (map.containsKey(number.substring(0, i))) {
                    return false; // 접두사가 존재하면 즉시 종료
                }
            }
        }

        return true;
    }
}
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // <숫자 값, 해당 숫자의 인덱스>를 저장하는 해시맵
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            // 내가 찾는 '짝꿍' 숫자 계산
            int complement = target - nums[i];

            // 1. 짝꿍이 이미 맵에 있다면? 정답 발견!
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // 2. 짝꿍이 없다면? 나중에 올 숫자를 위해 나를 맵에 저장
            map.put(nums[i], i);
        }

        // 정답이 없는 경우 (문제 조건상 발생하지 않음)
        return new int[] {};
    }
}
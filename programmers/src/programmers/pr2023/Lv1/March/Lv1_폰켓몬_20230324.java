package programmers.pr2023.Lv1.March;

import java.util.HashMap;

public class Lv1_폰켓몬_20230324 {
    public static void main(String[] args) {
        int[] nums = {3,3,3,2,2,4};
        //int[] nums = {3,1,2,3};
        Solution s = new Solution();
        System.out.println(s.solution(nums));
    }
    static class Solution {
        public int solution(int[] nums) {
            int answer = 0;
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int i = 0; i < nums.length; i++) {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }

            int cnt = nums.length / 2;
            int temp = 0;
            for (Integer key : map.keySet()) {
                temp++;
                if(temp <= cnt) {
                    answer++;
                }
            }

            return answer;
        }
    }
}

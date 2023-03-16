package programmers.pr2023.Lv1.March;

public class Lv1_소수만들기_20230316 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        Solution s = new Solution();
        System.out.println(s.solution(nums));
    }

    static class Solution {
        public int solution(int[] nums) {
            int answer = 0;

            int temp = 0;
            for(int i = 0; i < nums.length; i++) {
                for(int j = i+1; j < nums.length; j++) {
                    for(int k = j+1; k < nums.length; k++) {
                        temp = nums[i] + nums[j] + nums[k];
                        answer += minorityCheck(temp);
                    }
                }
            }

            return answer;
        }

        public int minorityCheck(int no) {
            for(int i = 2; i < no; i++) {
                if(no % i == 0) {
                    return 0;
                }
            }
            return 1;
        }
    }
}

package programmers.pr2023.Lv0.March;

import java.util.Arrays;

public class Lv0_다음에올숫자_20230304 {
    public static void main(String[] args) {
        int[] common = {1,2,3,4};
        //int[] common = {2,4,8};
        //int[] common = {1,2,4};
        //int[] common = {-1,-2,-3,-4};
        Solution s = new Solution();
        System.out.println(s.solution(common));
    }
    // 등차수열 : 첫째항에 일정한 수를 더해서 얻은 항으로 이루어진 수열
    // 등비수열 : 첫째항에 일정한 수를 곱해서 얻은 항으로 이루어진 수열
    static class Solution {
        public int solution(int[] common) {
            int answer = 0;
            int[] tempArr = new int[common.length-1];

            for(int i = 0; i < common.length; i++){
                if(i < common.length-1) {
                    tempArr[i] = common[i + 1] - common[i];
                }
            }

            int lastNum = common[common.length-1];
            if(tempArr[1] == tempArr[0]) {
                answer = lastNum + tempArr[0];
            } else {
                answer = lastNum * (common[1] / common[0]);
            }

            return answer;
        }
    }

}

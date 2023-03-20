package programmers.pr2023.Lv1.March;

import java.util.Arrays;

public class Lv1_과일장수_20230320 {
    public static void main(String[] args) {
        int k = 3;
        int m = 4;
        //int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
        int[] score = {1, 2, 3, 1, 2, 3, 1};

        Solution s = new Solution();
        System.out.println(s.solution(k, m, score));
    }
    static class Solution {
        public int solution(int k, int m, int[] score) {
            int answer = 0;
            // 최저 사과 점수 * 한 상자에 담긴 사과 개수 * 상자 개수
            // 이익이 발생하지 않는 경우는 0을 리턴
            // k 는 가장 큰 가격, m은 상자에 담을 수 있는 사과 개수
            Arrays.sort(score);

            int[] temp = new int[score.length/m];
            int cnt = score.length;
            for (int i = 0; i < score.length/m; i++) {
                answer += (score[cnt-m] * m);
                cnt -= m;
            }

            /*
            // 아래와 같이 역순으로 해서 구할수도 있음
            for(int i = score.length; i >= m; i -= m){
                answer += score[i - m] * m;
            }
            */

            return answer;
        }
    }
}

package programmers.pr2023.Lv1.March;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lv1_모의고사_20230314 {
    public static void main(String[] args) {
        // int[] answers = {1, 3, 2, 4, 2};
        int[] answers = {3,3,2,1,5};
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(answers)));
    }
    static class Solution {
        public int[] solution(int[] answers) {
            int[] people1 = {1,2,3,4,5};
            int[] people2 = {2,1,2,3,2,4,2,5};
            int[] people3 = {3,3,1,1,2,2,4,4,5,5};

            int[] scores = new int[3];
            for(int i = 0; i < answers.length; i++) {
                if(people1[i%people1.length] == answers[i]) scores[0]++;
                if(people2[i%people2.length] == answers[i]) scores[1]++;
                if(people3[i%people3.length] == answers[i]) scores[2]++;
            }

            // 최대 점수 구하기
            int max = Math.max(scores[0], Math.max(scores[1], scores[2]));

            // 최대 점수와 같은 것을 찾아 리스트에 추가하기
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < scores.length; i++) {
                if(max == scores[i]) list.add(i + 1);
            }

            // 리스트의 순서대로 answer 배열에 넣기
            int[] answer = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }

            return answer;
        }
    }
}

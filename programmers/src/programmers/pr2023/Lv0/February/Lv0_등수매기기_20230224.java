package programmers.pr2023.Lv0.February;

import java.util.*;

public class Lv0_등수매기기_20230224 {
    static class Solution {
        public int[] solution(int[][] score) {
            int[] answer = new int[score.length];
            List<Integer> list = new ArrayList<>();
            for (int[] temp: score) {
                list.add(temp[0] + temp[1]);
            }

            list.sort(Comparator.reverseOrder()); // 리스트에 모든 합을 다 넣고 내림차순으로 정렬

            for(int i = 0; i < score.length; i++) {
                // 리스트에 score 합을 찾아 해당 위치 + 1하여 answer에 담기
                // 만약 같은 값이 있다면 맨 앞에 있는 위치 값을 반환하기 때문에 동일한 점수에 대해서 같은 등수를 매길 수 있음
                answer[i] = list.indexOf(score[i][0] + score[i][1])+1;
            }

            return answer;
        }
    }
}

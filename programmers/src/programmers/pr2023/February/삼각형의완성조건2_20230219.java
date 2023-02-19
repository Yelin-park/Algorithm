package programmers.pr2023.February;

import java.util.ArrayList;
import java.util.HashSet;

public class 삼각형의완성조건2_20230219 {
    class Solution {
        public int solution(int[] sides) {
            int answer = 0;
            HashSet<Integer> set = new HashSet<>();
            // 가장 긴 변의 길이 < 다른 두변의 길이 합
            // 나머지 한 변이 될 수 있는 정수의 개수 리턴
            // 배열에 있는 가장 긴 변의 길이가 가장 긴 변일 경우에는 해당 값보다 클 수 없음

            int max = sides[0] > sides[1] ? sides[0] : sides[1];
            int min = sides[0] > sides[1] ? sides[1] : sides[0];
            int i = 1;

            while(i < min + max) {
                // 배열의 원소 합보다는 작고 max보다는 긴 원소
                if(min + max > i && i > max) {
                    set.add(i);
                }

                // max가 가장 긴 변일 때 두 변의 합은 max보다 커야함
                if(i+min > max) {
                    set.add(i);
                }

                i++;
            }

            return answer = set.size();
        }
    }
}

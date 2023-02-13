package programmers.pr2023;

import java.util.Arrays;

public class 삼각형의완성조건_20230130 {
    class Solution {
        public int solution(int[] sides) {
            // 가장긴변 < 나머지두변의합
            int answer = 0;
            int temp = 0;

            // 내림차순 정렬
            // 직접 구현하지 않아도 Arrays.sort를 사용하면 오름차순으로 정렬이 됨. 그렇게 되면 sides[2]에 있는 값이 제일 크게 됨
            for(int i = 0; i < sides.length; i++) {
                for(int j = i+1; j < sides.length; j++) {
                    if(sides[i] < sides[j]) {
                        temp = sides[i];
                        sides[i] = sides[j];
                        sides[j] = temp;
                    }
                }
            }

            if(sides[0] < sides[1] + sides[2]) {
                answer = 1;
            } else {
                answer = 2;
            }

            return answer;
        }
    }
}

package programmers.pr2023;

public class 점의위치구하기_20230128 {

    class Solution {
        public int solution(int[] dot) {
            int answer = 0;
            // 1사분면
            if(dot[0] > 0 && dot[1] > 0 ) {
                answer = 1;

                // 2사분면
            } else if(dot[0] < 0 && dot[1] > 0 ) {
                answer = 2;

                // 3사분면
            } else if(dot[0] < 0 && dot[1] < 0 ) {
                answer = 3;

                // 4사분면
            } else if(dot[0] > 0 && dot[1] < 0 ) {
                answer = 4;

            }

            return answer;
        }
    }

}

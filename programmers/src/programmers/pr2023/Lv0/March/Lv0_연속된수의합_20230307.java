package programmers.pr2023.Lv0.March;

public class Lv0_연속된수의합_20230307 {
    class Solution {
        public int[] solution(int num, int total) {
            int[] answer = new int[num];

            int i = 0;

            while(true) {
                int tempI = i;
                int cnt = 0;
                int sum = 0;
                int j = 0; // 배열의 인덱스

                while(cnt < num) {
                    sum += tempI;
                    answer[j++] = tempI;
                    tempI++;
                    cnt++;
                } // while

                if(sum == total) {
                    return answer;

                } else {
                    if(sum < total) {
                        i++;
                    }

                    if(sum > total) {
                        i--;
                    }

                } // if

            } // while

            // 등차수열의 합을 구하는 공식으로 쉽게 풀 수 있음
            /*
            int[] answer = new int[num];
            int check = num * (num + 1) / 2; // 등차 수열 합
            int start = (total - check) / num + 1; // 시작하는 값 확인

            for(int i = 0; i < answer.length; i++){
                answer[i] = start + i;
            }

            return answer;
            */

        } // solution

    } // Solution Class

} // class

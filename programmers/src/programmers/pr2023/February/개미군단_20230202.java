package programmers.pr2023.February;

public class 개미군단_20230202 {
    class Solution {
        /*
            개미의 공격력을 나눈 몫을 answer에 추가 나머지를 hp에 할당하는 방법도 있음
         */
        public int solution(int hp) {
            int answer = 0;

            while(true) {
                if(hp >= 5) {
                    hp -= 5;
                    answer++;
                } else if(hp >= 3) {
                    hp -= 3;
                    answer++;
                } else if(hp >= 1) {
                    hp -= 1;
                    answer++;
                }

                if(hp == 0) {
                    return answer;
                }
            }

        }
    }
}

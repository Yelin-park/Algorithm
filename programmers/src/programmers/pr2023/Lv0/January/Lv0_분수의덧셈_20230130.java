package programmers.pr2023.Lv0.January;

/*
    최대 공약수를 유클리드 호제법을 이용해서 구하기
    임의의 두 자연수 a, b(a>b)가 주어지고 a를 b로 나눈 나머지를 r(r = a % b)라고 하면
    a = b가되고 b = r이 되는데, 이때 b가 0이 될 때의 a가 최대공약수이다.
 */
public class Lv0_분수의덧셈_20230130 {
    class Solution {
        public int[] solution(int numer1, int denom1, int numer2, int denom2) {
            int[] answer = new int[2];
            answer[0] = numer1 * denom2 + numer2 * denom1; // a
            answer[1] = denom1 * denom2; // b

            int a = answer[0];
            int b = answer[1];
            int r = 0;

            while(b != 0 ) {
                r = a % b;
                a = b;
                b = r;
            }

            answer[0] = answer[0] / a;
            answer[1] = answer[1] / a;

            return answer;
        }
    }
}

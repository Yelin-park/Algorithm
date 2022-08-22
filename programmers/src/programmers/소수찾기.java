package programmers;

import java.util.ArrayList;
import java.util.Iterator;

public class 소수찾기 {

    public static void main(String[] args) {
        int n = 5;

	/*
	 n의 제곱근 보다 큰 수에서 소수가 아닌 수는 이미 n제곱근 ‘이하’의 수에서 걸러졌어야함

	n의 제곱근 ‘초과’에서 걸러지는 수는 그 약수인 두 수가 전부 n의 제곱근 보다 크다는 의미 이므로 n의 범위를 벗어남
	n까지 자연수 안에서 n의 제곱근보다 큰 수 중

	소수가 아닌 수는 그 약수 중 적어도 하나는 n의 제곱근 보다 작을 수 밖에 없다
	그렇기에 n의 제곱근까지만 살펴보면 소수가 아닌 수를 다 걸러낼 수 있다.
	 */

        Sol_4 s = new Sol_4();
        System.out.println(s.solution(n));

    } // main

} // class

class Sol_4 {
    public int solution(int n) {
        int answer = 0;
        if (n == 2 || n == 3 ) return 1;
        for (int i = 2; i <= n; i++) {
            int cnt = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cnt++;
                }
            }
            if (cnt == 2) {
                answer++;
            } else if(cnt >= 3 ){
                continue;
            }
        }
        return answer;
    }

}


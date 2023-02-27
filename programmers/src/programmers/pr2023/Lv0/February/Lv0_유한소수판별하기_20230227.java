package programmers.pr2023.Lv0.February;

import java.util.HashSet;
import java.util.Iterator;

public class Lv0_유한소수판별하기_20230227 {
    class Solution {
        public int solution(int a, int b) {
            // 유한소수라면 1, 무한소수라면 2(유한소수 조건 : 분모의 소인수가 2와 5만 존재)
            // 정수도 유한소수로 판별
            int answer = 1;
            
            if(a == b) return 1; // 같다면 정수이므로 유한소수
            if(b == 1) return 1; // 분모가 1이라면 유한소수

            // 기약분수 나타내기(유클리드호제법)
            // a > b 일때, r = a%b, a = b, b = r; b가 0이 될 때의 a가 최대공약수
            if(a > b) {
                int r = 0;
                int x = a;
                int y = b;
                while(y != 0) {
                    r = x % y;
                    x = y;
                    y = r;
                }

                a = a / x;
                b = b / x;

                // 분모가 1이면 유한소수
                if(b == 1) return 1;
            }

            if(b > a) {
                int r = 0;
                int x = b;
                int y = a;
                while(y != 0) {
                    r = x % y;
                    x = y;
                    y = r;
                }

                a = a / x;
                b = b / x;

                // 분모가 1이면 유한소수
                if(b == 1) return 1;
            }
            
            // 방법1) 소인수분해
            HashSet<Integer> set = new HashSet<>();
            int k = 2;
            int n = b;
            while(k <= n) {
                if(n % k == 0) {
                    set.add(k);
                    n = n/k;
                } else {
                    k++;
                }
            }

            Iterator<Integer> iter = set.iterator();
            while(iter.hasNext()) {
                int temp = iter.next();
                if(!(temp == 2 || temp == 5)) {
                    return 2;
                }
            }

            return answer;
        }
    }
}

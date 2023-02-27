package programmers.pr2023.Lv0.February;

import java.util.Arrays;
import java.util.HashSet;

public class Lv0_소인수분해_20230217 {
    // 소수란? 1과 자기 자신으로 나누어지는 수
    public int[] solution(int n) {
        int[] answer = {};
        HashSet<Integer> set = new HashSet<>();
        int k = 2;
        while(k <= n) {
            if(n % k == 0) {
                set.add(k);
                n = n/k;
            } else {
                k++;
            }
        }

        answer = set.stream().mapToInt(i -> i).toArray();
        Arrays.sort(answer); // LinkedHashSet을 사용하면 정렬을 안해도 됨
        return answer;
    }
}

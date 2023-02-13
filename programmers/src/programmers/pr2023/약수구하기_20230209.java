package programmers.pr2023;

import java.util.ArrayList;

public class 약수구하기_20230209 {
    class Solution {
        public int[] solution(int n) {
            int[] answer = {};

            ArrayList<Integer> list = new ArrayList<>();

            for(int i = 1; i <= n; i++){
                if(n % i == 0) {
                    list.add(i);
                }
            }

            return answer = list.stream().mapToInt(i -> i).toArray();
        }
    }
}

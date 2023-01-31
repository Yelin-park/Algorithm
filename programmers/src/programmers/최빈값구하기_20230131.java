package programmers;

import java.util.HashMap;

public class 최빈값구하기_20230131 {
    public static void main(String[] args) {
        // 반례 찾기
        // int[] array = {1, 2, 3, 3, 3, 4}; // 3
        // int[] array = {1, 1, 2, 2}; // -1
        // int[] array = {1, 1, 1}; // 1
        // int[] array = {1, 1, 2, 2, 3, 3, 3}; // 3
        int[] array = {0, 0, 0, 1}; // 0
        Solution20230131 s = new Solution20230131();
        System.out.println(s.solution(array));
    }
}

class Solution20230131
{
    public int solution(int[] array) {
        int answer = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            map.put(array[i], map.getOrDefault(array[i], 0) + 1);
        }

        int max = -1;
        int temp = -1; // key가 0일수도 있으니 -1로 초기화

        // 최빈값이 무엇인지 찾는 문제, 최빈값의 갯수를 구하는 것이 아님
        for (int key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                answer = key;
            } else if (max == map.get(key)) {
                temp = key;
            }
        }

        if (map.get(answer) == map.get(temp)) {
            return -1;
        }

        return answer;
    }

}


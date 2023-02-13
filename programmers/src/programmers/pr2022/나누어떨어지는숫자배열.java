package programmers.pr2022;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 나누어떨어지는숫자배열 {
    public static void main(String[] args) {
        int[] arr = {2, 36, 1, 3};
        int divisor = 1;
    }
}

class Solution27 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }

        if(list.size() > 0) {
            Collections.sort(list);
            answer = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
        } else{
            answer = new int[1];
            answer[0] = -1;
        }
        return answer;
    }
}

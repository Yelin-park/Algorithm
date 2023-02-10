package programmers;

import java.util.Arrays;

public class 문자열정렬하기2_20230210 {
    // 소문자로 변환 후 정렬하기
    class Solution {
        public String solution(String my_string) {
            String answer = "";

            my_string = my_string.toLowerCase();
            char[] tempArr = my_string.toCharArray();
            Arrays.sort(tempArr);

            return answer = String.valueOf(tempArr);
        }
    }
}

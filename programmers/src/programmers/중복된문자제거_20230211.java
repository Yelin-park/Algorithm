package programmers;

import java.util.LinkedHashSet;

public class 중복된문자제거_20230211 {
    class Solution {
        public String solution(String my_string) {
            String answer = "";

            // LinkedHashSet은 add한 순서대로 값을 유지하며 중복은 허용하지 않음
            LinkedHashSet<String> set = new LinkedHashSet<>();

            for (int i = 0; i < my_string.length(); i++) {
                set.add(String.valueOf(my_string.charAt(i)));
            }

            // set을 문자열로 변환하기 위해 String의 join 메서드 사용
            answer = String.join("", set);

            return answer;
        }
    }
}

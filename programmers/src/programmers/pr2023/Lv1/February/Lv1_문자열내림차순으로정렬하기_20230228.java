package programmers.pr2023.Lv1.February;

import java.util.Arrays;

public class Lv1_문자열내림차순으로정렬하기_20230228 {
    class Solution {
        public String solution(String s) {
            String answer = "";
            char[] tempArr = s.toCharArray();
            Arrays.sort(tempArr);
            StringBuffer sb = new StringBuffer();
            for(int i = tempArr.length-1; i >= 0; i--){
                sb.append(tempArr[i]);
            }

            return answer = sb.toString();
        }
    }
}

package programmers.pr2023.February;

import java.util.Arrays;
import java.util.HashMap;

public class 한번만등장하는문자_20230213 {
    class Solution {
        public String solution(String s) {
            String answer = "";

            HashMap<String, Integer> map = new HashMap<>();

            for(int i = 0; i < s.length(); i++){
                map.put(String.valueOf(s.charAt(i)), map.getOrDefault(String.valueOf(s.charAt(i)), 0)+1);
            }

            for (String key : map.keySet()) {
                if(map.get(key) == 1) {
                    answer += key;
                }
            }

            char[] tempArr = answer.toCharArray();
            Arrays.sort(tempArr);
            answer = String.valueOf(tempArr);
            return answer;
        }
    }
}

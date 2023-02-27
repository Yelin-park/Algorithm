package programmers.pr2023.Lv0.February;

import java.util.ArrayList;

public class Lv0_잘라서배열로저장하기_20230216 {
    class Solution {
        public String[] solution(String my_str, int n) {
            ArrayList<String> list = new ArrayList<>();

            int i = 0;
            int j = 1;
            int start = 0;
            int end = 0;
            while(end < my_str.length()) {
                start = i++ * n;
                end = n * j++;
                if(end > my_str.length()){
                    list.add(my_str.substring(start));
                } else {
                    list.add(my_str.substring(start, end));
                }
            }

            String[] answer = new String[list.size()];
            list.toArray(answer);

            return answer;
        }
    }
}

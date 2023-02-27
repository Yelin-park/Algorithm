package programmers.pr2023.Lv0.February;

import java.util.ArrayList;
import java.util.Comparator;

public class Lv0_문자열정렬하기1_20230207 {
    public static void main(String[] args) {
        String my_string = "hi12392";
        Solution s = new Solution();
    }

    static class Solution {
        public int[] solution(String my_string) {
            int[] answer = {};

            ArrayList<Integer> list = new ArrayList<>();

            String[] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

            for(int i = 0; i < my_string.length(); i++){
                for(int j = 0; j < num.length; j++){
                    if(my_string.substring(i, i+1).equals(num[j])){
                        list.add(Integer.parseInt(num[j]));
                        break;
                    }
                }
            }

            list.sort(Comparator.naturalOrder());
            answer = list.stream().mapToInt(i -> i).toArray();
            return answer;
        }
    }
}

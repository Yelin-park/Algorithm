package programmers.pr2023.Lv0.February;

public class Lv0_칠의개수_20230214 {
    class Solution {
        public int solution(int[] array) {
            int answer = 0;
            String temp = "";

            for(int i = 0; i < array.length; i++){
                temp += String.valueOf(array[i]);
            }

            for(int i = 0; i < temp.length(); i++) {
                if("7".equals(String.valueOf(temp.charAt(i)))) {
                    answer++;
                }
            }

            return answer;
        }
    }

    class Solution2 {
        public int solution(int[] array) {
            int answer = 0;
            String temp = "";

            for(int i = 0; i < array.length; i++){
                temp += String.valueOf(array[i]);
            }

            answer = temp.length();
            temp = temp.replaceAll("7", "");
            answer -= temp.length();

            return answer;
        }
    }
}

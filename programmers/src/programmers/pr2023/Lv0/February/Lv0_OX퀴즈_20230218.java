package programmers.pr2023.Lv0.February;

public class Lv0_OX퀴즈_20230218 {
    class Solution {
        public String[] solution(String[] quiz) {
            String[] answer = new String[quiz.length];

            int i = 0;
            int sum = 0;

            while(i < quiz.length) {
                String[] tempArr = quiz[i].replaceAll(" ", ",").split(",");

                if(tempArr[1].equals("+")) {
                    sum = Integer.parseInt(tempArr[0]) + Integer.parseInt(tempArr[2]);
                }

                if(tempArr[1].equals("-")) {
                    sum = Integer.parseInt(tempArr[0]) - Integer.parseInt(tempArr[2]);
                }

                if(tempArr[4].equals(String.valueOf(sum))) {
                    answer[i] = "O";
                }

                if(!tempArr[4].equals(String.valueOf(sum))) {
                    answer[i] = "X";
                }

                i++;
            }

            return answer;
        }
    }
}

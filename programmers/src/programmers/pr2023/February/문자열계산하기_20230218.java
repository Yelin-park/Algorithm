package programmers.pr2023.February;

public class 문자열계산하기_20230218 {
    class Solution {
        public int solution(String my_string) {
            int answer = 0;
            String[] tempArr = my_string.replaceAll(" ",",").split(",");

            answer += Integer.parseInt(tempArr[0]);
            for (int i = 1; i < tempArr.length; i++) {
                if(tempArr[i].equals("+")) {
                    answer += Integer.parseInt(tempArr[i+1]);
                }

                if(tempArr[i].equals("-")){
                    answer -= Integer.parseInt(tempArr[i+1]);
                }
            }

            return answer;
        }
    }
}

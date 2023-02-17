package programmers.pr2023.February;

public class 컨트롤제트_20230217 {
    class Solution {
        public int solution(String s) {
            int answer = 0;

            String[] tempArr = s.split(" ");
            for(int i = 0; i < tempArr.length; i++){
                if(!tempArr[i].equals("Z")) {
                    answer += Integer.parseInt(tempArr[i]);
                }

                if(tempArr[i].equals("Z")) {
                    answer -= Integer.parseInt(tempArr[i-1]);
                }

            }

            return answer;
        }
    }
}

package programmers.pr2023.Lv0.February;

public class Lv0_외계행성의나이_20230204 {
    class Solution {
        public String solution(int age) {
            String answer = "";
            String[] prNum = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
            String temp = Integer.toString(age);

            for(int i = 0; i < temp.length(); i++){
                answer += prNum[Integer.parseInt(String.valueOf(temp.charAt(i)))];
            }

            return answer;

            /*
            while(age>0){
                answer = alpha[age % 10] + answer;
                age /= 10;
            }
            */
            
            // 스트림 사용
            // return String.valueOf(age).chars().mapToObj(operand -> String.valueOf((char) (49 + operand))).collect(Collectors.joining());
        }
    }
}

package programmers.pr2023;

public class 인덱스바꾸기_20230208 {
    class Solution {
        public String solution(String my_string, int num1, int num2) {
            String answer = "";
            char temp;
            char[] my_stringArr = my_string.toCharArray();

            temp = my_stringArr[num1];
            my_stringArr[num1] = my_stringArr[num2];
            my_stringArr[num2] = temp;

            answer = String.valueOf(my_stringArr);

            return answer;
        }
    }
}

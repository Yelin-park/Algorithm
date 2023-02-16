package programmers.pr2023.February;

import java.util.Arrays;

public class 모스부호1_20230205 {
    class Solution {
        public String solution(String letter) {
            String answer = "";
            String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
            String[] letterArr = letter.split(" ");

            // 97 a
            for(int i = 0; i < letterArr.length; i++) {
                for(int j = 0; j < morse.length; j++){
                    if(letterArr[i].equals(morse[j])){
                        answer += (char)(j+97);
                    }
                }
            }

            return answer;
        }
    }
}

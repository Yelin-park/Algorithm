package programmers;

import java.util.Arrays;

public class 서울에서김서방찾기 {
    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};
    }

    public String solution(String[] seoul) {
        String answer = "";

        for (int i = 0; i < seoul.length; i++) {
            if(seoul[i].equals("Kim")){
                return answer = "김서방은 " + i + "에 있다";
            }
        }
        return answer;
    }

    public String solution2(String[] seoul) {
        String answer = "";
        return answer = "김서방은 " + Arrays.asList(seoul).indexOf("Kim") + "에 있다";
    }
}

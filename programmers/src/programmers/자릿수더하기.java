package programmers;

public class 자릿수더하기 {
    public int solution(int n) {
        int answer = 0;

        String str = n + "";

        for (int i = 0; i < str.length(); i++) {
            answer += str.charAt(i) - 48;
        }

        return answer;
    }
}
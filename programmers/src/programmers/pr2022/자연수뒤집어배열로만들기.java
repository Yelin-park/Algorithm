package programmers.pr2022;

public class 자연수뒤집어배열로만들기 {
    public int[] solution(long n) {
        int[] answer = new int[(n+"").length()];

        String str = n+"";
        for (int i = 0; i < str.length(); i++) {
            answer[i] = str.charAt(str.length()-i-1)-48;
        }

        return answer;
    }
}


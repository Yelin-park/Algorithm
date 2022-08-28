package programmers;

public class 음양더하기 {
    public static void main(String[] args) {
        int[] absolutes = {4,7,12};
        boolean[] signs = {true, false, true};

        System.out.println(solution(absolutes, signs));
    }

    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) {
            // signs가 trur이면 양수, false이면 음수
            if(signs[i]) {
                answer += absolutes[i];
            } else{
                answer -= absolutes[i];
            }
        }

        return answer;
    }
}

package programmers.pr2022;

public class 콜라츠추측 {
    public static void main(String[] args) {
        int num = 626331;
        System.out.println(solution(num));
    }

    public static int solution(long num) {
        int answer = 0;
        // 입력된 수가 짝수라면 2로 나눔
        // 홀수라면 3을 곱하고 1을 더함
        // 결과로 나온 수에 같은 작업을 1이 될 때까지 반복

        if (num == 1) {
            return 0;
        } else {
            while (num != 1 && answer < 500) {
                if (num % 2 == 0) {
                    num /= 2;
                } else {
                    num = num * 3 + 1;
                }
                answer++;
            }
            if (answer == 500) return -1;
            return answer;
        }
    }
}

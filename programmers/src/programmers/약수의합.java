package programmers;

public class 약수의합 {

    public static void main(String[] args) {
        int n = 12;

        Solution19 s = new Solution19();
        System.out.println(s.solution(n));
    }

}

class Solution19 {
    public int solution(int n) {
        int answer = 0;
        int sum = 0;

        if (n == 0) {
            return answer;
        } else {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }
            return answer = sum;
        }

    }

}

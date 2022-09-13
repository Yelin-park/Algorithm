package programmers;

public class 정수제곱근판별 {
    public static void main(String[] args) {

    }

    public long solution(long n) {
        long answer = -1;

        double i = 1;
        while( !(Math.pow(i, 2) == n) && Math.pow(i, 2) <= n){
            i++;
        }

        if(Math.pow(i, 2) == n) {
            answer = (long) Math.pow((i + 1), 2);
        }

        return answer;
    }
}

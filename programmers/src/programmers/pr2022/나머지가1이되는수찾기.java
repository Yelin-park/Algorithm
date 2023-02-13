package programmers.pr2022;

public class 나머지가1이되는수찾기 {
    public static void main(String[] args) {
        Solution21 s = new Solution21();
        int n = 10;
        System.out.println(s.solution(n));
    }

}

class Solution21 {
    public int solution(int n) {
        int answer = 0;

        int result = 0;
        int i = 0;
        while(!(result == 1)){
            i++;
            result = n % i;
        }

        answer = i;
        return answer;
    }
}

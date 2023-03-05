package programmers.pr2023.Lv0.March;

public class Lv0_문자열밀기_20230305 {
    public static void main(String[] args) {
        String A = "hello";
        String B = "ohell";
        Solution s = new Solution();
        System.out.println(s.solution(A, B));
    }

    static class Solution {
        public int solution(String A, String B) {
            int answer = 0;

            String temp = A;
            for(int i = 0; i < A.length(); i++) {
                if(temp.equals(B)) return answer;

                // 오른쪽으로 1칸씩 이동하면 마지막 글자가 맨 앞으로 옴
                String lastChar = temp.substring(temp.length() - 1);
                temp = lastChar + temp.substring(0, temp.length() - 1);
                answer++;
            }

            return -1;

            // 다른사람의 풀이 중 충격적인 풀이
            /*
            String temp = B + B;
            return temp.indexOf(A);
             */
        }
    }
}

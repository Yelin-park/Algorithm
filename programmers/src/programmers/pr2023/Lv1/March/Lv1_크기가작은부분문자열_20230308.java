package programmers.pr2023.Lv1.March;

public class Lv1_크기가작은부분문자열_20230308 {
    class Solution {
        public int solution(String t, String p) {
            int answer = 0;
            Long pNo = Long.parseLong(p);

            for(int i = 0; i < t.length()-p.length()+1; i++) {
                Long temp = Long.parseLong(t.substring(i, i + p.length()));
                if (pNo >= temp) answer++;
            }

            return answer;
        }
    }
}

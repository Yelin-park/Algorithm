package programmers.pr2023.Lv0.February;

public class Lv0_이진수더하기_20230214 {
    class Solution {
        public String solution(String bin1, String bin2) {
            String answer = "";

            int bin1Decimal = Integer.parseInt(bin1, 2);
            int bin2Decimal = Integer.parseInt(bin2, 2);
            int sumDecimal = bin1Decimal + bin2Decimal;

            answer = Integer.toBinaryString(sumDecimal);

            return answer;
        }
    }
}

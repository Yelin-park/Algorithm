package bj2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 그룹단어체커_1316_250704 {
    public static void main(String[] args) throws IOException {
        // 개선 버전
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int groupWordCount = 0;

        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            // 알파벳 26개 중 어떤 문자가 등장했는지 체크하는 배열
            boolean[] seen = new boolean[26];
            // 그룹 단어 여부 판단을 위한 변수
            boolean isGroupWord = true; 

            // 이전 문자를 담기 위한 변수
            char prevChar = 0;

            for (int j = 0; j < word.length(); j++) {
                char currChar = word.charAt(j);

                // 현재 문자와 이전 문자가 다른 경우에만 검사(연속된 문자일 경우 검사할 필요 없음)
                if (currChar != prevChar) {
                    // 현재 문자가 이미 등장한 문자라면, 그룹 단어가 아님
                    if (seen[currChar - 'a']) { // 현재 문자를 알파벳 배열에서 가져와 true인 경우에는 이미 등장한 단어임
                        isGroupWord = false;
                        break;
                    }
                    // 현재 문자가 등장하지 않은 문자라면 문자가 등장했으니 배열에 true 설정
                    seen[currChar - 'a'] = true;
                }

                // 이전 문자 갱신
                prevChar = currChar;
            }

            // 전체 문자 순회를 한 뒤 그룹 단어 체크 여부가 ture이면 해당 단어는 그룹 단어로 카운트 증가시키기
            if (isGroupWord) groupWordCount++;
        }

        System.out.println(groupWordCount);
        
        // 개선 전 버전
        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        int sum = 0;

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            char[] arr = str.toCharArray();
            StringBuilder sb = new StringBuilder();

            for (char c : arr) {
                if (sb.length() == 0) {
                    sb.append(c);
                } else {
                    if (sb.charAt(sb.length() - 1) == c && sb.indexOf(String.valueOf(c)) != -1) {
                        sb.append(c);
                    } else if (sb.indexOf(String.valueOf(c)) == -1) {
                        sb.append(c);
                    } else {
                        count = 0;
                        break;
                    }
                }
                count = 1;
            }

            sum += count;
        }

        System.out.println(sum);
         */

    }
}

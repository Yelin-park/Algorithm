package bj2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 가장많은글자_1371_250710 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26]; // 알파벳 갯수 만큼 배열 선언 0이 a, 26이 z
        int max = 0;

        while (true) {
            String line = br.readLine();
            if (line == null) break;
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == ' ') continue;
                int idx = line.charAt(i) - 'a';
                arr[idx]++;
                max = Math.max(max, arr[idx]);
            }
        }

        // 가장 큰 값과 같은 알파벳이 있다면 추가하기
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) sb.append((char) ('a' + i));
        }

        System.out.println(sb);

        // 버전1
        /*Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> map = new HashMap<>();
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if (c == ' ') continue;
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }

        int max = Collections.max(map.values());
        ArrayList<Character> result = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                result.add(entry.getKey());
            }
        }

        Collections.sort(result);
        StringBuilder sb = new StringBuilder();
        for (char c : result) {
            sb.append(c);
        }

        System.out.println(sb);*/
    }
}

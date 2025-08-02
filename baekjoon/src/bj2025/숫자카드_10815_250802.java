package bj2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.StringTokenizer;

public class 숫자카드_10815_250802 {
    static int[] numberCard;
    static int N;
    static LinkedHashMap<Integer, Integer> map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        numberCard = new int[N];
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            numberCard[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(numberCard);

        map = new LinkedHashMap<>();
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int key = Integer.parseInt(st.nextToken());
            binarySearch(key);
        }

        StringBuilder sb = new StringBuilder();
        map.values().forEach(x -> sb.append(x).append(" "));
        System.out.println(sb);
    }

    private static void binarySearch(int key) {
        int start = 0;
        int end = N - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (numberCard[mid] == key) {
                map.put(key, 1);
                return;
            } else if (numberCard[mid] > key) {
                end = mid - 1;
            } else if (numberCard[mid] < key) {
                start = mid + 1;
            }
        }
        map.put(key, 0);
    }
}

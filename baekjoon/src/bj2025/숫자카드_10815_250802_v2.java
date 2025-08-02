package bj2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.StringTokenizer;

public class 숫자카드_10815_250802_v2 {
    static int[] numberCard;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        numberCard = new int[N];
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            numberCard[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(numberCard);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (st.hasMoreTokens()) {
            int key = Integer.parseInt(st.nextToken());
            sb.append(binarySearch(key)).append(" ");
        }

        System.out.println(sb);
    }

    private static int binarySearch(int key) {
        int start = 0;
        int end = numberCard.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (numberCard[mid] == key) {
                return 1;
            } else if (numberCard[mid] > key) {
                end = mid - 1;
            } else if (numberCard[mid] < key) {
                start = mid + 1;
            }
        }
        return 0;
    }
}

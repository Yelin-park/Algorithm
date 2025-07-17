package bj2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 1. 시리얼 번호 길이가 짧은 거 먼저
// 2. 길이가 같으면 합이 작은 것(숫자만 더하기)
// 3. 사전순 비교(숫자가 알파벳보다 사전순으로 작다)
public class 시리얼번호_1431_250717_v2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (arr[i].length() > arr[j].length()) { // 1. 시리얼 번호 길이가 짧은 거 먼저
                    swap(arr, i, j);
                } else if (arr[i].length() == arr[j].length()) { // 2. 길이가 같으면 합이 작은 것(숫자만 더하기)
                    int a = numberAdd(arr[i]);
                    int b = numberAdd(arr[j]);
                    if (a > b) swap(arr, i, j);
                    else if (a == b) { // 3. 사전순 비교(숫자가 알파벳보다 사전순으로 작다)
                        if (arr[i].compareTo(arr[j]) > 0) { // 앞에 있는 문자가 더 크면 양수 반환
                            swap(arr, i, j);
                        }
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s).append("\n");
        }

        System.out.println(sb);
    }

    public static void swap(String[] arr, int i, int j) {
        String temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    public static int numberAdd(String str) {
        int sum = 0;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) sum += c - '0';
        }
        return sum;
    }
}


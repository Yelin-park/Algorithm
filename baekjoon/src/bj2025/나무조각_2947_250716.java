package bj2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 나무조각_2947_250716 {
    static boolean flag = false;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        while (!flag) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                    // 위치를 바꾼 뒤 출력
                    StringBuilder sb = new StringBuilder();
                    for (int k = 0; k < arr.length; k++) {
                        if (k != arr.length - 1) sb.append(arr[k]).append(" ");
                        else sb.append(arr[k]);
                    }

                    System.out.println(sb);

                    if (sb.toString().equals("1 2 3 4 5")) {
                        flag = true;
                        break;
                    }
                }
            }
        }
    }
}

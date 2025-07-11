package bj2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 새_1568_250711 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int songNum = 1;
        int count = 0;

        while (N != 0) {
            while (N - songNum >= songNum + 1) {
                count++;
                N -= songNum;
                songNum++;
            }
            N -= songNum;
            count++;
            songNum = 1;
        }

        System.out.println(count);
    }
}

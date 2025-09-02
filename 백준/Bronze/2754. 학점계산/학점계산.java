import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] rank = br.readLine().toCharArray();
        double score = 0;
        if (rank[0] != 'F') {
            switch (rank[0]) {
                case 'A':
                    score = 4.0;
                    break;
                case 'B':
                    score = 3.0;
                    break;
                case 'C':
                    score = 2.0;
                    break;
                case 'D':
                    score = 1.0;
                    break;
            }

            switch (rank[1]) {
                case '+':
                    score += 0.3;
                    break;
                case '-':
                    score -= 0.3;
                    break;
            }
        }

        System.out.println(score);
    }
}
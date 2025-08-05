import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
// 소문자 97 ~ 122
// 대문자 65 ~ 90
// 숫자 48 ~ 57
// 공백 32
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            int low = 0;
            int upper = 0;
            int num = 0;
            int space = 0;

            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if (c >= 97 && c <= 122) low++;
                else if (c >= 65 && c <= 90) upper++;
                else if (c >= 48 && c <= 57) num++;
                else if (c == 32) space++;
            }
            sb.append(low).append(" ").append(upper).append(" ").append(num).append(" ").append(space).append("\n");
        }

        System.out.println(sb);
    }
}
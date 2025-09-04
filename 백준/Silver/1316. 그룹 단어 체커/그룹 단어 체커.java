import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int groupWordCount = 0;

        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            boolean[] seen = new boolean[26];
            boolean isGroupWord = true;
            char prevChar = 0;

            for (int j = 0; j < word.length(); j++) {
                char currChar = word.charAt(j);

                if (currChar != prevChar) {
                    if (seen[currChar - 'a']) {
                        isGroupWord = false;
                        break;
                    }
                    seen[currChar - 'a'] = true;
                }

                prevChar = currChar;
            }

            if (isGroupWord) groupWordCount++;
            
        }

        System.out.println(groupWordCount);
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String doc = br.readLine();
        String word = br.readLine();
        int count = 0;
        int i = 0;
        int size = word.length();
        while (i + size <= doc.length()) {
            String temp = doc.substring(i, i + size);
            if (temp.equals(word)) {
                count++;
                i += size;
            } else {
                i++;
            }
        }
        System.out.println(count);
    }
}
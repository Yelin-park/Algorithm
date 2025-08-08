import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            set.add(s);
        }
        List<Word> list = new ArrayList<>();
        for (String s : set) {
            list.add(new Word(s.length(), s));
        }
        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        for (Word w : list) {
            sb.append(w.value).append("\n");
        }
        System.out.println(sb);
    }

    public static class Word implements Comparable<Word> {
        int size;
        String value;

        public Word(int size, String value) {
            this.size = size;
            this.value = value;
        }

        @Override
        public int compareTo(Word w) {
            if (this.size == w.size) return this.value.compareTo(w.value);
            return this.size - w.size;
        }
    }
}
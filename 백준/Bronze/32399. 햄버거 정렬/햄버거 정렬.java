import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine().trim();
        if (S.equals("(1)")) {
            System.out.println(0);
        } else if (S.equals(")1(")) {
            System.out.println(2);
        } else {
            System.out.println(1);
        }
    }
}
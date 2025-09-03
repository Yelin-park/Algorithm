import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] splits = s.split("-");
        int result = sum(splits[0]);
        for (int i = 1; i < splits.length; i++) {
            result -= sum(splits[i]);
        }
        System.out.println(result);
    }
    
    private static int sum(String str) {
        String[] nums = str.split("\\+");
        int sum = 0;
        for(String s : nums) {
            sum += Integer.parseInt(s);
        }
        return sum;
    }
}
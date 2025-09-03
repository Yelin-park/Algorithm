import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] split = s.split("-");
        int result = sum(split[0]);

        for (int i = 1; i < split.length; i++) {
            result -= sum(split[i]);
        }

        System.out.println(result);
    }

    private static int sum(String block) {
        String[] nums = block.split("\\+");
        int sum = 0;
        for (String num : nums) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }
}
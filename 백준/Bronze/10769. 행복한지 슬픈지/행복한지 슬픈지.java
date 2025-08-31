import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().replaceAll(" ", "");
        StringBuilder temp = new StringBuilder();
        int happy = 0;
        int sad = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            for (int j = i; j < i + 3; j++) {
                temp.append(str.charAt(j));
            }
            if (temp.toString().equals(":-)")) { happy++; }
            else if (temp.toString().equals(":-(")) { sad++; }
            temp.delete(0, 3);
        }
        
        String result = "";
        if (sad != 0 && happy == sad) {
            result = "unsure";
        } else if(happy > sad) {
            result = "happy";
        } else if (happy < sad) {
            result = "sad";
        } else {
            result = "none";
        }
        System.out.println(result);
    }
}
package bj2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 단어의개수_1152_250703 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = 0;
        while(st.hasMoreTokens()) {
            st.nextToken();
            count++;
        }

        System.out.println(count);

        /*int count = 0;
        int prev = ' ';

        while(true){
            int ch = System.in.read();
            if(ch == '\n') { //입력값이 줄바꿈이면
                //이전 글자가 공백이 아니면
                if (prev != ' ') count++;
                break; //줄바꿈을 한거니까 while문을 나온다.
            }
            if(ch == ' '){ //입력값이 공백이면
                if(prev != ' '){//이전 글자가 공백이 아니면
                    count++;
                }
            }
            prev = ch; //pre를 이전 단어로 바꿔준다.
        }
        System.out.println(count);*/
    }
}

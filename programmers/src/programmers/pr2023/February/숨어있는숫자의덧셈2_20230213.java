package programmers.pr2023.February;

public class 숨어있는숫자의덧셈2_20230213 {
    public static void main(String[] args) {
        int answer = 0;
        String my_string = "aAb1B2cC34oOp";
        my_string = my_string.replaceAll("[a-zA-Z]", ",");

        String[] tempArr = my_string.split(",");

        for(int i = 0; i < tempArr.length; i++){
            if(!tempArr[i].equals("")) {
                answer += Integer.parseInt(tempArr[i]);
            }
        }

        System.out.println(answer);

    }
}

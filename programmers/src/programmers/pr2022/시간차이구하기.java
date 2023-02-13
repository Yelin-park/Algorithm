package programmers.pr2022;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class 시간차이구하기 {
    public static void main(String[] args) throws ParseException {
        /*Date date = new Date();
        String date1 = date + "";
        String date2 = date - 2 + "";

        Date format1 = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss").parse(date1);
        Date format2 = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss").parse(date2);

        System.out.println(format1-format2);*/

        SimpleDateFormat f = new SimpleDateFormat("HH:mm:ss", Locale.KOREA);
        Date d1 = f.parse("01:03:00");
        Date d2 = f.parse("01:04:40");
        long diff = d2.getTime() - d1.getTime();
        long sec = diff / 1000;
        long min = diff / (60 * 1000);
        if(sec >= 60) {
            sec -= 60;
        }
        System.out.println(sec);
        System.out.println(min);
    }
}

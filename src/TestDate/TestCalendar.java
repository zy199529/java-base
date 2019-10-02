package TestDate;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalendar {
    public static void main(String[] args) {
        GregorianCalendar g = new GregorianCalendar(2019,10,9,4,6,7);
        int year = g.get(Calendar.YEAR);
        System.out.println(year);
        int week =g.get(Calendar.DAY_OF_WEEK);
        System.out.println(week);
        GregorianCalendar c = new GregorianCalendar();
        c.set(Calendar.YEAR,8012);
        c.add(Calendar.DATE,100);
        System.out.println(c.get(Calendar.YEAR));

        //日起对象和时间对象的转化
        Date d4 =c.getTime();
        System.out.println(d4);
        Calendar c4 = new GregorianCalendar();
        c4.setTime(new Date());
        System.out.println(c4);
        PrintCalender(c4);
    }
    public static void PrintCalender(Calendar C){
        int year = C.get(Calendar.YEAR);
        int month = C.get(Calendar.MONTH)+1;
        int day = C.get(Calendar.DAY_OF_MONTH);
        int week = C.get(Calendar.DAY_OF_WEEK)-1;
        String dayweek =(week==0?"日":week+"");
        int h=C.get(Calendar.HOUR);
        int m=C.get(Calendar.MINUTE);
        int s=C.get(Calendar.SECOND);
        System.out.println(year+"年"+month+"月"+day+"日"+" "+h+":"+m+":"+s);
    }
}

package TestDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class TestCalender2 {
    public static void main(String[] args) throws ParseException{
        System.out.println("请输入日期（格式）yyyy-mm-dd");
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date d = df.parse(str);
        Calendar c =new GregorianCalendar();
        c.setTime(d);
        int day =c.get(Calendar.DAY_OF_MONTH);
        int days = c.getActualMaximum(Calendar.DATE);
        System.out.println("日\t一\t二\t三\t四\t五\t六");
        c.set(Calendar.DAY_OF_MONTH,1);
        for(int i=0;i<c.get(Calendar.DAY_OF_WEEK);i++){
            System.out.print("\t");
        }

        for(int i=1;i<=c.get(Calendar.DAY_OF_MONTH);i++){
            if(c.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY){
                System.out.println();
            }
            if(day==c.get(Calendar.DAY_OF_MONTH)){
                System.out.print(c.get(Calendar.DAY_OF_MONTH)+"*\t");
            }else{
                System.out.print(c.get(Calendar.DAY_OF_MONTH)+"\t");
            }
            c.add(Calendar.DAY_OF_MONTH,1);
        }
    }
}

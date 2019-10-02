package TestDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 测试时间对象和字符串之间的转换
 */
public class TestSimpleDateFormat{
    public static void main(String[] args) throws ParseException {
        //按照指定格式转成相应的字符串
        SimpleDateFormat df= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String s =df.format(new Date(40000));
        System.out.println(s);
        //字符串转成日期
        SimpleDateFormat dd =new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        Date d= dd.parse("1983/05/10 10:45:59");
        System.out.println(d);
        SimpleDateFormat dd1 =new SimpleDateFormat("D");
        String t = dd1.format(new Date());
        System.out.println(t);
    }
}

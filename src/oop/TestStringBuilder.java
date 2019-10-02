package oop;

public class TestStringBuilder {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        for(int i=0;i<26;i++){
            s.append((char)('a'+i));
        }
        System.out.println(s);
        s.reverse();
        System.out.println(s);
        s.insert(0,"我");
        System.out.println(s);
        s.delete(20,23);
        System.out.println(s);



        String str8="";
        long num1 = Runtime.getRuntime().freeMemory();
        long time1 =System.currentTimeMillis();
        for(int i=0;i<5000;i++){
            str8=str8 + i;
        }
        long num2 = Runtime.getRuntime().freeMemory();
        long time2 =System.currentTimeMillis();
        System.out.println("占用内存"+(num1-num2));
        System.out.println("占用时间"+(time2-time1));
        StringBuilder sb=new StringBuilder("");
        long num3 = Runtime.getRuntime().freeMemory();
        long time3 =System.currentTimeMillis();
        for(int i=0;i<5000;i++){
            sb.append(i);
        }
        long num4 = Runtime.getRuntime().freeMemory();
        long time4 =System.currentTimeMillis();
        System.out.println("占用内存"+(num3-num4));
        System.out.println("占用时间"+(time4-time3));
    }
}

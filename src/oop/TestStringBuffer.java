package oop;

public class TestStringBuffer {
    public static void main(String[] args) {
        StringBuffer s=new StringBuffer("absdj");
        System.out.println(Integer.toHexString(s.hashCode()));
        System.out.println(s);
        s.setCharAt(1,'m');
        System.out.println(s);
    }
}

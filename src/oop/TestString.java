package oop;

/**
 * 测试字符串的常用方法
 */
public class TestString {
    public static void main(String[] args) {
        String s1 = "core java";
        String s2 = "Core java";
        System.out.println(s1.charAt(3));
        System.out.println(s1.length());
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.indexOf("java"));
        String s = s1.replace(" ","&");
        System.out.println(s);
    }
}

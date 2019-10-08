package Collections;

class Parent1 {
    /* 静态变量 */
    public static String p_StaticField = "父类--静态变量";
    /* 变量 */
    public String p_Field = "父类--变量";
    protected int i = 9;
    protected int j = 0;

    /* 静态初始化块 */
    static {
        System.out.println(p_StaticField);
        System.out.println("父类--静态初始化块");
    }

    /* 初始化块 */ {
        System.out.println(p_Field);
        System.out.println("父类--初始化块");
    }

    public void show() {
        System.out.println("父类方法");
    }

    /* 构造器 */
    public Parent1() {
        System.out.println("父类--构造器");
        System.out.println("i=" + i + ", j=" + j);
        j = 20;
        show();
    }
}

public class subclass1 extends Parent1 {
    /* 静态变量 */
    public static String s_StaticField = "子类--静态变量";
    /* 变量 */
    public String s_Field = "子类--变量";

    /* 静态初始化块 */
    static {
        System.out.println(s_StaticField);
        System.out.println("子类--静态初始化块");
    }

    /* 初始化块 */ {
        System.out.println(s_Field);
        System.out.println("子类--初始化块");
    }

    public void show() {
        System.out.println("子类方法");
    }

    /* 构造器 */
    public subclass1() {
        System.out.println("子类--构造器");
        System.out.println("i=" + i + ",j=" + j);
        show();
    }


    /* 程序入口 */
    public static void main(String[] args) {
        System.out.println("子类main方法");
        new subclass1();
    }
}

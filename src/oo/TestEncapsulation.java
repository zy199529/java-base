package oo;

/**
 * 测试封装
 */
public class TestEncapsulation {
    public static void main(String[] args) {
        Human h=new Human();
        h.name="朱";
    }
}
class Human{
    private int age;
    String name ;
    void sayAge(){
        System.out.println(age);
    }
}
class Boy{
    void sayHello(){
        System.out.println();
    }
}

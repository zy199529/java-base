package oop;

/**
 * 测试非静态内部类
 */
public class Testinner {

    public static void test01(Aa a){
        a.aa();
    }
    public static void main(String[] args) {
        Testinner.test01(new Aa(){
            @Override
            public void aa() {
                System.out.println("匿名n内部类");
            }
        });
        Outer.Inner o = new Outer().new Inner();
        Outer2.Inner2 i =new Outer2.Inner2();
        o.show();
    }
}
class Outer{
    private int age = 10;
    public void testOuter(){
        System.out.println("Outer.testOuter");
    }
    class Inner{
        int age =20;
        public void show(){
            System.out.println("外部类的成员变量；"+Outer.this.age);
            System.out.println("内部类的成员变量；"+this.age);
        }
    }
}


class Outer2{
    static class Inner2{

    }
}

interface Aa{
    void aa();
}
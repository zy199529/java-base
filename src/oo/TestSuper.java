package oo;

public class TestSuper {
    public static void main(String[] args) {
        new ChildClass().f();
    }
}
class FatherClass{
    public int value;
    public void f(){
        value =100;
        System.out.println("FatherClass.values="+value);
    }
}
class ChildClass extends FatherClass{
    public int value;
    public void f(){
        super.f();
        value =200;
        System.out.println("ChildClass.values="+value);
        System.out.println(value);
        System.out.println(super.value);
    }
}

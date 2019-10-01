package oop;

public class TestInterface {
    public static void main(String[] args) {
        Volant v=new Angle();
        v.fly();
        Honest h= new GoodMan();
        h.helpOther();
    }
}
//飞行接口
interface Volant{
    int FLY_HEIGHT=1000;
    void fly();
}
interface Honest{
    void helpOther();
}
class Angle implements Honest,Volant{

    @Override
    public void fly() {
        System.out.println("Angle.fly()");
    }

    @Override
    public void helpOther() {
        System.out.println("Angle.helpOther()");
    }
}
class GoodMan implements Honest{

    @Override
    public void helpOther() {
        System.out.println("Angle.helpOther()");
    }
}
class BirdMan implements Volant{

    @Override
    public void fly() {
        System.out.println("Angle.fly()");
    }
}
interface A{
    void testa();
}
interface B{
    void testb();
}
interface C extends A,B{
    void testc();
}
class Subclass implements C{

    @Override
    public void testa() {

    }

    @Override
    public void testb() {

    }

    @Override
    public void testc() {

    }
}
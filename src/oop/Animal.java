package oop;

public abstract class Animal {
    //抽象方法没有实现，子类必须实现
    abstract public void shout();
    public void run(){
        System.out.println("跑");
    }
}
class Dog extends Animal{

    @Override
    public void shout() {
        System.out.println("汪汪汪!");
    }
}
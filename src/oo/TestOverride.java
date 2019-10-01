package oo;

/**
 * 测试重写
 */
public class TestOverride {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.run();
    }
}
class Vehicle{
    public void run(){
        System.out.println("跑");
    }
    public void stop(){
        System.out.println("停止");
    }
    public Person whoIsPsg(){
        return new Person();
    }
}
class Horse extends Vehicle{
    public void run(){
        System.out.println("嘚嘚嘚");
    }
    public Student whoIsPsg(){//返回值类型小于等于父类的类型
        return new Student();
    }
}

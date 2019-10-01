package oo;

public class TestObject {
    public static void main(String[] args) {
//        Object obj;
        TestObject to = new TestObject();
        System.out.println(to.toString());
        Person2 p = new Person2("滋滋",20);
        System.out.println(p.toString());
    }
    public String toString(){
        return "测试";
    }
}
class Person2{
    String name;
    int age;
    public Person2(String name,int age){
        this.name=name;
        this.age=age;
    }
    @Override
    public String toString(){
        return name +",年龄"+age;
    }
}
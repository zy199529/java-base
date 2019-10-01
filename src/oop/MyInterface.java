package oop;

public interface MyInterface {
    int MAX_AGE=10;
    void test01();
}
class MyClass implements MyInterface{

    @Override
    public void test01() {
        System.out.println(MAX_AGE);
    }
}

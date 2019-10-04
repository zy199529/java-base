package Exception;

public class TestException {
    public static void main(String[] args) {
        try {
            int a =1/0;
        }catch (ArithmeticException e){

        }
        String a =null;
        a.length();
        Animal b = new Dog();
        Cat d =(Cat)b;
    }
}
class Animal{

}
class Dog extends Animal{

}
class Cat extends Animal{

}
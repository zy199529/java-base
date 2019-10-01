package oo;

/**
 * 测试多态
 */
public class TestPoly {
    public static void main(String[] args) {
        Animal a = new Animal();
        animalCry(a);
        Dog d = new Dog();
        animalCry(d);
    }
    static void animalCry(Animal a){
        a.shout();
    }
}
class Animal{
    public void shout(){
        System.out.println("叫了一声");
    }
}
class Dog extends Animal{
    public void shout(){
        System.out.println("汪汪汪");
    }
}
class Cat extends Animal{
    public void shout(){
        System.out.println("喵喵喵");
    }
}


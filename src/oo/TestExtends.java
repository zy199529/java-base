package oo;

/**
 * 测试继承
 */
public class TestExtends {
    public static void main(String[] args){
        Student stu = new Student();
        stu.name="朱烨";
        stu.height=163;
        stu.rest();
        Student stu2 = new Student("猪猪",12,"数学");
        System.out.println(stu2 instanceof Person);
    }
}

class Person {
    String name;
    int height;

    public void rest() {
        System.out.println("休息");
    }
}

class Student extends Person{
    String major;
    public void study() {
        System.out.println("学习两个小时！");
    }
    Student(){

    }
    public Student(String name,int height,String major){
        this.name=name;
        this.height=height;
        this.major = major;
    }
}
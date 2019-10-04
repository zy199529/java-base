package Exception;

import java.security.PublicKey;

public class Testcustom {
    public static void main(String[] args) {
        person p=new person();
        p.setAge(-1);
    }
}
class person{
    private int age;
    public int getAge(){
        return age;
    }
    public  void setAge(int age){
        if(age<0){
            throw new IllegalAgeException("年龄不能为负数");
        }
        this.age=age;
    }
}
class IllegalAgeException extends RuntimeException{
    public IllegalAgeException() {
    }
    public IllegalAgeException(String s){
        super(s);
    }
}
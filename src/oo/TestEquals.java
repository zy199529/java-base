package oo;

public class TestEquals {
    public static void main(String[] args) {
        Object obj;
        String str;
        User u1=new User(100,"朱","eq");
        User u2=new User(110,"朱","eq");
        System.out.println(u1.equals(u2));
    }
}
class User{
    int id;
    String name;
    String pwd;
    public User(int id,String name,String pwd){
        this.id=id;
        this.name=name;
        this.pwd=pwd;
    }
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        if(obj==null){
            return false;
        }
        if(getClass()!=obj.getClass()){
            return false;
        }
        User other = (User)obj;
        if(id!=other.id){
            return false;
        }
        return true;
    }
}

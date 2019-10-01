package Arr;

public class TestArr {
    public static void main(String[] args) {
        int[] array = new int[10];
        User[] arr2 = new User[3];
        arr2[0] = new User(1001,"na");
        arr2[1] = new User(1002,"nan");
        arr2[2] = new User(1003,"nananan");
        array[0]=13;
        for(int i=0;i<array.length;i++){
            array[i] = 10*i;
        }
        for(int m:array){
            System.out.println(m);
        }
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }

    }
}
class User{
    private int id;
    private String name;
    public User(int id,String name){
        this.id=id;
        this.name=name;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name =name;
    }
}

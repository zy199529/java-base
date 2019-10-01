package base;

public class TestOverload {
    public static void main(String[] args){
        int sum = add(1,2);
        System.out.println(sum);
    }
    public static int add(int a,int b,int c){
        int sum = a+b+c;
        return sum;
    }
    public static int add(int a,int b){
        int sum = a+b;
        return sum;
    }
}

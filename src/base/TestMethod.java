package base;

/**
 * @author zhuye
 * 方法的基本使用
 */
public class TestMethod {
    public static void main(String[] args){
        TestMethod tm = new TestMethod();
        tm.printStr();
        tm.add(20,30,5);
    }
    void printStr(){
        System.out.println("this is a good man");
    }
    void add(int a, int b,int c){
        int sum = a+b+c;
        System.out.println(sum);
    }
}

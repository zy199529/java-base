package Arr;

/**
 * 测试数组的三种初始化的方式
 */
public class ArrayTest {
    public static void main(String[] args) {
        //静态初始化
        int[] arr = {1,2,3};
        User[] b = {
                new User(10,"d"),
                new User(11,"d"),
                new User(12,"d"),
        };
        int[] c =new int[3];
    }
}


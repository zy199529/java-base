package base;

public class TestRecursion {
    public static void main(String[] args){
        long d1 = System.currentTimeMillis();
        System.out.printf("%d阶乘的结果：%s%n",10,factoria(10));
        long d2 = System.currentTimeMillis();
        System.out.println(d2-d1);
        long res = factoriaLoop(10);
        System.out.println(res);
    }

    static long factoria(int n){
        if(n==1){
            return 1;
        }else {
            return n*factoria(n-1);
        }
    }
    static long factoriaLoop(int a){
        long d3 = System.currentTimeMillis();
        long result =1;
        while(a>1){
            result *=a*(a-1);
            a =a-2;
        }
        long d4 =System.currentTimeMillis();
        System.out.println(d4-d3);
        return result;
    }

}

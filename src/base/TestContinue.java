package base;

public class TestContinue {
    public static void main(String[] args){
        outer:for (int i=101;i<150;i++){
            for (int j=2;j<i/2;j++){
                if(i%j==0){
                    continue outer;
                }
            }
            System.out.println(i+" ");
        }
    }
    //打印 101-150之间的质数
}

import java.util.Scanner;

class Main{
    public static int jump(int target){
        if(target<=1) return target;
        int[] a=new int[target+1];
        a[1]=1;
        a[2]=2;
        for(int i=3;i<=target;i++){
            a[i]=a[i-1]+a[i-2];
        }
        return a[target];
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(jump(n));
    }
}

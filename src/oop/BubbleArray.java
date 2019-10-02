package oop;

public class BubbleArray {
    public static void main(String[] args) {
        int[] a={10,28,3,4,9,0,78};
        for(int i=0;i<a.length;i++){
            for(int j=1;j<a.length-i;j++){
                if(a[j]<a[j-1]){
                    int temp = a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
//                    System.out.println(temp);
                }
            }
        }
        for(int t:a){
            System.out.println(t);
        }
    }
}

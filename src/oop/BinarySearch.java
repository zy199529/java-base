package oop;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={20,30,79,80,76,45};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(BinarySearch.binarr(arr,76));
    }
    public static int binarr(int[] a,int values) {

        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = (int) (low + high) / 2;
            if (values == a[mid]) {
                return mid;
            }
            if(values>a[mid]){
                low = mid+1;
            }
            if(values<a[mid]){
                high=mid-1;
            }
        }
        return -1;
    }
}

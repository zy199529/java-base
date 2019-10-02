package oop;

import java.security.PublicKey;

public class TestArrayCopy {
    public static void main(String[] args) {
        String[] s1 = {"aa","bb","cc","dd","ee"};
        String[] t =TestArrayCopy.testC(s1,"ff",3);
//        TestArrayCopy.extend();
    }
    public static void testA(){
        String[] s1 = {"aa","bb","cc","dd","ee"};
        String[] s2=new String[10];
        System.arraycopy(s1,2,s2,6,3);
        for(int i=0;i<s2.length;i++){
            System.out.println(i+s2[i]);
        }
    }
    public static String[] testB(String[] s,int index){
        System.arraycopy(s,index+1,s,index,s.length-index-1);
        s[s.length-1]=null;
        for(int i=0;i<s.length;i++){
            System.out.println(i+s[i]);
        }
        return s;
    }
    public static String[] testC(String[] s,String ff,int index){
        String[] s2 = new String[s.length+1];
        System.arraycopy(s,0,s2,0,index);
        System.arraycopy(s,index,s2,index+1,s2.length-index-1);
        s2[index]=ff;
//        s[s.length-1]=null;
        for(int i=0;i<s2.length;i++){
            System.out.println(i+s2[i]);
        }
        return s2;
    }
    public static void extend(){
        String[] s1={"aa","bb","cc","dd","ee"};
        String[] s2 = new String[s1.length+10];
        System.arraycopy(s1,0,s2,0,s1.length);
        for(String temp:s2){
            System.out.println(temp);
        }

    }
}

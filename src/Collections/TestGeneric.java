package Collections;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric {
    public static void main(String[] args) {
        MyCollection<String> mc = new MyCollection<String>();
        mc.set("朱烨",0);
        mc.set("朱烨",0);
//        Integer v =(Integer)mc.get(1);
        String s =(String)mc.get(0);
        System.out.println(s);
        List list =new ArrayList();
    }
}
class MyCollection<E>{
    Object[] objs = new Object[5];
    public void set(E e,int index){
        objs[index]=e;
    }
    public E get(int index){
        return (E)objs[index];
    }
}
package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TestList {
    public static void main(String[] args) {

        test03();
    }
    public static void test01(){
        Collection<String> c = new ArrayList<String>();
        System.out.println(c.size());
        System.out.println(c.isEmpty());
        c.add("高老大");
        c.add("高老二");
        System.out.println(c);
//        c.remove("高老二");
//        System.out.println(c);
//        c.clear();
//        System.out.println(c.size());
        System.out.println(c.contains("高老大"));
        Object[] objs=c.toArray();
        System.out.println(objs);
    }
    public static void test02(){
        List<String> list01 =new ArrayList<>();
        list01.add("aa");
        list01.add("bb");
        list01.add("cc");
        List<String> list02 =new ArrayList<>();
        list02.add("cc");
        list02.add("ee");
        list02.add("ff");
        System.out.println("list01"+list01);
        list01.removeAll(list02);
        System.out.println("list01"+list01);
    }

    public static void  test03(){
        List<String> list=new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add(2,"朱烨");
        list.remove(2);
        list.set(2,"高老");
        System.out.println(list.get(2));
        System.out.println(list.indexOf("B"));
        System.out.println(list.lastIndexOf("B"));

    }
}

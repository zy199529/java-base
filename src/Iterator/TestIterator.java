package Iterator;

import java.util.*;

public class TestIterator {
    public static void main(String[] args) {
        testIteratorMap();
    }
    public static void testIteratorList(){
        List<String> list=new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        for(Iterator<String> iter =list.iterator();iter.hasNext();){
            String temp =iter.next();
            System.out.println(temp);
        }
    }
    public static void testIteratorSet(){
        Set<String> set=new HashSet<>();
        set.add("aa");
        set.add("bb");
        set.add("cc");
        for(Iterator<String> iter =set.iterator();iter.hasNext();){
            String temp =iter.next();
            System.out.println(temp);
        }
    }
    public static void testIteratorMap(){
        Map<Integer,String> hashmap=new HashMap<>();
        hashmap.put(1,"aa");
        hashmap.put(2,"bb");
        hashmap.put(3,"cc");
        Set<Map.Entry<Integer, String>> ss=hashmap.entrySet();
        for(Iterator<Map.Entry<Integer,String>> iter =ss.iterator();iter.hasNext();){
            Map.Entry<Integer,String> temp =iter.next();
            System.out.println(temp.getKey()+":");
            System.out.println(temp.getValue()+":");
        }
        Set<Integer> keySet=hashmap.keySet();
        for(Iterator<Integer> iter=keySet.iterator();iter.hasNext();){
            Integer key = iter.next();
            System.out.println(key+"  "+hashmap.get(key));
        }
    }
}

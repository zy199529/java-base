package MySet;

import java.util.*;

public class TestSet {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        set.add("aa");
        set.add("bb");
        set.add("cc");
        set.add("aa");
        System.out.println(set);
        TestSet s = new TestSet();
        s.add("dd");
        s.add("ff");
        System.out.println(s.toString());
    }
    HashMap map;
    private static final Object PRESENT=new Object();
    public TestSet(){
        map=new HashMap();
    }
    public void add(Object o){
        map.put(o,PRESENT);
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        for(Object key:map.keySet()){
            sb.append(key+",");
        }
        sb.setCharAt(sb.length()-1,']');
        return sb.toString();
    }
}

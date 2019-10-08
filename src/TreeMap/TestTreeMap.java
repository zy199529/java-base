package TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {


    public static void main(String[] args) {
        Map<Integer,String> treemap=new TreeMap<>();
        treemap.put(20,"aa");
        treemap.put(3,"bb");
        treemap.put(6,"cc");
        for(Integer key:treemap.keySet()){
            System.out.println(key+":"+treemap.get(key));
        }
        Map<Emp,String> tree=new TreeMap<>();
        Emp e1 = new Emp(100,"张三",50000);
        Emp e2 = new Emp(101,"哈哈",50000);
        Emp e3 = new Emp(102,"赵四",60000);
        tree.put(e1,"好");
        tree.put(e2,"好");
        tree.put(e3,"好");
        for(Emp emp:tree.keySet()){
            System.out.println(emp.toString()+":"+tree.get(emp));
        }
    }
}
class Emp implements Comparable<Emp>{
    int id;
    String name;
    double salary;
    @Override
    public String toString() {
        return "id"+id+"name"+name+salary+salary;
    }
    public Emp(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    @Override
    public int compareTo(Emp o){
        if(this.salary>o.salary){
            return 1;
        }else if(this.salary<o.salary){
            return -1;
        }else{
            if(this.id>o.id){
                return 1;
            }else if(this.id<o.id){
                return -1;
            }
        }
        return 0;
    }
}

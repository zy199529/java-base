package MySet;

import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        Set<Integer> set =new TreeSet<>();
        set.add(200);
        set.add(300);
        set.add(200);
        for(Integer i:set){
            System.out.println(i);
        }
        Set<Emp> s=new TreeSet(){};
        s.add(new Emp(100,"朱烨",5000));
        s.add(new Emp(101,"朱烨",5000));
        s.add(new Emp(102,"朱烨",5000));
        for(Emp i:s){
            System.out.println(i.toString());
        }
    }
}
class Emp implements Comparable<Emp>{
    int id;
    String name;
    double salary;

    public Emp(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "id"+id+"name"+name+"salary"+salary;
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
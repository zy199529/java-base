package MyMap;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        Map<Integer,String> m1=new HashMap<>();
        m1.put(1,"one");
        m1.put(2,"two");
        m1.put(3,"three");
        m1.remove(2);
        System.out.println(m1.get(1));
        Employee e1 = new Employee(1001,"朱烨",2000);
        Employee e2 = new Employee(1002,"赵四",4000);
        Employee e3 = new Employee(1003,"小二",3000);
        Map<Integer,Employee> map=new HashMap<>();
        map.put(1001,e1);
        map.put(1002,e2);
        map.put(1003,e3);
        Employee emp = map.get(1001);
        System.out.println(emp.getEname());
        System.out.println(map);
    }
}
class Employee{
    private int id;
    private String ename;
    private double salary;

    public Employee(int id, String ename, double salary) {
        this.id = id;
        this.ename = ename;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "id:"+id+" name:"+ename+"  薪水:"+salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getEname() {
        return ename;
    }

    public double getSalary() {
        return salary;
    }
}

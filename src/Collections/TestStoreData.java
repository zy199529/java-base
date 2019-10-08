package Collections;

import myfarmgame.MainFrame;


import java.util.*;

public class TestStoreData {
    public static void main(String[] args) {
        Map<String,Object> row1= new HashMap<>();
        row1.put("id",1001);
        row1.put("name","张三");
        row1.put("salary",1000);
        row1.put("入职日期","2018.5.5");
        Map<String,Object> row2= new HashMap<>();
        row2.put("id",1002);
        row2.put("name","赵四");
        row2.put("salary",2000);
        row2.put("入职日期","2019.5.25");
        Map<String,Object> row3= new HashMap<>();
        row3.put("id",1003);
        row3.put("name","王五");
        row3.put("salary",3000);
        row3.put("入职日期","2012.5.25");
        List<Map<String,Object>> table=new ArrayList<>();
        table.add(row1);
        table.add(row2);
        table.add(row3);
        for(Map<String,Object> row:table){
            Set<String> keyset=row.keySet();
            for(String i:keyset){
                System.out.println(i+":"+row.get(i));
            }
        }
        javabean();
    }
    public static void javabean(){
        User user1 =new User(1001,"张三",1000,"2019.6.6");
        User user2 =new User(1002,"赵四",2000,"2017.6.6");
        User user3 =new User(1003,"王五",3000,"2018.6.6");
        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        for(User i:list){
            System.out.println(i.toString());
        }
        Map<Integer,User> map = new HashMap<>();
        map.put(1,user1);
        map.put(2,user2);
        map.put(3,user3);
        Set<Integer> keyset=map.keySet();
        for(Integer i:keyset){
            System.out.println(i+":"+map.get(i));
        }
    }
}
class User{
    private int id;
    private String name;
    private double salary;
    private String hiredate;

    public User(int id, String name, double salary, String hiredate) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.hiredate = hiredate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "id"+id+"name"+name+"salary"+salary;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getHiredate() {
        return hiredate;
    }
}

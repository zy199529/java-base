package cls;

public class TestObject{
    int id;
    String name;
    String pwd;
    public TestObject(int id,String name){
        this.id=id;
        this.name = name;
    }
    public void testParam(TestObject T){
        TestObject uu= new TestObject(20,"哈哈");
    }
    public static void main(String[] args){
        TestObject t1=new TestObject(100,"朱烨");
        t1.testParam(t1);
        System.out.println(t1.name);

    }
}

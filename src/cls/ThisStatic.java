package cls;

public class ThisStatic {
    int id;
    String name;
    static String company;
    static{
        System.out.println("执行类的初始化工作");
        company = "上海";
        PrintCompany();
    }
    public static void PrintCompany(){
        System.out.println(company);
    }

    public static void main(String[] args) {
        ThisStatic ts = new ThisStatic();
    }

}

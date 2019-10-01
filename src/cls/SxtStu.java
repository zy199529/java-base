package cls;

public class SxtStu {
    int id;
    String name;
    int age;
    Computer comp;
    void study(){
        System.out.println("我在认真学习"+comp.brand);
    }
    void play(){
        System.out.println("我在玩游戏！王者荣耀！");
    }
    SxtStu(){

    }
    public static void main(String[] args){
        SxtStu st = new SxtStu();
        st.id = 1000;
        st.name="朱烨";
        st.age=18;
        Computer c = new Computer();
        c.brand="联想";
        st.comp=c;
        st.study();
    }
}

class Computer{
    String brand;
}

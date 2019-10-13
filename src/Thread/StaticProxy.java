package Thread;

import myfarmgame.MainFrame;

/**
 * 静态代理
 * 接口：
 * 1、真实角色
 * 2、代理角色
 */
public class StaticProxy {
    public static void main(String[] args) {
        new WeddingCompany(new You()).happyMarry();
    }
}
interface Marry{
    void happyMarry();
}
class You implements Marry{
    @Override
    public void happyMarry() {
        System.out.println("you and me");
    }
}
class WeddingCompany implements Marry{
    //真实角色
    private Marry target;
    public WeddingCompany(Marry target){
        this.target=target;
    }
    private void ready(){
        System.out.println("布置");
    }
    private void after(){
        System.out.println("洞房");
    }
    @Override
    public void happyMarry() {
        ready();
        this.target.happyMarry();
        after();
    }
}
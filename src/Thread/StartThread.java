package Thread;

/**
 * 创建现成的方式一：
 * 1、创建：继承Thread
 */
public class StartThread extends Thread{
    /**
     * 线程入口点
     */
    @Override
    public void run() {
        super.run();
        for(int i =0;i<20;i++){
            System.out.println("一边听歌");
        }
    }

    public static void main(String[] args) {
        StartThread st=new StartThread();
        st.start();
        for(int i=0;i<20;i++){
            System.out.println("一边coding");
        }
    }
}

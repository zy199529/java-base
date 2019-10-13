package Thread;

/**
 * 实现Runnable接口
 * 推荐：避免单继承的局限性，优先使用接口
 */
public class StartRunnable implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<20;i++){
            System.out.println("一边听歌");
        }
    }

    public static void main(String[] args) {
        new Thread(new StartRunnable()).start();
        for(int i=0;i<20;i++){
            System.out.println("一边coding");
        }
    }
}

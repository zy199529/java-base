package Thread;

/**
 * 模拟龟兔赛跑
 */
public class Racer implements Runnable{
    private static String winner;
    @Override
    public void run() {
        for(int i=1;i<=100;i++){
            if(Thread.currentThread().getName().equals("兔子")&&i%10==0){
                try {
                    Thread.sleep(100);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName()+"-->"+i);
            boolean flag = gameOver(i);
            if(flag){
                break;
            }
        }

    }
    private boolean gameOver(int i){
        if(winner!=null){
            return true;
        }else{
            if(i==100){
                winner=Thread.currentThread().getName();
                System.out.println(winner);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Racer r=new Racer();
        new Thread(r,"乌龟").start();
        new Thread(r,"兔子").start();
    }
}

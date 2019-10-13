package Thread;

public class Web12306 implements Runnable{
    private int ticketNums=99;
    @Override
    public void run() {
        while (true){
            if(ticketNums<0){

                break;
            }
            else{
                System.out.println(Thread.currentThread().getName()+"-->"+ticketNums--);
            }
        }
    }

    public static void main(String[] args) {
        Web12306 web = new Web12306();
        new Thread(web,"马超").start();
        new Thread(web,"码农").start();
        new Thread(web,"马").start();
    }
}

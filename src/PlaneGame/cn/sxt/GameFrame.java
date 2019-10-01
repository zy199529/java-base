package PlaneGame.cn.sxt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;

/**
 * 飞机游戏的主窗口
 */
public class GameFrame extends Frame {
    Image plane = GameUtil.getImage("images/plane.png");
    Image bg = GameUtil.getImage("images/bg.jpg");
    Plane p1 = new Plane(plane,250,250);
    Shell sh = new Shell();
    Shell[] s =new Shell[50];
    int planeX =250,planeY=250;
    Date starttime = new Date();
    Date endtime;
    Explode e ;
    int diff;
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(bg,0,0,null);
        p1.drawSelf(g);
        for(int i=0;i<s.length;i++){
            s[i].draw(g);
            boolean peng = s[i].getRect().intersects(p1.getRect());
            if(peng){
                p1.live=false;
                if(e==null){
                    e=new Explode(p1.x,p1.y);
                    endtime=new Date();
                    diff = (int)((endtime.getTime()-starttime.getTime())/1000);
                }

                e.draw(g);
            }
        }
        if(!p1.live){
            g.setColor(Color.red);
            g.drawString("时间:"+diff+"秒,",(int)p1.x,(int)p1.y);
        }

        sh.draw(g);
//        g.drawString("我是谁",200,200);
    }
    //定义键盘监听的内部类
    class KeyMonitor extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {
            p1.addDirection(e);
        }

        @Override
        public void keyReleased(KeyEvent e) {
            p1.minusDirection(e);
        }
    }
    class PaintThread extends Thread{
        @Override
        public void run() {
            super.run();
            while(true){
                repaint();//重画
                try {
                    Thread.sleep(40);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void main(String[] args) {
        GameFrame b = new GameFrame();
        b.launchFrame();
    }
    private Image offScreenIamge =null;
    public void update(Graphics g){
        if(offScreenIamge ==null){
            offScreenIamge =this.createImage(Constant.GAME_WIDTH,Constant.GAME_WIDTH);
        }
        Graphics gOff = offScreenIamge.getGraphics();
        paint(gOff);
        g.drawImage(offScreenIamge,0,0,null);
    }
    public void launchFrame(){
        this.setTitle("朱烨的作品");
        this.setVisible(true);
        this.setSize(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);
        this.setLocation(300,300);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        new PaintThread().start();
        addKeyListener(new KeyMonitor());
        for(int i=0;i<s.length;i++){
            s[i]=new Shell();
        }
    }
}

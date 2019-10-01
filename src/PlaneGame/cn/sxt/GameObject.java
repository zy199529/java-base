package PlaneGame.cn.sxt;

import java.awt.*;

/**
 * 游戏物体的父类
 */
public class GameObject {
    Image img;
    double x,y;
    int speed;
    int weight,height;

    public GameObject(Image img, double x, double y, int weight, int height) {
        this.img = img;
        this.x = x;
        this.y = y;
    }
    public GameObject(){

    }

    public void drawSelf(Graphics g){
        g.drawImage(img,(int)x,(int)y,null);
    }
    public Rectangle getRect(){
        return new Rectangle((int)x,(int)y,(int)weight, (int)height);
    }
}

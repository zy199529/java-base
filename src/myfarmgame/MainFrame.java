package myfarmgame;



import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame extends JFrame {
    Image background = GameUtil.getImage("素材/farmBackground.png");

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(background,0,0,855,553,null);
//        background.setBounds(0,0,855,553)
    }

    public static void main(String[] args) {
        MainFrame farm = new MainFrame();
        farm.launchFarm();
    }
    public void launchFarm(){
        this.setTitle("开心农场");
        this.setVisible(true);
        this.setBounds(500,200,900,600);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

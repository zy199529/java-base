package cls;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class TestThis {
    int a,b,c;
    TestThis(int a,int b){
        this.a=a;
        this.b=b;
    }
    TestThis(int a,int b,int c){
        this(a,b);
        this.c=c;
    }
    void sing(){

    }
    void eat(){
        this.sing();
        System.out.println("沙雕");
    }
    public static void main(String[] args){
        TestThis gi = new TestThis(2,3);
        gi.eat();
    }
}

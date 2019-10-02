package oop;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class TestWrappedClass {
    public static void main(String[] args) {
        //将基本数据类型转成包装类对象
        Integer a=3;
        Integer b=Integer.valueOf(3);
        //将包装类转成基本数据类型
        int c = b.intValue();
        double d = b.doubleValue();
        //字符串转成包装类对象
//        Integer e = new Integer("9999");
        Integer f=Integer.parseInt("99999");
        //包装类对象转化为字符串
        String s = f.toString();

        //常见的常量
        System.out.println(Integer.MAX_VALUE);
        Integer h =null;
        if(h!=null){
            int j=h;
        }
        Integer w =-128;
        Integer v =-128;
        System.out.println(w==v);


    }
}

package oop;

import java.util.Arrays;

public class TestArrayTableData {
    public static void main(String[] args) {
        Object[] emp1={1001,"朱烨",18,"讲师","2009"};
        Object[] emp2={1002,"朱一烨",18,"讲师","2008"};
        Object[] emp3={1003,"朱二烨",19,"讲师","2010"};
        Object[][] tableData = new Object[3][];
        tableData[0]=emp1;
        tableData[1]=emp2;
        tableData[2]=emp3;
        for(Object[] temp:tableData){
            System.out.println(Arrays.toString(temp));
        }
        System.out.println(tableData[0][0]);
    }
}

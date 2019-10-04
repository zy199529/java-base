package File;

import java.io.File;

/**
 * 递归遍历目录
 */
public class TestFile2 {
    public static void main(String[] args) {
        File f = new File("C:/Users/Lenovo/");
        printFile(f);
    }
    static void printFile(File f){
        System.out.println(f.getName());
        if(f.isDirectory()){
            File[] files=f.listFiles();
            for(File temp:files){
                printFile(temp);
            }
        }
    }
}

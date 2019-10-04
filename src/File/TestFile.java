package File;

import java.io.File;
import java.io.IOException;

public class TestFile {
    public static void main(String[] args) throws IOException {
        File f = new File("C:/Users/Lenovo/fenduan_1/fenduan1_0.csv");
        System.out.println(f);
        f.renameTo(new File("C:/Users/Lenovo/fenduan_1/fenduan1_0.csv"));
        System.out.println(System.getProperty("user.dir"));
        File f1 = new File("gg.txt");
        f1.createNewFile();
        System.out.println(f1.exists());
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f1.lastModified());
        System.out.println(f1.length());
        System.out.println(f1.getName());
        System.out.println(f1.getPath());
        File f2 = new File("d:/电影、华语、大陆");
        boolean flag = f2.mkdirs();
        System.out.println(flag);
    }
}

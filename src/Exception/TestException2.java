package Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestException2 {
    public static void main(String[] args) {
        FileReader a = null;
        try {
            a = new FileReader("F:\\shangxuetang_java\\gg.txt");
            char c1 = (char)a.read();
            System.out.println(c1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {

                a.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

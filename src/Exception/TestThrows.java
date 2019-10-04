package Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestThrows {
    public static void main(String[] args) {

    }
    public static void readmyfile() throws FileNotFoundException {
        FileReader a =null;
        a = new FileReader("F:\\shangxuetang_java\\gg.txt");
    }
}

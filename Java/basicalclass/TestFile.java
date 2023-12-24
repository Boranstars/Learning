package basicalclass;

import java.io.File;
import java.io.IOException;

public class TestFile {
    public static void main(String[] args) throws IOException {
        System.out.println(System.getProperty("user.dir"));
        File f1 = new File("Java/basicalclass", "a.json");
        f1.createNewFile();
        File f2 = new File("Java/basicalclass", "a/b/c");
        f2.mkdirs();
    }
}

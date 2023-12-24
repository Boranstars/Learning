package basicalclass;

import java.io.File;

public class PrintFileTree {
    public static void main(String[] args) {
        File file = new File("C:"+File.separator+"users"+File.separator+"Boran"+File.separator+"Program"+File.separator+"java");
        printFile(file, 0);
    }

    static void printFile(File f, int level) {
        for (int i = 0; i < level; i++) {
            System.out.print(i == 0 && f.isDirectory() ? ">" :"-");
        }

        System.out.println(f.getName());

        if (f.isDirectory()) {
            
            for (File temp : f.listFiles()) {
                printFile(temp, level + 1);
            }
        }
    }
    
}

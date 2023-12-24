package oop.testarray;

import java.util.Arrays;

/**
 * 测试多维数组
 */
public class TestArray03 {
    public static void main(String[] args) {
        //动态初始化
        int[][] seq = new int[3][];
        System.out.println(Arrays.toString(seq));
        seq[0] = new int[3];
        seq[1] = new int[2];
        seq[2] = new int[1];
        System.out.println(Arrays.deepToString(seq));
        //静态初始化
        int[][] seq2 = {{1,2,3},
                        {4,5,6},
                        {7,8}};
        System.out.println(Arrays.deepToString(seq2));
    }
    
}

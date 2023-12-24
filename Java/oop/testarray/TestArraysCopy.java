package oop.testarray;


import java.util.Arrays;

/**
 * 测试数组的拷贝
 */
public class TestArraysCopy {
    public static void main(String[] args) {
        int[] seq1 = {1, 2, 3, 4, 5, 6};
        int[] seq2 = new int[10];
        System.out.println(Arrays.toString(seq1));
        System.out.println(Arrays.toString(seq2));
        System.arraycopy(seq1, 0, seq2, 2, seq1.length);
        System.out.println(Arrays.toString(seq2));
        System.out.println(Arrays.toString(Arrays.copyOf(seq1,8)));
    }   
}

package oop.testarray;

import java.util.Arrays;

/**
 * 测试Arrays类
 */
public class TestClassArrays {
    public static void main(String[] args) {
        //打印数组内容
        int[] seq = new int[10];
        System.out.println(Arrays.toString(seq));
        for(int i = 0; i < seq.length; i++){
            seq[i] =(int)(100*Math.random());
        }
        //数组排序
        System.out.println(Arrays.toString(seq));
        int key = seq[5];
        System.out.println(key);
        Arrays.sort(seq);
        System.out.println(Arrays.toString(seq));
        //二分查找
        int index = Arrays.binarySearch(seq, key);
        System.out.println("原来的值的索引：" + index);
        //填充数组
        int newindex = index + (int)(10*Math.random());
        if((newindex) < seq.length){
            Arrays.fill(seq, index, newindex, key);
            System.out.println(Arrays.toString(seq));
        } else {
            System.out.println("哈哈！它没了");
        }

        
    }
}   

package firsttests;

import java.util.Arrays;
/**测试编写冒泡排序 */
public class TestBubbleSort {
    public static void main(String[] args) {
        int[] s1 = {1,1,4,5,1,4,1,9,1,9,8,1,0};
        System.out.println(Arrays.toString(bubblesort(s1)));
        System.out.println(Arrays.toString(powerfulbubblesort(s1)));
        

    }

    public static int[] bubblesort(int[] seq) {
        int temp;
        for (int i = 0; i < seq.length; i++) {
            for (int j = 0; j < seq.length - 1 - i; j++) {
                if (seq[j] > seq[j + 1]) {
                    temp = seq[j];
                    seq[j] = seq[j + 1];
                    seq[j + 1] = temp;

                }
            }
        }
        return seq;
    }

    public static int[] powerfulbubblesort(int[] seq) {
        
        int temp;
        for (int i = 0; i < seq.length; i++) {
            boolean isSorted = true;
            for (int j = 0; j < seq.length - 1 - i; j++) {
                if (seq[j] > seq[j + 1]) {
                    temp = seq[j];
                    seq[j] = seq[j + 1];
                    seq[j + 1] = temp;
                    isSorted = false;
                }

            }
            if (isSorted) {
                return seq;
            }
        }
        return seq;
    }
}

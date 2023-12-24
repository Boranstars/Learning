package firsttests;
/**
 * 二分查找
 */
public class TestBinnarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int result = binnarySearch(arr, 2);
        System.out.println(result);
    }

    public static int binnarySearch(int[] seq, int value) {
        int left = 0;
        int right = seq.length - 1;
        while (left <= right) {
            int mid = (left + right)/2;
            if (seq[mid] == value){
                return mid;
            } else if (seq[mid] < value) {
                left = mid + 1;
            } else if (seq[mid] > value) {
                right = mid - 1;
            }
        }
        return -1;
        
    }
}

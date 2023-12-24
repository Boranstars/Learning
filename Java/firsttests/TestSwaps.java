package firsttests;

public class TestSwaps {
    public static void main(String[] args) {
        int a, b;
        a = 10;
        b = 5;
        a = a ^ b;

        b = a ^ b;
        
        a = a ^ b;

        
        System.out.printf("%d %d", a, b);
    }
    
}

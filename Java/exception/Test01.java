package exception;

public class Test01 {
    public static void main(String[] args) {
        System.out.println("hi");
        try {
            int a = 1 / 0;
            System.out.println(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

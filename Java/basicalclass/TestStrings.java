package basicalclass;

public class TestStrings {
    public static void main(String[] args) {
        String s1 = "abc";
        var s2 = s1.substring(0,2);
        System.out.println(s2);
        StringBuffer sBuffer = new StringBuffer("sdfgfdsdsf");
        StringBuilder sBuilder = new StringBuilder("dhsjd");

        sBuilder.append(s1);
        System.out.println(sBuilder);

        sBuffer.insert(0,"hei");
        System.out.println(sBuffer);
        sBuffer.delete(0, 3);
        System.out.println(sBuffer);
        System.out.println(sBuffer.charAt(1));
        System.out.println(sBuffer.reverse());
    }
}

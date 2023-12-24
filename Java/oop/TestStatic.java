package oop;

public class TestStatic {
    //成员变量
    int id;
    String name = "Nagisa";
    
    static String company ;//静态变量

    public TestStatic(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void login(){
        System.out.println(name);


    }
    static{
        System.out.println("加载类时就会被执行！");
        company = "key";//静态变量
        printCompany();//还可以调用静态方法！

    }
    public static void printCompany() {
        //login(); //不能在静态方法中调用非静态成员
        System.out.println(company);
        //System.out.println(name); //同上

     }
    public static void main(String[] args) {
        //什么都没有！
    }
}

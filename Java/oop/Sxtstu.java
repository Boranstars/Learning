package oop;

public class Sxtstu {
    String name;
    int age;
    
    int id;

    public Sxtstu() {
    }
    public void study() {
        System.out.println(name + " is studying!");
    }
    public void play() {
        System.out.println(name + " is playing!");
    }

    
    public static void main(String[] args) {
        Sxtstu Monika = new Sxtstu();
        Sxtstu Boran = new Sxtstu();

        Monika.age = 18;
        Monika.id = 0;
        Monika.name = "Monika";

        Monika.play();
        // Boran.study();
        Boran.name = "Boran";
        Boran.study();
    }
}

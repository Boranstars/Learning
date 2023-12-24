package oop.testencapsulation.b;

public class User  {
    public static void main(String[] args) {
        
    }
    private int id;
    private int age;
    private String name;
    private String gender;
    

    private boolean alive;
    //生成get方法
    public int getId() {
        return id;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public boolean isAlive() {
        return alive;
    }
    //生成set方法
    public void setId(int id) {
        this.id = id;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    
    
    public void setAlive(boolean alive) {
        this.alive = alive;
    }
    
    @Override
    public String toString() {
        return "User [id=" + id + ", age=" + age + ", name=" + name + ", gender=" + gender + ", alive=" + alive + "]";
    }
    public User(int id, int age, String name, String gender, boolean alive) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.alive = alive;
    }
    public User(){

    }
    
    
    
}

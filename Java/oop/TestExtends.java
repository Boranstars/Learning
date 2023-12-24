package oop;

public class TestExtends extends Object{
    public static void main(String[] args) {
        Students s1 = new Students("natsuki", 0, 16);
        s1.study();
        s1.eat();
        HighSchoolStudents s2 = new HighSchoolStudents("monika", 1, 18, "music");
        s2.study();
        s2.eat();
        System.out.println(s2.hashCode());
        
    }
}
class Students {
    String name;
    int id;
    int age;
    public Students(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }
    public void study(){
        System.out.println(name+" is studying!");
    }

    public void eat(){
        System.out.println(name+" is eating!");
    }

    public final void sleep() {
        System.out.printf("%s is sleeping!", this.name);
        
    }
    //尝试自动生成
    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + id;
        result = prime * result + age;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Students other = (Students) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (id != other.id)
            return false;
        if (age != other.age)
            return false;
        return true;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public int getAge() {
        return age;
    }

    
    
    



}

class HighSchoolStudents extends Students{

    String subject;

    public HighSchoolStudents(String name, int id, int age, String subject) {
        super(name, id, age);
        //重写构造函数
        this.subject = subject;
    }

    @Override
    public void study() {
        System.out.println(name + " is studying " + subject + "!");
    }//重写方法

    /*public void sleep() {
        //无法重写使用final标记的类
    }*/

    
}
//用python改写
// class Students:
//     def __init__(self, name, id, age):
//         self.name = name
//         self.id = id
//         self.age = age
    
//     def study(self):
//         print(self.name + " is studying!")
    
//     def eat(self):
//         print(self.name + " is eating!")

// class HighSchoolStudents(Students):
//     def __init__(self, name, id, age, subject):
//         super().__init__(name, id, age)
//         self.subject = subject
    
//     def study(self):
//         print(self.name + " is studying " + self.subject + "!")

// s1 = Students("natsuki", 0, 16)
// s1.study()
// s1.eat()

// s2 = HighSchoolStudents("monika", 1, 18, "music")
// s2.study()
// s2.eat()

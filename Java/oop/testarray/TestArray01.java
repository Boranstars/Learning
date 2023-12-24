package oop.testarray;


import java.util.Arrays;

public class TestArray01 {
    public static void main(String[] args) {
        int s1[] = new int[10];
        int[] s2 = new int[15];
        s1[0] =1;
        System.out.println(s1[0]);
        

        Person[] persons = new Person[10];
        Person p1 = new Person(18, 0);
        var p2 = new Person(18, 0);
        var p3 = new Person(18, 1);

        persons[0] = p1;
        persons[1] = p2;
        persons[2] = p3;

        System.out.println(persons[0].equals(persons[1]));
        System.out.println(persons[0].getAge());
        System.out.println(persons[2].getId());
        

        System.out.println("==正常遍历数组==");
        for(int i = 0; i < s2.length; i++){
            s2[i] = i*i;
            System.out.println(s2[i]);
        }
        

        System.out.println("==for-each遍历数组==");
        for(int temp:s2){
            System.out.println(temp);
        }//for-each循环只能读取，不能修改，不涉及下标操作。

        System.out.println(Arrays.toString(s2));

    }
}

class Person {
    private int age ;
    private int id;

    public Person(int age, int id) {
        this.age = age;
        this.id = id;
        
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + id;
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
        Person other = (Person) obj;
        if (age != other.age)
            return false;
        if (id != other.id)
            return false;
        return true;
    }
    
    

}
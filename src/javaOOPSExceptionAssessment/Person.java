package javaOOPSExceptionAssessment;

public class Person {

    String name;
    int age;

    public Person(String name, int   age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        Person person = new Person("John", 25);
        System.out.print("Name: " + person.name);
        System.out.println(", Age: " + person.age);

        Person person1 = new Person("Alice" , 30);
        System.out.print("Name: " + person1.name);
        System.out.println(", Age: " + person1.age);

    }
}

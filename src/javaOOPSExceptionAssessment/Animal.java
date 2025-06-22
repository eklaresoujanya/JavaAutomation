package javaOOPSExceptionAssessment;

public abstract class Animal {

    public abstract void makeSound();

    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();

        Animal cat = new Cat();
        cat.makeSound();

    }
}

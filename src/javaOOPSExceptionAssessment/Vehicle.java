package javaOOPSExceptionAssessment;

public abstract class Vehicle {

    public abstract void start();

    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();

        Vehicle bike = new Bike();
        bike.start();
    }
}

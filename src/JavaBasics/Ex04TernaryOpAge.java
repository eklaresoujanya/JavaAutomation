package JavaBasics;

public class Ex04TernaryOpAge {

    public static void main(String[] args){
        int age = 32;
        String category = age>65?"senior":age>18?"Adult":"Minor";
        System.out.println("Given person is "+category);
    }
}
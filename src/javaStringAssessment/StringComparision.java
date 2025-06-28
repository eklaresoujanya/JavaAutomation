package javaStringAssessment;

public class StringComparision {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "hello";

        System.out.println("s1 Equals s2 : " + s1.equals(s2));
        System.out.println("s1 Equal Ignore Casre s2: " + s1.equalsIgnoreCase(s2));
        System.out.println("s1 Compare To s2: " + s1.compareTo(s2));
    }
}

package javaProgrammingAssessment;

public class IncrementDecrementOperators {
    public static void main(String[] args) {

        int a = 5;

        System.out.println("Original: " + a);

        int pre_increment = ++a;
        System.out.println("Pre-increment: " + pre_increment);

        int post_increment = a++;
        System.out.println("Post-increment: " + post_increment);

        int pre_decrement = --a;
        System.out.println("Pre-decrement: " + pre_decrement);

        int post_decrement = a--;
        System.out.println("Post-decrement: " + post_decrement);

    }
}

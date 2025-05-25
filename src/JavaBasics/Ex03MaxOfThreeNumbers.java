package JavaBasics;

public class Ex03MaxOfThreeNumbers {
    public static void main(String[] args) {

        int a=3;
        int b=8;
        int c=5;
        int max = (a>b)?(a>c?a:c):(b>c)? b : c;
        System.out.println("Maximum number is "+max);

    }
}

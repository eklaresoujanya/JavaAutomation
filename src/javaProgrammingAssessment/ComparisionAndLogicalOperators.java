package javaProgrammingAssessment;

public class ComparisionAndLogicalOperators {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        boolean equals = a==b;
        System.out.println("a == b: " + equals);

        boolean greaterThan = a>b;
        System.out.println("a > b: " + greaterThan);

        boolean lessThan = a<b;
        System.out.println("a < b: " + lessThan);

        boolean andOperator = (a > b) && (a > 0);
        System.out.println("(a > b) && (a > 0): " + andOperator);

        boolean orOperator = (a < b) || (a > 0);
        System.out.println("(a < b) || (a > 0): " + orOperator);

        boolean notOperator = !(a > b);
        System.out.println("!(a > b): " +notOperator);

    }
}

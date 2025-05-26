package JavaBasics;

import java.util.Scanner;

public class Ex08FactorialForLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number to find the factorial");
        int n = scanner.nextInt();
        int fact = 1;

        if(n<1){
            System.out.println("Factorial is 1");
        }else{
            for(int i=1; i<=n; i++){
                fact=fact*i;
            }
            System.out.println("Factorial of " + n + " is " + fact);
        }

    }
}

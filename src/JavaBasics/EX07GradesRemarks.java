package JavaBasics;

import java.util.Scanner;

public class EX07GradesRemarks {
    public static void main(String[] args) {
        /* Hint
        case 'A': return "Excellent";
        case 'B': return "Very Good";
        case 'C': return "Good";
        case 'D': return "Needs Improvement";
        case 'F': return "Fail";
        default: return "Invalid grade";*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the Grade");
        String input = scanner.next().toUpperCase();
      //  input = input.toLowerCase();
        char grade = input.charAt(0);

        switch (grade){
            case 'A':
                System.out.println("Excellent");
                break;

            case 'B':
                System.out.println("Very Good");
                break;

            case 'C':
                System.out.println("Good");
                break;

            case 'D':
                System.out.println("Needs Improvement");
                break;

            case 'F':
                System.out.println("Fail");
                break;

            default:
                System.out.println("Invalid grade");

        }
    }
}

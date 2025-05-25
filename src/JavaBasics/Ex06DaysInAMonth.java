package JavaBasics;

import java.util.Scanner;

public class Ex06DaysInAMonth {
    public static void main(String[] args) {
 /*       Input -> 1 to 12, and Year = 2025
          -> 1 and year 2025 -> 31 Days
            -> 2 and year 2025 -> 28 Days, ( 2025 leap)     */
        System.out.println("Please enter year and month in number:");
        Scanner scanner = new Scanner(System.in);
        if(!scanner.hasNextInt()) {
            System.out.println("Please enter a number");
        }
        int year = scanner.nextInt();
        int n = scanner.nextInt();
        switch (n){
            case 1,3,5,7,8,10,12:
                System.out.println("31 days in the month");
                break;
            case 4,6,9,11:
                System.out.println("30 days in the month");
                break;
            case 2:
                if((year%4==0 && year%100!=0) ||(year%400==0)){
                    System.out.println("29 days in the month");
                }else{
                    System.out.println("28 days in the month");
                }
        }

    }
}

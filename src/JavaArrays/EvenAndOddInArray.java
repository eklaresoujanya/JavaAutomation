package JavaArrays;

public class EvenAndOddInArray {
    public static void main(String[] args) {
        int[] arr = {2, 5, 14, 7, 11, 15, 36, 8, 25, 3};
        int size = arr.length;
        System.out.print("Even Numbers: ");
        for (int i : arr) {
            if (i % 2 == 0) {
                System.out.print(i + "  ");
            }
        }
        System.out.println();
        System.out.print("Odd Numbers: ");
        for (int j : arr) {
            if (j % 2 == 1) {
                System.out.print(j + "  ");
            }
        }
    }
}

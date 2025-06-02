package JavaArrays;

public class SumOfElementsInArray {
    public static void main(String[] args) {

        int arr[] = {5,28,3,11,7,4};
        int size = arr.length;
        int sum = 0;

        for(int i=0; i<size;i++){
            sum+=arr[i];
        }
        System.out.println("Sum of Elements in given array is " + sum);
    }
}

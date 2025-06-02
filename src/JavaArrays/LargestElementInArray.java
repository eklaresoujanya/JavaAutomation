package JavaArrays;

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {5,28,3,11,7,4};
        int size = arr.length;
        int max = arr[0];
        for(int i=1 ; i < size ; i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("Largest number in the given array is "+max);
    }
}

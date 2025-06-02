package JavaArrays;

public class SmallestElementInArray {
    public static void main(String[] args) {

        int[] arr = {5,28,3,11,7,4};
        int size = arr.length;
        int min = arr[0];
        for(int i=0; i < size ; i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Smallest Element in the given array is "+min);
    }
}

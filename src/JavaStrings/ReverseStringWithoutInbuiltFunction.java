package JavaStrings;

public class ReverseStringWithoutInbuiltFunction {

    public static void main(String[] args) {

        String name = "Sowjanya";

        System.out.print("Reverse of Sowjanya is ");
        for(int i=name.length()-1; i>=0;i--){

            System.out.print(name.charAt(i));

        }

    }
}

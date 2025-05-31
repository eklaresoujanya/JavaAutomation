package JavaStrings;

public class StringPalindrome {
    public static void main(String[] args) {

        String input = "MadaM";
        String rev = new StringBuilder(input).reverse().toString();

        System.out.println("Input: "+input);

        if(input.equals(rev)){
            System.out.println("Given String is a Palindrome");
        }else{
            System.out.println("Given String is not a Palindrome");
        }

    }
}

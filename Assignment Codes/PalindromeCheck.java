import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number or string: ");
        String input = sc.nextLine();
        String reversed = new StringBuilder(input).reverse().toString();

        if (input.equalsIgnoreCase(reversed))
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");

        sc.close();
    }
}

import java.util.Scanner;

public class CharacterChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        sc.close();

        if (Character.isLetter(ch)) 
            System.out.println("It is a letter.");
        else if (Character.isDigit(ch)) 
            System.out.println("It is a digit.");
        else if (Character.isWhitespace(ch)) 
            System.out.println("It is a whitespace.");
        else 
            System.out.println("It is a special character.");
    }
}

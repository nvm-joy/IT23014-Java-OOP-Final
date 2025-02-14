import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter two numbers: ");
            int a = sc.nextInt(), b = sc.nextInt();

            System.out.println("Sum: " + (a + b));
            System.out.println("Difference: " + (a - b));
            System.out.println("Product: " + (a * b));
            System.out.println("Quotient: " + (b != 0 ? (a / b) : "Undefined (division by zero)"));
        } catch (Exception e) {
            System.out.println("Error: Invalid input!");
        } finally {
            sc.close();
        }
    }
}

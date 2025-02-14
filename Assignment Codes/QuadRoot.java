import java.util.Scanner;

public class QuadRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter coefficients a, b, c: ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        sc.close();

        double d = b * b - 4 * a * c; // Discriminant
        if (d < 0) {
            System.out.println("No real roots.");
            return;
        }

        double r1 = (-b + Math.sqrt(d)) / (2 * a);
        double r2 = (-b - Math.sqrt(d)) / (2 * a);
        double minRoot = Math.min(r1 > 0 ? r1 : Double.MAX_VALUE, r2 > 0 ? r2 : Double.MAX_VALUE);

        System.out.println(minRoot == Double.MAX_VALUE ? "No positive root." : "Smallest root: " + minRoot);
    }
}

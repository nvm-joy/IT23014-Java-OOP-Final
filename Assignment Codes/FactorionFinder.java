import java.util.Scanner;

public class FactorionFinder {
    static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;
        return fact;
    }

    static boolean isFactorion(int num) {
        int sum = 0, temp = num;
        while (temp > 0) {
            sum += factorial(temp % 10);
            temp /= 10;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range (lower upper): ");
        int lower = sc.nextInt(), upper = sc.nextInt();

        System.out.println("Factorion numbers:");
        for (int i = lower; i <= upper; i++)
            if (isFactorion(i)) System.out.println(i);

        sc.close();
    }
}

import java.util.Scanner;

class BaseClass {
    void printResult(String msg, Object result) {
        System.out.println(msg + result);
    }
}

class SumClass extends BaseClass {
    double computeSum() {
        double sum = 0;
        for (double i = 1.0; i >= 0.1; i -= 0.1) sum += i;
        return sum;
    }
}

class DivisorMultipleClass extends BaseClass {
    int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}

class NumberConversionClass extends BaseClass {
    void convert(int num) {
        printResult("Binary: ", Integer.toBinaryString(num));
        printResult("Hexadecimal: ", Integer.toHexString(num));
        printResult("Octal: ", Integer.toOctalString(num));
    }
}

class CustomPrintClass extends BaseClass {
    void pr(String msg) {
        System.out.println("*** " + msg + " ***");
    }
}

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        SumClass sumObj = new SumClass();
        sumObj.printResult("Sum of series: ", sumObj.computeSum());

        DivisorMultipleClass divObj = new DivisorMultipleClass();
        System.out.print("Enter two numbers for GCD & LCM: ");
        int a = sc.nextInt(), b = sc.nextInt();
        divObj.printResult("GCD: ", divObj.gcd(a, b));
        divObj.printResult("LCM: ", divObj.lcm(a, b));

        NumberConversionClass convObj = new NumberConversionClass();
        System.out.print("Enter a number for conversion: ");
        int num = sc.nextInt();
        convObj.convert(num);

        CustomPrintClass printObj = new CustomPrintClass();
        printObj.pr("Operations Completed");

        sc.close();
    }
}

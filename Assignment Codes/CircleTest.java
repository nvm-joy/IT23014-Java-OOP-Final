import java.util.Scanner;

class Circle {
    private double radius;

    public void setRadius(double r) throws Exception {
        if (r < 0) throw new Exception("Radius cannot be negative!");
        radius = r;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

public class CircleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();

        try {
            System.out.print("Enter radius: ");
            c.setRadius(sc.nextDouble());
            System.out.println("Area: " + c.getArea());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}

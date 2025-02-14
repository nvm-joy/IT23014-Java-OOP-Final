public class ArraySum {
    static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) sum += num;
        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; // Example array
        System.out.println("Sum: " + sumArray(numbers));
    }
}

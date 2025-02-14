public class ExtremeFinder {
    public static int findExtreme(String type, int... numbers) {
        if (numbers.length == 0) throw new IllegalArgumentException("No numbers provided");

        int result = numbers[0];
        for (int num : numbers) {
            if (type.equalsIgnoreCase("smallest")) {
                result = Math.min(result, num);
            } else if (type.equalsIgnoreCase("largest")) {
                result = Math.max(result, num);
            } else {
                throw new IllegalArgumentException("Invalid type. Use 'smallest' or 'largest'.");
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int x = findExtreme("smallest", 5, 2, 9, 1);
        int y = findExtreme("largest", 8, 3, 10, 4);

        System.out.println("Smallest: " + x);
        System.out.println("Largest: " + y);
    }
}

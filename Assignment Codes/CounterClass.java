class CounterClass {
    private static int instanceCount = 0;

    public CounterClass() {
        instanceCount++;
        if (instanceCount > 50) {
            instanceCount = 0;
        }
    }

    public static int getInstanceCount() {
        return instanceCount;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 55; i++) {
            new CounterClass();
            System.out.println("Object " + i + ", Instance Count: " + getInstanceCount());
        }
    }
}

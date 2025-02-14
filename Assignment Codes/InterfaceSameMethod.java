interface A {
    void show();
}

interface B {
    void show(); // Same method signature as in A
}

class C implements A, B {
    public void show() {
        System.out.println("Resolving conflict by overriding.");
    }
}

public class InterfaceSameMethod {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
    }
}

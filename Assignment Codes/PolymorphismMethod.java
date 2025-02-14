
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class PolymorphismMethod {
    public static void main(String[] args) {
        Animal myAnimal1 = new Dog();
        Animal myAnimal2 = new Cat();

        myAnimal1.makeSound();  // Output: Dog barks
        myAnimal2.makeSound();  // Output: Cat meows
    }
}

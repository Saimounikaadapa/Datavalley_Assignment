// Base class Animal
class Animal {
    // Method to make sound
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class Dog
class Dog extends Animal {
    // Overriding makeSound method for Dog
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

// Derived class Cat
class Cat extends Animal {
    // Overriding makeSound method for Cat
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

public class MainAnimal {
    public static void main(String[] args) {
        // Creating objects of Dog and Cat
        Animal dog = new Dog();
        Animal cat = new Cat();
        
        // Invoking the makeSound method of Dog
        dog.makeSound(); // Output will be "Dog barks"
        
        // Invoking the makeSound method of Cat
        cat.makeSound(); // Output will be "Cat meows"
    }
}

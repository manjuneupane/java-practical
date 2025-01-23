package mypackage;
interface Animal5{
    void eat();
}

interface Mammal extends Animal5 {
    void walk();
}

class Dog5 implements Mammal {
    public void eat() {
        System.out.println("The dog eats food.");
    }

    public void walk() {
        System.out.println("The dog walks.");
    }
}

public class InterfaceExtending {
    public static void main(String[] args) {
        Dog5 dog = new Dog5();
        dog.eat();
        dog.walk();
    }
}

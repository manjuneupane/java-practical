package mypackage;
class Calculator {
    // Overloading: Multiple methods with the same name but different parameters
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class AdvancedCalculator extends Calculator {
    @Override
    int add(int a, int b) {
        System.out.println("Overridden method in AdvancedCalculator");
        return a + b;
    }
}


public class OverloadingOverriding {
    public static void main(String[] args) {
        AdvancedCalculator calc = new AdvancedCalculator();
        System.out.println("Sum (2 args): " + calc.add(5, 3)); // Overridden
        System.out.println("Sum (3 args): " + calc.add(5, 3, 2)); // Overloaded
    }

}

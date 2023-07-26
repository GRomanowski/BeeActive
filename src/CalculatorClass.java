package src;

public class CalculatorClass {

    int a;
    int b;

    public void addition(int a, int b) {
        int z = a + b;
        System.out.println("Wynik dodawanie " + z);
    }

    public void substraction(int a, int b) {
        int z = a - b;
        System.out.println("Wynik odejmowania " + z);
    }

    public void multiplication(int a, int b) {
        int z = a * b;
        System.out.println("Wynik mnożenia " + z);
    }

    public void division(int a, int b) {
        int z = a / b;
        System.out.println("Wynik dzielenia " + z);
    }

    public void mod(int a, int b) {
        int z = a % b;
        System.out.println("Wynik modulo " + z);
    }

}

package src;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbę");
        int a = scan.nextInt();
        System.out.println("Podaj druga liczbę");
        int b = scan.nextInt();
        CalculatorClass calculator = new CalculatorClass();

        calculator.addition(a, b);
        calculator.substraction(a,b);
        calculator.multiplication(a,b);
        calculator.division(a,b);
        calculator.mod(a,b);
    }
}

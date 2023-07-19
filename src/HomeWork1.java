package src;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOne = scan.nextInt();
        int numberTwo = scan.nextInt();

        int adding = numberOne + numberTwo;
        int dividing = numberOne / numberTwo;
        int modulo = numberOne%numberTwo;
        int multiplication = numberOne*numberTwo;

        System.out.println(adding);
        System.out.println(dividing);
        System.out.println(modulo);
        System.out.println(multiplication);
    }
}

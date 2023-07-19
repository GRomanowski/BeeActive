package src;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you");
        int age = scan.nextInt();

        if (age < 18) {
            System.out.println("You cannot buy alcohol");
        } else {
            System.out.println("Thank you for shopping");
        }
    }
}

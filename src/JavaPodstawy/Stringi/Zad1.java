package src.JavaPodstawy.Stringi;

import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String imie = scan.nextLine();
        String nazwisko = scan.nextLine();

        System.out.println("Twoje imie i nazwisko to " + imie + " " + nazwisko);
    }
}

package src.JavaPodstawy.Stringi;

import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();

        System.out.println(word.charAt(word.length()-2));
    }
}

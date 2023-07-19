package src;

public class HomeWork3 {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }

        }

        int[] tab = new int[]{1, 3, 5};
        for (int i = 2; i < tab.length; i--) {
            System.out.println(tab[i]);
        }

        int[] tab2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < tab2.length; i++) {
            if (i % 2 == 0) {
                System.out.println(tab2[i]);
            }
        }
    }
}

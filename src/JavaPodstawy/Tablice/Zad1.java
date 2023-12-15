package src.JavaPodstawy.Tablice;

public class Zad1 {
    public static void main(String[] args) {
        int[] tabOne = {1,2,3,4,5};

        System.out.println(tabOne[0]);

        for (int i = 0; i < tabOne.length-2; i++) {
            System.out.print(tabOne[i*2]+ " ");
        }
    }
}

package src;

public class Auto {

    String marka;
    String model;
    int rok;
    int przebieg;

    public Auto() {

    }

    public Auto(String marka, String model, int rok, int przebieg) {
        this.marka = marka;
        this.model = model;
        this.rok = rok;
        this.przebieg = przebieg;

        System.out.println(marka);
        System.out.println(model);
        System.out.println(rok);
        System.out.println(przebieg);
    }
}

package src;

public class HomeWork4 {
    public static void main(String[] args) {
        Student adam = new Student();
        adam.name = "Adam";
        adam.surName = "Padam";
        adam.email = "Adam.Padam@email.com";
        adam.indexNumber = 12345;

        Student piotr = new Student();
        piotr.name = "Adam";
        piotr.surName = "Padam";
        piotr.email = "Adam.Padam@email.com";
        piotr.indexNumber = 12345;


        Student[] students = new Student[2];
        students[0] = adam;
        students[1] = piotr;

        for (int i = 0; i < students.length; i++) {
            students[i].whatsYourIndexNumber();
            students[i].logIn();
            students[i].nameYourSelf();
        }
    }
}

package src;

public class Student {

    public String name;
    public String surName;
    public String email;
    public int indexNumber;

    public void nameYourSelf() {
        System.out.println("My name is " + name + surName);
    }

    public void logIn(){
        System.out.println("Log in " + email);
    }

    public void whatsYourIndexNumber(){
        System.out.println("What is your index number " + indexNumber);
    }
}

package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private boolean operation;

    public Surgeon(String name, String surname, String education, String birthday, int experience,
                   boolean operation) {
        super(name, surname, education, birthday, experience);
        this.operation = operation;
    }
}

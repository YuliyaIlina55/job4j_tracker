package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private boolean dentalTreatment;

    public Dentist(String name, String surname, String education, String birthday, int experience,
                   boolean dentalTreatment) {
        super(name, surname, education, birthday, experience);
        this.dentalTreatment = dentalTreatment;
    }
}

package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private String nameProgram;

    public Programmer(String name, String surname, String education, String birthday, String project,
                      String nameProgram) {
        super(name, surname, education, birthday, project);
        this.nameProgram = nameProgram;
    }

    public Programmer(String nameProgram) {
        this.nameProgram = nameProgram;
    }
}

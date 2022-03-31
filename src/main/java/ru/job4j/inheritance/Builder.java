package ru.job4j.inheritance;

public class Builder extends Engineer {
    private String typeOfWork;

    public Builder(String name, String surname, String education, String birthday, String project,
                   String typeOfWork) {
        super(name, surname, education, birthday, project);
        this.typeOfWork = typeOfWork;
    }

    public Builder(String typeOfWork) {
        this.typeOfWork = typeOfWork;
    }
}

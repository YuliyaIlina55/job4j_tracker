package ru.job4j.inheritance;

public class Engineer extends Profession {
    private String project;

    public Engineer() {
        super();
    }

    public Engineer(String name, String surname, String education, String birthday, String project) {
        super(name, surname, education, birthday);
        this.project = project;
    }

    public Progress schedule(Project project) {
        Progress progress = new Progress();
        return progress;
    }
}

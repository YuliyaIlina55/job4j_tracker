package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
        active = true;
        status = 2;
        message = "Ошибка";
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println(active);
        System.out.println(status);
        System.out.println(message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.printInfo();
        Error error1 = new Error(false, 10, "Oк");
        error1.printInfo();
    }
}

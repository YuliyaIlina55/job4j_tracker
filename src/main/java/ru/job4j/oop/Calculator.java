package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int t) {
        return t - x;
    }

    public int divide(int f) {
        return f / x;
    }

    public int sumAllOperation(int p) {
        return (sum(p) + multiply(p) + minus(p) + divide(p));
    }

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        System.out.println(rsl);
        int rsl1 = minus(16);
        System.out.println(rsl1);
        Calculator calculator1 = new Calculator();
        int rsl2 = calculator1.divide(6);
        System.out.println(rsl2);
        Calculator calculator2 = new Calculator();
        int rsl3 = calculator2.sumAllOperation(52);
        System.out.println(rsl3);
    }
}

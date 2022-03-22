package ru.job4j.oop;

public class DummyDic {
    public String endToRus(String end) {
        return "Неизвестное слово " + end;
    }

    public static void main(String[] args) {
        DummyDic dic = new DummyDic();
        String j = dic.endToRus("ghjhgj");
        System.out.println(j);
    }
}

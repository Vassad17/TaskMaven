package ru.netology.javaqa;

public class Main {

    public static void main(String[] args) {
        BonusService bonusService = new BonusService();
        boolean registered;
        long bonus = bonusService.calculate(1_000_000, true);
    }
}
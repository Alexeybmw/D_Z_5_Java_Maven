package ru.netology.D.Z.five.mvn.services;

public class IncomeServices {
    public int calculate(int income, int expense) {
        int count = 0;
        int threshold = 0;

        for (int month = 0; month < 12; month++) {

            if (threshold >= income * 1.5) {
                count++;
                threshold = threshold / 3;

            } else {
                threshold = threshold + (income - expense);
            }
        }
        return count;
    }
}
